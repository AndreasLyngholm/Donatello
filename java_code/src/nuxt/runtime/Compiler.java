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
	//private static final String TAG_PATTERN = "\\s*\\$\\{\\s*([^%]*?)\\s*\\}\\s*";
	//private static final String INCLUDE_PATTERN = "\\s*use service (\\S+)\\s*";
	//private static final String DATAPROVIDER_PATTERN = "\\s*use (json|xml) (\\S+) as (\\S+)\\s*";

	public static StringBuilder output, code, dataproviders, includes, embeddings;

	public static String compile(Value request) {
//    	String contents = ( "${use service time}\r\n"
//    			+ "${use json data/users as users}\r\n"
//    			+ "<!DOCTYPE html>\r\n"
//    			+ "<html>\r\n"
//    			+ "	<head>\r\n"
//    			+ "		<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n"
//    			+ "	</head>\r\n"
//    			+ "	<body>\r\n"
//    			+ "		<!-- Testing comment... -->\r\n"
//    			+ "		\r\n"
//    			+ "		${getCurrentDateTime@Time()(time)}\r\n"
//    			+ "		<h1>Welcome, {{ users.name }}</h1>\r\n"
//    			+ "\r\n"
//    			+ "		${a = 7}\r\n"
//    			+ "		${b = 3}\r\n"
//    			+ "		<h1>{{ a }} + {{ b }} = {{ a+b }}</h1>\r\n"
//    			+ "		<h1>{{ a }} / {{ b }} = {{ a/b }}</h1>\r\n"
//    			+ "		<h1>{{ a }} * {{ b }} = {{ a*b }}</h1>\r\n"
//    			+ "		<h1>{{ a }} - {{ b }} = {{ a-b }}</h1>\r\n"
//    			+ "\r\n"
//    			+ "		<p>The time is: {{ time }}</p>\r\n"
//    			+ "	</body>\r\n"
//    			+ "</html>" );
//    	
//    	String base = ( "from runtime import Runtime\r\n"
//    			+ "from PageInterfaceModule import PageInterface\r\n"
//    			+ "from file import File\r\n"
//    			+ "@includes\r\n"
//    			+ "\r\n"
//    			+ "type Params {\r\n"
//    			+ "    location:string\r\n"
//    			+ "    root:string\r\n"
//    			+ "    contentDir:string\r\n"
//    			+ "    servicesDir:string\r\n"
//    			+ "    defaultPage:string\r\n"
//    			+ "}\r\n"
//    			+ "\r\n"
//    			+ "service Main( params:Params ) {\r\n"
//    			+ "	embed Runtime as Runtime\r\n"
//    			+ "	embed File as File\r\n"
//    			+ "	@embedings\r\n"
//    			+ "\r\n"
//    			+ "	define operations {\r\n"
//    			+ "		@operations\r\n"
//    			+ "	}\r\n"
//    			+ "\r\n"
//    			+ "	execution { single }\r\n"
//    			+ "\r\n"
//    			+ "	inputPort Local {\r\n"
//    			+ "		location: \"local\"\r\n"
//    			+ "		interfaces: PageInterface\r\n"
//    			+ "	}\r\n"
//    			+ "\r\n"
//    			+ "	outputPort Page {\r\n"
//    			+ "		interfaces: PageInterface\r\n"
//    			+ "	}\r\n"
//    			+ "\r\n"
//    			+ "	init {\r\n"
//    			+ "		getLocalLocation@Runtime()(Page.location)\r\n"
//    			+ "		document = \"\"\r\n"
//    			+ "	}\r\n"
//    			+ "\r\n"
//    			+ "	main {\r\n"
//    			+ "		getDocument(request)(response) {\r\n"
//    			+ "\r\n"
//    			+ "			@dataproviders\r\n"
//    			+ "\r\n"
//    			+ "			operations\r\n"
//    			+ "			response = document\r\n"
//    			+ "		}\r\n"
//    			+ "	}\r\n"
//    			+ "}" );
		
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

		//Pattern pattern = Pattern.compile(TAG_PATTERN);
		//Matcher matcher = pattern.matcher(contents);

		//int i = 0;
		//while(matcher.find()) {
		//	addHTML(contents.substring(i, matcher.start()));

		//	String block = matcher.group(1);
		//	code.append(parseDirectives(block));
		//	code.append("\n");

		//	i = matcher.end();
		//}
		//addHTML(contents.substring(i, contents.length()));

		// Assemble service
		//String formatedIncludes = "";
		//String formatedEmbeddings = "";
		//for(String include : includes) {
		//	formatedIncludes += String.format("from %s import %s \n", include, capitalize(include));
		//	formatedEmbeddings += String.format("embed %s as %s \n", capitalize(include), capitalize(include));
		//}
		
		//System.out.println(code);
		
		base = base.replace("@includes", includes);
		base = base.replace("@embedings", embeddings);
		base = base.replace("@dataproviders", dataproviders);
		base = base.replace("@operations", code);
		
		output.append(base);
		
		System.out.println(output);

		return output.toString();
	}

//	private void addHTML(String text) {
//		if(text.length() == 0) return;
//
//		code.append("\tdocument += \"");
//		text = text.replaceAll("\\n", "\\\\n");
//		text = text.replaceAll("\\t", "\\\\t");
//		text = text.replaceAll("\"", "\\\\\"");
//		code.append(text);
//		code.append("\"\n");
//	}
//
//	private String parseDirectives(String text) {
//		text = text.replaceAll("@print", "document +=");
//
//		return parseIncludes(text);
//	}
//
//	private String parseIncludes(String text) {
//		Pattern pattern = Pattern.compile(INCLUDE_PATTERN);
//		Matcher matcher = pattern.matcher(text);
//
//		while(matcher.find()) {
//			includes.append(matcher.group(1));
//		}
//		
//		return parseDataproviders(text.replaceAll(INCLUDE_PATTERN, ""));
//	}
//	
//	private String parseDataproviders(String text) {
//		Pattern pattern = Pattern.compile(DATAPROVIDER_PATTERN);
//		Matcher matcher = pattern.matcher(text);
//
//		while(matcher.find()) {
//			dataproviders.append(String.format("readFile@File( {filename = params.root + \"%s.%s\", format = \"%s\"} )( %s ) \n", matcher.group(2), matcher.group(1), matcher.group(1), matcher.group(3)));
//		}
//		
//		return text.replaceAll(DATAPROVIDER_PATTERN, "");
//	}
//	
//	public static String capitalize(String str)
//	{
//	    if(str == null) return str;
//	    return str.substring(0, 1).toUpperCase() + str.substring(1);
//	}
}