package dk.simpleconcept.donatello;

import jolie.runtime.JavaService;
import jolie.runtime.Value;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.github.rjeschke.txtmark.Processor;

public class Compiler extends JavaService {

    public static StringBuilder output, code, dataproviders, includes, embeddings, params, init_params;

    public static String compile(Value request) {
//        String contents = ("${use service string_utils}"
//                + "${use service ..app.chuck}"
//        		+ "<html>testestestet</html>");
//        
//        String base = ( "from GatewayInterfaceModule import GatewayInterface\r\n"
//                + "from runtime import Runtime\r\n"
//                + "from PageInterfaceModule import PageInterface\r\n"
//                + "from file import File\r\n"
//                + "@includes\r\n"
//                + "\r\n"
//                + "type Params {\r\n"
//                + "    location:string\r\n"
//                + "    root:string\r\n"
//                + "    contentDir:string\r\n"
//                + "    servicesDir:string\r\n"
//                + "    defaultPage:string\r\n"
//                + "    routes:string\r\n"
//                + "    @params\r\n"
//                + "}\r\n"
//                + "\r\n"
//                + "service Main( params:Params ) {\r\n"
//                + "    embed Runtime as Runtime\r\n"
//                + "    embed File as File\r\n"
//                + "    @embedings\r\n"
//                + "\r\n"
//                + "    define operations {\r\n"
//                + "        @operations\r\n"
//                + "    }\r\n"
//                + "\r\n"
//                + "    execution { single }\r\n"
//                + "\r\n"
//                + "    inputPort Local {\r\n"
//                + "        location: \"local\"\r\n"
//                + "        interfaces: PageInterface\r\n"
//                + "    }\r\n"
//                + "\r\n"
//                + "    outputPort Gateway {\r\n"
//                + "        location: \"socket://localhost:8000\"\r\n"
//                + "        protocol: http { format = \"json\" }\r\n"
//                + "        interfaces: GatewayInterface\r\n"
//                + "    }\r\n"
//                + "\r\n"
//                + "    outputPort Page {\r\n"
//                + "        interfaces: PageInterface\r\n"
//                + "    }\r\n"
//                + "\r\n"
//                + "    init {\r\n"
//                + "        getLocalLocation@Runtime()(Page.location)\r\n"
//                + "        document = \"\"\r\n"
//                + "    }\r\n"
//                + "\r\n"
//                + "    main {\r\n"
//                + "        getDocument(request)(response) {\r\n"
//                + "\r\n"
//                + "            @init_params\r\n"
//                + "            @dataproviders\r\n"
//                + "\r\n"
//                + "            operations\r\n"
//                + "            response = document\r\n"
//                + "        }\r\n"
//                + "    }\r\n"
//                + "}" );
        
        String contents = request.getFirstChild( "contents" ).strValue();
        String base = request.getFirstChild( "base" ).strValue();
        String type = request.getFirstChild( "type" ).strValue();
        
        if (type == "markdown") {
            String html = Processor.process(contents);
            
            return html;
        }

        params = new StringBuilder();
        init_params = new StringBuilder();
        includes = new StringBuilder();
        output = new StringBuilder();
        code = new StringBuilder();
        dataproviders = new StringBuilder();
        embeddings = new StringBuilder();
        
        /*
         * make Lexer
         */
        Lexer lexer = new DonatelloLexer(CharStreams.fromString(contents));
        
        /*
         * get a TokenStream on the Lexer
         */
        TokenStream tokenStream = new CommonTokenStream(lexer);
        
        /*
         * make a Parser on the token stream
         */
        DonatelloParser parser = new DonatelloParser(tokenStream);
        
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
        base = base.replace("@params", params);
        base = base.replace("@init_params", init_params);
        base = base.replace("@operations", code);
        
        output.append(base);
        
//        System.out.println(output);

        return output.toString();
    }
}