// Generated from Nuxt.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NuxtParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, USE=5, SERVICE=6, JSON=7, XML=8, ANY=9, 
		PRINT=10, VARIABLE=11, ALPHA=12, DIGIT=13, NEWLINE=14, WS=15, CODE=16, 
		ANYTHING=17;
	public static final int
		RULE_prog = 0, RULE_print = 1, RULE_code = 2, RULE_statement = 3, RULE_type = 4, 
		RULE_resource = 5, RULE_as = 6, RULE_html = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "print", "code", "statement", "type", "resource", "as", "html"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'${'", "'}'", "'/'", "'as'", "'use'", "'service'", "'json'", "'xml'", 
			null, "'@print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "USE", "SERVICE", "JSON", "XML", "ANY", 
			"PRINT", "VARIABLE", "ALPHA", "DIGIT", "NEWLINE", "WS", "CODE", "ANYTHING"
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

	@Override
	public String getGrammarFileName() { return "Nuxt.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NuxtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(NuxtParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NuxtParser.NEWLINE, i);
		}
		public TerminalNode EOF() { return getToken(NuxtParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==ANYTHING) {
					{
					setState(27);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(16);
						match(T__0);
						setState(20);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case USE:
							{
							setState(17);
							statement();
							}
							break;
						case CODE:
							{
							setState(18);
							code();
							}
							break;
						case PRINT:
							{
							setState(19);
							print();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(22);
						match(T__1);
						setState(24);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(23);
							match(NEWLINE);
							}
						}

						}
						break;
					case ANYTHING:
						{
						setState(26);
						html();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(NuxtParser.PRINT, 0); }
		public List<TerminalNode> ANY() { return getTokens(NuxtParser.ANY); }
		public TerminalNode ANY(int i) {
			return getToken(NuxtParser.ANY, i);
		}
		public List<TerminalNode> WS() { return getTokens(NuxtParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NuxtParser.WS, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(NuxtParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(NuxtParser.VARIABLE, i);
		}
		public List<TerminalNode> CODE() { return getTokens(NuxtParser.CODE); }
		public TerminalNode CODE(int i) {
			return getToken(NuxtParser.CODE, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(PRINT);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ANY) | (1L << VARIABLE) | (1L << WS) | (1L << CODE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ANY) | (1L << VARIABLE) | (1L << WS) | (1L << CODE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(NuxtParser.CODE, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(CODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(NuxtParser.USE, 0); }
		public List<TerminalNode> WS() { return getTokens(NuxtParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NuxtParser.WS, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(USE);
			setState(44);
			match(WS);
			setState(45);
			type();
			setState(46);
			match(WS);
			setState(47);
			resource();
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(48);
				match(WS);
				}
				break;
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(51);
				match(T__3);
				setState(52);
				match(WS);
				setState(53);
				as();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(56);
				match(WS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode SERVICE() { return getToken(NuxtParser.SERVICE, 0); }
		public TerminalNode JSON() { return getToken(NuxtParser.JSON, 0); }
		public TerminalNode XML() { return getToken(NuxtParser.XML, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SERVICE) | (1L << JSON) | (1L << XML))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(NuxtParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(NuxtParser.VARIABLE, i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(VARIABLE);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(62);
				match(T__2);
				setState(63);
				match(VARIABLE);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(NuxtParser.VARIABLE, 0); }
		public AsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).enterAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).exitAs(this);
		}
	}

	public final AsContext as() throws RecognitionException {
		AsContext _localctx = new AsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmlContext extends ParserRuleContext {
		public TerminalNode ANYTHING() { return getToken(NuxtParser.ANYTHING, 0); }
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).exitHtml(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ANYTHING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23L\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\2\3\2\5\2\33\n\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\5\2$\n\2"+
		"\3\3\3\3\6\3(\n\3\r\3\16\3)\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5"+
		"\3\5\3\5\3\5\5\59\n\5\3\5\5\5<\n\5\3\6\3\6\3\7\3\7\3\7\7\7C\n\7\f\7\16"+
		"\7F\13\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\6\2\5\5\13\13"+
		"\r\r\21\22\3\2\b\n\2N\2#\3\2\2\2\4%\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n=\3"+
		"\2\2\2\f?\3\2\2\2\16G\3\2\2\2\20I\3\2\2\2\22\26\7\3\2\2\23\27\5\b\5\2"+
		"\24\27\5\6\4\2\25\27\5\4\3\2\26\23\3\2\2\2\26\24\3\2\2\2\26\25\3\2\2\2"+
		"\27\30\3\2\2\2\30\32\7\4\2\2\31\33\7\20\2\2\32\31\3\2\2\2\32\33\3\2\2"+
		"\2\33\36\3\2\2\2\34\36\5\20\t\2\35\22\3\2\2\2\35\34\3\2\2\2\36!\3\2\2"+
		"\2\37\35\3\2\2\2\37 \3\2\2\2 $\3\2\2\2!\37\3\2\2\2\"$\7\2\2\3#\37\3\2"+
		"\2\2#\"\3\2\2\2$\3\3\2\2\2%\'\7\f\2\2&(\t\2\2\2\'&\3\2\2\2()\3\2\2\2)"+
		"\'\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+,\7\22\2\2,\7\3\2\2\2-.\7\7\2\2./\7\21"+
		"\2\2/\60\5\n\6\2\60\61\7\21\2\2\61\63\5\f\7\2\62\64\7\21\2\2\63\62\3\2"+
		"\2\2\63\64\3\2\2\2\648\3\2\2\2\65\66\7\6\2\2\66\67\7\21\2\2\679\5\16\b"+
		"\28\65\3\2\2\289\3\2\2\29;\3\2\2\2:<\7\21\2\2;:\3\2\2\2;<\3\2\2\2<\t\3"+
		"\2\2\2=>\t\3\2\2>\13\3\2\2\2?D\7\r\2\2@A\7\5\2\2AC\7\r\2\2B@\3\2\2\2C"+
		"F\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\r\3\2\2\2FD\3\2\2\2GH\7\r\2\2H\17\3\2\2"+
		"\2IJ\7\23\2\2J\21\3\2\2\2\f\26\32\35\37#)\638;D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}