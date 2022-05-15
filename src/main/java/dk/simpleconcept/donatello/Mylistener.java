package dk.simpleconcept.donatello;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.UUID;

public class Mylistener extends DonatelloParserBaseListener {
    
    String[] ruleNames;
    
    public Mylistener(String[] ruleNames) {
        this.ruleNames = ruleNames;
    }
    
    String type, resource, as, print;
    Boolean ifstatement = false;

    @Override public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
        
        String rule = this.ruleNames[ctx.getRuleIndex()];

        if(! rule.equals("as") && type != null && resource != null) {
            String resource_name = "";
            
            for(String name : resource.split("_")) {
                resource_name += capitalize(name);
            }
            
            String[] dotSplit = resource_name.split("\\.");
            
            if(dotSplit.length > 1) {
            	resource_name = capitalize(dotSplit[dotSplit.length-1]);
            }
            
            Compiler.includes.append( String.format("from %s import %s \n", resource, resource_name) );
            Compiler.embeddings.append( String.format("embed %s as %s \n", resource_name, resource_name) );
            
            type = null;
            resource = null;
        }
        
    }
    
    @Override public void enterAs(DonatelloParser.AsContext ctx) {
        as = ctx.getRuleContext().getText();

        Compiler.dataproviders.append((String.format("readFile@File( {filename = params.root + \"%s.%s\", format = \"%s\"} )( %s ) \n", resource, type, type, as)));
        
        type = null;
        resource = null;
        as = null;
    }
    
    @Override public void enterResource(DonatelloParser.ResourceContext ctx) {
        resource = ctx.getText();
    }
    
    @Override public void enterType(DonatelloParser.TypeContext ctx) {
        type = ctx.getText();
    }
    
    @Override public void enterCode_tag(DonatelloParser.Code_tagContext ctx) {
        String code = ctx.getText();
        Compiler.code.append(code.substring(2, code.length()-1) + "\n");
    }
    
    @Override public void enterOther(DonatelloParser.OtherContext ctx) {
        Compiler.code.append("document += \"");
        String text = ctx.getText();
        text = text.replaceAll("\\n", "\\\\n");
        text = text.replaceAll("\\t", "\\\\t");
        text = text.replaceAll("\"", "\\\\\"");
        Compiler.code.append(text);
        Compiler.code.append("\"\n");
    }
    
    @Override public void enterPrint(DonatelloParser.PrintContext ctx) {
        if(ctx.getParent().getText().contains("|")) {
            print = ctx.getText();
        } else {
            Compiler.code.append("document += ");
            String text = ctx.getText();
            Compiler.code.append(text);
            Compiler.code.append("\n");
        }
    }
    
    @Override public void enterIf_tag(DonatelloParser.If_tagContext ctx) {
        //System.out.println("Entered if tag; Open brackets");
        Compiler.code.append(String.format("if (%s) { \n", ctx.getChild(2).getText().replace("and", " && ")));
    }
    
    @Override public void enterElseif_tag(DonatelloParser.Elseif_tagContext ctx) {
        //System.out.println("Else if tag; Continue brackets");
        Compiler.code.append(String.format("} else if (%s) { \n", ctx.getChild(2).getText()));
    }
    
    @Override public void enterElse_tag(DonatelloParser.Else_tagContext ctx) {
        //System.out.println("Else tag; Continue brackets");
        Compiler.code.append("} else { \n");
    }
    
    @Override public void exitIf_tag(DonatelloParser.If_tagContext ctx) {
        //System.out.println("Exited if tag; Close brackets");
        Compiler.code.append("} \n");
    }
    
    @Override public void enterFor_array(DonatelloParser.For_arrayContext ctx) {
        //System.out.println("Entered for tag; Open brackets");
        Compiler.code.append(String.format("for ( %s in %s ) { \n", ctx.getChild(2).getText(), ctx.getChild(4).getText()));
    }
    
    @Override public void exitFor_array(DonatelloParser.For_arrayContext ctx) {
        //System.out.println("Exited for tag; Close brackets");
        Compiler.code.append("} \n");
    }
    
    @Override public void enterInclude_tag(DonatelloParser.Include_tagContext ctx) {
        String to_include = ctx.getChild(2).getText();
        
        String params = "";
        
        for (ParseTree param : ctx.children) {
            if(param.getText().contains("=")) {
                params += ", " + param.getText().replace("=", " << ");
            }
        }
        
        Compiler.dataproviders.append((String.format("default@Gateway( {operation = \"%s\"%s, compile = false} )( %s ) \n", to_include, params, to_include.replace("/", "_"))));
        Compiler.code.append(String.format("document += %s \n", to_include.replace("/", "_")));
    }
    
    @Override public void enterParam_type(DonatelloParser.Param_typeContext ctx) {
        String param = ctx.getText();
        Compiler.params.append(param + "\n    ");
        
        String[] init_param = param.split(":");
        String init_param_name = init_param[0].replace("?", "");
        Compiler.init_params.append(String.format("%s = params.%s \n", init_param_name, init_param_name));
    }
    
    @Override public void enterFilter(DonatelloParser.FilterContext ctx) {
        String uuid = uuid();
        Compiler.code.append(String.format("%s(%s)(%s) \n", ctx.getChild(1).getText(), print, uuid));
        Compiler.code.append(String.format("document += %s \n", uuid));
        
        print = null;
    }
    
    @Override public void enterParam_body(DonatelloParser.Param_bodyContext ctx) {
        String param = ctx.getParent().getChild(1).getText().replace("param ", "").replace("{", "");
        
        Compiler.params.append(param + "{" + ctx.getText() + "} \n");
        Compiler.init_params.append(String.format("%s << params.%s \n", param, param));
    }
    
    @Override public void enterRaw_body(DonatelloParser.Raw_bodyContext ctx) {
    	Compiler.code.append(ctx.getText());
    }
    
    private String capitalize(String str) {
        if(str == null) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
    private String uuid() {
        UUID randomUUID = UUID.randomUUID();
        return "print" + randomUUID.toString().replaceAll("-", "").substring(0, 4);
    } 
}