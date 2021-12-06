package nuxt.runtime;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import nuxt.runtime.NuxtParser.ProgContext;

public class App
{
	public static StringBuilder stringBuilder = new StringBuilder();
	public static Map<String, String> data = new HashMap<String, String>();
	
    public static void main( String[] args )
    {
//    	if(false) {
//    		CharStream cs = CharStreams.fromString("${use service data/users as users}");  //load the file
//	        NuxtLexer lexer = new NuxtLexer(cs);  //instantiate a lexer
//	        CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
//	        NuxtParser parser = new NuxtParser(tokens);  //parse the tokens
//	
//	        ParseTree tree = parser.prog(); // parse the content and get the tree
//	        
//	        //System.out.println(tree.toStringTree(parser));
//	        
//	        
//	        Mylistener listener = new Mylistener(parser.getRuleNames());
//	
//	        ParseTreeWalker walker = new ParseTreeWalker();
//	        walker.walk(listener,tree);
//	        
//	        //List<Token> tokensTest = new ArrayList<Token>();
//	        //inOrderTraversal(tokensTest, tree);
//	        
//	        //System.out.println(tokensTest);
//	        
//	        System.out.println(data.toString());
//    	}
    	
    	try {
            /*
             * get the input file as an InputStream
             */
            InputStream inputStream = App.class.getResourceAsStream("Test.txt");
            
            /*
             * make Lexer
             */
            Lexer lexer = new NuxtLexer(CharStreams.fromStream(inputStream));
            
            /*
             * get a TokenStream on the Lexer
             */
            TokenStream tokenStream = new CommonTokenStream(lexer);
            
            /*
             * make a Parser on the token stream
             */
            NuxtParser parser = new NuxtParser(tokenStream);
            
            /*
             * get the top node of the AST. This corresponds to the topmost rule of equation.q4, "equation"
             */
            ParseTree tree = parser.prog();
            
            
            Mylistener listener = new Mylistener(parser.getRuleNames());
        	
	        ParseTreeWalker walker = new ParseTreeWalker();
	        walker.walk(listener,tree);
            
         } catch (IOException e) {
            e.printStackTrace();
         }
        
        
        
        
        
        
        
        
        
        
    	
    	
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