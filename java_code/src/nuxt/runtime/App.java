package nuxt.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class App
{
    public static void main( String[] args )
    {    	
    	CharStream cs = CharStreams.fromString("${use service time}");  //load the file
        NuxtLexer lexer = new NuxtLexer(cs);  //instantiate a lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
        NuxtParser parser = new NuxtParser(tokens);  //parse the tokens

        ParseTree tree = parser.prog(); // parse the content and get the tree
        
        System.out.println(tree.toStringTree(parser));
        
        
        Mylistener listener = new Mylistener(parser.getRuleNames());

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);
        
        //List<Token> tokensTest = new ArrayList<Token>();
        //inOrderTraversal(tokensTest, tree);
        
        //System.out.println(tokensTest);
        
    	
    	
    }
    
    private static void inOrderTraversal(List<Token> tokens, ParseTree parent) {

        // Iterate over all child nodes of `parent`.
        for (int i = 0; i < parent.getChildCount(); i++) {

            // Get the i-th child node of `parent`.
            ParseTree child = parent.getChild(i);

            if (child instanceof TerminalNode) {
                // We found a leaf/terminal, add its Token to our list.
                TerminalNode node = (TerminalNode) child;
                tokens.add(node.getSymbol());
            }
            else {
                // No leaf/terminal node, recursively call this method.
                inOrderTraversal(tokens, child);
            }
        }
    }
}