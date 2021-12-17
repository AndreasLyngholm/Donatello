// Generated from NuxtLexer.g4 by ANTLR 4.9.3

package nuxt.runtime;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NuxtLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OutStart=1, TagStart=2, Other=3, OutStart2=4, TagStart2=5, OutEnd=6, TagEnd=7, 
		Str=8, DotDot=9, Dot=10, NEq=11, Eq=12, EqSign=13, GtEq=14, Gt=15, LtEq=16, 
		Lt=17, Minus=18, Pipe=19, Col=20, Comma=21, OPar=22, CPar=23, OBr=24, 
		CBr=25, QMark=26, Mul=27, Div=28, Plus=29, Add=30, PathSep=31, DoubleNum=32, 
		LongNum=33, WS=34, Use=35, Param=36, Service=37, Json=38, Xml=39, As=40, 
		CaptureStart=41, CaptureEnd=42, CommentStart=43, CommentEnd=44, RawStart=45, 
		IfStart=46, Elseif=47, IfEnd=48, UnlessStart=49, UnlessEnd=50, Else=51, 
		Contains=52, CaseStart=53, CaseEnd=54, When=55, Cycle=56, ForStart=57, 
		ForEnd=58, In=59, And=60, Or=61, TableStart=62, TableEnd=63, Assign=64, 
		True=65, False=66, Nil=67, Include=68, With=69, Offset=70, Continue=71, 
		Reversed=72, Empty=73, Blank=74, EndId=75, IdChain=76, Id=77, Type=78, 
		RawEnd=79, OtherRaw=80;
	public static final int
		IN_TAG=1, IN_RAW=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_TAG", "IN_RAW"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OutStart", "TagStart", "Other", "SStr", "DStr", "WhitespaceChar", "SpaceOrTab", 
			"LineBreak", "Letter", "Digit", "OutStart2", "TagStart2", "OutEnd", "TagEnd", 
			"Str", "DotDot", "Dot", "NEq", "Eq", "EqSign", "GtEq", "Gt", "LtEq", 
			"Lt", "Minus", "Pipe", "Col", "Comma", "OPar", "CPar", "OBr", "CBr", 
			"QMark", "Mul", "Div", "Plus", "Add", "PathSep", "DoubleNum", "LongNum", 
			"WS", "Use", "Param", "Service", "Json", "Xml", "As", "CaptureStart", 
			"CaptureEnd", "CommentStart", "CommentEnd", "RawStart", "IfStart", "Elseif", 
			"IfEnd", "UnlessStart", "UnlessEnd", "Else", "Contains", "CaseStart", 
			"CaseEnd", "When", "Cycle", "ForStart", "ForEnd", "In", "And", "Or", 
			"TableStart", "TableEnd", "Assign", "True", "False", "Nil", "Include", 
			"With", "Offset", "Continue", "Reversed", "Empty", "Blank", "EndId", 
			"IdChain", "Id", "Type", "RawEnd", "OtherRaw"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'{{'", "'${'", null, null, null, "'..'", "'.'", 
			null, "'=='", "'='", "'>='", "'>'", "'<='", "'<'", "'-'", "'|'", "':'", 
			"','", "'('", "')'", "'['", "']'", "'?'", "'*'", "'/'", "'+'", "'@'", 
			null, null, null, null, "'use'", "'param'", "'service'", "'json'", "'xml'", 
			"'as'", "'capture'", "'endcapture'", "'comment'", "'endcomment'", null, 
			"'if'", "'elseif'", "'endif'", "'unless'", "'endunless'", "'else'", "'contains'", 
			"'case'", "'endcase'", "'when'", "'cycle'", "'for'", "'endfor'", "'in'", 
			"'and'", "'or'", "'tablerow'", "'endtablerow'", "'assign'", "'true'", 
			"'false'", null, "'include'", "'with'", "'offset'", "'continue'", "'reversed'", 
			"'empty'", "'blank'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OutStart", "TagStart", "Other", "OutStart2", "TagStart2", "OutEnd", 
			"TagEnd", "Str", "DotDot", "Dot", "NEq", "Eq", "EqSign", "GtEq", "Gt", 
			"LtEq", "Lt", "Minus", "Pipe", "Col", "Comma", "OPar", "CPar", "OBr", 
			"CBr", "QMark", "Mul", "Div", "Plus", "Add", "PathSep", "DoubleNum", 
			"LongNum", "WS", "Use", "Param", "Service", "Json", "Xml", "As", "CaptureStart", 
			"CaptureEnd", "CommentStart", "CommentEnd", "RawStart", "IfStart", "Elseif", 
			"IfEnd", "UnlessStart", "UnlessEnd", "Else", "Contains", "CaseStart", 
			"CaseEnd", "When", "Cycle", "ForStart", "ForEnd", "In", "And", "Or", 
			"TableStart", "TableEnd", "Assign", "True", "False", "Nil", "Include", 
			"With", "Offset", "Continue", "Reversed", "Empty", "Blank", "EndId", 
			"IdChain", "Id", "Type", "RawEnd", "OtherRaw"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	  private boolean stripSpacesAroundTags = false;
	  private boolean stripSingleLine = false;
	  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	  public NuxtLexer(CharStream charStream, boolean stripSpacesAroundTags) {
	    this(charStream, stripSpacesAroundTags, false);
	  }

	  public NuxtLexer(CharStream charStream, boolean stripSpacesAroundTags, boolean stripSingleLine) {
	    this(charStream);
	    this.stripSpacesAroundTags = stripSpacesAroundTags;
	    this.stripSingleLine = stripSingleLine;
	  }

	  @Override
	  public void emit(Token t) {
	    super.setToken(t);
	    tokens.offer(t);
	  }

	  @Override
	  public Token nextToken() {
	    Token next = super.nextToken();
	    return tokens.isEmpty() ? next : tokens.poll();
	  }

	  private void handleIdChain(String chain) {
	    String[] ids = chain.split("\\.");
	    int start = this.getCharIndex() - chain.getBytes().length;
	  for (int i = 0; i < ids.length; i++) {
	    int stop = start + ids[i].getBytes().length - 1;
	      this.emit(new CommonToken(this._tokenFactorySourcePair, Id, DEFAULT_TOKEN_CHANNEL, start, stop));
	      if (i < ids.length - 1) {
	        stop += 1;
	        this.emit(new CommonToken(this._tokenFactorySourcePair, Dot, DEFAULT_TOKEN_CHANNEL, stop, stop));
	      }

	      start = stop + 1;
	  }
	  }


	public NuxtLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NuxtLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 82:
			IdChain_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IdChain_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			handleIdChain(getText());
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return OutStart_sempred((RuleContext)_localctx, predIndex);
		case 1:
			return TagStart_sempred((RuleContext)_localctx, predIndex);
		case 12:
			return OutEnd_sempred((RuleContext)_localctx, predIndex);
		case 13:
			return TagEnd_sempred((RuleContext)_localctx, predIndex);
		case 38:
			return DoubleNum_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean OutStart_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return stripSpacesAroundTags && stripSingleLine;
		case 1:
			return stripSpacesAroundTags && !stripSingleLine;
		}
		return true;
	}
	private boolean TagStart_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return stripSpacesAroundTags && stripSingleLine;
		case 3:
			return stripSpacesAroundTags && !stripSingleLine;
		}
		return true;
	}
	private boolean OutEnd_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return stripSpacesAroundTags && stripSingleLine;
		case 5:
			return stripSpacesAroundTags && !stripSingleLine;
		}
		return true;
	}
	private boolean TagEnd_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return stripSpacesAroundTags && stripSingleLine;
		case 7:
			return stripSpacesAroundTags && !stripSingleLine;
		}
		return true;
	}
	private boolean DoubleNum_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return _input.LA(1) != '.';
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u032c\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4"+
		"H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\t"+
		"S\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\3\2\7\2\u00b5\n\2\f\2\16\2\u00b8\13\2"+
		"\3\2\3\2\3\2\3\2\3\2\7\2\u00bf\n\2\f\2\16\2\u00c2\13\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2\u00c9\n\2\f\2\16\2\u00cc\13\2\3\2\3\2\3\2\3\2\3\2\5\2\u00d3\n"+
		"\2\3\2\3\2\3\3\7\3\u00d8\n\3\f\3\16\3\u00db\13\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\u00e2\n\3\f\3\16\3\u00e5\13\3\3\3\3\3\3\3\3\3\3\3\7\3\u00ec\n\3\f\3"+
		"\16\3\u00ef\13\3\3\3\3\3\3\3\3\3\3\3\5\3\u00f6\n\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\7\5\u00fe\n\5\f\5\16\5\u0101\13\5\3\5\3\5\3\6\3\6\7\6\u0107\n\6\f"+
		"\6\16\6\u010a\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\5\t\u0113\n\t\3\t\3\t\5"+
		"\t\u0117\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\7\16\u012b\n\16\f\16\16\16\u012e\13\16\3\16\5\16"+
		"\u0131\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u0138\n\16\f\16\16\16\u013b"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0143\n\16\f\16\16\16\u0146"+
		"\13\16\3\16\3\16\5\16\u014a\n\16\3\16\3\16\3\17\3\17\7\17\u0150\n\17\f"+
		"\17\16\17\u0153\13\17\3\17\5\17\u0156\n\17\3\17\3\17\3\17\7\17\u015b\n"+
		"\17\f\17\16\17\u015e\13\17\3\17\3\17\3\17\3\17\3\17\7\17\u0165\n\17\f"+
		"\17\16\17\u0168\13\17\3\17\5\17\u016b\n\17\3\17\3\17\3\20\3\20\5\20\u0171"+
		"\n\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u017c\n\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\5(\u01aa\n(\3(\6(\u01ad"+
		"\n(\r(\16(\u01ae\3(\3(\6(\u01b3\n(\r(\16(\u01b4\3(\5(\u01b8\n(\3(\6(\u01bb"+
		"\n(\r(\16(\u01bc\3(\3(\3(\5(\u01c2\n(\3)\5)\u01c5\n)\3)\6)\u01c8\n)\r"+
		")\16)\u01c9\3*\6*\u01cd\n*\r*\16*\u01ce\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\7\65\u021c\n\65\f\65\16\65\u021f\13\65\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39"+
		"\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?"+
		"\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3D"+
		"\3D\3D\3D\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K"+
		"\3K\3K\3K\3K\3K\3K\5K\u02af\nK\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M"+
		"\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3T\3T\7T"+
		"\u02eb\nT\fT\16T\u02ee\13T\3T\3T\6T\u02f2\nT\rT\16T\u02f3\6T\u02f6\nT"+
		"\rT\16T\u02f7\3T\3T\3T\3T\3U\3U\5U\u0300\nU\3U\3U\3U\7U\u0305\nU\fU\16"+
		"U\u0308\13U\3V\3V\7V\u030c\nV\fV\16V\u030f\13V\3V\3V\3V\7V\u0314\nV\f"+
		"V\16V\u0317\13V\3W\3W\3W\3W\7W\u031d\nW\fW\16W\u0320\13W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3X\3X\2\2Y\5\3\7\4\t\5\13\2\r\2\17\2\21\2\23\2\25\2\27\2"+
		"\31\6\33\7\35\b\37\t!\n#\13%\f\'\r)\16+\17-\20/\21\61\22\63\23\65\24\67"+
		"\259\26;\27=\30?\31A\32C\33E\34G\35I\36K\37M O!Q\"S#U$W%Y&[\'](_)a*c+"+
		"e,g-i.k/m\60o\61q\62s\63u\64w\65y\66{\67}8\1779\u0081:\u0083;\u0085<\u0087"+
		"=\u0089>\u008b?\u008d@\u008fA\u0091B\u0093C\u0095D\u0097E\u0099F\u009b"+
		"G\u009dH\u009fI\u00a1J\u00a3K\u00a5L\u00a7M\u00a9N\u00abO\u00adP\u00af"+
		"Q\u00b1R\5\2\3\4\r\3\2))\3\2$$\5\2\13\f\17\17\"\"\4\2\13\13\"\"\4\2C\\"+
		"c|\3\2\62;\4\2\61\61^^\5\2C\\aac|\6\2\62;C\\aac|\5\2//\61\61aa\3\2c|\2"+
		"\u0357\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\31\3\2\2\2\3\33\3\2\2\2\3"+
		"\35\3\2\2\2\3\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3%\3\2\2\2\3\'\3\2\2\2"+
		"\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3\2\2\2\3\61\3\2\2\2\3\63\3\2\2\2"+
		"\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2\3;\3\2\2\2\3=\3\2\2\2\3?\3\2\2\2"+
		"\3A\3\2\2\2\3C\3\2\2\2\3E\3\2\2\2\3G\3\2\2\2\3I\3\2\2\2\3K\3\2\2\2\3M"+
		"\3\2\2\2\3O\3\2\2\2\3Q\3\2\2\2\3S\3\2\2\2\3U\3\2\2\2\3W\3\2\2\2\3Y\3\2"+
		"\2\2\3[\3\2\2\2\3]\3\2\2\2\3_\3\2\2\2\3a\3\2\2\2\3c\3\2\2\2\3e\3\2\2\2"+
		"\3g\3\2\2\2\3i\3\2\2\2\3k\3\2\2\2\3m\3\2\2\2\3o\3\2\2\2\3q\3\2\2\2\3s"+
		"\3\2\2\2\3u\3\2\2\2\3w\3\2\2\2\3y\3\2\2\2\3{\3\2\2\2\3}\3\2\2\2\3\177"+
		"\3\2\2\2\3\u0081\3\2\2\2\3\u0083\3\2\2\2\3\u0085\3\2\2\2\3\u0087\3\2\2"+
		"\2\3\u0089\3\2\2\2\3\u008b\3\2\2\2\3\u008d\3\2\2\2\3\u008f\3\2\2\2\3\u0091"+
		"\3\2\2\2\3\u0093\3\2\2\2\3\u0095\3\2\2\2\3\u0097\3\2\2\2\3\u0099\3\2\2"+
		"\2\3\u009b\3\2\2\2\3\u009d\3\2\2\2\3\u009f\3\2\2\2\3\u00a1\3\2\2\2\3\u00a3"+
		"\3\2\2\2\3\u00a5\3\2\2\2\3\u00a7\3\2\2\2\3\u00a9\3\2\2\2\3\u00ab\3\2\2"+
		"\2\3\u00ad\3\2\2\2\4\u00af\3\2\2\2\4\u00b1\3\2\2\2\5\u00d2\3\2\2\2\7\u00f5"+
		"\3\2\2\2\t\u00f9\3\2\2\2\13\u00fb\3\2\2\2\r\u0104\3\2\2\2\17\u010d\3\2"+
		"\2\2\21\u010f\3\2\2\2\23\u0116\3\2\2\2\25\u0118\3\2\2\2\27\u011a\3\2\2"+
		"\2\31\u011c\3\2\2\2\33\u0121\3\2\2\2\35\u0149\3\2\2\2\37\u016a\3\2\2\2"+
		"!\u0170\3\2\2\2#\u0172\3\2\2\2%\u0175\3\2\2\2\'\u017b\3\2\2\2)\u017d\3"+
		"\2\2\2+\u0180\3\2\2\2-\u0182\3\2\2\2/\u0185\3\2\2\2\61\u0187\3\2\2\2\63"+
		"\u018a\3\2\2\2\65\u018c\3\2\2\2\67\u018e\3\2\2\29\u0190\3\2\2\2;\u0192"+
		"\3\2\2\2=\u0194\3\2\2\2?\u0196\3\2\2\2A\u0198\3\2\2\2C\u019a\3\2\2\2E"+
		"\u019c\3\2\2\2G\u019e\3\2\2\2I\u01a0\3\2\2\2K\u01a2\3\2\2\2M\u01a4\3\2"+
		"\2\2O\u01a6\3\2\2\2Q\u01c1\3\2\2\2S\u01c4\3\2\2\2U\u01cc\3\2\2\2W\u01d2"+
		"\3\2\2\2Y\u01d6\3\2\2\2[\u01dc\3\2\2\2]\u01e4\3\2\2\2_\u01e9\3\2\2\2a"+
		"\u01ed\3\2\2\2c\u01f0\3\2\2\2e\u01f8\3\2\2\2g\u0203\3\2\2\2i\u020b\3\2"+
		"\2\2k\u0216\3\2\2\2m\u0224\3\2\2\2o\u0227\3\2\2\2q\u022e\3\2\2\2s\u0234"+
		"\3\2\2\2u\u023b\3\2\2\2w\u0245\3\2\2\2y\u024a\3\2\2\2{\u0253\3\2\2\2}"+
		"\u0258\3\2\2\2\177\u0260\3\2\2\2\u0081\u0265\3\2\2\2\u0083\u026b\3\2\2"+
		"\2\u0085\u026f\3\2\2\2\u0087\u0276\3\2\2\2\u0089\u0279\3\2\2\2\u008b\u027d"+
		"\3\2\2\2\u008d\u0280\3\2\2\2\u008f\u0289\3\2\2\2\u0091\u0295\3\2\2\2\u0093"+
		"\u029c\3\2\2\2\u0095\u02a1\3\2\2\2\u0097\u02ae\3\2\2\2\u0099\u02b0\3\2"+
		"\2\2\u009b\u02b8\3\2\2\2\u009d\u02bd\3\2\2\2\u009f\u02c4\3\2\2\2\u00a1"+
		"\u02cd\3\2\2\2\u00a3\u02d6\3\2\2\2\u00a5\u02dc\3\2\2\2\u00a7\u02e2\3\2"+
		"\2\2\u00a9\u02e8\3\2\2\2\u00ab\u02ff\3\2\2\2\u00ad\u0309\3\2\2\2\u00af"+
		"\u0318\3\2\2\2\u00b1\u032a\3\2\2\2\u00b3\u00b5\5\21\b\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7}\2\2\u00ba\u00bb\7}\2"+
		"\2\u00bb\u00bc\3\2\2\2\u00bc\u00d3\6\2\2\2\u00bd\u00bf\5\17\7\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7}\2\2\u00c4"+
		"\u00c5\7}\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00d3\6\2\3\2\u00c7\u00c9\5\17"+
		"\7\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7}"+
		"\2\2\u00ce\u00cf\7}\2\2\u00cf\u00d3\7/\2\2\u00d0\u00d1\7}\2\2\u00d1\u00d3"+
		"\7}\2\2\u00d2\u00b6\3\2\2\2\u00d2\u00c0\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\2\2\2\u00d5\6\3\2\2\2"+
		"\u00d6\u00d8\5\21\b\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\7&\2\2\u00dd\u00de\7}\2\2\u00de\u00df\3\2\2\2\u00df\u00f6\6\3\4"+
		"\2\u00e0\u00e2\5\17\7\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e7\7&\2\2\u00e7\u00e8\7}\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f6"+
		"\6\3\5\2\u00ea\u00ec\5\17\7\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f1\7&\2\2\u00f1\u00f2\7}\2\2\u00f2\u00f6\7/\2\2\u00f3"+
		"\u00f4\7&\2\2\u00f4\u00f6\7}\2\2\u00f5\u00d9\3\2\2\2\u00f5\u00e3\3\2\2"+
		"\2\u00f5\u00ed\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\b\3\2\2\u00f8\b\3\2\2\2\u00f9\u00fa\13\2\2\2\u00fa\n\3\2\2\2\u00fb\u00ff"+
		"\7)\2\2\u00fc\u00fe\n\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0103\7)\2\2\u0103\f\3\2\2\2\u0104\u0108\7$\2\2\u0105\u0107"+
		"\n\3\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7$"+
		"\2\2\u010c\16\3\2\2\2\u010d\u010e\t\4\2\2\u010e\20\3\2\2\2\u010f\u0110"+
		"\t\5\2\2\u0110\22\3\2\2\2\u0111\u0113\7\17\2\2\u0112\u0111\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117\7\f\2\2\u0115\u0117\7\17"+
		"\2\2\u0116\u0112\3\2\2\2\u0116\u0115\3\2\2\2\u0117\24\3\2\2\2\u0118\u0119"+
		"\t\6\2\2\u0119\26\3\2\2\2\u011a\u011b\t\7\2\2\u011b\30\3\2\2\2\u011c\u011d"+
		"\7}\2\2\u011d\u011e\7}\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b\f\2\2\u0120"+
		"\32\3\2\2\2\u0121\u0122\7&\2\2\u0122\u0123\7}\2\2\u0123\u0124\3\2\2\2"+
		"\u0124\u0125\b\r\2\2\u0125\34\3\2\2\2\u0126\u0127\7\177\2\2\u0127\u0128"+
		"\7\177\2\2\u0128\u012c\3\2\2\2\u0129\u012b\5\21\b\2\u012a\u0129\3\2\2"+
		"\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\5\23\t\2\u0130\u012f\3\2\2\2"+
		"\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u014a\6\16\6\2\u0133\u0134"+
		"\7\177\2\2\u0134\u0135\7\177\2\2\u0135\u0139\3\2\2\2\u0136\u0138\5\17"+
		"\7\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u014a\6\16"+
		"\7\2\u013d\u013e\7/\2\2\u013e\u013f\7\177\2\2\u013f\u0140\7\177\2\2\u0140"+
		"\u0144\3\2\2\2\u0141\u0143\5\17\7\2\u0142\u0141\3\2\2\2\u0143\u0146\3"+
		"\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u014a\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0147\u0148\7\177\2\2\u0148\u014a\7\177\2\2\u0149\u0126"+
		"\3\2\2\2\u0149\u0133\3\2\2\2\u0149\u013d\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\b\16\3\2\u014c\36\3\2\2\2\u014d\u0151\7\177"+
		"\2\2\u014e\u0150\5\21\b\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0156\5\23\t\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u016b\6\17\b\2\u0158\u015c\7\177\2\2\u0159\u015b"+
		"\5\17\7\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2"+
		"\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u016b"+
		"\6\17\t\2\u0160\u0161\7/\2\2\u0161\u0162\7\177\2\2\u0162\u0166\3\2\2\2"+
		"\u0163\u0165\5\17\7\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016b\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016b\7\177\2\2\u016a\u014d\3\2\2\2\u016a\u0158\3\2\2\2\u016a\u0160\3"+
		"\2\2\2\u016a\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b\17\3\2\u016d"+
		" \3\2\2\2\u016e\u0171\5\13\5\2\u016f\u0171\5\r\6\2\u0170\u016e\3\2\2\2"+
		"\u0170\u016f\3\2\2\2\u0171\"\3\2\2\2\u0172\u0173\7\60\2\2\u0173\u0174"+
		"\7\60\2\2\u0174$\3\2\2\2\u0175\u0176\7\60\2\2\u0176&\3\2\2\2\u0177\u0178"+
		"\7#\2\2\u0178\u017c\7?\2\2\u0179\u017a\7>\2\2\u017a\u017c\7@\2\2\u017b"+
		"\u0177\3\2\2\2\u017b\u0179\3\2\2\2\u017c(\3\2\2\2\u017d\u017e\7?\2\2\u017e"+
		"\u017f\7?\2\2\u017f*\3\2\2\2\u0180\u0181\7?\2\2\u0181,\3\2\2\2\u0182\u0183"+
		"\7@\2\2\u0183\u0184\7?\2\2\u0184.\3\2\2\2\u0185\u0186\7@\2\2\u0186\60"+
		"\3\2\2\2\u0187\u0188\7>\2\2\u0188\u0189\7?\2\2\u0189\62\3\2\2\2\u018a"+
		"\u018b\7>\2\2\u018b\64\3\2\2\2\u018c\u018d\7/\2\2\u018d\66\3\2\2\2\u018e"+
		"\u018f\7~\2\2\u018f8\3\2\2\2\u0190\u0191\7<\2\2\u0191:\3\2\2\2\u0192\u0193"+
		"\7.\2\2\u0193<\3\2\2\2\u0194\u0195\7*\2\2\u0195>\3\2\2\2\u0196\u0197\7"+
		"+\2\2\u0197@\3\2\2\2\u0198\u0199\7]\2\2\u0199B\3\2\2\2\u019a\u019b\7_"+
		"\2\2\u019bD\3\2\2\2\u019c\u019d\7A\2\2\u019dF\3\2\2\2\u019e\u019f\7,\2"+
		"\2\u019fH\3\2\2\2\u01a0\u01a1\7\61\2\2\u01a1J\3\2\2\2\u01a2\u01a3\7-\2"+
		"\2\u01a3L\3\2\2\2\u01a4\u01a5\7B\2\2\u01a5N\3\2\2\2\u01a6\u01a7\t\b\2"+
		"\2\u01a7P\3\2\2\2\u01a8\u01aa\7/\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3"+
		"\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\5\27\13\2\u01ac\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0\u01b2\7\60\2\2\u01b1\u01b3\5\27\13\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01c2\3\2"+
		"\2\2\u01b6\u01b8\7/\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01ba\3\2\2\2\u01b9\u01bb\5\27\13\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3"+
		"\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\7\60\2\2\u01bf\u01c0\6(\n\2\u01c0\u01c2\3\2\2\2\u01c1\u01a9\3\2"+
		"\2\2\u01c1\u01b7\3\2\2\2\u01c2R\3\2\2\2\u01c3\u01c5\7/\2\2\u01c4\u01c3"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c8\5\27\13\2"+
		"\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01caT\3\2\2\2\u01cb\u01cd\5\17\7\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d1\b*\4\2\u01d1V\3\2\2\2\u01d2\u01d3\7w\2\2\u01d3\u01d4"+
		"\7u\2\2\u01d4\u01d5\7g\2\2\u01d5X\3\2\2\2\u01d6\u01d7\7r\2\2\u01d7\u01d8"+
		"\7c\2\2\u01d8\u01d9\7t\2\2\u01d9\u01da\7c\2\2\u01da\u01db\7o\2\2\u01db"+
		"Z\3\2\2\2\u01dc\u01dd\7u\2\2\u01dd\u01de\7g\2\2\u01de\u01df\7t\2\2\u01df"+
		"\u01e0\7x\2\2\u01e0\u01e1\7k\2\2\u01e1\u01e2\7e\2\2\u01e2\u01e3\7g\2\2"+
		"\u01e3\\\3\2\2\2\u01e4\u01e5\7l\2\2\u01e5\u01e6\7u\2\2\u01e6\u01e7\7q"+
		"\2\2\u01e7\u01e8\7p\2\2\u01e8^\3\2\2\2\u01e9\u01ea\7z\2\2\u01ea\u01eb"+
		"\7o\2\2\u01eb\u01ec\7n\2\2\u01ec`\3\2\2\2\u01ed\u01ee\7c\2\2\u01ee\u01ef"+
		"\7u\2\2\u01efb\3\2\2\2\u01f0\u01f1\7e\2\2\u01f1\u01f2\7c\2\2\u01f2\u01f3"+
		"\7r\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5\7w\2\2\u01f5\u01f6\7t\2\2\u01f6"+
		"\u01f7\7g\2\2\u01f7d\3\2\2\2\u01f8\u01f9\7g\2\2\u01f9\u01fa\7p\2\2\u01fa"+
		"\u01fb\7f\2\2\u01fb\u01fc\7e\2\2\u01fc\u01fd\7c\2\2\u01fd\u01fe\7r\2\2"+
		"\u01fe\u01ff\7v\2\2\u01ff\u0200\7w\2\2\u0200\u0201\7t\2\2\u0201\u0202"+
		"\7g\2\2\u0202f\3\2\2\2\u0203\u0204\7e\2\2\u0204\u0205\7q\2\2\u0205\u0206"+
		"\7o\2\2\u0206\u0207\7o\2\2\u0207\u0208\7g\2\2\u0208\u0209\7p\2\2\u0209"+
		"\u020a\7v\2\2\u020ah\3\2\2\2\u020b\u020c\7g\2\2\u020c\u020d\7p\2\2\u020d"+
		"\u020e\7f\2\2\u020e\u020f\7e\2\2\u020f\u0210\7q\2\2\u0210\u0211\7o\2\2"+
		"\u0211\u0212\7o\2\2\u0212\u0213\7g\2\2\u0213\u0214\7p\2\2\u0214\u0215"+
		"\7v\2\2\u0215j\3\2\2\2\u0216\u0217\7t\2\2\u0217\u0218\7c\2\2\u0218\u0219"+
		"\7y\2\2\u0219\u021d\3\2\2\2\u021a\u021c\5\17\7\2\u021b\u021a\3\2\2\2\u021c"+
		"\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2"+
		"\2\2\u021f\u021d\3\2\2\2\u0220\u0221\7\177\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0223\b\65\5\2\u0223l\3\2\2\2\u0224\u0225\7k\2\2\u0225\u0226\7h\2\2\u0226"+
		"n\3\2\2\2\u0227\u0228\7g\2\2\u0228\u0229\7n\2\2\u0229\u022a\7u\2\2\u022a"+
		"\u022b\7g\2\2\u022b\u022c\7k\2\2\u022c\u022d\7h\2\2\u022dp\3\2\2\2\u022e"+
		"\u022f\7g\2\2\u022f\u0230\7p\2\2\u0230\u0231\7f\2\2\u0231\u0232\7k\2\2"+
		"\u0232\u0233\7h\2\2\u0233r\3\2\2\2\u0234\u0235\7w\2\2\u0235\u0236\7p\2"+
		"\2\u0236\u0237\7n\2\2\u0237\u0238\7g\2\2\u0238\u0239\7u\2\2\u0239\u023a"+
		"\7u\2\2\u023at\3\2\2\2\u023b\u023c\7g\2\2\u023c\u023d\7p\2\2\u023d\u023e"+
		"\7f\2\2\u023e\u023f\7w\2\2\u023f\u0240\7p\2\2\u0240\u0241\7n\2\2\u0241"+
		"\u0242\7g\2\2\u0242\u0243\7u\2\2\u0243\u0244\7u\2\2\u0244v\3\2\2\2\u0245"+
		"\u0246\7g\2\2\u0246\u0247\7n\2\2\u0247\u0248\7u\2\2\u0248\u0249\7g\2\2"+
		"\u0249x\3\2\2\2\u024a\u024b\7e\2\2\u024b\u024c\7q\2\2\u024c\u024d\7p\2"+
		"\2\u024d\u024e\7v\2\2\u024e\u024f\7c\2\2\u024f\u0250\7k\2\2\u0250\u0251"+
		"\7p\2\2\u0251\u0252\7u\2\2\u0252z\3\2\2\2\u0253\u0254\7e\2\2\u0254\u0255"+
		"\7c\2\2\u0255\u0256\7u\2\2\u0256\u0257\7g\2\2\u0257|\3\2\2\2\u0258\u0259"+
		"\7g\2\2\u0259\u025a\7p\2\2\u025a\u025b\7f\2\2\u025b\u025c\7e\2\2\u025c"+
		"\u025d\7c\2\2\u025d\u025e\7u\2\2\u025e\u025f\7g\2\2\u025f~\3\2\2\2\u0260"+
		"\u0261\7y\2\2\u0261\u0262\7j\2\2\u0262\u0263\7g\2\2\u0263\u0264\7p\2\2"+
		"\u0264\u0080\3\2\2\2\u0265\u0266\7e\2\2\u0266\u0267\7{\2\2\u0267\u0268"+
		"\7e\2\2\u0268\u0269\7n\2\2\u0269\u026a\7g\2\2\u026a\u0082\3\2\2\2\u026b"+
		"\u026c\7h\2\2\u026c\u026d\7q\2\2\u026d\u026e\7t\2\2\u026e\u0084\3\2\2"+
		"\2\u026f\u0270\7g\2\2\u0270\u0271\7p\2\2\u0271\u0272\7f\2\2\u0272\u0273"+
		"\7h\2\2\u0273\u0274\7q\2\2\u0274\u0275\7t\2\2\u0275\u0086\3\2\2\2\u0276"+
		"\u0277\7k\2\2\u0277\u0278\7p\2\2\u0278\u0088\3\2\2\2\u0279\u027a\7c\2"+
		"\2\u027a\u027b\7p\2\2\u027b\u027c\7f\2\2\u027c\u008a\3\2\2\2\u027d\u027e"+
		"\7q\2\2\u027e\u027f\7t\2\2\u027f\u008c\3\2\2\2\u0280\u0281\7v\2\2\u0281"+
		"\u0282\7c\2\2\u0282\u0283\7d\2\2\u0283\u0284\7n\2\2\u0284\u0285\7g\2\2"+
		"\u0285\u0286\7t\2\2\u0286\u0287\7q\2\2\u0287\u0288\7y\2\2\u0288\u008e"+
		"\3\2\2\2\u0289\u028a\7g\2\2\u028a\u028b\7p\2\2\u028b\u028c\7f\2\2\u028c"+
		"\u028d\7v\2\2\u028d\u028e\7c\2\2\u028e\u028f\7d\2\2\u028f\u0290\7n\2\2"+
		"\u0290\u0291\7g\2\2\u0291\u0292\7t\2\2\u0292\u0293\7q\2\2\u0293\u0294"+
		"\7y\2\2\u0294\u0090\3\2\2\2\u0295\u0296\7c\2\2\u0296\u0297\7u\2\2\u0297"+
		"\u0298\7u\2\2\u0298\u0299\7k\2\2\u0299\u029a\7i\2\2\u029a\u029b\7p\2\2"+
		"\u029b\u0092\3\2\2\2\u029c\u029d\7v\2\2\u029d\u029e\7t\2\2\u029e\u029f"+
		"\7w\2\2\u029f\u02a0\7g\2\2\u02a0\u0094\3\2\2\2\u02a1\u02a2\7h\2\2\u02a2"+
		"\u02a3\7c\2\2\u02a3\u02a4\7n\2\2\u02a4\u02a5\7u\2\2\u02a5\u02a6\7g\2\2"+
		"\u02a6\u0096\3\2\2\2\u02a7\u02a8\7p\2\2\u02a8\u02a9\7k\2\2\u02a9\u02af"+
		"\7n\2\2\u02aa\u02ab\7p\2\2\u02ab\u02ac\7w\2\2\u02ac\u02ad\7n\2\2\u02ad"+
		"\u02af\7n\2\2\u02ae\u02a7\3\2\2\2\u02ae\u02aa\3\2\2\2\u02af\u0098\3\2"+
		"\2\2\u02b0\u02b1\7k\2\2\u02b1\u02b2\7p\2\2\u02b2\u02b3\7e\2\2\u02b3\u02b4"+
		"\7n\2\2\u02b4\u02b5\7w\2\2\u02b5\u02b6\7f\2\2\u02b6\u02b7\7g\2\2\u02b7"+
		"\u009a\3\2\2\2\u02b8\u02b9\7y\2\2\u02b9\u02ba\7k\2\2\u02ba\u02bb\7v\2"+
		"\2\u02bb\u02bc\7j\2\2\u02bc\u009c\3\2\2\2\u02bd\u02be\7q\2\2\u02be\u02bf"+
		"\7h\2\2\u02bf\u02c0\7h\2\2\u02c0\u02c1\7u\2\2\u02c1\u02c2\7g\2\2\u02c2"+
		"\u02c3\7v\2\2\u02c3\u009e\3\2\2\2\u02c4\u02c5\7e\2\2\u02c5\u02c6\7q\2"+
		"\2\u02c6\u02c7\7p\2\2\u02c7\u02c8\7v\2\2\u02c8\u02c9\7k\2\2\u02c9\u02ca"+
		"\7p\2\2\u02ca\u02cb\7w\2\2\u02cb\u02cc\7g\2\2\u02cc\u00a0\3\2\2\2\u02cd"+
		"\u02ce\7t\2\2\u02ce\u02cf\7g\2\2\u02cf\u02d0\7x\2\2\u02d0\u02d1\7g\2\2"+
		"\u02d1\u02d2\7t\2\2\u02d2\u02d3\7u\2\2\u02d3\u02d4\7g\2\2\u02d4\u02d5"+
		"\7f\2\2\u02d5\u00a2\3\2\2\2\u02d6\u02d7\7g\2\2\u02d7\u02d8\7o\2\2\u02d8"+
		"\u02d9\7r\2\2\u02d9\u02da\7v\2\2\u02da\u02db\7{\2\2\u02db\u00a4\3\2\2"+
		"\2\u02dc\u02dd\7d\2\2\u02dd\u02de\7n\2\2\u02de\u02df\7c\2\2\u02df\u02e0"+
		"\7p\2\2\u02e0\u02e1\7m\2\2\u02e1\u00a6\3\2\2\2\u02e2\u02e3\7g\2\2\u02e3"+
		"\u02e4\7p\2\2\u02e4\u02e5\7f\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\5\u00ab"+
		"U\2\u02e7\u00a8\3\2\2\2\u02e8\u02ec\t\t\2\2\u02e9\u02eb\t\n\2\2\u02ea"+
		"\u02e9\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u02f5\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f1\7\60\2\2\u02f0"+
		"\u02f2\t\n\2\2\u02f1\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f1\3\2"+
		"\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02ef\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2"+
		"\2\2\u02f9\u02fa\bT\6\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\bT\7\2\u02fc\u00aa"+
		"\3\2\2\2\u02fd\u0300\5\25\n\2\u02fe\u0300\7a\2\2\u02ff\u02fd\3\2\2\2\u02ff"+
		"\u02fe\3\2\2\2\u0300\u0306\3\2\2\2\u0301\u0305\5\25\n\2\u0302\u0305\t"+
		"\13\2\2\u0303\u0305\5\27\13\2\u0304\u0301\3\2\2\2\u0304\u0302\3\2\2\2"+
		"\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307"+
		"\3\2\2\2\u0307\u00ac\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030d\t\f\2\2\u030a"+
		"\u030c\t\n\2\2\u030b\u030a\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2"+
		"\2\2\u030d\u030e\3\2\2\2\u030e\u0310\3\2\2\2\u030f\u030d\3\2\2\2\u0310"+
		"\u0311\59\34\2\u0311\u0315\t\f\2\2\u0312\u0314\t\n\2\2\u0313\u0312\3\2"+
		"\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"\u00ae\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u0319\7&\2\2\u0319\u031a\7}\2"+
		"\2\u031a\u031e\3\2\2\2\u031b\u031d\5\17\7\2\u031c\u031b\3\2\2\2\u031d"+
		"\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\3\2"+
		"\2\2\u0320\u031e\3\2\2\2\u0321\u0322\7g\2\2\u0322\u0323\7p\2\2\u0323\u0324"+
		"\7f\2\2\u0324\u0325\7t\2\2\u0325\u0326\7c\2\2\u0326\u0327\7y\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u0329\bW\3\2\u0329\u00b0\3\2\2\2\u032a\u032b\13\2"+
		"\2\2\u032b\u00b2\3\2\2\2\61\2\3\4\u00b6\u00c0\u00ca\u00d2\u00d9\u00e3"+
		"\u00ed\u00f5\u00ff\u0108\u0112\u0116\u012c\u0130\u0139\u0144\u0149\u0151"+
		"\u0155\u015c\u0166\u016a\u0170\u017b\u01a9\u01ae\u01b4\u01b7\u01bc\u01c1"+
		"\u01c4\u01c9\u01ce\u021d\u02ae\u02ec\u02f3\u02f7\u02ff\u0304\u0306\u030d"+
		"\u0315\u031e\b\7\3\2\6\2\2\2\3\2\7\4\2\3T\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}