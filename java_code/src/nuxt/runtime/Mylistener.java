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
    	
    	//System.out.println("-- " + ctx.parent);	
    	
    	//if(ctx.children != null) {
    	//	System.out.println("-- " + ctx.children);
    	//}
    	
              //code that executes per rule
    }
    
    @Override public void visitTerminal(TerminalNode node) {
    	//System.out.println("-- " + node.);
    }
    
    @Override public void enterStatement(NuxtParser.StatementContext ctx) {
    	//System.out.println("Got into statement: " + ctx.getText());
    }
    
    @Override public void enterType(NuxtParser.TypeContext ctx) {
    	//System.out.println("Type: " + ctx.getText());
    }
}