package nuxt.runtime;

import jolie.runtime.JavaService;
import jolie.runtime.Value;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class Compiler extends JavaService {
	//private static final String TAG_PATTERN = "\\s*\\<%\\s*([^%]*?)\\s*%\\>\\s*";
	private static final String TAG_PATTERN = "\\s*\\$\\{\\s*([^%]*?)\\s*\\}\\s*";
	private static final String INCLUDE_PATTERN = "\\s*use service (\\S+)\\s*";

	//private static final String HEADER = "include \"services/base.ol\"\ndefine operations {\n";
	//private static final String FOOTER = "\tnullProcess\n}";

	private StringBuilder output, code;
	private ArrayList<String> includes;

	public String compile(Value request) {
		String contents = request.getFirstChild( "contents" ).strValue();
		String base = request.getFirstChild( "base" ).strValue();

		includes = new ArrayList<String>();
		output = new StringBuilder();
		code = new StringBuilder();

		Pattern pattern = Pattern.compile(TAG_PATTERN);
		Matcher matcher = pattern.matcher(contents);

		int i = 0;
		while(matcher.find()) {
			addHTML(contents.substring(i, matcher.start()));

			String block = matcher.group(1);
			code.append(parseDirectives(block));
			code.append("\n");

			i = matcher.end();
		}
		addHTML(contents.substring(i, contents.length()));

		// Assemble service
		String formatedIncludes = "";
		String formatedEmbeddings = "";
		for(String include : includes) {
			formatedIncludes += String.format("from %s import %s \n", include, capitalize(include));
			formatedEmbeddings += String.format("embed %s as %s \n", capitalize(include), capitalize(include));
		}
		//output.append(HEADER);
		//output.append(code.toString());
		
		base = base.replace("@includes", formatedIncludes);
		base = base.replace("@embedings", formatedEmbeddings);
		base = base.replace("@operations", code.toString());
		//output.append(FOOTER);
		
		output.append(base);

		return output.toString();
	}

	private void addHTML(String text) {
		if(text.length() == 0) return;

		code.append("\tdocument += \"");
		text = text.replaceAll("\\n", "\\\\n");
		text = text.replaceAll("\\t", "\\\\t");
		text = text.replaceAll("\"", "\\\\\"");
		code.append(text);
		code.append("\"\n");
	}

	private String parseDirectives(String text) {
		text = text.replaceAll("@print", "document +=");

		return parseIncludes(text);
	}

	private String parseIncludes(String text) {
		Pattern pattern = Pattern.compile(INCLUDE_PATTERN);
		Matcher matcher = pattern.matcher(text);

		while(matcher.find()) {
			includes.add(matcher.group(1));
		}
		
		return text.replaceAll(INCLUDE_PATTERN, "");
	}
	
	public static String capitalize(String str)
	{
	    if(str == null) return str;
	    return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}