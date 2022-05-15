// Generated from DonatelloLexer.g4 by ANTLR 4.9.3

package dk.simpleconcept.donatello;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DonatelloLexer extends Lexer {
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
		CaptureStart=41, CaptureEnd=42, RawStart=43, ParamStart=44, IfStart=45, 
		Elseif=46, IfEnd=47, UnlessStart=48, UnlessEnd=49, Else=50, Contains=51, 
		CaseStart=52, CaseEnd=53, When=54, Cycle=55, ForStart=56, ForEnd=57, In=58, 
		And=59, Or=60, TableStart=61, TableEnd=62, Assign=63, True=64, False=65, 
		Nil=66, Include=67, With=68, Offset=69, Continue=70, Reversed=71, Empty=72, 
		Blank=73, EndId=74, IdChain=75, Id=76, ServiceId=77, Type=78, ParamVar=79, 
		Filter=80, RawEnd=81, OtherRaw=82, ParamEnd=83, OtherParam=84;
	public static final int
		IN_TAG=1, IN_RAW=2, IN_PARAM=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_TAG", "IN_RAW", "IN_PARAM"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OutStart", "TagStart", "Other", "SStr", "DStr", "WhitespaceChar", "SpaceOrTab", 
			"LineBreak", "Letter", "Digit", "OutStart2", "TagStart2", "OutEnd", "TagEnd", 
			"Str", "DotDot", "Dot", "NEq", "Eq", "EqSign", "GtEq", "Gt", "LtEq", 
			"Lt", "Minus", "Pipe", "Col", "Comma", "OPar", "CPar", "OBr", "CBr", 
			"QMark", "Mul", "Div", "Plus", "Add", "PathSep", "DoubleNum", "LongNum", 
			"WS", "Use", "Param", "Service", "Json", "Xml", "As", "CaptureStart", 
			"CaptureEnd", "RawStart", "ParamStart", "IfStart", "Elseif", "IfEnd", 
			"UnlessStart", "UnlessEnd", "Else", "Contains", "CaseStart", "CaseEnd", 
			"When", "Cycle", "ForStart", "ForEnd", "In", "And", "Or", "TableStart", 
			"TableEnd", "Assign", "True", "False", "Nil", "Include", "With", "Offset", 
			"Continue", "Reversed", "Empty", "Blank", "EndId", "IdChain", "Id", "ServiceId", 
			"Type", "ParamVar", "Filter", "RawEnd", "OtherRaw", "ParamEnd", "OtherParam"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'{{'", "'${'", null, null, null, "'..'", "'.'", 
			null, "'=='", "'='", "'>='", "'>'", "'<='", "'<'", "'-'", "'|'", "':'", 
			"','", "'('", "')'", "'['", "']'", "'?'", "'*'", "'/'", "'+'", "'@'", 
			null, null, null, null, "'use'", "'param'", "'service'", "'json'", "'xml'", 
			"'as'", "'capture'", "'endcapture'", null, null, "'if'", "'elseif'", 
			"'endif'", "'unless'", "'endunless'", "'else'", "'contains'", "'case'", 
			"'endcase'", "'when'", "'cycle'", "'for'", "'endfor'", "'in'", "'and'", 
			"'or'", "'tablerow'", "'endtablerow'", "'assign'", "'true'", "'false'", 
			null, "'include'", "'with'", "'offset'", "'continue'", "'reversed'", 
			"'empty'", "'blank'", null, null, null, null, null, null, null, null, 
			null, "'}'"
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
			"CaptureEnd", "RawStart", "ParamStart", "IfStart", "Elseif", "IfEnd", 
			"UnlessStart", "UnlessEnd", "Else", "Contains", "CaseStart", "CaseEnd", 
			"When", "Cycle", "ForStart", "ForEnd", "In", "And", "Or", "TableStart", 
			"TableEnd", "Assign", "True", "False", "Nil", "Include", "With", "Offset", 
			"Continue", "Reversed", "Empty", "Blank", "EndId", "IdChain", "Id", "ServiceId", 
			"Type", "ParamVar", "Filter", "RawEnd", "OtherRaw", "ParamEnd", "OtherParam"
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
	  public DonatelloLexer(CharStream charStream, boolean stripSpacesAroundTags) {
	    this(charStream, stripSpacesAroundTags, false);
	  }

	  public DonatelloLexer(CharStream charStream, boolean stripSpacesAroundTags, boolean stripSingleLine) {
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


	public DonatelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DonatelloLexer.g4"; }

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
		case 81:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u0362\b\1\b\1\b"+
		"\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37"+
		"\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)"+
		"\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;"+
		"\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G"+
		"\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR"+
		"\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\7\2"+
		"\u00be\n\2\f\2\16\2\u00c1\13\2\3\2\3\2\3\2\3\2\3\2\7\2\u00c8\n\2\f\2\16"+
		"\2\u00cb\13\2\3\2\3\2\3\2\3\2\3\2\7\2\u00d2\n\2\f\2\16\2\u00d5\13\2\3"+
		"\2\3\2\3\2\3\2\3\2\5\2\u00dc\n\2\3\2\3\2\3\3\7\3\u00e1\n\3\f\3\16\3\u00e4"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\7\3\u00eb\n\3\f\3\16\3\u00ee\13\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3\u00f5\n\3\f\3\16\3\u00f8\13\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ff"+
		"\n\3\3\3\3\3\3\4\3\4\3\5\3\5\7\5\u0107\n\5\f\5\16\5\u010a\13\5\3\5\3\5"+
		"\3\6\3\6\7\6\u0110\n\6\f\6\16\6\u0113\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\5\t\u011c\n\t\3\t\3\t\5\t\u0120\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0134\n\16\f\16\16\16"+
		"\u0137\13\16\3\16\5\16\u013a\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u0141"+
		"\n\16\f\16\16\16\u0144\13\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u014c"+
		"\n\16\f\16\16\16\u014f\13\16\3\16\3\16\5\16\u0153\n\16\3\16\3\16\3\17"+
		"\3\17\7\17\u0159\n\17\f\17\16\17\u015c\13\17\3\17\5\17\u015f\n\17\3\17"+
		"\3\17\3\17\7\17\u0164\n\17\f\17\16\17\u0167\13\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u016e\n\17\f\17\16\17\u0171\13\17\3\17\5\17\u0174\n\17\3\17"+
		"\3\17\3\20\3\20\5\20\u017a\n\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\5\23\u0185\n\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\5(\u01b3\n(\3(\6(\u01b6\n(\r(\16(\u01b7\3(\3(\6(\u01bc\n(\r(\16(\u01bd"+
		"\3(\5(\u01c1\n(\3(\6(\u01c4\n(\r(\16(\u01c5\3(\3(\3(\5(\u01cb\n(\3)\5"+
		")\u01ce\n)\3)\6)\u01d1\n)\r)\16)\u01d2\3*\6*\u01d6\n*\r*\16*\u01d7\3*"+
		"\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3."+
		"\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\7\63\u0212\n\63\f\63\16\63\u0215\13\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0222\n\64\f\64\16\64\u0225\13"+
		"\64\3\64\3\64\7\64\u0229\n\64\f\64\16\64\u022c\13\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\3:\3"+
		":\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3"+
		"A\3A\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3"+
		"I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\5J\u02bc\nJ\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3"+
		"R\3R\3R\3S\3S\7S\u02f8\nS\fS\16S\u02fb\13S\3S\3S\6S\u02ff\nS\rS\16S\u0300"+
		"\6S\u0303\nS\rS\16S\u0304\3S\3S\3S\3S\3T\3T\5T\u030d\nT\3T\3T\3T\7T\u0312"+
		"\nT\fT\16T\u0315\13T\3U\3U\5U\u0319\nU\3U\3U\3U\7U\u031e\nU\fU\16U\u0321"+
		"\13U\3V\3V\7V\u0325\nV\fV\16V\u0328\13V\3W\3W\7W\u032c\nW\fW\16W\u032f"+
		"\13W\3W\5W\u0332\nW\3W\3W\3W\7W\u0337\nW\fW\16W\u033a\13W\3X\3X\7X\u033e"+
		"\nX\fX\16X\u0341\13X\3X\3X\6X\u0345\nX\rX\16X\u0346\3Y\3Y\3Y\3Y\7Y\u034d"+
		"\nY\fY\16Y\u0350\13Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3\\"+
		"\3\\\2\2]\6\3\b\4\n\5\f\2\16\2\20\2\22\2\24\2\26\2\30\2\32\6\34\7\36\b"+
		" \t\"\n$\13&\f(\r*\16,\17.\20\60\21\62\22\64\23\66\248\25:\26<\27>\30"+
		"@\31B\32D\33F\34H\35J\36L\37N P!R\"T#V$X%Z&\\\'^(`)b*d+f,h-j.l/n\60p\61"+
		"r\62t\63v\64x\65z\66|\67~8\u00809\u0082:\u0084;\u0086<\u0088=\u008a>\u008c"+
		"?\u008e@\u0090A\u0092B\u0094C\u0096D\u0098E\u009aF\u009cG\u009eH\u00a0"+
		"I\u00a2J\u00a4K\u00a6L\u00a8M\u00aaN\u00acO\u00aeP\u00b0Q\u00b2R\u00b4"+
		"S\u00b6T\u00b8U\u00baV\6\2\3\4\5\17\3\2))\3\2$$\5\2\13\f\17\17\"\"\4\2"+
		"\13\13\"\"\4\2C\\c|\3\2\62;\4\2\61\61^^\5\2C\\aac|\6\2\62;C\\aac|\5\2"+
		"//\61\61aa\4\2\60\60aa\4\2/\61aa\3\2c|\2\u0396\2\6\3\2\2\2\2\b\3\2\2\2"+
		"\2\n\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2"+
		"\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2"+
		"\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3\2\2\2\3:\3\2"+
		"\2\2\3<\3\2\2\2\3>\3\2\2\2\3@\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\3F\3\2\2\2"+
		"\3H\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\3N\3\2\2\2\3P\3\2\2\2\3R\3\2\2\2\3T"+
		"\3\2\2\2\3V\3\2\2\2\3X\3\2\2\2\3Z\3\2\2\2\3\\\3\2\2\2\3^\3\2\2\2\3`\3"+
		"\2\2\2\3b\3\2\2\2\3d\3\2\2\2\3f\3\2\2\2\3h\3\2\2\2\3j\3\2\2\2\3l\3\2\2"+
		"\2\3n\3\2\2\2\3p\3\2\2\2\3r\3\2\2\2\3t\3\2\2\2\3v\3\2\2\2\3x\3\2\2\2\3"+
		"z\3\2\2\2\3|\3\2\2\2\3~\3\2\2\2\3\u0080\3\2\2\2\3\u0082\3\2\2\2\3\u0084"+
		"\3\2\2\2\3\u0086\3\2\2\2\3\u0088\3\2\2\2\3\u008a\3\2\2\2\3\u008c\3\2\2"+
		"\2\3\u008e\3\2\2\2\3\u0090\3\2\2\2\3\u0092\3\2\2\2\3\u0094\3\2\2\2\3\u0096"+
		"\3\2\2\2\3\u0098\3\2\2\2\3\u009a\3\2\2\2\3\u009c\3\2\2\2\3\u009e\3\2\2"+
		"\2\3\u00a0\3\2\2\2\3\u00a2\3\2\2\2\3\u00a4\3\2\2\2\3\u00a6\3\2\2\2\3\u00a8"+
		"\3\2\2\2\3\u00aa\3\2\2\2\3\u00ac\3\2\2\2\3\u00ae\3\2\2\2\3\u00b0\3\2\2"+
		"\2\3\u00b2\3\2\2\2\4\u00b4\3\2\2\2\4\u00b6\3\2\2\2\5\u00b8\3\2\2\2\5\u00ba"+
		"\3\2\2\2\6\u00db\3\2\2\2\b\u00fe\3\2\2\2\n\u0102\3\2\2\2\f\u0104\3\2\2"+
		"\2\16\u010d\3\2\2\2\20\u0116\3\2\2\2\22\u0118\3\2\2\2\24\u011f\3\2\2\2"+
		"\26\u0121\3\2\2\2\30\u0123\3\2\2\2\32\u0125\3\2\2\2\34\u012a\3\2\2\2\36"+
		"\u0152\3\2\2\2 \u0173\3\2\2\2\"\u0179\3\2\2\2$\u017b\3\2\2\2&\u017e\3"+
		"\2\2\2(\u0184\3\2\2\2*\u0186\3\2\2\2,\u0189\3\2\2\2.\u018b\3\2\2\2\60"+
		"\u018e\3\2\2\2\62\u0190\3\2\2\2\64\u0193\3\2\2\2\66\u0195\3\2\2\28\u0197"+
		"\3\2\2\2:\u0199\3\2\2\2<\u019b\3\2\2\2>\u019d\3\2\2\2@\u019f\3\2\2\2B"+
		"\u01a1\3\2\2\2D\u01a3\3\2\2\2F\u01a5\3\2\2\2H\u01a7\3\2\2\2J\u01a9\3\2"+
		"\2\2L\u01ab\3\2\2\2N\u01ad\3\2\2\2P\u01af\3\2\2\2R\u01ca\3\2\2\2T\u01cd"+
		"\3\2\2\2V\u01d5\3\2\2\2X\u01db\3\2\2\2Z\u01df\3\2\2\2\\\u01e5\3\2\2\2"+
		"^\u01ed\3\2\2\2`\u01f2\3\2\2\2b\u01f6\3\2\2\2d\u01f9\3\2\2\2f\u0201\3"+
		"\2\2\2h\u020c\3\2\2\2j\u021a\3\2\2\2l\u0231\3\2\2\2n\u0234\3\2\2\2p\u023b"+
		"\3\2\2\2r\u0241\3\2\2\2t\u0248\3\2\2\2v\u0252\3\2\2\2x\u0257\3\2\2\2z"+
		"\u0260\3\2\2\2|\u0265\3\2\2\2~\u026d\3\2\2\2\u0080\u0272\3\2\2\2\u0082"+
		"\u0278\3\2\2\2\u0084\u027c\3\2\2\2\u0086\u0283\3\2\2\2\u0088\u0286\3\2"+
		"\2\2\u008a\u028a\3\2\2\2\u008c\u028d\3\2\2\2\u008e\u0296\3\2\2\2\u0090"+
		"\u02a2\3\2\2\2\u0092\u02a9\3\2\2\2\u0094\u02ae\3\2\2\2\u0096\u02bb\3\2"+
		"\2\2\u0098\u02bd\3\2\2\2\u009a\u02c5\3\2\2\2\u009c\u02ca\3\2\2\2\u009e"+
		"\u02d1\3\2\2\2\u00a0\u02da\3\2\2\2\u00a2\u02e3\3\2\2\2\u00a4\u02e9\3\2"+
		"\2\2\u00a6\u02ef\3\2\2\2\u00a8\u02f5\3\2\2\2\u00aa\u030c\3\2\2\2\u00ac"+
		"\u0318\3\2\2\2\u00ae\u0322\3\2\2\2\u00b0\u0329\3\2\2\2\u00b2\u033b\3\2"+
		"\2\2\u00b4\u0348\3\2\2\2\u00b6\u035a\3\2\2\2\u00b8\u035c\3\2\2\2\u00ba"+
		"\u0360\3\2\2\2\u00bc\u00be\5\22\b\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3"+
		"\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3\u00c4\7}\2\2\u00c4\u00c5\3\2\2"+
		"\2\u00c5\u00dc\6\2\2\2\u00c6\u00c8\5\20\7\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7}\2\2\u00cd\u00ce\7}\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00dc\6\2\3\2\u00d0\u00d2\5\20\7\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7}\2\2\u00d7\u00d8\7}\2\2\u00d8"+
		"\u00dc\7/\2\2\u00d9\u00da\7}\2\2\u00da\u00dc\7}\2\2\u00db\u00bf\3\2\2"+
		"\2\u00db\u00c9\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\b\2\2\2\u00de\7\3\2\2\2\u00df\u00e1\5\22\b\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7&\2\2\u00e6"+
		"\u00e7\7}\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ff\6\3\4\2\u00e9\u00eb\5\20"+
		"\7\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7&"+
		"\2\2\u00f0\u00f1\7}\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00ff\6\3\5\2\u00f3"+
		"\u00f5\5\20\7\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fa\7&\2\2\u00fa\u00fb\7}\2\2\u00fb\u00ff\7/\2\2\u00fc\u00fd\7&\2\2"+
		"\u00fd\u00ff\7}\2\2\u00fe\u00e2\3\2\2\2\u00fe\u00ec\3\2\2\2\u00fe\u00f6"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b\3\2\2\u0101"+
		"\t\3\2\2\2\u0102\u0103\13\2\2\2\u0103\13\3\2\2\2\u0104\u0108\7)\2\2\u0105"+
		"\u0107\n\2\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\7)\2\2\u010c\r\3\2\2\2\u010d\u0111\7$\2\2\u010e\u0110\n\3\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7$\2\2\u0115"+
		"\17\3\2\2\2\u0116\u0117\t\4\2\2\u0117\21\3\2\2\2\u0118\u0119\t\5\2\2\u0119"+
		"\23\3\2\2\2\u011a\u011c\7\17\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2"+
		"\2\u011c\u011d\3\2\2\2\u011d\u0120\7\f\2\2\u011e\u0120\7\17\2\2\u011f"+
		"\u011b\3\2\2\2\u011f\u011e\3\2\2\2\u0120\25\3\2\2\2\u0121\u0122\t\6\2"+
		"\2\u0122\27\3\2\2\2\u0123\u0124\t\7\2\2\u0124\31\3\2\2\2\u0125\u0126\7"+
		"}\2\2\u0126\u0127\7}\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b\f\2\2\u0129"+
		"\33\3\2\2\2\u012a\u012b\7&\2\2\u012b\u012c\7}\2\2\u012c\u012d\3\2\2\2"+
		"\u012d\u012e\b\r\2\2\u012e\35\3\2\2\2\u012f\u0130\7\177\2\2\u0130\u0131"+
		"\7\177\2\2\u0131\u0135\3\2\2\2\u0132\u0134\5\22\b\2\u0133\u0132\3\2\2"+
		"\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\5\24\t\2\u0139\u0138\3\2\2\2"+
		"\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0153\6\16\6\2\u013c\u013d"+
		"\7\177\2\2\u013d\u013e\7\177\2\2\u013e\u0142\3\2\2\2\u013f\u0141\5\20"+
		"\7\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0153\6\16"+
		"\7\2\u0146\u0147\7/\2\2\u0147\u0148\7\177\2\2\u0148\u0149\7\177\2\2\u0149"+
		"\u014d\3\2\2\2\u014a\u014c\5\20\7\2\u014b\u014a\3\2\2\2\u014c\u014f\3"+
		"\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0153\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0151\7\177\2\2\u0151\u0153\7\177\2\2\u0152\u012f"+
		"\3\2\2\2\u0152\u013c\3\2\2\2\u0152\u0146\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\b\16\3\2\u0155\37\3\2\2\2\u0156\u015a\7\177"+
		"\2\2\u0157\u0159\5\22\b\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015d\u015f\5\24\t\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0174\6\17\b\2\u0161\u0165\7\177\2\2\u0162\u0164"+
		"\5\20\7\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2"+
		"\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0174"+
		"\6\17\t\2\u0169\u016a\7/\2\2\u016a\u016b\7\177\2\2\u016b\u016f\3\2\2\2"+
		"\u016c\u016e\5\20\7\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0174\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0174\7\177\2\2\u0173\u0156\3\2\2\2\u0173\u0161\3\2\2\2\u0173\u0169\3"+
		"\2\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\b\17\3\2\u0176"+
		"!\3\2\2\2\u0177\u017a\5\f\5\2\u0178\u017a\5\16\6\2\u0179\u0177\3\2\2\2"+
		"\u0179\u0178\3\2\2\2\u017a#\3\2\2\2\u017b\u017c\7\60\2\2\u017c\u017d\7"+
		"\60\2\2\u017d%\3\2\2\2\u017e\u017f\7\60\2\2\u017f\'\3\2\2\2\u0180\u0181"+
		"\7#\2\2\u0181\u0185\7?\2\2\u0182\u0183\7>\2\2\u0183\u0185\7@\2\2\u0184"+
		"\u0180\3\2\2\2\u0184\u0182\3\2\2\2\u0185)\3\2\2\2\u0186\u0187\7?\2\2\u0187"+
		"\u0188\7?\2\2\u0188+\3\2\2\2\u0189\u018a\7?\2\2\u018a-\3\2\2\2\u018b\u018c"+
		"\7@\2\2\u018c\u018d\7?\2\2\u018d/\3\2\2\2\u018e\u018f\7@\2\2\u018f\61"+
		"\3\2\2\2\u0190\u0191\7>\2\2\u0191\u0192\7?\2\2\u0192\63\3\2\2\2\u0193"+
		"\u0194\7>\2\2\u0194\65\3\2\2\2\u0195\u0196\7/\2\2\u0196\67\3\2\2\2\u0197"+
		"\u0198\7~\2\2\u01989\3\2\2\2\u0199\u019a\7<\2\2\u019a;\3\2\2\2\u019b\u019c"+
		"\7.\2\2\u019c=\3\2\2\2\u019d\u019e\7*\2\2\u019e?\3\2\2\2\u019f\u01a0\7"+
		"+\2\2\u01a0A\3\2\2\2\u01a1\u01a2\7]\2\2\u01a2C\3\2\2\2\u01a3\u01a4\7_"+
		"\2\2\u01a4E\3\2\2\2\u01a5\u01a6\7A\2\2\u01a6G\3\2\2\2\u01a7\u01a8\7,\2"+
		"\2\u01a8I\3\2\2\2\u01a9\u01aa\7\61\2\2\u01aaK\3\2\2\2\u01ab\u01ac\7-\2"+
		"\2\u01acM\3\2\2\2\u01ad\u01ae\7B\2\2\u01aeO\3\2\2\2\u01af\u01b0\t\b\2"+
		"\2\u01b0Q\3\2\2\2\u01b1\u01b3\7/\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3"+
		"\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b6\5\30\13\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01bb\7\60\2\2\u01ba\u01bc\5\30\13\2\u01bb\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01cb\3\2"+
		"\2\2\u01bf\u01c1\7/\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c3\3\2\2\2\u01c2\u01c4\5\30\13\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3"+
		"\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c8\7\60\2\2\u01c8\u01c9\6(\n\2\u01c9\u01cb\3\2\2\2\u01ca\u01b2\3\2"+
		"\2\2\u01ca\u01c0\3\2\2\2\u01cbS\3\2\2\2\u01cc\u01ce\7/\2\2\u01cd\u01cc"+
		"\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01d1\5\30\13\2"+
		"\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3U\3\2\2\2\u01d4\u01d6\5\20\7\2\u01d5\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01da\b*\4\2\u01daW\3\2\2\2\u01db\u01dc\7w\2\2\u01dc\u01dd"+
		"\7u\2\2\u01dd\u01de\7g\2\2\u01deY\3\2\2\2\u01df\u01e0\7r\2\2\u01e0\u01e1"+
		"\7c\2\2\u01e1\u01e2\7t\2\2\u01e2\u01e3\7c\2\2\u01e3\u01e4\7o\2\2\u01e4"+
		"[\3\2\2\2\u01e5\u01e6\7u\2\2\u01e6\u01e7\7g\2\2\u01e7\u01e8\7t\2\2\u01e8"+
		"\u01e9\7x\2\2\u01e9\u01ea\7k\2\2\u01ea\u01eb\7e\2\2\u01eb\u01ec\7g\2\2"+
		"\u01ec]\3\2\2\2\u01ed\u01ee\7l\2\2\u01ee\u01ef\7u\2\2\u01ef\u01f0\7q\2"+
		"\2\u01f0\u01f1\7p\2\2\u01f1_\3\2\2\2\u01f2\u01f3\7z\2\2\u01f3\u01f4\7"+
		"o\2\2\u01f4\u01f5\7n\2\2\u01f5a\3\2\2\2\u01f6\u01f7\7c\2\2\u01f7\u01f8"+
		"\7u\2\2\u01f8c\3\2\2\2\u01f9\u01fa\7e\2\2\u01fa\u01fb\7c\2\2\u01fb\u01fc"+
		"\7r\2\2\u01fc\u01fd\7v\2\2\u01fd\u01fe\7w\2\2\u01fe\u01ff\7t\2\2\u01ff"+
		"\u0200\7g\2\2\u0200e\3\2\2\2\u0201\u0202\7g\2\2\u0202\u0203\7p\2\2\u0203"+
		"\u0204\7f\2\2\u0204\u0205\7e\2\2\u0205\u0206\7c\2\2\u0206\u0207\7r\2\2"+
		"\u0207\u0208\7v\2\2\u0208\u0209\7w\2\2\u0209\u020a\7t\2\2\u020a\u020b"+
		"\7g\2\2\u020bg\3\2\2\2\u020c\u020d\7t\2\2\u020d\u020e\7c\2\2\u020e\u020f"+
		"\7y\2\2\u020f\u0213\3\2\2\2\u0210\u0212\5\20\7\2\u0211\u0210\3\2\2\2\u0212"+
		"\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2"+
		"\2\2\u0215\u0213\3\2\2\2\u0216\u0217\7\177\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0219\b\63\5\2\u0219i\3\2\2\2\u021a\u021b\7r\2\2\u021b\u021c\7c\2\2\u021c"+
		"\u021d\7t\2\2\u021d\u021e\7c\2\2\u021e\u021f\7o\2\2\u021f\u0223\3\2\2"+
		"\2\u0220\u0222\5\20\7\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0226\u022a\5\u00aeV\2\u0227\u0229\5\20\7\2\u0228\u0227\3\2\2\2\u0229"+
		"\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2"+
		"\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7}\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0230\b\64\6\2\u0230k\3\2\2\2\u0231\u0232\7k\2\2\u0232\u0233\7h\2\2\u0233"+
		"m\3\2\2\2\u0234\u0235\7g\2\2\u0235\u0236\7n\2\2\u0236\u0237\7u\2\2\u0237"+
		"\u0238\7g\2\2\u0238\u0239\7k\2\2\u0239\u023a\7h\2\2\u023ao\3\2\2\2\u023b"+
		"\u023c\7g\2\2\u023c\u023d\7p\2\2\u023d\u023e\7f\2\2\u023e\u023f\7k\2\2"+
		"\u023f\u0240\7h\2\2\u0240q\3\2\2\2\u0241\u0242\7w\2\2\u0242\u0243\7p\2"+
		"\2\u0243\u0244\7n\2\2\u0244\u0245\7g\2\2\u0245\u0246\7u\2\2\u0246\u0247"+
		"\7u\2\2\u0247s\3\2\2\2\u0248\u0249\7g\2\2\u0249\u024a\7p\2\2\u024a\u024b"+
		"\7f\2\2\u024b\u024c\7w\2\2\u024c\u024d\7p\2\2\u024d\u024e\7n\2\2\u024e"+
		"\u024f\7g\2\2\u024f\u0250\7u\2\2\u0250\u0251\7u\2\2\u0251u\3\2\2\2\u0252"+
		"\u0253\7g\2\2\u0253\u0254\7n\2\2\u0254\u0255\7u\2\2\u0255\u0256\7g\2\2"+
		"\u0256w\3\2\2\2\u0257\u0258\7e\2\2\u0258\u0259\7q\2\2\u0259\u025a\7p\2"+
		"\2\u025a\u025b\7v\2\2\u025b\u025c\7c\2\2\u025c\u025d\7k\2\2\u025d\u025e"+
		"\7p\2\2\u025e\u025f\7u\2\2\u025fy\3\2\2\2\u0260\u0261\7e\2\2\u0261\u0262"+
		"\7c\2\2\u0262\u0263\7u\2\2\u0263\u0264\7g\2\2\u0264{\3\2\2\2\u0265\u0266"+
		"\7g\2\2\u0266\u0267\7p\2\2\u0267\u0268\7f\2\2\u0268\u0269\7e\2\2\u0269"+
		"\u026a\7c\2\2\u026a\u026b\7u\2\2\u026b\u026c\7g\2\2\u026c}\3\2\2\2\u026d"+
		"\u026e\7y\2\2\u026e\u026f\7j\2\2\u026f\u0270\7g\2\2\u0270\u0271\7p\2\2"+
		"\u0271\177\3\2\2\2\u0272\u0273\7e\2\2\u0273\u0274\7{\2\2\u0274\u0275\7"+
		"e\2\2\u0275\u0276\7n\2\2\u0276\u0277\7g\2\2\u0277\u0081\3\2\2\2\u0278"+
		"\u0279\7h\2\2\u0279\u027a\7q\2\2\u027a\u027b\7t\2\2\u027b\u0083\3\2\2"+
		"\2\u027c\u027d\7g\2\2\u027d\u027e\7p\2\2\u027e\u027f\7f\2\2\u027f\u0280"+
		"\7h\2\2\u0280\u0281\7q\2\2\u0281\u0282\7t\2\2\u0282\u0085\3\2\2\2\u0283"+
		"\u0284\7k\2\2\u0284\u0285\7p\2\2\u0285\u0087\3\2\2\2\u0286\u0287\7c\2"+
		"\2\u0287\u0288\7p\2\2\u0288\u0289\7f\2\2\u0289\u0089\3\2\2\2\u028a\u028b"+
		"\7q\2\2\u028b\u028c\7t\2\2\u028c\u008b\3\2\2\2\u028d\u028e\7v\2\2\u028e"+
		"\u028f\7c\2\2\u028f\u0290\7d\2\2\u0290\u0291\7n\2\2\u0291\u0292\7g\2\2"+
		"\u0292\u0293\7t\2\2\u0293\u0294\7q\2\2\u0294\u0295\7y\2\2\u0295\u008d"+
		"\3\2\2\2\u0296\u0297\7g\2\2\u0297\u0298\7p\2\2\u0298\u0299\7f\2\2\u0299"+
		"\u029a\7v\2\2\u029a\u029b\7c\2\2\u029b\u029c\7d\2\2\u029c\u029d\7n\2\2"+
		"\u029d\u029e\7g\2\2\u029e\u029f\7t\2\2\u029f\u02a0\7q\2\2\u02a0\u02a1"+
		"\7y\2\2\u02a1\u008f\3\2\2\2\u02a2\u02a3\7c\2\2\u02a3\u02a4\7u\2\2\u02a4"+
		"\u02a5\7u\2\2\u02a5\u02a6\7k\2\2\u02a6\u02a7\7i\2\2\u02a7\u02a8\7p\2\2"+
		"\u02a8\u0091\3\2\2\2\u02a9\u02aa\7v\2\2\u02aa\u02ab\7t\2\2\u02ab\u02ac"+
		"\7w\2\2\u02ac\u02ad\7g\2\2\u02ad\u0093\3\2\2\2\u02ae\u02af\7h\2\2\u02af"+
		"\u02b0\7c\2\2\u02b0\u02b1\7n\2\2\u02b1\u02b2\7u\2\2\u02b2\u02b3\7g\2\2"+
		"\u02b3\u0095\3\2\2\2\u02b4\u02b5\7p\2\2\u02b5\u02b6\7k\2\2\u02b6\u02bc"+
		"\7n\2\2\u02b7\u02b8\7p\2\2\u02b8\u02b9\7w\2\2\u02b9\u02ba\7n\2\2\u02ba"+
		"\u02bc\7n\2\2\u02bb\u02b4\3\2\2\2\u02bb\u02b7\3\2\2\2\u02bc\u0097\3\2"+
		"\2\2\u02bd\u02be\7k\2\2\u02be\u02bf\7p\2\2\u02bf\u02c0\7e\2\2\u02c0\u02c1"+
		"\7n\2\2\u02c1\u02c2\7w\2\2\u02c2\u02c3\7f\2\2\u02c3\u02c4\7g\2\2\u02c4"+
		"\u0099\3\2\2\2\u02c5\u02c6\7y\2\2\u02c6\u02c7\7k\2\2\u02c7\u02c8\7v\2"+
		"\2\u02c8\u02c9\7j\2\2\u02c9\u009b\3\2\2\2\u02ca\u02cb\7q\2\2\u02cb\u02cc"+
		"\7h\2\2\u02cc\u02cd\7h\2\2\u02cd\u02ce\7u\2\2\u02ce\u02cf\7g\2\2\u02cf"+
		"\u02d0\7v\2\2\u02d0\u009d\3\2\2\2\u02d1\u02d2\7e\2\2\u02d2\u02d3\7q\2"+
		"\2\u02d3\u02d4\7p\2\2\u02d4\u02d5\7v\2\2\u02d5\u02d6\7k\2\2\u02d6\u02d7"+
		"\7p\2\2\u02d7\u02d8\7w\2\2\u02d8\u02d9\7g\2\2\u02d9\u009f\3\2\2\2\u02da"+
		"\u02db\7t\2\2\u02db\u02dc\7g\2\2\u02dc\u02dd\7x\2\2\u02dd\u02de\7g\2\2"+
		"\u02de\u02df\7t\2\2\u02df\u02e0\7u\2\2\u02e0\u02e1\7g\2\2\u02e1\u02e2"+
		"\7f\2\2\u02e2\u00a1\3\2\2\2\u02e3\u02e4\7g\2\2\u02e4\u02e5\7o\2\2\u02e5"+
		"\u02e6\7r\2\2\u02e6\u02e7\7v\2\2\u02e7\u02e8\7{\2\2\u02e8\u00a3\3\2\2"+
		"\2\u02e9\u02ea\7d\2\2\u02ea\u02eb\7n\2\2\u02eb\u02ec\7c\2\2\u02ec\u02ed"+
		"\7p\2\2\u02ed\u02ee\7m\2\2\u02ee\u00a5\3\2\2\2\u02ef\u02f0\7g\2\2\u02f0"+
		"\u02f1\7p\2\2\u02f1\u02f2\7f\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\5\u00aa"+
		"T\2\u02f4\u00a7\3\2\2\2\u02f5\u02f9\t\t\2\2\u02f6\u02f8\t\n\2\2\u02f7"+
		"\u02f6\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2"+
		"\2\2\u02fa\u0302\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02fe\7\60\2\2\u02fd"+
		"\u02ff\t\n\2\2\u02fe\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u02fe\3\2"+
		"\2\2\u0300\u0301\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u02fc\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\3\2"+
		"\2\2\u0306\u0307\bS\7\2\u0307\u0308\3\2\2\2\u0308\u0309\bS\b\2\u0309\u00a9"+
		"\3\2\2\2\u030a\u030d\5\26\n\2\u030b\u030d\7a\2\2\u030c\u030a\3\2\2\2\u030c"+
		"\u030b\3\2\2\2\u030d\u0313\3\2\2\2\u030e\u0312\5\26\n\2\u030f\u0312\t"+
		"\13\2\2\u0310\u0312\5\30\13\2\u0311\u030e\3\2\2\2\u0311\u030f\3\2\2\2"+
		"\u0311\u0310\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314"+
		"\3\2\2\2\u0314\u00ab\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0319\5\26\n\2"+
		"\u0317\u0319\t\f\2\2\u0318\u0316\3\2\2\2\u0318\u0317\3\2\2\2\u0319\u031f"+
		"\3\2\2\2\u031a\u031e\5\26\n\2\u031b\u031e\t\r\2\2\u031c\u031e\5\30\13"+
		"\2\u031d\u031a\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031c\3\2\2\2\u031e\u0321"+
		"\3\2\2\2\u031f\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u00ad\3\2\2\2\u0321"+
		"\u031f\3\2\2\2\u0322\u0326\t\16\2\2\u0323\u0325\t\n\2\2\u0324\u0323\3"+
		"\2\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u00af\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032d\t\16\2\2\u032a\u032c\t"+
		"\n\2\2\u032b\u032a\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d"+
		"\u032e\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0332\5F"+
		"\"\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u0334\5:\34\2\u0334\u0338\t\16\2\2\u0335\u0337\t\n\2\2\u0336\u0335\3"+
		"\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u00b1\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033f\t\16\2\2\u033c\u033e\t"+
		"\n\2\2\u033d\u033c\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u0340\u0342\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0344\5N"+
		"&\2\u0343\u0345\t\n\2\2\u0344\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346"+
		"\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u00b3\3\2\2\2\u0348\u0349\7&"+
		"\2\2\u0349\u034a\7}\2\2\u034a\u034e\3\2\2\2\u034b\u034d\5\20\7\2\u034c"+
		"\u034b\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2"+
		"\2\2\u034f\u0351\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u0352\7g\2\2\u0352"+
		"\u0353\7p\2\2\u0353\u0354\7f\2\2\u0354\u0355\7t\2\2\u0355\u0356\7c\2\2"+
		"\u0356\u0357\7y\2\2\u0357\u0358\3\2\2\2\u0358\u0359\bY\3\2\u0359\u00b5"+
		"\3\2\2\2\u035a\u035b\13\2\2\2\u035b\u00b7\3\2\2\2\u035c\u035d\7\177\2"+
		"\2\u035d\u035e\3\2\2\2\u035e\u035f\b[\3\2\u035f\u00b9\3\2\2\2\u0360\u0361"+
		"\13\2\2\2\u0361\u00bb\3\2\2\2;\2\3\4\5\u00bf\u00c9\u00d3\u00db\u00e2\u00ec"+
		"\u00f6\u00fe\u0108\u0111\u011b\u011f\u0135\u0139\u0142\u014d\u0152\u015a"+
		"\u015e\u0165\u016f\u0173\u0179\u0184\u01b2\u01b7\u01bd\u01c0\u01c5\u01ca"+
		"\u01cd\u01d2\u01d7\u0213\u0223\u022a\u02bb\u02f9\u0300\u0304\u030c\u0311"+
		"\u0313\u0318\u031d\u031f\u0326\u032d\u0331\u0338\u033f\u0346\u034e\t\7"+
		"\3\2\6\2\2\2\3\2\7\4\2\7\5\2\3S\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}