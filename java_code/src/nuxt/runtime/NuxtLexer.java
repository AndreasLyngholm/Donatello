// Generated from Nuxt.g4 by ANTLR 4.9.3
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
		T__0=1, T__1=2, T__2=3, T__3=4, USE=5, SERVICE=6, JSON=7, XML=8, ANY=9, 
		PRINT=10, VARIABLE=11, ALPHA=12, DIGIT=13, NEWLINE=14, WS=15, CODE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "USE", "SERVICE", "JSON", "XML", "ANY", 
			"PRINT", "VARIABLE", "ALPHA", "DIGIT", "NEWLINE", "WS", "CODE"
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
			"PRINT", "VARIABLE", "ALPHA", "DIGIT", "NEWLINE", "WS", "CODE"
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


	public NuxtLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Nuxt.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22g\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\7\fO\n\f\f\f\16\fR\13\f\3\r\3\r\3\16\3"+
		"\16\3\17\5\17Y\n\17\3\17\3\17\3\20\6\20^\n\20\r\20\16\20_\3\21\3\21\6"+
		"\21d\n\21\r\21\16\21e\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\b\3\2\"\"\5\2C\\aac|\3\2\62"+
		";\5\2\13\f\17\17\"\"\4\2C\\c|\7\2*+\60\60\62;B\\c|\2k\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5&\3\2\2\2\7"+
		"(\3\2\2\2\t*\3\2\2\2\13-\3\2\2\2\r\61\3\2\2\2\179\3\2\2\2\21>\3\2\2\2"+
		"\23B\3\2\2\2\25D\3\2\2\2\27K\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35X\3\2\2"+
		"\2\37]\3\2\2\2!a\3\2\2\2#$\7&\2\2$%\7}\2\2%\4\3\2\2\2&\'\7\177\2\2\'\6"+
		"\3\2\2\2()\7\61\2\2)\b\3\2\2\2*+\7c\2\2+,\7u\2\2,\n\3\2\2\2-.\7w\2\2."+
		"/\7u\2\2/\60\7g\2\2\60\f\3\2\2\2\61\62\7u\2\2\62\63\7g\2\2\63\64\7t\2"+
		"\2\64\65\7x\2\2\65\66\7k\2\2\66\67\7e\2\2\678\7g\2\28\16\3\2\2\29:\7l"+
		"\2\2:;\7u\2\2;<\7q\2\2<=\7p\2\2=\20\3\2\2\2>?\7z\2\2?@\7o\2\2@A\7n\2\2"+
		"A\22\3\2\2\2BC\n\2\2\2C\24\3\2\2\2DE\7B\2\2EF\7r\2\2FG\7t\2\2GH\7k\2\2"+
		"HI\7p\2\2IJ\7v\2\2J\26\3\2\2\2KP\5\31\r\2LO\5\31\r\2MO\5\33\16\2NL\3\2"+
		"\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\30\3\2\2\2RP\3\2\2\2ST\t"+
		"\3\2\2T\32\3\2\2\2UV\t\4\2\2V\34\3\2\2\2WY\7\17\2\2XW\3\2\2\2XY\3\2\2"+
		"\2YZ\3\2\2\2Z[\7\f\2\2[\36\3\2\2\2\\^\t\5\2\2]\\\3\2\2\2^_\3\2\2\2_]\3"+
		"\2\2\2_`\3\2\2\2` \3\2\2\2ac\t\6\2\2bd\t\7\2\2cb\3\2\2\2de\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2f\"\3\2\2\2\t\2NPX_ce\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}