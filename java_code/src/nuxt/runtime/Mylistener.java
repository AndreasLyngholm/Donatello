package nuxt.runtime;

import org.antlr.v4.runtime.ParserRuleContext;

public class Mylistener extends NuxtParserBaseListener {
	
	String[] ruleNames;
	
    public Mylistener(String[] ruleNames) {
		this.ruleNames = ruleNames;
	}
    
    String type, resource, as;
    Boolean ifstatement = false;

	@Override public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
    	    			
    	System.out.println("Rule: " + this.ruleNames[ctx.getRuleIndex()]);
    	
    	String rule = this.ruleNames[ctx.getRuleIndex()];

    	if(! rule.equals("as") && type != null && resource != null) {
			Compiler.includes.append( String.format("from %s import %s \n", resource, capitalize(resource)) );
			Compiler.embeddings.append( String.format("embed %s as %s \n", capitalize(resource), capitalize(resource)) );
			
			type = null;
			resource = null;
    	}
    	
    }
	
	@Override public void enterAs(NuxtParser.AsContext ctx) {
		as = ctx.getRuleContext().getText();

		Compiler.dataproviders.append((String.format("readFile@File( {filename = params.root + \"%s.%s\", format = \"%s\"} )( %s ) \n", resource, type, type, as)));
		
		type = null;
		resource = null;
		as = null;
	}
	
	@Override public void enterResource(NuxtParser.ResourceContext ctx) {
		resource = ctx.getRuleContext().getText();
	}
	
	@Override public void enterType(NuxtParser.TypeContext ctx) {
		type = ctx.getRuleContext().getText();
	}
	
	@Override public void enterCode_tag(NuxtParser.Code_tagContext ctx) {
		String code = ctx.getRuleContext().getText();
		Compiler.code.append(code.substring(2, code.length()-1) + "\n");
	}
	
	@Override public void enterOther(NuxtParser.OtherContext ctx) {
		Compiler.code.append("document += \"");
		String text = ctx.getRuleContext().getText();
		text = text.replaceAll("\\n", "\\\\n");
		text = text.replaceAll("\\t", "\\\\t");
		text = text.replaceAll("\"", "\\\\\"");
		Compiler.code.append(text);
		Compiler.code.append("\"\n");
	}
	
	@Override public void enterPrint(NuxtParser.PrintContext ctx) {
		Compiler.code.append("document += ");
		String text = ctx.getRuleContext().getText();
		Compiler.code.append(text);
		Compiler.code.append("\n");
	}
	
	@Override public void enterIf_tag(NuxtParser.If_tagContext ctx) {
		System.out.println("Entered if tag; Open brackets");
		Compiler.code.append(String.format("if (%s) { \n", ctx.getChild(2).getText()));
	}
	
	@Override public void enterElseif_tag(NuxtParser.Elseif_tagContext ctx) {
		System.out.println("Else if tag; Continue brackets");
		Compiler.code.append(String.format("} else if (%s) { \n", ctx.getChild(2).getText()));
	}
	
	@Override public void enterElse_tag(NuxtParser.Else_tagContext ctx) {
		System.out.println("Else tag; Continue brackets");
		Compiler.code.append("} else { \n");
	}
	
	@Override public void exitIf_tag(NuxtParser.If_tagContext ctx) {
		System.out.println("Exited if tag; Close brackets");
		Compiler.code.append("} \n");
	}
	
	private String capitalize(String str)
	{
	    if(str == null) return str;
	    return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}