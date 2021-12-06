package nuxt.runtime;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Mylistener extends NuxtBaseListener {
	
	String[] ruleNames;
	
    public Mylistener(String[] ruleNames) {
		this.ruleNames = ruleNames;
	}

	@Override public void enterEveryRule(ParserRuleContext ctx) {  //see gramBaseListener for allowed functions
    	    			
    	System.out.println("Rule: " + this.ruleNames[ctx.getRuleIndex()]);
    	
    	//System.out.println("rule entered: " + ctx.getText());
    	
    	//String Rule = this.ruleNames[ctx.getRuleIndex()];
    	System.out.println("-- " + ctx.getRuleContext().getText() + "\n");
    	
    	//App.stringBuilder.append(ctx.getRuleContext().getText());
    	
    	String rule = this.ruleNames[ctx.getRuleIndex()];
    	if( ! rule.equals("prog"))
    		App.data.put(rule, ctx.getRuleContext().getText());
    	
    	//System.out.println("-- " + ctx.parent);	
    	
    	//if(ctx.children != null) {
    	//	System.out.println("-- " + ctx.children);
    	//}
    	
              //code that executes per rule
    }
}