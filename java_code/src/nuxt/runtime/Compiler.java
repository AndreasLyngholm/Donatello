package nuxt.runtime;

import jolie.runtime.JavaService;
import jolie.runtime.Value;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Compiler extends JavaService {

	public static StringBuilder output, code, dataproviders, includes, embeddings;

	public static String compile(Value request) {
		
		String contents = request.getFirstChild( "contents" ).strValue();
		String base = request.getFirstChild( "base" ).strValue();

		includes = new StringBuilder();
		output = new StringBuilder();
		code = new StringBuilder();
		dataproviders = new StringBuilder();
		embeddings = new StringBuilder();
		
		/*
		 * make Lexer
		 */
		Lexer lexer = new NuxtLexer(CharStreams.fromString(contents));
		
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
		ParseTree tree = parser.parse();
		
		Mylistener listener = new Mylistener(parser.getRuleNames());
		
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(listener,tree);
		
		base = base.replace("@includes", includes);
		base = base.replace("@embedings", embeddings);
		base = base.replace("@dataproviders", dataproviders);
		base = base.replace("@operations", code);
		
		output.append(base);

		return output.toString();
	}
}