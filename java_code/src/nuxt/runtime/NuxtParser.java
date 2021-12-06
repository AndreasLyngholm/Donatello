// Generated from Nuxt.g4 by ANTLR 4.9.3

    package nuxt.runtime;

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
		PRINT=10, Unknown=11, VARIABLE=12, ALPHA=13, DIGIT=14, NEWLINE=15, WS=16, 
		CODE=17;
	public static final int
		RULE_prog = 0, RULE_unknowns = 1, RULE_print = 2, RULE_code = 3, RULE_statement = 4, 
		RULE_type = 5, RULE_resource = 6, RULE_as = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "unknowns", "print", "code", "statement", "type", "resource", 
			"as"
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
			"PRINT", "Unknown", "VARIABLE", "ALPHA", "DIGIT", "NEWLINE", "WS", "CODE"
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
		public List<UnknownsContext> unknowns() {
			return getRuleContexts(UnknownsContext.class);
		}
		public UnknownsContext unknowns(int i) {
			return getRuleContext(UnknownsContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(NuxtParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NuxtParser.WS, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(NuxtParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(NuxtParser.NEWLINE, i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(33);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(16);
					match(T__0);
					setState(18);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(17);
						match(WS);
						}
					}

					setState(23);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USE:
						{
						setState(20);
						statement();
						}
						break;
					case CODE:
						{
						setState(21);
						code();
						}
						break;
					case PRINT:
						{
						setState(22);
						print();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(25);
						match(WS);
						}
					}

					setState(28);
					match(T__1);
					}
					break;
				case Unknown:
					{
					setState(30);
					unknowns();
					}
					break;
				case WS:
					{
					setState(31);
					match(WS);
					}
					break;
				case NEWLINE:
					{
					setState(32);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Unknown) | (1L << NEWLINE) | (1L << WS))) != 0) );
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

	public static class UnknownsContext extends ParserRuleContext {
		public List<TerminalNode> Unknown() { return getTokens(NuxtParser.Unknown); }
		public TerminalNode Unknown(int i) {
			return getToken(NuxtParser.Unknown, i);
		}
		public UnknownsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknowns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).enterUnknowns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtListener ) ((NuxtListener)listener).exitUnknowns(this);
		}
	}

	public final UnknownsContext unknowns() throws RecognitionException {
		UnknownsContext _localctx = new UnknownsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unknowns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(37);
					match(Unknown);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(40); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public List<TerminalNode> WS() { return getTokens(NuxtParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(NuxtParser.WS, i);
		}
		public List<TerminalNode> ANY() { return getTokens(NuxtParser.ANY); }
		public TerminalNode ANY(int i) {
			return getToken(NuxtParser.ANY, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(NuxtParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(NuxtParser.VARIABLE, i);
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
		enterRule(_localctx, 4, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(PRINT);
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(43);
				match(WS);
				}
				break;
			}
			setState(47); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(46);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ANY) | (1L << VARIABLE) | (1L << WS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(49); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 6, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
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
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(USE);
			setState(54);
			match(WS);
			setState(55);
			type();
			setState(56);
			match(WS);
			setState(57);
			resource();
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(58);
				match(WS);
				}
				break;
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(61);
				match(T__3);
				setState(62);
				match(WS);
				setState(63);
				as();
				}
			}

			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(66);
				match(WS);
				}
				break;
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
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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
		enterRule(_localctx, 12, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(VARIABLE);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(72);
				match(T__2);
				setState(73);
				match(VARIABLE);
				}
				}
				setState(78);
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
		enterRule(_localctx, 14, RULE_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\5\2\25\n\2"+
		"\3\2\3\2\3\2\5\2\32\n\2\3\2\5\2\35\n\2\3\2\3\2\3\2\3\2\3\2\6\2$\n\2\r"+
		"\2\16\2%\3\3\6\3)\n\3\r\3\16\3*\3\4\3\4\5\4/\n\4\3\4\6\4\62\n\4\r\4\16"+
		"\4\63\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6>\n\6\3\6\3\6\3\6\5\6C\n\6\3"+
		"\6\5\6F\n\6\3\7\3\7\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\t\3\t\3\t\2"+
		"\2\n\2\4\6\b\n\f\16\20\2\4\6\2\5\5\13\13\16\16\22\22\3\2\b\n\2Z\2#\3\2"+
		"\2\2\4(\3\2\2\2\6,\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\fG\3\2\2\2\16I\3"+
		"\2\2\2\20Q\3\2\2\2\22\24\7\3\2\2\23\25\7\22\2\2\24\23\3\2\2\2\24\25\3"+
		"\2\2\2\25\31\3\2\2\2\26\32\5\n\6\2\27\32\5\b\5\2\30\32\5\6\4\2\31\26\3"+
		"\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\34\3\2\2\2\33\35\7\22\2\2\34\33"+
		"\3\2\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\7\4\2\2\37$\3\2\2\2 $\5\4\3"+
		"\2!$\7\22\2\2\"$\7\21\2\2#\22\3\2\2\2# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$"+
		"%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\')\7\r\2\2(\'\3\2\2\2)*\3\2\2"+
		"\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,.\7\f\2\2-/\7\22\2\2.-\3\2\2\2./\3\2"+
		"\2\2/\61\3\2\2\2\60\62\t\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2"+
		"\2\63\64\3\2\2\2\64\7\3\2\2\2\65\66\7\23\2\2\66\t\3\2\2\2\678\7\7\2\2"+
		"89\7\22\2\29:\5\f\7\2:;\7\22\2\2;=\5\16\b\2<>\7\22\2\2=<\3\2\2\2=>\3\2"+
		"\2\2>B\3\2\2\2?@\7\6\2\2@A\7\22\2\2AC\5\20\t\2B?\3\2\2\2BC\3\2\2\2CE\3"+
		"\2\2\2DF\7\22\2\2ED\3\2\2\2EF\3\2\2\2F\13\3\2\2\2GH\t\3\2\2H\r\3\2\2\2"+
		"IN\7\16\2\2JK\7\5\2\2KM\7\16\2\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2O\17\3\2\2\2PN\3\2\2\2QR\7\16\2\2R\21\3\2\2\2\16\24\31\34#%*.\63=BE"+
		"N";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}