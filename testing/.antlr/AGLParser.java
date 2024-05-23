// Generated from /home/weza/UA/Year-3/S-2/C/projeto/testing/AGL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AGLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, ID=58, NUMBER=59, STRING=60, 
		LINE_COMMENT=61, BLOCK_COMMENT=62, NEWLINE=63, WS=64;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_withBlock = 2, RULE_varDeclaration = 3, 
		RULE_varPropertyAssignment = 4, RULE_command = 5, RULE_commandCondition = 6, 
		RULE_objectAssignment = 7, RULE_objectDeclaration = 8, RULE_objectProperty = 9, 
		RULE_objectType = 10, RULE_viewDeclaration = 11, RULE_viewProperty = 12, 
		RULE_print = 13, RULE_assignment = 14, RULE_action = 15, RULE_forLoop = 16, 
		RULE_range = 17, RULE_comment = 18, RULE_type = 19, RULE_expr = 20, RULE_point = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "withBlock", "varDeclaration", "varPropertyAssignment", 
			"command", "commandCondition", "objectAssignment", "objectDeclaration", 
			"objectProperty", "objectType", "viewDeclaration", "viewProperty", "print", 
			"assignment", "action", "forLoop", "range", "comment", "type", "expr", 
			"point"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'with'", "'do'", "'{'", "'}'", "':'", "'='", "';'", "'.'", "'wait'", 
			"'mouse'", "'click'", "'key'", "'press'", "'time'", "'pass'", "'s'", 
			"'ms'", "'at'", "'fill'", "'length'", "'start'", "'extent'", "'outline'", 
			"'text'", "'Line'", "'Rectangle'", "'Ellipse'", "'Arc'", "'ArcChord'", 
			"'PieSlice'", "'Text'", "'Dot'", "'View'", "'Ox'", "'Oy'", "'width'", 
			"'height'", "'title'", "'background'", "'print'", "'refresh'", "'close'", 
			"'move'", "'by'", "'after'", "'for'", "'in'", "'..'", "'Integer'", "'Number'", 
			"'Point'", "'Vector'", "'String'", "'Time'", "'('", "','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "NUMBER", 
			"STRING", "LINE_COMMENT", "BLOCK_COMMENT", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "AGL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AGLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AGLParser.EOF, 0); }
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2017525763087007230L) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					comment();
					}
					break;
				case 2:
					{
					setState(45);
					statement();
					}
					break;
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ViewDeclarationContext viewDeclaration() {
			return getRuleContext(ViewDeclarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AGLParser.NEWLINE, 0); }
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public ObjectAssignmentContext objectAssignment() {
			return getRuleContext(ObjectAssignmentContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarPropertyAssignmentContext varPropertyAssignment() {
			return getRuleContext(VarPropertyAssignmentContext.class,0);
		}
		public WithBlockContext withBlock() {
			return getRuleContext(WithBlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				viewDeclaration();
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(54);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				objectDeclaration();
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(58);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				objectAssignment();
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(62);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				varDeclaration();
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(66);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				varPropertyAssignment();
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(70);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				withBlock();
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(74);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				assignment();
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(78);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				print();
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(82);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				action();
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(86);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				forLoop();
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(90);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(93);
				comment();
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(94);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(97);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WithBlockContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AGLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AGLParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WithBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withBlock; }
	}

	public final WithBlockContext withBlock() throws RecognitionException {
		WithBlockContext _localctx = new WithBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_withBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__0);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(101);
				match(ID);
				setState(102);
				match(T__1);
				}
			}

			setState(105);
			match(T__2);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					match(NEWLINE);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					statement();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(118);
				match(NEWLINE);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
			setState(127);
			match(T__4);
			setState(128);
			type();
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(129);
					match(T__5);
					setState(130);
					expr();
					}
				}

				}
				break;
			case 2:
				{
				{
				setState(133);
				match(T__5);
				setState(134);
				command();
				}
				}
				break;
			}
			setState(137);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarPropertyAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AGLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AGLParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarPropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varPropertyAssignment; }
	}

	public final VarPropertyAssignmentContext varPropertyAssignment() throws RecognitionException {
		VarPropertyAssignmentContext _localctx = new VarPropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varPropertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ID);
			setState(140);
			match(T__7);
			setState(141);
			match(ID);
			setState(142);
			match(T__5);
			setState(143);
			expr();
			setState(144);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public CommandConditionContext commandCondition() {
			return getRuleContext(CommandConditionContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__8);
			setState(147);
			commandCondition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandConditionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AGLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AGLParser.NUMBER, 0); }
		public CommandConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandCondition; }
	}

	public final CommandConditionContext commandCondition() throws RecognitionException {
		CommandConditionContext _localctx = new CommandConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_commandCondition);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__9);
				setState(150);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__11);
				setState(152);
				match(T__12);
				setState(153);
				match(STRING);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(T__13);
				setState(155);
				match(T__14);
				setState(156);
				match(NUMBER);
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public ObjectAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAssignment; }
	}

	public final ObjectAssignmentContext objectAssignment() throws RecognitionException {
		ObjectAssignmentContext _localctx = new ObjectAssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objectAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
			setState(161);
			match(T__4);
			setState(162);
			objectDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclarationContext extends ParserRuleContext {
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WithBlockContext withBlock() {
			return getRuleContext(WithBlockContext.class,0);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_objectDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			objectType();
			setState(165);
			match(T__17);
			setState(166);
			expr();
			setState(167);
			withBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_objectProperty);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__18);
				setState(170);
				match(T__5);
				setState(171);
				expr();
				setState(172);
				match(T__6);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__19);
				setState(175);
				match(T__5);
				setState(176);
				expr();
				setState(177);
				match(T__6);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__20);
				setState(180);
				match(T__5);
				setState(181);
				expr();
				setState(182);
				match(T__6);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(T__21);
				setState(185);
				match(T__5);
				setState(186);
				expr();
				setState(187);
				match(T__6);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				match(T__22);
				setState(190);
				match(T__5);
				setState(191);
				expr();
				setState(192);
				match(T__6);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(T__23);
				setState(195);
				match(T__5);
				setState(196);
				expr();
				setState(197);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectTypeContext extends ParserRuleContext {
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8556380160L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ViewDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AGLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AGLParser.NEWLINE, i);
		}
		public List<ViewPropertyContext> viewProperty() {
			return getRuleContexts(ViewPropertyContext.class);
		}
		public ViewPropertyContext viewProperty(int i) {
			return getRuleContext(ViewPropertyContext.class,i);
		}
		public ViewDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewDeclaration; }
	}

	public final ViewDeclarationContext viewDeclaration() throws RecognitionException {
		ViewDeclarationContext _localctx = new ViewDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_viewDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ID);
			setState(204);
			match(T__4);
			setState(205);
			match(T__32);
			setState(206);
			match(T__0);
			setState(207);
			match(T__2);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(NEWLINE);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1082331758592L) != 0)) {
				{
				{
				setState(214);
				viewProperty();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(220);
				match(NEWLINE);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ViewPropertyContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ViewPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewProperty; }
	}

	public final ViewPropertyContext viewProperty() throws RecognitionException {
		ViewPropertyContext _localctx = new ViewPropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_viewProperty);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(T__33);
				setState(229);
				match(T__5);
				setState(230);
				expr();
				setState(231);
				match(T__6);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(T__34);
				setState(234);
				match(T__5);
				setState(235);
				expr();
				setState(236);
				match(T__6);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(T__35);
				setState(239);
				match(T__5);
				setState(240);
				expr();
				setState(241);
				match(T__6);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(T__36);
				setState(244);
				match(T__5);
				setState(245);
				expr();
				setState(246);
				match(T__6);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				match(T__37);
				setState(249);
				match(T__5);
				setState(250);
				expr();
				setState(251);
				match(T__6);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				match(T__38);
				setState(254);
				match(T__5);
				setState(255);
				expr();
				setState(256);
				match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__39);
			setState(261);
			expr();
			setState(262);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ID);
			setState(265);
			match(T__5);
			setState(266);
			expr();
			setState(267);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(AGLParser.NUMBER, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_action);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(T__40);
				setState(270);
				match(ID);
				setState(271);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(T__41);
				setState(273);
				match(ID);
				setState(274);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(T__42);
				setState(276);
				match(ID);
				setState(277);
				match(T__43);
				setState(278);
				point();
				setState(279);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				match(T__40);
				setState(282);
				match(ID);
				setState(283);
				match(T__44);
				setState(284);
				match(NUMBER);
				setState(285);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(286);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(T__8);
				setState(288);
				match(T__9);
				setState(289);
				match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AGLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AGLParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forLoop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__45);
			setState(293);
			match(ID);
			setState(294);
			match(T__46);
			setState(295);
			range();
			setState(296);
			match(T__1);
			setState(297);
			match(T__2);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(298);
					match(NEWLINE);
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(304);
					statement();
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(310);
				match(NEWLINE);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(AGLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AGLParser.NUMBER, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(NUMBER);
			setState(319);
			match(T__47);
			setState(320);
			match(NUMBER);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(321);
				match(T__47);
				setState(322);
				match(NUMBER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(AGLParser.LINE_COMMENT, 0); }
		public TerminalNode BLOCK_COMMENT() { return getToken(AGLParser.BLOCK_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !(_la==LINE_COMMENT || _la==BLOCK_COMMENT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35465847065542656L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AGLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AGLParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(ID);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				point();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				command();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(AGLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AGLParser.NUMBER, i);
		}
		public List<TerminalNode> ID() { return getTokens(AGLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AGLParser.ID, i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__54);
			setState(337);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(338);
			match(T__55);
			setState(339);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(340);
			match(T__56);
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
		"\u0004\u0001@\u0157\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001@\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001H\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001L\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001P\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001T\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"X\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001\\\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001`\b\u0001\u0001\u0001\u0003\u0001c\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002h\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002l\b\u0002\n\u0002\f\u0002o\t\u0002\u0001\u0002\u0005\u0002"+
		"r\b\u0002\n\u0002\f\u0002u\t\u0002\u0001\u0002\u0005\u0002x\b\u0002\n"+
		"\u0002\f\u0002{\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0084\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0088\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u009f\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00c8\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d2\b\u000b\n\u000b\f\u000b"+
		"\u00d5\t\u000b\u0001\u000b\u0005\u000b\u00d8\b\u000b\n\u000b\f\u000b\u00db"+
		"\t\u000b\u0001\u000b\u0005\u000b\u00de\b\u000b\n\u000b\f\u000b\u00e1\t"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0103"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0123\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u012c\b\u0010\n\u0010\f\u0010\u012f"+
		"\t\u0010\u0001\u0010\u0005\u0010\u0132\b\u0010\n\u0010\f\u0010\u0135\t"+
		"\u0010\u0001\u0010\u0005\u0010\u0138\b\u0010\n\u0010\f\u0010\u013b\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0144\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u014f\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*\u0000\u0005\u0001\u0000\u0010\u0011\u0001\u0000\u0019 \u0001\u0000"+
		"=>\u0001\u000016\u0001\u0000:;\u0179\u00000\u0001\u0000\u0000\u0000\u0002"+
		"b\u0001\u0000\u0000\u0000\u0004d\u0001\u0000\u0000\u0000\u0006~\u0001"+
		"\u0000\u0000\u0000\b\u008b\u0001\u0000\u0000\u0000\n\u0092\u0001\u0000"+
		"\u0000\u0000\f\u009e\u0001\u0000\u0000\u0000\u000e\u00a0\u0001\u0000\u0000"+
		"\u0000\u0010\u00a4\u0001\u0000\u0000\u0000\u0012\u00c7\u0001\u0000\u0000"+
		"\u0000\u0014\u00c9\u0001\u0000\u0000\u0000\u0016\u00cb\u0001\u0000\u0000"+
		"\u0000\u0018\u0102\u0001\u0000\u0000\u0000\u001a\u0104\u0001\u0000\u0000"+
		"\u0000\u001c\u0108\u0001\u0000\u0000\u0000\u001e\u0122\u0001\u0000\u0000"+
		"\u0000 \u0124\u0001\u0000\u0000\u0000\"\u013e\u0001\u0000\u0000\u0000"+
		"$\u0145\u0001\u0000\u0000\u0000&\u0147\u0001\u0000\u0000\u0000(\u014e"+
		"\u0001\u0000\u0000\u0000*\u0150\u0001\u0000\u0000\u0000,/\u0003$\u0012"+
		"\u0000-/\u0003\u0002\u0001\u0000.,\u0001\u0000\u0000\u0000.-\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"34\u0005\u0000\u0000\u00014\u0001\u0001\u0000\u0000\u000057\u0003\u0016"+
		"\u000b\u000068\u0005?\u0000\u000076\u0001\u0000\u0000\u000078\u0001\u0000"+
		"\u0000\u00008c\u0001\u0000\u0000\u00009;\u0003\u0010\b\u0000:<\u0005?"+
		"\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<c\u0001"+
		"\u0000\u0000\u0000=?\u0003\u000e\u0007\u0000>@\u0005?\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@c\u0001\u0000\u0000\u0000"+
		"AC\u0003\u0006\u0003\u0000BD\u0005?\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000Dc\u0001\u0000\u0000\u0000EG\u0003\b\u0004\u0000"+
		"FH\u0005?\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"Hc\u0001\u0000\u0000\u0000IK\u0003\u0004\u0002\u0000JL\u0005?\u0000\u0000"+
		"KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000Lc\u0001\u0000\u0000"+
		"\u0000MO\u0003\u001c\u000e\u0000NP\u0005?\u0000\u0000ON\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000Pc\u0001\u0000\u0000\u0000QS\u0003\u001a"+
		"\r\u0000RT\u0005?\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000Tc\u0001\u0000\u0000\u0000UW\u0003\u001e\u000f\u0000VX\u0005"+
		"?\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000Xc\u0001"+
		"\u0000\u0000\u0000Y[\u0003 \u0010\u0000Z\\\u0005?\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\c\u0001\u0000\u0000\u0000"+
		"]_\u0003$\u0012\u0000^`\u0005?\u0000\u0000_^\u0001\u0000\u0000\u0000_"+
		"`\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000ac\u0005?\u0000\u0000"+
		"b5\u0001\u0000\u0000\u0000b9\u0001\u0000\u0000\u0000b=\u0001\u0000\u0000"+
		"\u0000bA\u0001\u0000\u0000\u0000bE\u0001\u0000\u0000\u0000bI\u0001\u0000"+
		"\u0000\u0000bM\u0001\u0000\u0000\u0000bQ\u0001\u0000\u0000\u0000bU\u0001"+
		"\u0000\u0000\u0000bY\u0001\u0000\u0000\u0000b]\u0001\u0000\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000c\u0003\u0001\u0000\u0000\u0000dg\u0005\u0001"+
		"\u0000\u0000ef\u0005:\u0000\u0000fh\u0005\u0002\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000im\u0005"+
		"\u0003\u0000\u0000jl\u0005?\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"ns\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0003\u0002\u0001"+
		"\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000ty\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vx\u0005?\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0004\u0000"+
		"\u0000}\u0005\u0001\u0000\u0000\u0000~\u007f\u0005:\u0000\u0000\u007f"+
		"\u0080\u0005\u0005\u0000\u0000\u0080\u0087\u0003&\u0013\u0000\u0081\u0082"+
		"\u0005\u0006\u0000\u0000\u0082\u0084\u0003(\u0014\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0088\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u0006\u0000\u0000\u0086\u0088\u0003"+
		"\n\u0005\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0007"+
		"\u0000\u0000\u008a\u0007\u0001\u0000\u0000\u0000\u008b\u008c\u0005:\u0000"+
		"\u0000\u008c\u008d\u0005\b\u0000\u0000\u008d\u008e\u0005:\u0000\u0000"+
		"\u008e\u008f\u0005\u0006\u0000\u0000\u008f\u0090\u0003(\u0014\u0000\u0090"+
		"\u0091\u0005\u0007\u0000\u0000\u0091\t\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005\t\u0000\u0000\u0093\u0094\u0003\f\u0006\u0000\u0094\u000b\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\n\u0000\u0000\u0096\u009f\u0005\u000b"+
		"\u0000\u0000\u0097\u0098\u0005\f\u0000\u0000\u0098\u0099\u0005\r\u0000"+
		"\u0000\u0099\u009f\u0005<\u0000\u0000\u009a\u009b\u0005\u000e\u0000\u0000"+
		"\u009b\u009c\u0005\u000f\u0000\u0000\u009c\u009d\u0005;\u0000\u0000\u009d"+
		"\u009f\u0007\u0000\u0000\u0000\u009e\u0095\u0001\u0000\u0000\u0000\u009e"+
		"\u0097\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000\u0000\u0000\u009f"+
		"\r\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005:\u0000\u0000\u00a1\u00a2"+
		"\u0005\u0005\u0000\u0000\u00a2\u00a3\u0003\u0010\b\u0000\u00a3\u000f\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0003\u0014\n\u0000\u00a5\u00a6\u0005\u0012"+
		"\u0000\u0000\u00a6\u00a7\u0003(\u0014\u0000\u00a7\u00a8\u0003\u0004\u0002"+
		"\u0000\u00a8\u0011\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0013\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0006\u0000\u0000\u00ab\u00ac\u0003(\u0014\u0000"+
		"\u00ac\u00ad\u0005\u0007\u0000\u0000\u00ad\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\u0014\u0000\u0000\u00af\u00b0\u0005\u0006\u0000\u0000"+
		"\u00b0\u00b1\u0003(\u0014\u0000\u00b1\u00b2\u0005\u0007\u0000\u0000\u00b2"+
		"\u00c8\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0015\u0000\u0000\u00b4"+
		"\u00b5\u0005\u0006\u0000\u0000\u00b5\u00b6\u0003(\u0014\u0000\u00b6\u00b7"+
		"\u0005\u0007\u0000\u0000\u00b7\u00c8\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0016\u0000\u0000\u00b9\u00ba\u0005\u0006\u0000\u0000\u00ba\u00bb"+
		"\u0003(\u0014\u0000\u00bb\u00bc\u0005\u0007\u0000\u0000\u00bc\u00c8\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005\u0017\u0000\u0000\u00be\u00bf\u0005"+
		"\u0006\u0000\u0000\u00bf\u00c0\u0003(\u0014\u0000\u00c0\u00c1\u0005\u0007"+
		"\u0000\u0000\u00c1\u00c8\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0018"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0006\u0000\u0000\u00c4\u00c5\u0003(\u0014"+
		"\u0000\u00c5\u00c6\u0005\u0007\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c7\u00a9\u0001\u0000\u0000\u0000\u00c7\u00ae\u0001\u0000\u0000"+
		"\u0000\u00c7\u00b3\u0001\u0000\u0000\u0000\u00c7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00c7\u00bd\u0001\u0000\u0000\u0000\u00c7\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c8\u0013\u0001\u0000\u0000\u0000\u00c9\u00ca\u0007\u0001\u0000"+
		"\u0000\u00ca\u0015\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005:\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0005\u0000\u0000\u00cd\u00ce\u0005!\u0000\u0000\u00ce"+
		"\u00cf\u0005\u0001\u0000\u0000\u00cf\u00d3\u0005\u0003\u0000\u0000\u00d0"+
		"\u00d2\u0005?\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d9\u0001\u0000\u0000\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d8\u0003\u0018\f\u0000\u00d7\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00df\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00de\u0005"+
		"?\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005\u0004\u0000\u0000\u00e3\u0017\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0005\"\u0000\u0000\u00e5\u00e6\u0005\u0006\u0000"+
		"\u0000\u00e6\u00e7\u0003(\u0014\u0000\u00e7\u00e8\u0005\u0007\u0000\u0000"+
		"\u00e8\u0103\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005#\u0000\u0000\u00ea"+
		"\u00eb\u0005\u0006\u0000\u0000\u00eb\u00ec\u0003(\u0014\u0000\u00ec\u00ed"+
		"\u0005\u0007\u0000\u0000\u00ed\u0103\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0005$\u0000\u0000\u00ef\u00f0\u0005\u0006\u0000\u0000\u00f0\u00f1\u0003"+
		"(\u0014\u0000\u00f1\u00f2\u0005\u0007\u0000\u0000\u00f2\u0103\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0005%\u0000\u0000\u00f4\u00f5\u0005\u0006\u0000"+
		"\u0000\u00f5\u00f6\u0003(\u0014\u0000\u00f6\u00f7\u0005\u0007\u0000\u0000"+
		"\u00f7\u0103\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005&\u0000\u0000\u00f9"+
		"\u00fa\u0005\u0006\u0000\u0000\u00fa\u00fb\u0003(\u0014\u0000\u00fb\u00fc"+
		"\u0005\u0007\u0000\u0000\u00fc\u0103\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0005\'\u0000\u0000\u00fe\u00ff\u0005\u0006\u0000\u0000\u00ff\u0100\u0003"+
		"(\u0014\u0000\u0100\u0101\u0005\u0007\u0000\u0000\u0101\u0103\u0001\u0000"+
		"\u0000\u0000\u0102\u00e4\u0001\u0000\u0000\u0000\u0102\u00e9\u0001\u0000"+
		"\u0000\u0000\u0102\u00ee\u0001\u0000\u0000\u0000\u0102\u00f3\u0001\u0000"+
		"\u0000\u0000\u0102\u00f8\u0001\u0000\u0000\u0000\u0102\u00fd\u0001\u0000"+
		"\u0000\u0000\u0103\u0019\u0001\u0000\u0000\u0000\u0104\u0105\u0005(\u0000"+
		"\u0000\u0105\u0106\u0003(\u0014\u0000\u0106\u0107\u0005\u0007\u0000\u0000"+
		"\u0107\u001b\u0001\u0000\u0000\u0000\u0108\u0109\u0005:\u0000\u0000\u0109"+
		"\u010a\u0005\u0006\u0000\u0000\u010a\u010b\u0003(\u0014\u0000\u010b\u010c"+
		"\u0005\u0007\u0000\u0000\u010c\u001d\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0005)\u0000\u0000\u010e\u010f\u0005:\u0000\u0000\u010f\u0123\u0005\u0007"+
		"\u0000\u0000\u0110\u0111\u0005*\u0000\u0000\u0111\u0112\u0005:\u0000\u0000"+
		"\u0112\u0123\u0005\u0007\u0000\u0000\u0113\u0114\u0005+\u0000\u0000\u0114"+
		"\u0115\u0005:\u0000\u0000\u0115\u0116\u0005,\u0000\u0000\u0116\u0117\u0003"+
		"*\u0015\u0000\u0117\u0118\u0005\u0007\u0000\u0000\u0118\u0123\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0005)\u0000\u0000\u011a\u011b\u0005:\u0000\u0000"+
		"\u011b\u011c\u0005-\u0000\u0000\u011c\u011d\u0005;\u0000\u0000\u011d\u011e"+
		"\u0007\u0000\u0000\u0000\u011e\u0123\u0005\u0007\u0000\u0000\u011f\u0120"+
		"\u0005\t\u0000\u0000\u0120\u0121\u0005\n\u0000\u0000\u0121\u0123\u0005"+
		"\u000b\u0000\u0000\u0122\u010d\u0001\u0000\u0000\u0000\u0122\u0110\u0001"+
		"\u0000\u0000\u0000\u0122\u0113\u0001\u0000\u0000\u0000\u0122\u0119\u0001"+
		"\u0000\u0000\u0000\u0122\u011f\u0001\u0000\u0000\u0000\u0123\u001f\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0005.\u0000\u0000\u0125\u0126\u0005:\u0000"+
		"\u0000\u0126\u0127\u0005/\u0000\u0000\u0127\u0128\u0003\"\u0011\u0000"+
		"\u0128\u0129\u0005\u0002\u0000\u0000\u0129\u012d\u0005\u0003\u0000\u0000"+
		"\u012a\u012c\u0005?\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e\u0133\u0001\u0000\u0000\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u0130\u0132\u0003\u0002\u0001\u0000\u0131"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133"+
		"\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u0139\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136"+
		"\u0138\u0005?\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u013b"+
		"\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0004\u0000\u0000\u013d!\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0005;\u0000\u0000\u013f\u0140\u00050\u0000"+
		"\u0000\u0140\u0143\u0005;\u0000\u0000\u0141\u0142\u00050\u0000\u0000\u0142"+
		"\u0144\u0005;\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144#\u0001\u0000\u0000\u0000\u0145\u0146\u0007"+
		"\u0002\u0000\u0000\u0146%\u0001\u0000\u0000\u0000\u0147\u0148\u0007\u0003"+
		"\u0000\u0000\u0148\'\u0001\u0000\u0000\u0000\u0149\u014f\u0005<\u0000"+
		"\u0000\u014a\u014f\u0005;\u0000\u0000\u014b\u014f\u0005:\u0000\u0000\u014c"+
		"\u014f\u0003*\u0015\u0000\u014d\u014f\u0003\n\u0005\u0000\u014e\u0149"+
		"\u0001\u0000\u0000\u0000\u014e\u014a\u0001\u0000\u0000\u0000\u014e\u014b"+
		"\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014d"+
		"\u0001\u0000\u0000\u0000\u014f)\u0001\u0000\u0000\u0000\u0150\u0151\u0005"+
		"7\u0000\u0000\u0151\u0152\u0007\u0004\u0000\u0000\u0152\u0153\u00058\u0000"+
		"\u0000\u0153\u0154\u0007\u0004\u0000\u0000\u0154\u0155\u00059\u0000\u0000"+
		"\u0155+\u0001\u0000\u0000\u0000 .07;?CGKOSW[_bgmsy\u0083\u0087\u009e\u00c7"+
		"\u00d3\u00d9\u00df\u0102\u0122\u012d\u0133\u0139\u0143\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}