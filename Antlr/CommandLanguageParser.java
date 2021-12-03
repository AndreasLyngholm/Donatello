// Generated from CommandLanguage.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommandLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GET=1, PUT=2, CHANGE=3, DATA=4, METADATA=5, DEPENDENCIES=6, DEPENDENTS=7, 
		STATISTICS=8, FROM=9, IN=10, ABOUT=11, OF=12, FILE=13, NEWLINE=14, WS=15;
	public static final int
		RULE_prog = 0, RULE_sentence = 1, RULE_verb = 2, RULE_object = 3, RULE_preposition = 4, 
		RULE_target = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "sentence", "verb", "object", "preposition", "target"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'get'", "'put'", "'change'", "'data'", "'metadata'", "'dependencies'", 
			"'dependents'", "'statistics'", "'from'", "'in'", "'about'", "'of'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GET", "PUT", "CHANGE", "DATA", "METADATA", "DEPENDENCIES", "DEPENDENTS", 
			"STATISTICS", "FROM", "IN", "ABOUT", "OF", "FILE", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "CommandLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CommandLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode EOF() { return getToken(CommandLanguageParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CommandLanguageParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CommandLanguageParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GET:
			case PUT:
			case CHANGE:
			case WS:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				sentence();
				setState(17);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(13);
						match(NEWLINE);
						setState(14);
						sentence();
						}
						} 
					}
					setState(19);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(20);
					match(NEWLINE);
					}
				}

				setState(23);
				match(EOF);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SentenceContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(CommandLanguageParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CommandLanguageParser.WS, i);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public PrepositionContext preposition() {
			return getRuleContext(PrepositionContext.class,0);
		}
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(28);
				match(WS);
				}
			}

			setState(31);
			verb();
			setState(32);
			match(WS);
			setState(33);
			object();
			setState(34);
			match(WS);
			setState(35);
			preposition();
			setState(36);
			match(WS);
			setState(37);
			target();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(38);
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

	public static class VerbContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CommandLanguageParser.GET, 0); }
		public TerminalNode PUT() { return getToken(CommandLanguageParser.PUT, 0); }
		public TerminalNode CHANGE() { return getToken(CommandLanguageParser.CHANGE, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GET) | (1L << PUT) | (1L << CHANGE))) != 0)) ) {
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(CommandLanguageParser.DATA, 0); }
		public TerminalNode METADATA() { return getToken(CommandLanguageParser.METADATA, 0); }
		public TerminalNode DEPENDENCIES() { return getToken(CommandLanguageParser.DEPENDENCIES, 0); }
		public TerminalNode DEPENDENTS() { return getToken(CommandLanguageParser.DEPENDENTS, 0); }
		public TerminalNode STATISTICS() { return getToken(CommandLanguageParser.STATISTICS, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATA) | (1L << METADATA) | (1L << DEPENDENCIES) | (1L << DEPENDENTS) | (1L << STATISTICS))) != 0)) ) {
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

	public static class PrepositionContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(CommandLanguageParser.FROM, 0); }
		public TerminalNode IN() { return getToken(CommandLanguageParser.IN, 0); }
		public TerminalNode ABOUT() { return getToken(CommandLanguageParser.ABOUT, 0); }
		public TerminalNode OF() { return getToken(CommandLanguageParser.OF, 0); }
		public PrepositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).enterPreposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).exitPreposition(this);
		}
	}

	public final PrepositionContext preposition() throws RecognitionException {
		PrepositionContext _localctx = new PrepositionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_preposition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FROM) | (1L << IN) | (1L << ABOUT) | (1L << OF))) != 0)) ) {
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

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(CommandLanguageParser.FILE, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommandLanguageListener ) ((CommandLanguageListener)listener).exitTarget(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(FILE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\5\2\30\n\2\3\2\3\2\3\2\5\2\35\n\2\3\3\5\3 \n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\2\2\b"+
		"\2\4\6\b\n\f\2\5\3\2\3\5\3\2\6\n\3\2\13\16\2\62\2\34\3\2\2\2\4\37\3\2"+
		"\2\2\6+\3\2\2\2\b-\3\2\2\2\n/\3\2\2\2\f\61\3\2\2\2\16\23\5\4\3\2\17\20"+
		"\7\20\2\2\20\22\5\4\3\2\21\17\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24"+
		"\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\26\30\7\20\2\2\27\26\3\2\2\2\27\30"+
		"\3\2\2\2\30\31\3\2\2\2\31\32\7\2\2\3\32\35\3\2\2\2\33\35\3\2\2\2\34\16"+
		"\3\2\2\2\34\33\3\2\2\2\35\3\3\2\2\2\36 \7\21\2\2\37\36\3\2\2\2\37 \3\2"+
		"\2\2 !\3\2\2\2!\"\5\6\4\2\"#\7\21\2\2#$\5\b\5\2$%\7\21\2\2%&\5\n\6\2&"+
		"\'\7\21\2\2\')\5\f\7\2(*\7\21\2\2)(\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+,\t\2"+
		"\2\2,\7\3\2\2\2-.\t\3\2\2.\t\3\2\2\2/\60\t\4\2\2\60\13\3\2\2\2\61\62\7"+
		"\17\2\2\62\r\3\2\2\2\7\23\27\34\37)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}