// Generated from NuxtParser.g4 by ANTLR 4.9.3

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
		OutStart=1, TagStart=2, Other=3, OutStart2=4, TagStart2=5, OutEnd=6, TagEnd=7, 
		Str=8, DotDot=9, Dot=10, NEq=11, Eq=12, EqSign=13, GtEq=14, Gt=15, LtEq=16, 
		Lt=17, Minus=18, Pipe=19, Col=20, Comma=21, OPar=22, CPar=23, OBr=24, 
		CBr=25, QMark=26, Mul=27, Div=28, Plus=29, Add=30, PathSep=31, DoubleNum=32, 
		LongNum=33, WS=34, Use=35, Service=36, Json=37, Xml=38, As=39, CaptureStart=40, 
		CaptureEnd=41, CommentStart=42, CommentEnd=43, RawStart=44, IfStart=45, 
		Elseif=46, IfEnd=47, UnlessStart=48, UnlessEnd=49, Else=50, Contains=51, 
		CaseStart=52, CaseEnd=53, When=54, Cycle=55, ForStart=56, ForEnd=57, In=58, 
		And=59, Or=60, TableStart=61, TableEnd=62, Assign=63, True=64, False=65, 
		Nil=66, Include=67, With=68, Offset=69, Continue=70, Reversed=71, Empty=72, 
		Blank=73, EndId=74, IdChain=75, Id=76, RawEnd=77, OtherRaw=78;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_atom = 2, RULE_tag = 3, RULE_use_tag = 4, 
		RULE_code_tag = 5, RULE_other_tag = 6, RULE_continue_tag = 7, RULE_other_tag_block = 8, 
		RULE_raw_tag = 9, RULE_raw_body = 10, RULE_comment_tag = 11, RULE_other_than_tag_start = 12, 
		RULE_other_than_tag_start_and_ifs = 13, RULE_if_tag = 14, RULE_elseif_tag = 15, 
		RULE_else_tag = 16, RULE_unless_tag = 17, RULE_case_tag = 18, RULE_when_tag = 19, 
		RULE_cycle_tag = 20, RULE_cycle_group = 21, RULE_for_tag = 22, RULE_for_array = 23, 
		RULE_for_range = 24, RULE_for_block = 25, RULE_for_attribute = 26, RULE_attribute = 27, 
		RULE_table_tag = 28, RULE_capture_tag = 29, RULE_include_tag = 30, RULE_file_name_or_output = 31, 
		RULE_jekyll_include_params = 32, RULE_output = 33, RULE_print = 34, RULE_filter = 35, 
		RULE_params = 36, RULE_param_expr = 37, RULE_assignment = 38, RULE_expr = 39, 
		RULE_term = 40, RULE_lookup = 41, RULE_type = 42, RULE_id = 43, RULE_as = 44, 
		RULE_id2 = 45, RULE_resource = 46, RULE_index = 47, RULE_other_tag_parameters = 48, 
		RULE_other_than_tag_end = 49, RULE_filename = 50, RULE_tagStart = 51, 
		RULE_outStart = 52, RULE_other = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "block", "atom", "tag", "use_tag", "code_tag", "other_tag", 
			"continue_tag", "other_tag_block", "raw_tag", "raw_body", "comment_tag", 
			"other_than_tag_start", "other_than_tag_start_and_ifs", "if_tag", "elseif_tag", 
			"else_tag", "unless_tag", "case_tag", "when_tag", "cycle_tag", "cycle_group", 
			"for_tag", "for_array", "for_range", "for_block", "for_attribute", "attribute", 
			"table_tag", "capture_tag", "include_tag", "file_name_or_output", "jekyll_include_params", 
			"output", "print", "filter", "params", "param_expr", "assignment", "expr", 
			"term", "lookup", "type", "id", "as", "id2", "resource", "index", "other_tag_parameters", 
			"other_than_tag_end", "filename", "tagStart", "outStart", "other"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'{{'", "'${'", null, null, null, "'..'", "'.'", 
			null, "'=='", "'='", "'>='", "'>'", "'<='", "'<'", "'-'", "'|'", "':'", 
			"','", "'('", "')'", "'['", "']'", "'?'", "'*'", "'/'", "'+'", "'@'", 
			null, null, null, null, "'use'", "'service'", "'json'", "'xml'", "'as'", 
			"'capture'", "'endcapture'", "'comment'", "'endcomment'", null, "'if'", 
			"'elseif'", "'endif'", "'unless'", "'endunless'", "'else'", "'contains'", 
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
			"LongNum", "WS", "Use", "Service", "Json", "Xml", "As", "CaptureStart", 
			"CaptureEnd", "CommentStart", "CommentEnd", "RawStart", "IfStart", "Elseif", 
			"IfEnd", "UnlessStart", "UnlessEnd", "Else", "Contains", "CaseStart", 
			"CaseEnd", "When", "Cycle", "ForStart", "ForEnd", "In", "And", "Or", 
			"TableStart", "TableEnd", "Assign", "True", "False", "Nil", "Include", 
			"With", "Offset", "Continue", "Reversed", "Empty", "Blank", "EndId", 
			"IdChain", "Id", "RawEnd", "OtherRaw"
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
	public String getGrammarFileName() { return "NuxtParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private boolean isLiquid = true;
	    private boolean isLiquid(){
	        return isLiquid;
	    }

	    private boolean isJekyll(){
	        return !isLiquid;
	    }

	    public NuxtParser(TokenStream input, boolean isLiquid) {
	        this(input);
	        this.isLiquid = isLiquid;
	    }


	public NuxtParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NuxtParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			block();
			setState(109);
			match(EOF);
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

	public static class BlockContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					atom();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Atom_outputContext extends AtomContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public Atom_outputContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterAtom_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitAtom_output(this);
		}
	}
	public static class Atom_assignmentContext extends AtomContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Atom_assignmentContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterAtom_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitAtom_assignment(this);
		}
	}
	public static class Atom_tagContext extends AtomContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public Atom_tagContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterAtom_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitAtom_tag(this);
		}
	}
	public static class Atom_othersContext extends AtomContext {
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public Atom_othersContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterAtom_others(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitAtom_others(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atom);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Atom_tagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				tag();
				}
				break;
			case 2:
				_localctx = new Atom_outputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				output();
				}
				break;
			case 3:
				_localctx = new Atom_assignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				assignment();
				}
				break;
			case 4:
				_localctx = new Atom_othersContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				other();
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

	public static class TagContext extends ParserRuleContext {
		public Use_tagContext use_tag() {
			return getRuleContext(Use_tagContext.class,0);
		}
		public Raw_tagContext raw_tag() {
			return getRuleContext(Raw_tagContext.class,0);
		}
		public Comment_tagContext comment_tag() {
			return getRuleContext(Comment_tagContext.class,0);
		}
		public If_tagContext if_tag() {
			return getRuleContext(If_tagContext.class,0);
		}
		public Unless_tagContext unless_tag() {
			return getRuleContext(Unless_tagContext.class,0);
		}
		public Case_tagContext case_tag() {
			return getRuleContext(Case_tagContext.class,0);
		}
		public Cycle_tagContext cycle_tag() {
			return getRuleContext(Cycle_tagContext.class,0);
		}
		public For_tagContext for_tag() {
			return getRuleContext(For_tagContext.class,0);
		}
		public Table_tagContext table_tag() {
			return getRuleContext(Table_tagContext.class,0);
		}
		public Capture_tagContext capture_tag() {
			return getRuleContext(Capture_tagContext.class,0);
		}
		public Include_tagContext include_tag() {
			return getRuleContext(Include_tagContext.class,0);
		}
		public Continue_tagContext continue_tag() {
			return getRuleContext(Continue_tagContext.class,0);
		}
		public Code_tagContext code_tag() {
			return getRuleContext(Code_tagContext.class,0);
		}
		public Other_tagContext other_tag() {
			return getRuleContext(Other_tagContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tag);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				use_tag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				raw_tag();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				comment_tag();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				if_tag();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				unless_tag();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				case_tag();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				cycle_tag();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				for_tag();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(131);
				table_tag();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(132);
				capture_tag();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(133);
				include_tag();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(134);
				continue_tag();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(135);
				code_tag();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(136);
				other_tag();
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

	public static class Use_tagContext extends ParserRuleContext {
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public TerminalNode Use() { return getToken(NuxtParser.Use, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ResourceContext resource() {
			return getRuleContext(ResourceContext.class,0);
		}
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public TerminalNode As() { return getToken(NuxtParser.As, 0); }
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
		public Use_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterUse_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitUse_tag(this);
		}
	}

	public final Use_tagContext use_tag() throws RecognitionException {
		Use_tagContext _localctx = new Use_tagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_use_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			tagStart();
			setState(140);
			match(Use);
			setState(141);
			type();
			setState(142);
			resource();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(143);
				match(As);
				setState(144);
				as();
				}
			}

			setState(147);
			match(TagEnd);
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

	public static class Code_tagContext extends ParserRuleContext {
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public Other_than_tag_start_and_ifsContext other_than_tag_start_and_ifs() {
			return getRuleContext(Other_than_tag_start_and_ifsContext.class,0);
		}
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public Code_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterCode_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitCode_tag(this);
		}
	}

	public final Code_tagContext code_tag() throws RecognitionException {
		Code_tagContext _localctx = new Code_tagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_code_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			tagStart();
			setState(150);
			other_than_tag_start_and_ifs();
			setState(151);
			match(TagEnd);
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

	public static class Other_tagContext extends ParserRuleContext {
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public Other_tag_parametersContext other_tag_parameters() {
			return getRuleContext(Other_tag_parametersContext.class,0);
		}
		public Other_tag_blockContext other_tag_block() {
			return getRuleContext(Other_tag_blockContext.class,0);
		}
		public Other_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterOther_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitOther_tag(this);
		}
	}

	public final Other_tagContext other_tag() throws RecognitionException {
		Other_tagContext _localctx = new Other_tagContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_other_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			tagStart();
			setState(154);
			match(Id);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OutStart) | (1L << TagStart) | (1L << Other) | (1L << OutStart2) | (1L << TagStart2) | (1L << OutEnd) | (1L << Str) | (1L << DotDot) | (1L << Dot) | (1L << NEq) | (1L << Eq) | (1L << EqSign) | (1L << GtEq) | (1L << Gt) | (1L << LtEq) | (1L << Lt) | (1L << Minus) | (1L << Pipe) | (1L << Col) | (1L << Comma) | (1L << OPar) | (1L << CPar) | (1L << OBr) | (1L << CBr) | (1L << QMark) | (1L << Mul) | (1L << Div) | (1L << Plus) | (1L << Add) | (1L << PathSep) | (1L << DoubleNum) | (1L << LongNum) | (1L << WS) | (1L << Use) | (1L << Service) | (1L << Json) | (1L << Xml) | (1L << As) | (1L << CaptureStart) | (1L << CaptureEnd) | (1L << CommentStart) | (1L << CommentEnd) | (1L << RawStart) | (1L << IfStart) | (1L << Elseif) | (1L << IfEnd) | (1L << UnlessStart) | (1L << UnlessEnd) | (1L << Else) | (1L << Contains) | (1L << CaseStart) | (1L << CaseEnd) | (1L << When) | (1L << Cycle) | (1L << ForStart) | (1L << ForEnd) | (1L << In) | (1L << And) | (1L << Or) | (1L << TableStart) | (1L << TableEnd) | (1L << Assign))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (False - 64)) | (1L << (Nil - 64)) | (1L << (Include - 64)) | (1L << (With - 64)) | (1L << (Offset - 64)) | (1L << (Continue - 64)) | (1L << (Reversed - 64)) | (1L << (Empty - 64)) | (1L << (Blank - 64)) | (1L << (EndId - 64)) | (1L << (IdChain - 64)) | (1L << (Id - 64)) | (1L << (RawEnd - 64)) | (1L << (OtherRaw - 64)))) != 0)) {
				{
				setState(155);
				other_tag_parameters();
				}
			}

			setState(158);
			match(TagEnd);
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(159);
				other_tag_block();
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

	public static class Continue_tagContext extends ParserRuleContext {
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public TerminalNode Continue() { return getToken(NuxtParser.Continue, 0); }
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public Continue_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterContinue_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitContinue_tag(this);
		}
	}

	public final Continue_tagContext continue_tag() throws RecognitionException {
		Continue_tagContext _localctx = new Continue_tagContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_continue_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			tagStart();
			setState(163);
			match(Continue);
			setState(164);
			match(TagEnd);
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

	public static class Other_tag_blockContext extends ParserRuleContext {
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public TerminalNode EndId() { return getToken(NuxtParser.EndId, 0); }
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public Other_tag_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_tag_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterOther_tag_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitOther_tag_block(this);
		}
	}

	public final Other_tag_blockContext other_tag_block() throws RecognitionException {
		Other_tag_blockContext _localctx = new Other_tag_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_other_tag_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(166);
					atom();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(172);
			tagStart();
			setState(173);
			match(EndId);
			setState(174);
			match(TagEnd);
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

	public static class Raw_tagContext extends ParserRuleContext {
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public TerminalNode RawStart() { return getToken(NuxtParser.RawStart, 0); }
		public Raw_bodyContext raw_body() {
			return getRuleContext(Raw_bodyContext.class,0);
		}
		public TerminalNode RawEnd() { return getToken(NuxtParser.RawEnd, 0); }
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public Raw_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterRaw_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitRaw_tag(this);
		}
	}

	public final Raw_tagContext raw_tag() throws RecognitionException {
		Raw_tagContext _localctx = new Raw_tagContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_raw_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			tagStart();
			setState(177);
			match(RawStart);
			setState(178);
			raw_body();
			setState(179);
			match(RawEnd);
			setState(180);
			match(TagEnd);
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

	public static class Raw_bodyContext extends ParserRuleContext {
		public List<TerminalNode> OtherRaw() { return getTokens(NuxtParser.OtherRaw); }
		public TerminalNode OtherRaw(int i) {
			return getToken(NuxtParser.OtherRaw, i);
		}
		public Raw_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterRaw_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitRaw_body(this);
		}
	}

	public final Raw_bodyContext raw_body() throws RecognitionException {
		Raw_bodyContext _localctx = new Raw_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_raw_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OtherRaw) {
				{
				{
				setState(182);
				match(OtherRaw);
				}
				}
				setState(187);
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

	public static class Comment_tagContext extends ParserRuleContext {
		public List<TagStartContext> tagStart() {
			return getRuleContexts(TagStartContext.class);
		}
		public TagStartContext tagStart(int i) {
			return getRuleContext(TagStartContext.class,i);
		}
		public TerminalNode CommentStart() { return getToken(NuxtParser.CommentStart, 0); }
		public List<TerminalNode> TagEnd() { return getTokens(NuxtParser.TagEnd); }
		public TerminalNode TagEnd(int i) {
			return getToken(NuxtParser.TagEnd, i);
		}
		public TerminalNode CommentEnd() { return getToken(NuxtParser.CommentEnd, 0); }
		public Comment_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterComment_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitComment_tag(this);
		}
	}

	public final Comment_tagContext comment_tag() throws RecognitionException {
		Comment_tagContext _localctx = new Comment_tagContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comment_tag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			tagStart();
			setState(189);
			match(CommentStart);
			setState(190);
			match(TagEnd);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(191);
					matchWildcard();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(197);
			tagStart();
			setState(198);
			match(CommentEnd);
			setState(199);
			match(TagEnd);
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

	public static class Other_than_tag_startContext extends ParserRuleContext {
		public List<TerminalNode> TagStart() { return getTokens(NuxtParser.TagStart); }
		public TerminalNode TagStart(int i) {
			return getToken(NuxtParser.TagStart, i);
		}
		public List<TerminalNode> TagStart2() { return getTokens(NuxtParser.TagStart2); }
		public TerminalNode TagStart2(int i) {
			return getToken(NuxtParser.TagStart2, i);
		}
		public Other_than_tag_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_than_tag_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterOther_than_tag_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitOther_than_tag_start(this);
		}
	}

	public final Other_than_tag_startContext other_than_tag_start() throws RecognitionException {
		Other_than_tag_startContext _localctx = new Other_than_tag_startContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_other_than_tag_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OutStart) | (1L << Other) | (1L << OutStart2) | (1L << OutEnd) | (1L << TagEnd) | (1L << Str) | (1L << DotDot) | (1L << Dot) | (1L << NEq) | (1L << Eq) | (1L << EqSign) | (1L << GtEq) | (1L << Gt) | (1L << LtEq) | (1L << Lt) | (1L << Minus) | (1L << Pipe) | (1L << Col) | (1L << Comma) | (1L << OPar) | (1L << CPar) | (1L << OBr) | (1L << CBr) | (1L << QMark) | (1L << Mul) | (1L << Div) | (1L << Plus) | (1L << Add) | (1L << PathSep) | (1L << DoubleNum) | (1L << LongNum) | (1L << WS) | (1L << Use) | (1L << Service) | (1L << Json) | (1L << Xml) | (1L << As) | (1L << CaptureStart) | (1L << CaptureEnd) | (1L << CommentStart) | (1L << CommentEnd) | (1L << RawStart) | (1L << IfStart) | (1L << Elseif) | (1L << IfEnd) | (1L << UnlessStart) | (1L << UnlessEnd) | (1L << Else) | (1L << Contains) | (1L << CaseStart) | (1L << CaseEnd) | (1L << When) | (1L << Cycle) | (1L << ForStart) | (1L << ForEnd) | (1L << In) | (1L << And) | (1L << Or) | (1L << TableStart) | (1L << TableEnd) | (1L << Assign))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (False - 64)) | (1L << (Nil - 64)) | (1L << (Include - 64)) | (1L << (With - 64)) | (1L << (Offset - 64)) | (1L << (Continue - 64)) | (1L << (Reversed - 64)) | (1L << (Empty - 64)) | (1L << (Blank - 64)) | (1L << (EndId - 64)) | (1L << (IdChain - 64)) | (1L << (Id - 64)) | (1L << (RawEnd - 64)) | (1L << (OtherRaw - 64)))) != 0)) {
				{
				{
				setState(201);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TagStart || _la==TagStart2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(206);
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

	public static class Other_than_tag_start_and_ifsContext extends ParserRuleContext {
		public List<TerminalNode> TagStart() { return getTokens(NuxtParser.TagStart); }
		public TerminalNode TagStart(int i) {
			return getToken(NuxtParser.TagStart, i);
		}
		public List<TerminalNode> TagStart2() { return getTokens(NuxtParser.TagStart2); }
		public TerminalNode TagStart2(int i) {
			return getToken(NuxtParser.TagStart2, i);
		}
		public List<TerminalNode> IfStart() { return getTokens(NuxtParser.IfStart); }
		public TerminalNode IfStart(int i) {
			return getToken(NuxtParser.IfStart, i);
		}
		public List<TerminalNode> Elseif() { return getTokens(NuxtParser.Elseif); }
		public TerminalNode Elseif(int i) {
			return getToken(NuxtParser.Elseif, i);
		}
		public List<TerminalNode> Else() { return getTokens(NuxtParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(NuxtParser.Else, i);
		}
		public Other_than_tag_start_and_ifsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_than_tag_start_and_ifs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterOther_than_tag_start_and_ifs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitOther_than_tag_start_and_ifs(this);
		}
	}

	public final Other_than_tag_start_and_ifsContext other_than_tag_start_and_ifs() throws RecognitionException {
		Other_than_tag_start_and_ifsContext _localctx = new Other_than_tag_start_and_ifsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_other_than_tag_start_and_ifs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TagStart) | (1L << TagStart2) | (1L << IfStart) | (1L << Elseif) | (1L << Else))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class If_tagContext extends ParserRuleContext {
		public List<TagStartContext> tagStart() {
			return getRuleContexts(TagStartContext.class);
		}
		public TagStartContext tagStart(int i) {
			return getRuleContext(TagStartContext.class,i);
		}
		public TerminalNode IfStart() { return getToken(NuxtParser.IfStart, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> TagEnd() { return getTokens(NuxtParser.TagEnd); }
		public TerminalNode TagEnd(int i) {
			return getToken(NuxtParser.TagEnd, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IfEnd() { return getToken(NuxtParser.IfEnd, 0); }
		public List<Elseif_tagContext> elseif_tag() {
			return getRuleContexts(Elseif_tagContext.class);
		}
		public Elseif_tagContext elseif_tag(int i) {
			return getRuleContext(Elseif_tagContext.class,i);
		}
		public Else_tagContext else_tag() {
			return getRuleContext(Else_tagContext.class,0);
		}
		public If_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterIf_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitIf_tag(this);
		}
	}

	public final If_tagContext if_tag() throws RecognitionException {
		If_tagContext _localctx = new If_tagContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_tag);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			tagStart();
			setState(214);
			match(IfStart);
			setState(215);
			expr(0);
			setState(216);
			match(TagEnd);
			setState(217);
			block();
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					elseif_tag();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(224);
				else_tag();
				}
				break;
			}
			setState(227);
			tagStart();
			setState(228);
			match(IfEnd);
			setState(229);
			match(TagEnd);
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

	public static class Elseif_tagContext extends ParserRuleContext {
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public TerminalNode Elseif() { return getToken(NuxtParser.Elseif, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elseif_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterElseif_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitElseif_tag(this);
		}
	}

	public final Elseif_tagContext elseif_tag() throws RecognitionException {
		Elseif_tagContext _localctx = new Elseif_tagContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseif_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			tagStart();
			setState(232);
			match(Elseif);
			setState(233);
			expr(0);
			setState(234);
			match(TagEnd);
			setState(235);
			block();
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

	public static class Else_tagContext extends ParserRuleContext {
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public TerminalNode Else() { return getToken(NuxtParser.Else, 0); }
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterElse_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitElse_tag(this);
		}
	}

	public final Else_tagContext else_tag() throws RecognitionException {
		Else_tagContext _localctx = new Else_tagContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_else_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			tagStart();
			setState(238);
			match(Else);
			setState(239);
			match(TagEnd);
			setState(240);
			block();
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

	public static class Unless_tagContext extends ParserRuleContext {
		public List<TagStartContext> tagStart() {
			return getRuleContexts(TagStartContext.class);
		}
		public TagStartContext tagStart(int i) {
			return getRuleContext(TagStartContext.class,i);
		}
		public TerminalNode UnlessStart() { return getToken(NuxtParser.UnlessStart, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> TagEnd() { return getTokens(NuxtParser.TagEnd); }
		public TerminalNode TagEnd(int i) {
			return getToken(NuxtParser.TagEnd, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode UnlessEnd() { return getToken(NuxtParser.UnlessEnd, 0); }
		public Else_tagContext else_tag() {
			return getRuleContext(Else_tagContext.class,0);
		}
		public Unless_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterUnless_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitUnless_tag(this);
		}
	}

	public final Unless_tagContext unless_tag() throws RecognitionException {
		Unless_tagContext _localctx = new Unless_tagContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unless_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			tagStart();
			setState(243);
			match(UnlessStart);
			setState(244);
			expr(0);
			setState(245);
			match(TagEnd);
			setState(246);
			block();
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(247);
				else_tag();
				}
				break;
			}
			setState(250);
			tagStart();
			setState(251);
			match(UnlessEnd);
			setState(252);
			match(TagEnd);
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

	public static class Case_tagContext extends ParserRuleContext {
		public List<TagStartContext> tagStart() {
			return getRuleContexts(TagStartContext.class);
		}
		public TagStartContext tagStart(int i) {
			return getRuleContext(TagStartContext.class,i);
		}
		public TerminalNode CaseStart() { return getToken(NuxtParser.CaseStart, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> TagEnd() { return getTokens(NuxtParser.TagEnd); }
		public TerminalNode TagEnd(int i) {
			return getToken(NuxtParser.TagEnd, i);
		}
		public TerminalNode CaseEnd() { return getToken(NuxtParser.CaseEnd, 0); }
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public List<When_tagContext> when_tag() {
			return getRuleContexts(When_tagContext.class);
		}
		public When_tagContext when_tag(int i) {
			return getRuleContext(When_tagContext.class,i);
		}
		public Else_tagContext else_tag() {
			return getRuleContext(Else_tagContext.class,0);
		}
		public Case_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterCase_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitCase_tag(this);
		}
	}

	public final Case_tagContext case_tag() throws RecognitionException {
		Case_tagContext _localctx = new Case_tagContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_case_tag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			tagStart();
			setState(255);
			match(CaseStart);
			setState(256);
			expr(0);
			setState(257);
			match(TagEnd);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Other) {
				{
				setState(258);
				other();
				}
			}

			setState(262); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(261);
					when_tag();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(264); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(266);
				else_tag();
				}
				break;
			}
			setState(269);
			tagStart();
			setState(270);
			match(CaseEnd);
			setState(271);
			match(TagEnd);
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

	public static class When_tagContext extends ParserRuleContext {
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public TerminalNode When() { return getToken(NuxtParser.When, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> Or() { return getTokens(NuxtParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(NuxtParser.Or, i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuxtParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuxtParser.Comma, i);
		}
		public When_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterWhen_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitWhen_tag(this);
		}
	}

	public final When_tagContext when_tag() throws RecognitionException {
		When_tagContext _localctx = new When_tagContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_when_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			tagStart();
			setState(274);
			match(When);
			setState(275);
			term();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma || _la==Or) {
				{
				{
				setState(276);
				_la = _input.LA(1);
				if ( !(_la==Comma || _la==Or) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(277);
				term();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(TagEnd);
			setState(284);
			block();
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

	public static class Cycle_tagContext extends ParserRuleContext {
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public TerminalNode Cycle() { return getToken(NuxtParser.Cycle, 0); }
		public Cycle_groupContext cycle_group() {
			return getRuleContext(Cycle_groupContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public List<TerminalNode> Comma() { return getTokens(NuxtParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuxtParser.Comma, i);
		}
		public Cycle_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterCycle_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitCycle_tag(this);
		}
	}

	public final Cycle_tagContext cycle_tag() throws RecognitionException {
		Cycle_tagContext _localctx = new Cycle_tagContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cycle_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			tagStart();
			setState(287);
			match(Cycle);
			setState(288);
			cycle_group();
			setState(289);
			expr(0);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(290);
				match(Comma);
				setState(291);
				expr(0);
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(TagEnd);
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

	public static class Cycle_groupContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Col() { return getToken(NuxtParser.Col, 0); }
		public Cycle_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterCycle_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitCycle_group(this);
		}
	}

	public final Cycle_groupContext cycle_group() throws RecognitionException {
		Cycle_groupContext _localctx = new Cycle_groupContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cycle_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(299);
				expr(0);
				setState(300);
				match(Col);
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

	public static class For_tagContext extends ParserRuleContext {
		public For_arrayContext for_array() {
			return getRuleContext(For_arrayContext.class,0);
		}
		public For_rangeContext for_range() {
			return getRuleContext(For_rangeContext.class,0);
		}
		public For_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterFor_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitFor_tag(this);
		}
	}

	public final For_tagContext for_tag() throws RecognitionException {
		For_tagContext _localctx = new For_tagContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_for_tag);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				for_array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				for_range();
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

	public static class For_arrayContext extends ParserRuleContext {
		public List<TagStartContext> tagStart() {
			return getRuleContexts(TagStartContext.class);
		}
		public TagStartContext tagStart(int i) {
			return getRuleContext(TagStartContext.class,i);
		}
		public TerminalNode ForStart() { return getToken(NuxtParser.ForStart, 0); }
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public TerminalNode In() { return getToken(NuxtParser.In, 0); }
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public List<TerminalNode> TagEnd() { return getTokens(NuxtParser.TagEnd); }
		public TerminalNode TagEnd(int i) {
			return getToken(NuxtParser.TagEnd, i);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public TerminalNode ForEnd() { return getToken(NuxtParser.ForEnd, 0); }
		public TerminalNode Reversed() { return getToken(NuxtParser.Reversed, 0); }
		public List<For_attributeContext> for_attribute() {
			return getRuleContexts(For_attributeContext.class);
		}
		public For_attributeContext for_attribute(int i) {
			return getRuleContext(For_attributeContext.class,i);
		}
		public For_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterFor_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitFor_array(this);
		}
	}

	public final For_arrayContext for_array() throws RecognitionException {
		For_arrayContext _localctx = new For_arrayContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			tagStart();
			setState(309);
			match(ForStart);
			setState(310);
			match(Id);
			setState(311);
			match(In);
			setState(312);
			lookup();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Reversed) {
				{
				setState(313);
				match(Reversed);
				}
			}

			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Offset || _la==Id) {
				{
				{
				setState(316);
				for_attribute();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(TagEnd);
			setState(323);
			for_block();
			setState(324);
			tagStart();
			setState(325);
			match(ForEnd);
			setState(326);
			match(TagEnd);
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

	public static class For_rangeContext extends ParserRuleContext {
		public ExprContext from;
		public ExprContext to;
		public List<TagStartContext> tagStart() {
			return getRuleContexts(TagStartContext.class);
		}
		public TagStartContext tagStart(int i) {
			return getRuleContext(TagStartContext.class,i);
		}
		public TerminalNode ForStart() { return getToken(NuxtParser.ForStart, 0); }
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public TerminalNode In() { return getToken(NuxtParser.In, 0); }
		public TerminalNode OPar() { return getToken(NuxtParser.OPar, 0); }
		public TerminalNode DotDot() { return getToken(NuxtParser.DotDot, 0); }
		public TerminalNode CPar() { return getToken(NuxtParser.CPar, 0); }
		public List<TerminalNode> TagEnd() { return getTokens(NuxtParser.TagEnd); }
		public TerminalNode TagEnd(int i) {
			return getToken(NuxtParser.TagEnd, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ForEnd() { return getToken(NuxtParser.ForEnd, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Reversed() { return getToken(NuxtParser.Reversed, 0); }
		public List<For_attributeContext> for_attribute() {
			return getRuleContexts(For_attributeContext.class);
		}
		public For_attributeContext for_attribute(int i) {
			return getRuleContext(For_attributeContext.class,i);
		}
		public For_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterFor_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitFor_range(this);
		}
	}

	public final For_rangeContext for_range() throws RecognitionException {
		For_rangeContext _localctx = new For_rangeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			tagStart();
			setState(329);
			match(ForStart);
			setState(330);
			match(Id);
			setState(331);
			match(In);
			setState(332);
			match(OPar);
			setState(333);
			((For_rangeContext)_localctx).from = expr(0);
			setState(334);
			match(DotDot);
			setState(335);
			((For_rangeContext)_localctx).to = expr(0);
			setState(336);
			match(CPar);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Reversed) {
				{
				setState(337);
				match(Reversed);
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Offset || _la==Id) {
				{
				{
				setState(340);
				for_attribute();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			match(TagEnd);
			setState(347);
			block();
			setState(348);
			tagStart();
			setState(349);
			match(ForEnd);
			setState(350);
			match(TagEnd);
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

	public static class For_blockContext extends ParserRuleContext {
		public BlockContext a;
		public BlockContext b;
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public TerminalNode Else() { return getToken(NuxtParser.Else, 0); }
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterFor_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitFor_block(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			((For_blockContext)_localctx).a = block();
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(353);
				tagStart();
				setState(354);
				match(Else);
				setState(355);
				match(TagEnd);
				setState(356);
				((For_blockContext)_localctx).b = block();
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

	public static class For_attributeContext extends ParserRuleContext {
		public TerminalNode Offset() { return getToken(NuxtParser.Offset, 0); }
		public TerminalNode Col() { return getToken(NuxtParser.Col, 0); }
		public TerminalNode Continue() { return getToken(NuxtParser.Continue, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public For_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterFor_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitFor_attribute(this);
		}
	}

	public final For_attributeContext for_attribute() throws RecognitionException {
		For_attributeContext _localctx = new For_attributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_for_attribute);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(Offset);
				setState(361);
				match(Col);
				setState(362);
				match(Continue);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(Offset);
				setState(364);
				match(Col);
				setState(365);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				match(Id);
				setState(367);
				match(Col);
				setState(368);
				expr(0);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode Offset() { return getToken(NuxtParser.Offset, 0); }
		public TerminalNode Col() { return getToken(NuxtParser.Col, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_attribute);
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Offset:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(Offset);
				setState(372);
				match(Col);
				setState(373);
				expr(0);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(Id);
				setState(375);
				match(Col);
				setState(376);
				expr(0);
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

	public static class Table_tagContext extends ParserRuleContext {
		public List<TagStartContext> tagStart() {
			return getRuleContexts(TagStartContext.class);
		}
		public TagStartContext tagStart(int i) {
			return getRuleContext(TagStartContext.class,i);
		}
		public TerminalNode TableStart() { return getToken(NuxtParser.TableStart, 0); }
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public TerminalNode In() { return getToken(NuxtParser.In, 0); }
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public List<TerminalNode> TagEnd() { return getTokens(NuxtParser.TagEnd); }
		public TerminalNode TagEnd(int i) {
			return getToken(NuxtParser.TagEnd, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TableEnd() { return getToken(NuxtParser.TableEnd, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Table_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTable_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTable_tag(this);
		}
	}

	public final Table_tagContext table_tag() throws RecognitionException {
		Table_tagContext _localctx = new Table_tagContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_table_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			tagStart();
			setState(380);
			match(TableStart);
			setState(381);
			match(Id);
			setState(382);
			match(In);
			setState(383);
			lookup();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Offset || _la==Id) {
				{
				{
				setState(384);
				attribute();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			match(TagEnd);
			setState(391);
			block();
			setState(392);
			tagStart();
			setState(393);
			match(TableEnd);
			setState(394);
			match(TagEnd);
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

	public static class Capture_tagContext extends ParserRuleContext {
		public Capture_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_tag; }
	 
		public Capture_tagContext() { }
		public void copyFrom(Capture_tagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Capture_tag_IdContext extends Capture_tagContext {
		public List<TagStartContext> tagStart() {
			return getRuleContexts(TagStartContext.class);
		}
		public TagStartContext tagStart(int i) {
			return getRuleContext(TagStartContext.class,i);
		}
		public TerminalNode CaptureStart() { return getToken(NuxtParser.CaptureStart, 0); }
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public List<TerminalNode> TagEnd() { return getTokens(NuxtParser.TagEnd); }
		public TerminalNode TagEnd(int i) {
			return getToken(NuxtParser.TagEnd, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CaptureEnd() { return getToken(NuxtParser.CaptureEnd, 0); }
		public Capture_tag_IdContext(Capture_tagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterCapture_tag_Id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitCapture_tag_Id(this);
		}
	}
	public static class Capture_tag_StrContext extends Capture_tagContext {
		public List<TagStartContext> tagStart() {
			return getRuleContexts(TagStartContext.class);
		}
		public TagStartContext tagStart(int i) {
			return getRuleContext(TagStartContext.class,i);
		}
		public TerminalNode CaptureStart() { return getToken(NuxtParser.CaptureStart, 0); }
		public TerminalNode Str() { return getToken(NuxtParser.Str, 0); }
		public List<TerminalNode> TagEnd() { return getTokens(NuxtParser.TagEnd); }
		public TerminalNode TagEnd(int i) {
			return getToken(NuxtParser.TagEnd, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CaptureEnd() { return getToken(NuxtParser.CaptureEnd, 0); }
		public Capture_tag_StrContext(Capture_tagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterCapture_tag_Str(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitCapture_tag_Str(this);
		}
	}

	public final Capture_tagContext capture_tag() throws RecognitionException {
		Capture_tagContext _localctx = new Capture_tagContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_capture_tag);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new Capture_tag_IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				tagStart();
				setState(397);
				match(CaptureStart);
				setState(398);
				match(Id);
				setState(399);
				match(TagEnd);
				setState(400);
				block();
				setState(401);
				tagStart();
				setState(402);
				match(CaptureEnd);
				setState(403);
				match(TagEnd);
				}
				break;
			case 2:
				_localctx = new Capture_tag_StrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				tagStart();
				setState(406);
				match(CaptureStart);
				setState(407);
				match(Str);
				setState(408);
				match(TagEnd);
				setState(409);
				block();
				setState(410);
				tagStart();
				setState(411);
				match(CaptureEnd);
				setState(412);
				match(TagEnd);
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

	public static class Include_tagContext extends ParserRuleContext {
		public Token liquid;
		public Token jekyll;
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public TerminalNode Include() { return getToken(NuxtParser.Include, 0); }
		public TerminalNode With() { return getToken(NuxtParser.With, 0); }
		public TerminalNode Str() { return getToken(NuxtParser.Str, 0); }
		public File_name_or_outputContext file_name_or_output() {
			return getRuleContext(File_name_or_outputContext.class,0);
		}
		public List<Jekyll_include_paramsContext> jekyll_include_params() {
			return getRuleContexts(Jekyll_include_paramsContext.class);
		}
		public Jekyll_include_paramsContext jekyll_include_params(int i) {
			return getRuleContext(Jekyll_include_paramsContext.class,i);
		}
		public Include_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterInclude_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitInclude_tag(this);
		}
	}

	public final Include_tagContext include_tag() throws RecognitionException {
		Include_tagContext _localctx = new Include_tagContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_include_tag);
		int _la;
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				if (!(isLiquid())) throw new FailedPredicateException(this, "isLiquid()");
				setState(417);
				tagStart();
				setState(418);
				((Include_tagContext)_localctx).liquid = match(Include);
				setState(419);
				expr(0);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==With) {
					{
					setState(420);
					match(With);
					setState(421);
					match(Str);
					}
				}

				setState(424);
				match(TagEnd);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				if (!(isJekyll())) throw new FailedPredicateException(this, "isJekyll()");
				setState(427);
				tagStart();
				setState(428);
				((Include_tagContext)_localctx).jekyll = match(Include);
				setState(429);
				file_name_or_output();
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (CaptureStart - 40)) | (1L << (CaptureEnd - 40)) | (1L << (CommentStart - 40)) | (1L << (CommentEnd - 40)) | (1L << (RawStart - 40)) | (1L << (IfStart - 40)) | (1L << (Elseif - 40)) | (1L << (IfEnd - 40)) | (1L << (UnlessStart - 40)) | (1L << (UnlessEnd - 40)) | (1L << (Else - 40)) | (1L << (Contains - 40)) | (1L << (CaseStart - 40)) | (1L << (CaseEnd - 40)) | (1L << (When - 40)) | (1L << (Cycle - 40)) | (1L << (ForStart - 40)) | (1L << (ForEnd - 40)) | (1L << (In - 40)) | (1L << (And - 40)) | (1L << (Or - 40)) | (1L << (TableStart - 40)) | (1L << (TableEnd - 40)) | (1L << (Assign - 40)) | (1L << (Include - 40)) | (1L << (With - 40)) | (1L << (Offset - 40)) | (1L << (Continue - 40)) | (1L << (Reversed - 40)) | (1L << (EndId - 40)) | (1L << (Id - 40)) | (1L << (RawEnd - 40)))) != 0)) {
					{
					{
					setState(430);
					jekyll_include_params();
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(436);
				match(TagEnd);
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

	public static class File_name_or_outputContext extends ParserRuleContext {
		public File_name_or_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name_or_output; }
	 
		public File_name_or_outputContext() { }
		public void copyFrom(File_name_or_outputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Jekyll_include_filenameContext extends File_name_or_outputContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public Jekyll_include_filenameContext(File_name_or_outputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterJekyll_include_filename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitJekyll_include_filename(this);
		}
	}
	public static class Jekyll_include_outputContext extends File_name_or_outputContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public Jekyll_include_outputContext(File_name_or_outputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterJekyll_include_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitJekyll_include_output(this);
		}
	}

	public final File_name_or_outputContext file_name_or_output() throws RecognitionException {
		File_name_or_outputContext _localctx = new File_name_or_outputContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_file_name_or_output);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new Jekyll_include_outputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				output();
				}
				break;
			case 2:
				_localctx = new Jekyll_include_filenameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				filename();
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

	public static class Jekyll_include_paramsContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode EqSign() { return getToken(NuxtParser.EqSign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Jekyll_include_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jekyll_include_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterJekyll_include_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitJekyll_include_params(this);
		}
	}

	public final Jekyll_include_paramsContext jekyll_include_params() throws RecognitionException {
		Jekyll_include_paramsContext _localctx = new Jekyll_include_paramsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_jekyll_include_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			id();
			setState(445);
			match(EqSign);
			setState(446);
			expr(0);
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

	public static class OutputContext extends ParserRuleContext {
		public OutStartContext outStart() {
			return getRuleContext(OutStartContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode OutEnd() { return getToken(NuxtParser.OutEnd, 0); }
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			outStart();
			setState(449);
			print();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(450);
				filter();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			match(OutEnd);
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
		public List<TerminalNode> TagStart() { return getTokens(NuxtParser.TagStart); }
		public TerminalNode TagStart(int i) {
			return getToken(NuxtParser.TagStart, i);
		}
		public List<TerminalNode> TagStart2() { return getTokens(NuxtParser.TagStart2); }
		public TerminalNode TagStart2(int i) {
			return getToken(NuxtParser.TagStart2, i);
		}
		public List<TerminalNode> OutEnd() { return getTokens(NuxtParser.OutEnd); }
		public TerminalNode OutEnd(int i) {
			return getToken(NuxtParser.OutEnd, i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_print);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					_la = _input.LA(1);
					if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TagStart) | (1L << TagStart2) | (1L << OutEnd))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode Pipe() { return getToken(NuxtParser.Pipe, 0); }
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitFilter(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(Pipe);
			setState(465);
			match(Id);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Col) {
				{
				setState(466);
				params();
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

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode Col() { return getToken(NuxtParser.Col, 0); }
		public List<Param_exprContext> param_expr() {
			return getRuleContexts(Param_exprContext.class);
		}
		public Param_exprContext param_expr(int i) {
			return getRuleContext(Param_exprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(NuxtParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NuxtParser.Comma, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(Col);
			setState(470);
			param_expr();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(471);
				match(Comma);
				setState(472);
				param_expr();
				}
				}
				setState(477);
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

	public static class Param_exprContext extends ParserRuleContext {
		public Param_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_expr; }
	 
		public Param_exprContext() { }
		public void copyFrom(Param_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Param_expr_exprContext extends Param_exprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Param_expr_exprContext(Param_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterParam_expr_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitParam_expr_expr(this);
		}
	}
	public static class Param_expr_key_valueContext extends Param_exprContext {
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
		}
		public TerminalNode Col() { return getToken(NuxtParser.Col, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Param_expr_key_valueContext(Param_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterParam_expr_key_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitParam_expr_key_value(this);
		}
	}

	public final Param_exprContext param_expr() throws RecognitionException {
		Param_exprContext _localctx = new Param_exprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_param_expr);
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new Param_expr_key_valueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				id2();
				setState(479);
				match(Col);
				setState(480);
				expr(0);
				}
				break;
			case 2:
				_localctx = new Param_expr_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				expr(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TagStartContext tagStart() {
			return getRuleContext(TagStartContext.class,0);
		}
		public TerminalNode Assign() { return getToken(NuxtParser.Assign, 0); }
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public TerminalNode EqSign() { return getToken(NuxtParser.EqSign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TagEnd() { return getToken(NuxtParser.TagEnd, 0); }
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			tagStart();
			setState(486);
			match(Assign);
			setState(487);
			match(Id);
			setState(488);
			match(EqSign);
			setState(489);
			expr(0);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(490);
				filter();
				}
				}
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(496);
			match(TagEnd);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr_containsContext extends ExprContext {
		public ExprContext lhs;
		public ExprContext rhs;
		public TerminalNode Contains() { return getToken(NuxtParser.Contains, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_containsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterExpr_contains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitExpr_contains(this);
		}
	}
	public static class Expr_termContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_termContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterExpr_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitExpr_term(this);
		}
	}
	public static class Expr_relContext extends ExprContext {
		public ExprContext lhs;
		public Token op;
		public ExprContext rhs;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LtEq() { return getToken(NuxtParser.LtEq, 0); }
		public TerminalNode Lt() { return getToken(NuxtParser.Lt, 0); }
		public TerminalNode GtEq() { return getToken(NuxtParser.GtEq, 0); }
		public TerminalNode Gt() { return getToken(NuxtParser.Gt, 0); }
		public Expr_relContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterExpr_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitExpr_rel(this);
		}
	}
	public static class Expr_eqContext extends ExprContext {
		public ExprContext lhs;
		public Token op;
		public ExprContext rhs;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Eq() { return getToken(NuxtParser.Eq, 0); }
		public TerminalNode NEq() { return getToken(NuxtParser.NEq, 0); }
		public Expr_eqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterExpr_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitExpr_eq(this);
		}
	}
	public static class Expr_logicContext extends ExprContext {
		public ExprContext lhs;
		public Token op;
		public ExprContext rhs;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode And() { return getToken(NuxtParser.And, 0); }
		public TerminalNode Or() { return getToken(NuxtParser.Or, 0); }
		public Expr_logicContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterExpr_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitExpr_logic(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Expr_termContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(499);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_relContext(new ExprContext(_parentctx, _parentState));
						((Expr_relContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(501);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(502);
						((Expr_relContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GtEq) | (1L << Gt) | (1L << LtEq) | (1L << Lt))) != 0)) ) {
							((Expr_relContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(503);
						((Expr_relContext)_localctx).rhs = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new Expr_eqContext(new ExprContext(_parentctx, _parentState));
						((Expr_eqContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(504);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(505);
						((Expr_eqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==NEq || _la==Eq) ) {
							((Expr_eqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(506);
						((Expr_eqContext)_localctx).rhs = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new Expr_containsContext(new ExprContext(_parentctx, _parentState));
						((Expr_containsContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(507);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(508);
						match(Contains);
						setState(509);
						((Expr_containsContext)_localctx).rhs = expr(4);
						}
						break;
					case 4:
						{
						_localctx = new Expr_logicContext(new ExprContext(_parentctx, _parentState));
						((Expr_logicContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(510);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(511);
						((Expr_logicContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==And || _la==Or) ) {
							((Expr_logicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(512);
						((Expr_logicContext)_localctx).rhs = expr(2);
						}
						break;
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Term_DoubleNumContext extends TermContext {
		public TerminalNode DoubleNum() { return getToken(NuxtParser.DoubleNum, 0); }
		public Term_DoubleNumContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTerm_DoubleNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTerm_DoubleNum(this);
		}
	}
	public static class Term_lookupContext extends TermContext {
		public LookupContext lookup() {
			return getRuleContext(LookupContext.class,0);
		}
		public Term_lookupContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTerm_lookup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTerm_lookup(this);
		}
	}
	public static class Term_exprContext extends TermContext {
		public TerminalNode OPar() { return getToken(NuxtParser.OPar, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPar() { return getToken(NuxtParser.CPar, 0); }
		public Term_exprContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTerm_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTerm_expr(this);
		}
	}
	public static class Term_TrueContext extends TermContext {
		public TerminalNode True() { return getToken(NuxtParser.True, 0); }
		public Term_TrueContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTerm_True(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTerm_True(this);
		}
	}
	public static class Term_BlankContext extends TermContext {
		public TerminalNode Blank() { return getToken(NuxtParser.Blank, 0); }
		public Term_BlankContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTerm_Blank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTerm_Blank(this);
		}
	}
	public static class Term_LongNumContext extends TermContext {
		public TerminalNode LongNum() { return getToken(NuxtParser.LongNum, 0); }
		public Term_LongNumContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTerm_LongNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTerm_LongNum(this);
		}
	}
	public static class Term_FalseContext extends TermContext {
		public TerminalNode False() { return getToken(NuxtParser.False, 0); }
		public Term_FalseContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTerm_False(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTerm_False(this);
		}
	}
	public static class Term_EmptyContext extends TermContext {
		public TerminalNode Empty() { return getToken(NuxtParser.Empty, 0); }
		public Term_EmptyContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTerm_Empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTerm_Empty(this);
		}
	}
	public static class Term_StrContext extends TermContext {
		public TerminalNode Str() { return getToken(NuxtParser.Str, 0); }
		public Term_StrContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTerm_Str(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTerm_Str(this);
		}
	}
	public static class Term_NilContext extends TermContext {
		public TerminalNode Nil() { return getToken(NuxtParser.Nil, 0); }
		public Term_NilContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTerm_Nil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTerm_Nil(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_term);
		try {
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new Term_DoubleNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(DoubleNum);
				}
				break;
			case 2:
				_localctx = new Term_LongNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(LongNum);
				}
				break;
			case 3:
				_localctx = new Term_StrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				match(Str);
				}
				break;
			case 4:
				_localctx = new Term_TrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				match(True);
				}
				break;
			case 5:
				_localctx = new Term_FalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(522);
				match(False);
				}
				break;
			case 6:
				_localctx = new Term_NilContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(523);
				match(Nil);
				}
				break;
			case 7:
				_localctx = new Term_lookupContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(524);
				lookup();
				}
				break;
			case 8:
				_localctx = new Term_EmptyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(525);
				match(Empty);
				}
				break;
			case 9:
				_localctx = new Term_BlankContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(526);
				match(Blank);
				}
				break;
			case 10:
				_localctx = new Term_exprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(527);
				match(OPar);
				setState(528);
				expr(0);
				setState(529);
				match(CPar);
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

	public static class LookupContext extends ParserRuleContext {
		public LookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lookup; }
	 
		public LookupContext() { }
		public void copyFrom(LookupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Lookup_IdContext extends LookupContext {
		public TerminalNode OBr() { return getToken(NuxtParser.OBr, 0); }
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public TerminalNode CBr() { return getToken(NuxtParser.CBr, 0); }
		public TerminalNode QMark() { return getToken(NuxtParser.QMark, 0); }
		public Lookup_IdContext(LookupContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterLookup_Id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitLookup_Id(this);
		}
	}
	public static class Lookup_id_indexesContext extends LookupContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public TerminalNode QMark() { return getToken(NuxtParser.QMark, 0); }
		public Lookup_id_indexesContext(LookupContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterLookup_id_indexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitLookup_id_indexes(this);
		}
	}
	public static class Lookup_emptyContext extends LookupContext {
		public TerminalNode Empty() { return getToken(NuxtParser.Empty, 0); }
		public Lookup_emptyContext(LookupContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterLookup_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitLookup_empty(this);
		}
	}
	public static class Lookup_StrContext extends LookupContext {
		public TerminalNode OBr() { return getToken(NuxtParser.OBr, 0); }
		public TerminalNode Str() { return getToken(NuxtParser.Str, 0); }
		public TerminalNode CBr() { return getToken(NuxtParser.CBr, 0); }
		public TerminalNode QMark() { return getToken(NuxtParser.QMark, 0); }
		public Lookup_StrContext(LookupContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterLookup_Str(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitLookup_Str(this);
		}
	}

	public final LookupContext lookup() throws RecognitionException {
		LookupContext _localctx = new LookupContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lookup);
		try {
			int _alt;
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new Lookup_emptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				match(Empty);
				}
				break;
			case 2:
				_localctx = new Lookup_id_indexesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				id();
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(535);
						index();
						}
						} 
					}
					setState(540);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(541);
					match(QMark);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new Lookup_StrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				match(OBr);
				setState(545);
				match(Str);
				setState(546);
				match(CBr);
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(547);
					match(QMark);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Lookup_IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
				match(OBr);
				setState(551);
				match(Id);
				setState(552);
				match(CBr);
				setState(554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(553);
					match(QMark);
					}
					break;
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Service() { return getToken(NuxtParser.Service, 0); }
		public TerminalNode Json() { return getToken(NuxtParser.Json, 0); }
		public TerminalNode Xml() { return getToken(NuxtParser.Xml, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Service) | (1L << Json) | (1L << Xml))) != 0)) ) {
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public TerminalNode CaptureStart() { return getToken(NuxtParser.CaptureStart, 0); }
		public TerminalNode CaptureEnd() { return getToken(NuxtParser.CaptureEnd, 0); }
		public TerminalNode CommentStart() { return getToken(NuxtParser.CommentStart, 0); }
		public TerminalNode CommentEnd() { return getToken(NuxtParser.CommentEnd, 0); }
		public TerminalNode RawStart() { return getToken(NuxtParser.RawStart, 0); }
		public TerminalNode RawEnd() { return getToken(NuxtParser.RawEnd, 0); }
		public TerminalNode IfStart() { return getToken(NuxtParser.IfStart, 0); }
		public TerminalNode Elseif() { return getToken(NuxtParser.Elseif, 0); }
		public TerminalNode IfEnd() { return getToken(NuxtParser.IfEnd, 0); }
		public TerminalNode UnlessStart() { return getToken(NuxtParser.UnlessStart, 0); }
		public TerminalNode UnlessEnd() { return getToken(NuxtParser.UnlessEnd, 0); }
		public TerminalNode Else() { return getToken(NuxtParser.Else, 0); }
		public TerminalNode Contains() { return getToken(NuxtParser.Contains, 0); }
		public TerminalNode CaseStart() { return getToken(NuxtParser.CaseStart, 0); }
		public TerminalNode CaseEnd() { return getToken(NuxtParser.CaseEnd, 0); }
		public TerminalNode When() { return getToken(NuxtParser.When, 0); }
		public TerminalNode Cycle() { return getToken(NuxtParser.Cycle, 0); }
		public TerminalNode ForStart() { return getToken(NuxtParser.ForStart, 0); }
		public TerminalNode ForEnd() { return getToken(NuxtParser.ForEnd, 0); }
		public TerminalNode In() { return getToken(NuxtParser.In, 0); }
		public TerminalNode And() { return getToken(NuxtParser.And, 0); }
		public TerminalNode Or() { return getToken(NuxtParser.Or, 0); }
		public TerminalNode TableStart() { return getToken(NuxtParser.TableStart, 0); }
		public TerminalNode TableEnd() { return getToken(NuxtParser.TableEnd, 0); }
		public TerminalNode Assign() { return getToken(NuxtParser.Assign, 0); }
		public TerminalNode Include() { return getToken(NuxtParser.Include, 0); }
		public TerminalNode With() { return getToken(NuxtParser.With, 0); }
		public TerminalNode Offset() { return getToken(NuxtParser.Offset, 0); }
		public TerminalNode Continue() { return getToken(NuxtParser.Continue, 0); }
		public TerminalNode Reversed() { return getToken(NuxtParser.Reversed, 0); }
		public TerminalNode EndId() { return getToken(NuxtParser.EndId, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_la = _input.LA(1);
			if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (CaptureStart - 40)) | (1L << (CaptureEnd - 40)) | (1L << (CommentStart - 40)) | (1L << (CommentEnd - 40)) | (1L << (RawStart - 40)) | (1L << (IfStart - 40)) | (1L << (Elseif - 40)) | (1L << (IfEnd - 40)) | (1L << (UnlessStart - 40)) | (1L << (UnlessEnd - 40)) | (1L << (Else - 40)) | (1L << (Contains - 40)) | (1L << (CaseStart - 40)) | (1L << (CaseEnd - 40)) | (1L << (When - 40)) | (1L << (Cycle - 40)) | (1L << (ForStart - 40)) | (1L << (ForEnd - 40)) | (1L << (In - 40)) | (1L << (And - 40)) | (1L << (Or - 40)) | (1L << (TableStart - 40)) | (1L << (TableEnd - 40)) | (1L << (Assign - 40)) | (1L << (Include - 40)) | (1L << (With - 40)) | (1L << (Offset - 40)) | (1L << (Continue - 40)) | (1L << (Reversed - 40)) | (1L << (EndId - 40)) | (1L << (Id - 40)) | (1L << (RawEnd - 40)))) != 0)) ) {
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

	public static class AsContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public AsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitAs(this);
		}
	}

	public final AsContext as() throws RecognitionException {
		AsContext _localctx = new AsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(Id);
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

	public static class Id2Context extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Empty() { return getToken(NuxtParser.Empty, 0); }
		public TerminalNode Nil() { return getToken(NuxtParser.Nil, 0); }
		public TerminalNode True() { return getToken(NuxtParser.True, 0); }
		public TerminalNode False() { return getToken(NuxtParser.False, 0); }
		public Id2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterId2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitId2(this);
		}
	}

	public final Id2Context id2() throws RecognitionException {
		Id2Context _localctx = new Id2Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_id2);
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CaptureStart:
			case CaptureEnd:
			case CommentStart:
			case CommentEnd:
			case RawStart:
			case IfStart:
			case Elseif:
			case IfEnd:
			case UnlessStart:
			case UnlessEnd:
			case Else:
			case Contains:
			case CaseStart:
			case CaseEnd:
			case When:
			case Cycle:
			case ForStart:
			case ForEnd:
			case In:
			case And:
			case Or:
			case TableStart:
			case TableEnd:
			case Assign:
			case Include:
			case With:
			case Offset:
			case Continue:
			case Reversed:
			case EndId:
			case Id:
			case RawEnd:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				id();
				}
				break;
			case Empty:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(Empty);
				}
				break;
			case Nil:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				match(Nil);
				}
				break;
			case True:
				enterOuterAlt(_localctx, 4);
				{
				setState(567);
				match(True);
				}
				break;
			case False:
				enterOuterAlt(_localctx, 5);
				{
				setState(568);
				match(False);
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

	public static class ResourceContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(NuxtParser.Id, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(Id);
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

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(NuxtParser.Dot, 0); }
		public Id2Context id2() {
			return getRuleContext(Id2Context.class,0);
		}
		public TerminalNode OBr() { return getToken(NuxtParser.OBr, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CBr() { return getToken(NuxtParser.CBr, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_index);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Dot:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(Dot);
				setState(574);
				id2();
				}
				break;
			case OBr:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(OBr);
				setState(576);
				expr(0);
				setState(577);
				match(CBr);
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

	public static class Other_tag_parametersContext extends ParserRuleContext {
		public Other_than_tag_endContext other_than_tag_end() {
			return getRuleContext(Other_than_tag_endContext.class,0);
		}
		public Other_tag_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_tag_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterOther_tag_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitOther_tag_parameters(this);
		}
	}

	public final Other_tag_parametersContext other_tag_parameters() throws RecognitionException {
		Other_tag_parametersContext _localctx = new Other_tag_parametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_other_tag_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			other_than_tag_end();
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

	public static class Other_than_tag_endContext extends ParserRuleContext {
		public List<TerminalNode> TagEnd() { return getTokens(NuxtParser.TagEnd); }
		public TerminalNode TagEnd(int i) {
			return getToken(NuxtParser.TagEnd, i);
		}
		public Other_than_tag_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_than_tag_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterOther_than_tag_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitOther_than_tag_end(this);
		}
	}

	public final Other_than_tag_endContext other_than_tag_end() throws RecognitionException {
		Other_than_tag_endContext _localctx = new Other_than_tag_endContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_other_than_tag_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(583);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==TagEnd) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(586); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OutStart) | (1L << TagStart) | (1L << Other) | (1L << OutStart2) | (1L << TagStart2) | (1L << OutEnd) | (1L << Str) | (1L << DotDot) | (1L << Dot) | (1L << NEq) | (1L << Eq) | (1L << EqSign) | (1L << GtEq) | (1L << Gt) | (1L << LtEq) | (1L << Lt) | (1L << Minus) | (1L << Pipe) | (1L << Col) | (1L << Comma) | (1L << OPar) | (1L << CPar) | (1L << OBr) | (1L << CBr) | (1L << QMark) | (1L << Mul) | (1L << Div) | (1L << Plus) | (1L << Add) | (1L << PathSep) | (1L << DoubleNum) | (1L << LongNum) | (1L << WS) | (1L << Use) | (1L << Service) | (1L << Json) | (1L << Xml) | (1L << As) | (1L << CaptureStart) | (1L << CaptureEnd) | (1L << CommentStart) | (1L << CommentEnd) | (1L << RawStart) | (1L << IfStart) | (1L << Elseif) | (1L << IfEnd) | (1L << UnlessStart) | (1L << UnlessEnd) | (1L << Else) | (1L << Contains) | (1L << CaseStart) | (1L << CaseEnd) | (1L << When) | (1L << Cycle) | (1L << ForStart) | (1L << ForEnd) | (1L << In) | (1L << And) | (1L << Or) | (1L << TableStart) | (1L << TableEnd) | (1L << Assign))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (True - 64)) | (1L << (False - 64)) | (1L << (Nil - 64)) | (1L << (Include - 64)) | (1L << (With - 64)) | (1L << (Offset - 64)) | (1L << (Continue - 64)) | (1L << (Reversed - 64)) | (1L << (Empty - 64)) | (1L << (Blank - 64)) | (1L << (EndId - 64)) | (1L << (IdChain - 64)) | (1L << (Id - 64)) | (1L << (RawEnd - 64)) | (1L << (OtherRaw - 64)))) != 0) );
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

	public static class FilenameContext extends ParserRuleContext {
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitFilename(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_filename);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(588);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(591); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TagStartContext extends ParserRuleContext {
		public TerminalNode TagStart() { return getToken(NuxtParser.TagStart, 0); }
		public TerminalNode TagStart2() { return getToken(NuxtParser.TagStart2, 0); }
		public TagStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterTagStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitTagStart(this);
		}
	}

	public final TagStartContext tagStart() throws RecognitionException {
		TagStartContext _localctx = new TagStartContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tagStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_la = _input.LA(1);
			if ( !(_la==TagStart || _la==TagStart2) ) {
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

	public static class OutStartContext extends ParserRuleContext {
		public TerminalNode OutStart() { return getToken(NuxtParser.OutStart, 0); }
		public TerminalNode OutStart2() { return getToken(NuxtParser.OutStart2, 0); }
		public OutStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterOutStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitOutStart(this);
		}
	}

	public final OutStartContext outStart() throws RecognitionException {
		OutStartContext _localctx = new OutStartContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_outStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_la = _input.LA(1);
			if ( !(_la==OutStart || _la==OutStart2) ) {
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

	public static class OtherContext extends ParserRuleContext {
		public List<TerminalNode> Other() { return getTokens(NuxtParser.Other); }
		public TerminalNode Other(int i) {
			return getToken(NuxtParser.Other, i);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NuxtParserListener ) ((NuxtParserListener)listener).exitOther(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_other);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(597);
					match(Other);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(600); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return include_tag_sempred((Include_tagContext)_localctx, predIndex);
		case 39:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean include_tag_sempred(Include_tagContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return isLiquid();
		case 1:
			return isJekyll();
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u025d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\3\7\3s\n\3\f\3\16\3v\13"+
		"\3\3\4\3\4\3\4\3\4\5\4|\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u008c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u009f\n\b\3\b\3\b\5\b\u00a3\n\b\3"+
		"\t\3\t\3\t\3\t\3\n\7\n\u00aa\n\n\f\n\16\n\u00ad\13\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\7\f\u00ba\n\f\f\f\16\f\u00bd\13\f\3\r"+
		"\3\r\3\r\3\r\7\r\u00c3\n\r\f\r\16\r\u00c6\13\r\3\r\3\r\3\r\3\r\3\16\7"+
		"\16\u00cd\n\16\f\16\16\16\u00d0\13\16\3\17\7\17\u00d3\n\17\f\17\16\17"+
		"\u00d6\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00de\n\20\f\20\16\20"+
		"\u00e1\13\20\3\20\5\20\u00e4\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u00fb\n\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u0106"+
		"\n\24\3\24\6\24\u0109\n\24\r\24\16\24\u010a\3\24\5\24\u010e\n\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0119\n\25\f\25\16\25\u011c"+
		"\13\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0127\n\26\f"+
		"\26\16\26\u012a\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u0131\n\27\3\30\3"+
		"\30\5\30\u0135\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u013d\n\31\3\31"+
		"\7\31\u0140\n\31\f\31\16\31\u0143\13\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0155\n\32\3\32"+
		"\7\32\u0158\n\32\f\32\16\32\u015b\13\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0169\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0174\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u017c\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0184\n\36\f\36\16\36\u0187"+
		"\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01a1\n\37"+
		"\3 \3 \3 \3 \3 \3 \5 \u01a9\n \3 \3 \3 \3 \3 \3 \3 \7 \u01b2\n \f \16"+
		" \u01b5\13 \3 \3 \5 \u01b9\n \3!\3!\5!\u01bd\n!\3\"\3\"\3\"\3\"\3#\3#"+
		"\3#\7#\u01c6\n#\f#\16#\u01c9\13#\3#\3#\3$\7$\u01ce\n$\f$\16$\u01d1\13"+
		"$\3%\3%\3%\5%\u01d6\n%\3&\3&\3&\3&\7&\u01dc\n&\f&\16&\u01df\13&\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u01e6\n\'\3(\3(\3(\3(\3(\3(\7(\u01ee\n(\f(\16(\u01f1"+
		"\13(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0204\n)\f"+
		")\16)\u0207\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0216\n*\3+"+
		"\3+\3+\7+\u021b\n+\f+\16+\u021e\13+\3+\5+\u0221\n+\3+\3+\3+\3+\5+\u0227"+
		"\n+\3+\3+\3+\3+\5+\u022d\n+\5+\u022f\n+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/"+
		"\3/\5/\u023c\n/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0246\n\61"+
		"\3\62\3\62\3\63\6\63\u024b\n\63\r\63\16\63\u024c\3\64\6\64\u0250\n\64"+
		"\r\64\16\64\u0251\3\65\3\65\3\66\3\66\3\67\6\67\u0259\n\67\r\67\16\67"+
		"\u025a\3\67\5\u00ab\u00c4\u0251\3P8\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\r\4\2\4\4\7\7\6"+
		"\2\4\4\7\7/\60\64\64\4\2\27\27>>\4\2\4\4\7\b\3\2\20\23\3\2\r\16\3\2=>"+
		"\3\2&(\6\2*AEILLNO\3\2\t\t\4\2\3\3\6\6\2\u0279\2n\3\2\2\2\4t\3\2\2\2\6"+
		"{\3\2\2\2\b\u008b\3\2\2\2\n\u008d\3\2\2\2\f\u0097\3\2\2\2\16\u009b\3\2"+
		"\2\2\20\u00a4\3\2\2\2\22\u00ab\3\2\2\2\24\u00b2\3\2\2\2\26\u00bb\3\2\2"+
		"\2\30\u00be\3\2\2\2\32\u00ce\3\2\2\2\34\u00d4\3\2\2\2\36\u00d7\3\2\2\2"+
		" \u00e9\3\2\2\2\"\u00ef\3\2\2\2$\u00f4\3\2\2\2&\u0100\3\2\2\2(\u0113\3"+
		"\2\2\2*\u0120\3\2\2\2,\u0130\3\2\2\2.\u0134\3\2\2\2\60\u0136\3\2\2\2\62"+
		"\u014a\3\2\2\2\64\u0162\3\2\2\2\66\u0173\3\2\2\28\u017b\3\2\2\2:\u017d"+
		"\3\2\2\2<\u01a0\3\2\2\2>\u01b8\3\2\2\2@\u01bc\3\2\2\2B\u01be\3\2\2\2D"+
		"\u01c2\3\2\2\2F\u01cf\3\2\2\2H\u01d2\3\2\2\2J\u01d7\3\2\2\2L\u01e5\3\2"+
		"\2\2N\u01e7\3\2\2\2P\u01f4\3\2\2\2R\u0215\3\2\2\2T\u022e\3\2\2\2V\u0230"+
		"\3\2\2\2X\u0232\3\2\2\2Z\u0234\3\2\2\2\\\u023b\3\2\2\2^\u023d\3\2\2\2"+
		"`\u0245\3\2\2\2b\u0247\3\2\2\2d\u024a\3\2\2\2f\u024f\3\2\2\2h\u0253\3"+
		"\2\2\2j\u0255\3\2\2\2l\u0258\3\2\2\2no\5\4\3\2op\7\2\2\3p\3\3\2\2\2qs"+
		"\5\6\4\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\5\3\2\2\2vt\3\2\2\2"+
		"w|\5\b\5\2x|\5D#\2y|\5N(\2z|\5l\67\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3"+
		"\2\2\2|\7\3\2\2\2}\u008c\5\n\6\2~\u008c\5\24\13\2\177\u008c\5\30\r\2\u0080"+
		"\u008c\5\36\20\2\u0081\u008c\5$\23\2\u0082\u008c\5&\24\2\u0083\u008c\5"+
		"*\26\2\u0084\u008c\5.\30\2\u0085\u008c\5:\36\2\u0086\u008c\5<\37\2\u0087"+
		"\u008c\5> \2\u0088\u008c\5\20\t\2\u0089\u008c\5\f\7\2\u008a\u008c\5\16"+
		"\b\2\u008b}\3\2\2\2\u008b~\3\2\2\2\u008b\177\3\2\2\2\u008b\u0080\3\2\2"+
		"\2\u008b\u0081\3\2\2\2\u008b\u0082\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u0084"+
		"\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b"+
		"\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\t\3\2\2\2"+
		"\u008d\u008e\5h\65\2\u008e\u008f\7%\2\2\u008f\u0090\5V,\2\u0090\u0093"+
		"\5^\60\2\u0091\u0092\7)\2\2\u0092\u0094\5Z.\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\t\2\2\u0096\13\3\2\2"+
		"\2\u0097\u0098\5h\65\2\u0098\u0099\5\34\17\2\u0099\u009a\7\t\2\2\u009a"+
		"\r\3\2\2\2\u009b\u009c\5h\65\2\u009c\u009e\7N\2\2\u009d\u009f\5b\62\2"+
		"\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2"+
		"\7\t\2\2\u00a1\u00a3\5\22\n\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\17\3\2\2\2\u00a4\u00a5\5h\65\2\u00a5\u00a6\7H\2\2\u00a6\u00a7\7"+
		"\t\2\2\u00a7\21\3\2\2\2\u00a8\u00aa\5\6\4\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\5h\65\2\u00af\u00b0\7L\2\2\u00b0"+
		"\u00b1\7\t\2\2\u00b1\23\3\2\2\2\u00b2\u00b3\5h\65\2\u00b3\u00b4\7.\2\2"+
		"\u00b4\u00b5\5\26\f\2\u00b5\u00b6\7O\2\2\u00b6\u00b7\7\t\2\2\u00b7\25"+
		"\3\2\2\2\u00b8\u00ba\7P\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\27\3\2\2\2\u00bd\u00bb\3\2\2"+
		"\2\u00be\u00bf\5h\65\2\u00bf\u00c0\7,\2\2\u00c0\u00c4\7\t\2\2\u00c1\u00c3"+
		"\13\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8"+
		"\5h\65\2\u00c8\u00c9\7-\2\2\u00c9\u00ca\7\t\2\2\u00ca\31\3\2\2\2\u00cb"+
		"\u00cd\n\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00ce\u00cf\3\2\2\2\u00cf\33\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3"+
		"\n\3\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\35\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5h\65"+
		"\2\u00d8\u00d9\7/\2\2\u00d9\u00da\5P)\2\u00da\u00db\7\t\2\2\u00db\u00df"+
		"\5\4\3\2\u00dc\u00de\5 \21\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00e4\5\"\22\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\5h\65\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\7"+
		"\t\2\2\u00e8\37\3\2\2\2\u00e9\u00ea\5h\65\2\u00ea\u00eb\7\60\2\2\u00eb"+
		"\u00ec\5P)\2\u00ec\u00ed\7\t\2\2\u00ed\u00ee\5\4\3\2\u00ee!\3\2\2\2\u00ef"+
		"\u00f0\5h\65\2\u00f0\u00f1\7\64\2\2\u00f1\u00f2\7\t\2\2\u00f2\u00f3\5"+
		"\4\3\2\u00f3#\3\2\2\2\u00f4\u00f5\5h\65\2\u00f5\u00f6\7\62\2\2\u00f6\u00f7"+
		"\5P)\2\u00f7\u00f8\7\t\2\2\u00f8\u00fa\5\4\3\2\u00f9\u00fb\5\"\22\2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\5h"+
		"\65\2\u00fd\u00fe\7\63\2\2\u00fe\u00ff\7\t\2\2\u00ff%\3\2\2\2\u0100\u0101"+
		"\5h\65\2\u0101\u0102\7\66\2\2\u0102\u0103\5P)\2\u0103\u0105\7\t\2\2\u0104"+
		"\u0106\5l\67\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0109\5(\25\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010e\5\""+
		"\22\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\5h\65\2\u0110\u0111\7\67\2\2\u0111\u0112\7\t\2\2\u0112\'\3\2\2"+
		"\2\u0113\u0114\5h\65\2\u0114\u0115\78\2\2\u0115\u011a\5R*\2\u0116\u0117"+
		"\t\4\2\2\u0117\u0119\5R*\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011d\u011e\7\t\2\2\u011e\u011f\5\4\3\2\u011f)\3\2\2\2\u0120\u0121"+
		"\5h\65\2\u0121\u0122\79\2\2\u0122\u0123\5,\27\2\u0123\u0128\5P)\2\u0124"+
		"\u0125\7\27\2\2\u0125\u0127\5P)\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012c\7\t\2\2\u012c+\3\2\2\2\u012d\u012e\5P)\2\u012e"+
		"\u012f\7\26\2\2\u012f\u0131\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131-\3\2\2\2\u0132\u0135\5\60\31\2\u0133\u0135\5\62\32\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135/\3\2\2\2\u0136\u0137\5h\65\2"+
		"\u0137\u0138\7:\2\2\u0138\u0139\7N\2\2\u0139\u013a\7<\2\2\u013a\u013c"+
		"\5T+\2\u013b\u013d\7I\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u0141\3\2\2\2\u013e\u0140\5\66\34\2\u013f\u013e\3\2\2\2\u0140\u0143\3"+
		"\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0144\u0145\7\t\2\2\u0145\u0146\5\64\33\2\u0146\u0147\5"+
		"h\65\2\u0147\u0148\7;\2\2\u0148\u0149\7\t\2\2\u0149\61\3\2\2\2\u014a\u014b"+
		"\5h\65\2\u014b\u014c\7:\2\2\u014c\u014d\7N\2\2\u014d\u014e\7<\2\2\u014e"+
		"\u014f\7\30\2\2\u014f\u0150\5P)\2\u0150\u0151\7\13\2\2\u0151\u0152\5P"+
		")\2\u0152\u0154\7\31\2\2\u0153\u0155\7I\2\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0159\3\2\2\2\u0156\u0158\5\66\34\2\u0157\u0156\3"+
		"\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7\t\2\2\u015d\u015e\5\4"+
		"\3\2\u015e\u015f\5h\65\2\u015f\u0160\7;\2\2\u0160\u0161\7\t\2\2\u0161"+
		"\63\3\2\2\2\u0162\u0168\5\4\3\2\u0163\u0164\5h\65\2\u0164\u0165\7\64\2"+
		"\2\u0165\u0166\7\t\2\2\u0166\u0167\5\4\3\2\u0167\u0169\3\2\2\2\u0168\u0163"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\65\3\2\2\2\u016a\u016b\7G\2\2\u016b"+
		"\u016c\7\26\2\2\u016c\u0174\7H\2\2\u016d\u016e\7G\2\2\u016e\u016f\7\26"+
		"\2\2\u016f\u0174\5P)\2\u0170\u0171\7N\2\2\u0171\u0172\7\26\2\2\u0172\u0174"+
		"\5P)\2\u0173\u016a\3\2\2\2\u0173\u016d\3\2\2\2\u0173\u0170\3\2\2\2\u0174"+
		"\67\3\2\2\2\u0175\u0176\7G\2\2\u0176\u0177\7\26\2\2\u0177\u017c\5P)\2"+
		"\u0178\u0179\7N\2\2\u0179\u017a\7\26\2\2\u017a\u017c\5P)\2\u017b\u0175"+
		"\3\2\2\2\u017b\u0178\3\2\2\2\u017c9\3\2\2\2\u017d\u017e\5h\65\2\u017e"+
		"\u017f\7?\2\2\u017f\u0180\7N\2\2\u0180\u0181\7<\2\2\u0181\u0185\5T+\2"+
		"\u0182\u0184\58\35\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188"+
		"\u0189\7\t\2\2\u0189\u018a\5\4\3\2\u018a\u018b\5h\65\2\u018b\u018c\7@"+
		"\2\2\u018c\u018d\7\t\2\2\u018d;\3\2\2\2\u018e\u018f\5h\65\2\u018f\u0190"+
		"\7*\2\2\u0190\u0191\7N\2\2\u0191\u0192\7\t\2\2\u0192\u0193\5\4\3\2\u0193"+
		"\u0194\5h\65\2\u0194\u0195\7+\2\2\u0195\u0196\7\t\2\2\u0196\u01a1\3\2"+
		"\2\2\u0197\u0198\5h\65\2\u0198\u0199\7*\2\2\u0199\u019a\7\n\2\2\u019a"+
		"\u019b\7\t\2\2\u019b\u019c\5\4\3\2\u019c\u019d\5h\65\2\u019d\u019e\7+"+
		"\2\2\u019e\u019f\7\t\2\2\u019f\u01a1\3\2\2\2\u01a0\u018e\3\2\2\2\u01a0"+
		"\u0197\3\2\2\2\u01a1=\3\2\2\2\u01a2\u01a3\6 \2\2\u01a3\u01a4\5h\65\2\u01a4"+
		"\u01a5\7E\2\2\u01a5\u01a8\5P)\2\u01a6\u01a7\7F\2\2\u01a7\u01a9\7\n\2\2"+
		"\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab"+
		"\7\t\2\2\u01ab\u01b9\3\2\2\2\u01ac\u01ad\6 \3\2\u01ad\u01ae\5h\65\2\u01ae"+
		"\u01af\7E\2\2\u01af\u01b3\5@!\2\u01b0\u01b2\5B\"\2\u01b1\u01b0\3\2\2\2"+
		"\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6"+
		"\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\7\t\2\2\u01b7\u01b9\3\2\2\2\u01b8"+
		"\u01a2\3\2\2\2\u01b8\u01ac\3\2\2\2\u01b9?\3\2\2\2\u01ba\u01bd\5D#\2\u01bb"+
		"\u01bd\5f\64\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb\3\2\2\2\u01bdA\3\2\2\2"+
		"\u01be\u01bf\5X-\2\u01bf\u01c0\7\17\2\2\u01c0\u01c1\5P)\2\u01c1C\3\2\2"+
		"\2\u01c2\u01c3\5j\66\2\u01c3\u01c7\5F$\2\u01c4\u01c6\5H%\2\u01c5\u01c4"+
		"\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7\b\2\2\u01cbE\3\2\2\2"+
		"\u01cc\u01ce\n\5\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0G\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2"+
		"\u01d3\7\25\2\2\u01d3\u01d5\7N\2\2\u01d4\u01d6\5J&\2\u01d5\u01d4\3\2\2"+
		"\2\u01d5\u01d6\3\2\2\2\u01d6I\3\2\2\2\u01d7\u01d8\7\26\2\2\u01d8\u01dd"+
		"\5L\'\2\u01d9\u01da\7\27\2\2\u01da\u01dc\5L\'\2\u01db\u01d9\3\2\2\2\u01dc"+
		"\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01deK\3\2\2\2"+
		"\u01df\u01dd\3\2\2\2\u01e0\u01e1\5\\/\2\u01e1\u01e2\7\26\2\2\u01e2\u01e3"+
		"\5P)\2\u01e3\u01e6\3\2\2\2\u01e4\u01e6\5P)\2\u01e5\u01e0\3\2\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e6M\3\2\2\2\u01e7\u01e8\5h\65\2\u01e8\u01e9\7A\2\2\u01e9"+
		"\u01ea\7N\2\2\u01ea\u01eb\7\17\2\2\u01eb\u01ef\5P)\2\u01ec\u01ee\5H%\2"+
		"\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\7\t\2\2\u01f3"+
		"O\3\2\2\2\u01f4\u01f5\b)\1\2\u01f5\u01f6\5R*\2\u01f6\u0205\3\2\2\2\u01f7"+
		"\u01f8\f\7\2\2\u01f8\u01f9\t\6\2\2\u01f9\u0204\5P)\b\u01fa\u01fb\f\6\2"+
		"\2\u01fb\u01fc\t\7\2\2\u01fc\u0204\5P)\7\u01fd\u01fe\f\5\2\2\u01fe\u01ff"+
		"\7\65\2\2\u01ff\u0204\5P)\6\u0200\u0201\f\4\2\2\u0201\u0202\t\b\2\2\u0202"+
		"\u0204\5P)\4\u0203\u01f7\3\2\2\2\u0203\u01fa\3\2\2\2\u0203\u01fd\3\2\2"+
		"\2\u0203\u0200\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206"+
		"\3\2\2\2\u0206Q\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0216\7\"\2\2\u0209"+
		"\u0216\7#\2\2\u020a\u0216\7\n\2\2\u020b\u0216\7B\2\2\u020c\u0216\7C\2"+
		"\2\u020d\u0216\7D\2\2\u020e\u0216\5T+\2\u020f\u0216\7J\2\2\u0210\u0216"+
		"\7K\2\2\u0211\u0212\7\30\2\2\u0212\u0213\5P)\2\u0213\u0214\7\31\2\2\u0214"+
		"\u0216\3\2\2\2\u0215\u0208\3\2\2\2\u0215\u0209\3\2\2\2\u0215\u020a\3\2"+
		"\2\2\u0215\u020b\3\2\2\2\u0215\u020c\3\2\2\2\u0215\u020d\3\2\2\2\u0215"+
		"\u020e\3\2\2\2\u0215\u020f\3\2\2\2\u0215\u0210\3\2\2\2\u0215\u0211\3\2"+
		"\2\2\u0216S\3\2\2\2\u0217\u022f\7J\2\2\u0218\u021c\5X-\2\u0219\u021b\5"+
		"`\61\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0221\7\34"+
		"\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u022f\3\2\2\2\u0222"+
		"\u0223\7\32\2\2\u0223\u0224\7\n\2\2\u0224\u0226\7\33\2\2\u0225\u0227\7"+
		"\34\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022f\3\2\2\2\u0228"+
		"\u0229\7\32\2\2\u0229\u022a\7N\2\2\u022a\u022c\7\33\2\2\u022b\u022d\7"+
		"\34\2\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e"+
		"\u0217\3\2\2\2\u022e\u0218\3\2\2\2\u022e\u0222\3\2\2\2\u022e\u0228\3\2"+
		"\2\2\u022fU\3\2\2\2\u0230\u0231\t\t\2\2\u0231W\3\2\2\2\u0232\u0233\t\n"+
		"\2\2\u0233Y\3\2\2\2\u0234\u0235\7N\2\2\u0235[\3\2\2\2\u0236\u023c\5X-"+
		"\2\u0237\u023c\7J\2\2\u0238\u023c\7D\2\2\u0239\u023c\7B\2\2\u023a\u023c"+
		"\7C\2\2\u023b\u0236\3\2\2\2\u023b\u0237\3\2\2\2\u023b\u0238\3\2\2\2\u023b"+
		"\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c]\3\2\2\2\u023d\u023e\7N\2\2\u023e"+
		"_\3\2\2\2\u023f\u0240\7\f\2\2\u0240\u0246\5\\/\2\u0241\u0242\7\32\2\2"+
		"\u0242\u0243\5P)\2\u0243\u0244\7\33\2\2\u0244\u0246\3\2\2\2\u0245\u023f"+
		"\3\2\2\2\u0245\u0241\3\2\2\2\u0246a\3\2\2\2\u0247\u0248\5d\63\2\u0248"+
		"c\3\2\2\2\u0249\u024b\n\13\2\2\u024a\u0249\3\2\2\2\u024b\u024c\3\2\2\2"+
		"\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024de\3\2\2\2\u024e\u0250\13"+
		"\2\2\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0251"+
		"\u024f\3\2\2\2\u0252g\3\2\2\2\u0253\u0254\t\2\2\2\u0254i\3\2\2\2\u0255"+
		"\u0256\t\f\2\2\u0256k\3\2\2\2\u0257\u0259\7\5\2\2\u0258\u0257\3\2\2\2"+
		"\u0259\u025a\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025bm\3"+
		"\2\2\2\67t{\u008b\u0093\u009e\u00a2\u00ab\u00bb\u00c4\u00ce\u00d4\u00df"+
		"\u00e3\u00fa\u0105\u010a\u010d\u011a\u0128\u0130\u0134\u013c\u0141\u0154"+
		"\u0159\u0168\u0173\u017b\u0185\u01a0\u01a8\u01b3\u01b8\u01bc\u01c7\u01cf"+
		"\u01d5\u01dd\u01e5\u01ef\u0203\u0205\u0215\u021c\u0220\u0226\u022c\u022e"+
		"\u023b\u0245\u024c\u0251\u025a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}