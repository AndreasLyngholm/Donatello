package nuxt.runtime;

import org.antlr.v4.runtime.ParserRuleContext;

public class Mylistener extends NuxtParserBaseListener {
	
	String[] ruleNames;
	
    public Mylistener(String[] ruleNames) {
		this.ruleNames = ruleNames;
	}
    
    String type, resource, as;

	@Override public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
    	    			
    	System.out.println("Rule: " + this.ruleNames[ctx.getRuleIndex()]);
    	
    	String rule = this.ruleNames[ctx.getRuleIndex()];

    	if(! rule.equals("as") && type != null && resource != null) {
			Compiler.includes.append( String.format("from %s import %s \n", resource, capitalize(resource)) );
			Compiler.embeddings.append( String.format("embed %s as %s \n", capitalize(resource), capitalize(resource)) );
			
			type = null;
			resource = null;
    	}
    	
		if(rule.equals("other")) {
			
			Compiler.code.append("document += \"");
			String text = ctx.getRuleContext().getText();
			text = text.replaceAll("\\n", "\\\\n");
			text = text.replaceAll("\\t", "\\\\t");
			text = text.replaceAll("\"", "\\\\\"");
			Compiler.code.append(text);
			Compiler.code.append("\"\n");
			
		} else if(rule.equals("print")) {
			
			Compiler.code.append("document += ");
			String text = ctx.getRuleContext().getText();
			Compiler.code.append(text);
			Compiler.code.append("\n");
			
		} else if(rule.equals("code_tag")) {
			
			String code = ctx.getRuleContext().getText();
			Compiler.code.append(code.substring(2, code.length()-1) + "\n");
			
		} else if(rule.equals("type")) {
			
			type = ctx.getRuleContext().getText();
			
		} else if (rule.equals("resource")) {
			
			resource = ctx.getRuleContext().getText();
			
		} else if (rule.equals("as")) {
			
			as = ctx.getRuleContext().getText();
			
			//Compiler.includes.append( String.format("from %s import %s \n", resource, capitalize(resource)) );
			//Compiler.embeddings.append( String.format("embed %s as %s \n", capitalize(resource), capitalize(resource)) );
			Compiler.dataproviders.append((String.format("readFile@File( {filename = params.root + \"%s.%s\", format = \"%s\"} )( %s ) \n", resource, type, type, as)));
			
			type = null;
			resource = null;
			as = null;
			
		}
    	
    }
	
	private String capitalize(String str)
	{
	    if(str == null) return str;
	    return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}