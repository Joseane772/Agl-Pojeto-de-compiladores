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
		T__38=39, T__39=40, ID=41, NUMBER=42, STRING=43, LINE_COMMENT=44, BLOCK_COMMENT=45, 
		NEWLINE=46, WS=47;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_varDeclaration = 2, RULE_objectDeclaration = 3, 
		RULE_objectProperty = 4, RULE_objectType = 5, RULE_viewDeclaration = 6, 
		RULE_viewProperty = 7, RULE_viewAction = 8, RULE_print = 9, RULE_assignment = 10, 
		RULE_action = 11, RULE_comment = 12, RULE_type = 13, RULE_expr = 14, RULE_point = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varDeclaration", "objectDeclaration", "objectProperty", 
			"objectType", "viewDeclaration", "viewProperty", "viewAction", "print", 
			"assignment", "action", "comment", "type", "expr", "point"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "';'", "'at'", "'with'", "'{'", "'}'", "'fill'", 
			"'lenft'", "'start'", "'extent'", "'outline'", "'Line'", "'Rectangle'", 
			"'Ellipse'", "'Arc'", "'ArcChord'", "'PieSlice'", "'Text'", "'Dot'", 
			"'View'", "'Ox'", "'Oy'", "'width'", "'height'", "'title'", "'background'", 
			"'refresh'", "'close'", "'print'", "'move'", "'('", "')'", "'Integer'", 
			"'Number'", "'Point'", "'Vector'", "'String'", "'Time'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "NUMBER", "STRING", "LINE_COMMENT", 
			"BLOCK_COMMENT", "NEWLINE", "WS"
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
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 107756168142848L) != 0)) {
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BLOCK_COMMENT:
					{
					setState(32);
					comment();
					}
					break;
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case ID:
				case NEWLINE:
					{
					setState(33);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ViewDeclarationContext viewDeclaration() {
			return getRuleContext(ViewDeclarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AGLParser.NEWLINE, 0); }
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ViewActionContext viewAction() {
			return getRuleContext(ViewActionContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				viewDeclaration();
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(40);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				objectDeclaration();
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(44);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				varDeclaration();
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(48);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				assignment();
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(52);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				print();
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(56);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				viewAction();
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(60);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				action();
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(64);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ID);
			setState(71);
			match(T__0);
			setState(72);
			type();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(73);
				match(T__1);
				setState(74);
				expr();
				}
			}

			setState(77);
			match(T__2);
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
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AGLParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AGLParser.NEWLINE, i);
		}
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_objectDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			objectType();
			setState(80);
			match(T__3);
			setState(81);
			point();
			setState(82);
			match(T__4);
			setState(83);
			match(T__5);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					match(NEWLINE);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				{
				setState(90);
				objectProperty();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(96);
				match(NEWLINE);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
		enterRule(_localctx, 8, RULE_objectProperty);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__7);
				setState(105);
				match(T__1);
				setState(106);
				expr();
				setState(107);
				match(T__2);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__8);
				setState(110);
				match(T__1);
				setState(111);
				expr();
				setState(112);
				match(T__2);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__9);
				setState(115);
				match(T__1);
				setState(116);
				expr();
				setState(117);
				match(T__2);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(T__10);
				setState(120);
				match(T__1);
				setState(121);
				expr();
				setState(122);
				match(T__2);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				match(T__11);
				setState(125);
				match(T__1);
				setState(126);
				expr();
				setState(127);
				match(T__2);
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
		enterRule(_localctx, 10, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2088960L) != 0)) ) {
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
		enterRule(_localctx, 12, RULE_viewDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ID);
			setState(134);
			match(T__0);
			setState(135);
			match(T__20);
			setState(136);
			match(T__4);
			setState(137);
			match(T__5);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					match(NEWLINE);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) {
				{
				{
				setState(144);
				viewProperty();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(150);
				match(NEWLINE);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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
		enterRule(_localctx, 14, RULE_viewProperty);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__21);
				setState(159);
				match(T__1);
				setState(160);
				expr();
				setState(161);
				match(T__2);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__22);
				setState(164);
				match(T__1);
				setState(165);
				expr();
				setState(166);
				match(T__2);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(T__23);
				setState(169);
				match(T__1);
				setState(170);
				expr();
				setState(171);
				match(T__2);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(T__24);
				setState(174);
				match(T__1);
				setState(175);
				expr();
				setState(176);
				match(T__2);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
				match(T__25);
				setState(179);
				match(T__1);
				setState(180);
				expr();
				setState(181);
				match(T__2);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(T__26);
				setState(184);
				match(T__1);
				setState(185);
				expr();
				setState(186);
				match(T__2);
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
	public static class ViewActionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AGLParser.ID, 0); }
		public ViewActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewAction; }
	}

	public final ViewActionContext viewAction() throws RecognitionException {
		ViewActionContext _localctx = new ViewActionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_viewAction);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__27);
				setState(191);
				match(ID);
				setState(192);
				match(T__2);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(T__28);
				setState(194);
				match(ID);
				setState(195);
				match(T__2);
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
		enterRule(_localctx, 18, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__29);
			setState(199);
			expr();
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
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(202);
			match(T__1);
			setState(203);
			expr();
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
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_action);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__30);
				setState(206);
				match(T__31);
				setState(207);
				point();
				setState(208);
				match(T__32);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(T__28);
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode BLOCK_COMMENT() { return getToken(AGLParser.BLOCK_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(BLOCK_COMMENT);
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
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1082331758592L) != 0)) ) {
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(ID);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				point();
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
		enterRule(_localctx, 30, RULE_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__31);
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(226);
			match(T__39);
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(228);
			match(T__32);
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
		"\u0004\u0001/\u00e7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0005\u0000#\b\u0000\n\u0000\f\u0000&\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001:\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0001\u0003\u0001E\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002L\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003V\b\u0003\n\u0003\f\u0003Y\t"+
		"\u0003\u0001\u0003\u0005\u0003\\\b\u0003\n\u0003\f\u0003_\t\u0003\u0001"+
		"\u0003\u0005\u0003b\b\u0003\n\u0003\f\u0003e\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0082\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u008c\b\u0006\n\u0006\f\u0006\u008f\t\u0006\u0001\u0006\u0005\u0006"+
		"\u0092\b\u0006\n\u0006\f\u0006\u0095\t\u0006\u0001\u0006\u0005\u0006\u0098"+
		"\b\u0006\n\u0006\f\u0006\u009b\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00bd\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u00c5\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00d5\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00df\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0003\u0001\u0000\r\u0014\u0001"+
		"\u0000\"\'\u0001\u0000)*\u00fc\u0000$\u0001\u0000\u0000\u0000\u0002D\u0001"+
		"\u0000\u0000\u0000\u0004F\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000"+
		"\u0000\b\u0081\u0001\u0000\u0000\u0000\n\u0083\u0001\u0000\u0000\u0000"+
		"\f\u0085\u0001\u0000\u0000\u0000\u000e\u00bc\u0001\u0000\u0000\u0000\u0010"+
		"\u00c4\u0001\u0000\u0000\u0000\u0012\u00c6\u0001\u0000\u0000\u0000\u0014"+
		"\u00c9\u0001\u0000\u0000\u0000\u0016\u00d4\u0001\u0000\u0000\u0000\u0018"+
		"\u00d6\u0001\u0000\u0000\u0000\u001a\u00d8\u0001\u0000\u0000\u0000\u001c"+
		"\u00de\u0001\u0000\u0000\u0000\u001e\u00e0\u0001\u0000\u0000\u0000 #\u0003"+
		"\u0018\f\u0000!#\u0003\u0002\u0001\u0000\" \u0001\u0000\u0000\u0000\""+
		"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%\u0001\u0001\u0000\u0000\u0000&$\u0001"+
		"\u0000\u0000\u0000\')\u0003\f\u0006\u0000(*\u0005.\u0000\u0000)(\u0001"+
		"\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*E\u0001\u0000\u0000\u0000"+
		"+-\u0003\u0006\u0003\u0000,.\u0005.\u0000\u0000-,\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.E\u0001\u0000\u0000\u0000/1\u0003\u0004\u0002"+
		"\u000002\u0005.\u0000\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u00002E\u0001\u0000\u0000\u000035\u0003\u0014\n\u000046\u0005.\u0000"+
		"\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006E\u0001\u0000"+
		"\u0000\u000079\u0003\u0012\t\u00008:\u0005.\u0000\u000098\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:E\u0001\u0000\u0000\u0000;=\u0003"+
		"\u0010\b\u0000<>\u0005.\u0000\u0000=<\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>E\u0001\u0000\u0000\u0000?A\u0003\u0016\u000b\u0000"+
		"@B\u0005.\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CE\u0005.\u0000\u0000D\'\u0001\u0000\u0000\u0000"+
		"D+\u0001\u0000\u0000\u0000D/\u0001\u0000\u0000\u0000D3\u0001\u0000\u0000"+
		"\u0000D7\u0001\u0000\u0000\u0000D;\u0001\u0000\u0000\u0000D?\u0001\u0000"+
		"\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0003\u0001\u0000\u0000\u0000"+
		"FG\u0005)\u0000\u0000GH\u0005\u0001\u0000\u0000HK\u0003\u001a\r\u0000"+
		"IJ\u0005\u0002\u0000\u0000JL\u0003\u001c\u000e\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0005\u0003"+
		"\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0003\n\u0005\u0000PQ\u0005"+
		"\u0004\u0000\u0000QR\u0003\u001e\u000f\u0000RS\u0005\u0005\u0000\u0000"+
		"SW\u0005\u0006\u0000\u0000TV\u0005.\u0000\u0000UT\u0001\u0000\u0000\u0000"+
		"VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X]\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0003\b"+
		"\u0004\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^c\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`b\u0005.\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u0007"+
		"\u0000\u0000g\u0007\u0001\u0000\u0000\u0000hi\u0005\b\u0000\u0000ij\u0005"+
		"\u0002\u0000\u0000jk\u0003\u001c\u000e\u0000kl\u0005\u0003\u0000\u0000"+
		"l\u0082\u0001\u0000\u0000\u0000mn\u0005\t\u0000\u0000no\u0005\u0002\u0000"+
		"\u0000op\u0003\u001c\u000e\u0000pq\u0005\u0003\u0000\u0000q\u0082\u0001"+
		"\u0000\u0000\u0000rs\u0005\n\u0000\u0000st\u0005\u0002\u0000\u0000tu\u0003"+
		"\u001c\u000e\u0000uv\u0005\u0003\u0000\u0000v\u0082\u0001\u0000\u0000"+
		"\u0000wx\u0005\u000b\u0000\u0000xy\u0005\u0002\u0000\u0000yz\u0003\u001c"+
		"\u000e\u0000z{\u0005\u0003\u0000\u0000{\u0082\u0001\u0000\u0000\u0000"+
		"|}\u0005\f\u0000\u0000}~\u0005\u0002\u0000\u0000~\u007f\u0003\u001c\u000e"+
		"\u0000\u007f\u0080\u0005\u0003\u0000\u0000\u0080\u0082\u0001\u0000\u0000"+
		"\u0000\u0081h\u0001\u0000\u0000\u0000\u0081m\u0001\u0000\u0000\u0000\u0081"+
		"r\u0001\u0000\u0000\u0000\u0081w\u0001\u0000\u0000\u0000\u0081|\u0001"+
		"\u0000\u0000\u0000\u0082\t\u0001\u0000\u0000\u0000\u0083\u0084\u0007\u0000"+
		"\u0000\u0000\u0084\u000b\u0001\u0000\u0000\u0000\u0085\u0086\u0005)\u0000"+
		"\u0000\u0086\u0087\u0005\u0001\u0000\u0000\u0087\u0088\u0005\u0015\u0000"+
		"\u0000\u0088\u0089\u0005\u0005\u0000\u0000\u0089\u008d\u0005\u0006\u0000"+
		"\u0000\u008a\u008c\u0005.\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0093\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0003\u000e\u0007\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0099\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0098\u0005.\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b"+
		"\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0007\u0000\u0000\u009d"+
		"\r\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0016\u0000\u0000\u009f\u00a0"+
		"\u0005\u0002\u0000\u0000\u00a0\u00a1\u0003\u001c\u000e\u0000\u00a1\u00a2"+
		"\u0005\u0003\u0000\u0000\u00a2\u00bd\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005\u0017\u0000\u0000\u00a4\u00a5\u0005\u0002\u0000\u0000\u00a5\u00a6"+
		"\u0003\u001c\u000e\u0000\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u00bd"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0018\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0002\u0000\u0000\u00aa\u00ab\u0003\u001c\u000e\u0000\u00ab\u00ac"+
		"\u0005\u0003\u0000\u0000\u00ac\u00bd\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0019\u0000\u0000\u00ae\u00af\u0005\u0002\u0000\u0000\u00af\u00b0"+
		"\u0003\u001c\u000e\u0000\u00b0\u00b1\u0005\u0003\u0000\u0000\u00b1\u00bd"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u001a\u0000\u0000\u00b3\u00b4"+
		"\u0005\u0002\u0000\u0000\u00b4\u00b5\u0003\u001c\u000e\u0000\u00b5\u00b6"+
		"\u0005\u0003\u0000\u0000\u00b6\u00bd\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005\u001b\u0000\u0000\u00b8\u00b9\u0005\u0002\u0000\u0000\u00b9\u00ba"+
		"\u0003\u001c\u000e\u0000\u00ba\u00bb\u0005\u0003\u0000\u0000\u00bb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bc\u009e\u0001\u0000\u0000\u0000\u00bc\u00a3"+
		"\u0001\u0000\u0000\u0000\u00bc\u00a8\u0001\u0000\u0000\u0000\u00bc\u00ad"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b2\u0001\u0000\u0000\u0000\u00bc\u00b7"+
		"\u0001\u0000\u0000\u0000\u00bd\u000f\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005\u001c\u0000\u0000\u00bf\u00c0\u0005)\u0000\u0000\u00c0\u00c5\u0005"+
		"\u0003\u0000\u0000\u00c1\u00c2\u0005\u001d\u0000\u0000\u00c2\u00c3\u0005"+
		")\u0000\u0000\u00c3\u00c5\u0005\u0003\u0000\u0000\u00c4\u00be\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c5\u0011\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0005\u001e\u0000\u0000\u00c7\u00c8\u0003\u001c"+
		"\u000e\u0000\u00c8\u0013\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005)\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0002\u0000\u0000\u00cb\u00cc\u0003\u001c\u000e"+
		"\u0000\u00cc\u0015\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u001f\u0000"+
		"\u0000\u00ce\u00cf\u0005 \u0000\u0000\u00cf\u00d0\u0003\u001e\u000f\u0000"+
		"\u00d0\u00d1\u0005!\u0000\u0000\u00d1\u00d5\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d5\u0005\u001c\u0000\u0000\u00d3\u00d5\u0005\u001d\u0000\u0000\u00d4"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u0017\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005-\u0000\u0000\u00d7\u0019\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0007\u0001\u0000\u0000\u00d9\u001b\u0001\u0000\u0000\u0000\u00da\u00df"+
		"\u0005+\u0000\u0000\u00db\u00df\u0005*\u0000\u0000\u00dc\u00df\u0005)"+
		"\u0000\u0000\u00dd\u00df\u0003\u001e\u000f\u0000\u00de\u00da\u0001\u0000"+
		"\u0000\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u001d\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0005 \u0000\u0000\u00e1\u00e2\u0007\u0002\u0000"+
		"\u0000\u00e2\u00e3\u0005(\u0000\u0000\u00e3\u00e4\u0007\u0002\u0000\u0000"+
		"\u00e4\u00e5\u0005!\u0000\u0000\u00e5\u001f\u0001\u0000\u0000\u0000\u0016"+
		"\"$)-159=ADKW]c\u0081\u008d\u0093\u0099\u00bc\u00c4\u00d4\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}