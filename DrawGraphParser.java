// Generated from DrawGraph.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawGraphParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PLUS=2, MINUS=3, DIV=4, MUL=5, POWER=6, EQUALS=7, SEMICO=8, L_BRACKET=9, 
		R_BRACKET=10, COMMA=11, ORIGIN=12, SCALE=13, ROT=14, IS=15, TO=16, STEP=17, 
		DRAW=18, FOR=19, FROM=20, T1=21, COLOR=22, RED=23, GREEN=24, BLUE=25, 
		BLACK=26, COLORFUL=27, WHITE=28, SIZE=29, BACKGROUND=30, WATERMAKER=31, 
		P=32, I=33, E=34, CONST_ID=35, Integer=36, Real=37, ID=38, WS=39, COMMENT=40, 
		ErrText=41;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_originStatment = 2, RULE_scaleStatment = 3, 
		RULE_rotStatment = 4, RULE_forStatment = 5, RULE_statColor = 6, RULE_statSize = 7, 
		RULE_statVar = 8, RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "originStatment", "scaleStatment", "rotStatment", 
			"forStatment", "statColor", "statSize", "statVar", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Color('", "'+'", "'-'", "'/'", "'*'", "'**'", "'='", "';'", "'('", 
			"')'", "','", "'ORIGIN'", "'SCALE'", "'ROT'", "'IS'", "'TO'", "'STEP'", 
			"'DRAW'", "'FOR'", "'FROM'", "'T'", "'COLOR'", "'RED'", "'GREEN'", "'BLUE'", 
			"'BLACK'", "'COLORFUL'", "'WHITE'", "'SIZE'", "'BACKGROUND'", "'WATERMAKER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PLUS", "MINUS", "DIV", "MUL", "POWER", "EQUALS", "SEMICO", 
			"L_BRACKET", "R_BRACKET", "COMMA", "ORIGIN", "SCALE", "ROT", "IS", "TO", 
			"STEP", "DRAW", "FOR", "FROM", "T1", "COLOR", "RED", "GREEN", "BLUE", 
			"BLACK", "COLORFUL", "WHITE", "SIZE", "BACKGROUND", "WATERMAKER", "P", 
			"I", "E", "CONST_ID", "Integer", "Real", "ID", "WS", "COMMENT", "ErrText"
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
	public String getGrammarFileName() { return "DrawGraph.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawGraphParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DrawGraphParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICO() { return getTokens(DrawGraphParser.SEMICO); }
		public TerminalNode SEMICO(int i) {
			return getToken(DrawGraphParser.SEMICO, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ORIGIN) | (1L << SCALE) | (1L << ROT) | (1L << FOR) | (1L << COLOR) | (1L << SIZE) | (1L << ID))) != 0)) {
				{
				{
				setState(20);
				statement();
				setState(21);
				match(SEMICO);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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

	public static class StatementContext extends ParserRuleContext {
		public ScaleStatmentContext scaleStatment() {
			return getRuleContext(ScaleStatmentContext.class,0);
		}
		public RotStatmentContext rotStatment() {
			return getRuleContext(RotStatmentContext.class,0);
		}
		public ForStatmentContext forStatment() {
			return getRuleContext(ForStatmentContext.class,0);
		}
		public StatColorContext statColor() {
			return getRuleContext(StatColorContext.class,0);
		}
		public StatSizeContext statSize() {
			return getRuleContext(StatSizeContext.class,0);
		}
		public OriginStatmentContext originStatment() {
			return getRuleContext(OriginStatmentContext.class,0);
		}
		public StatVarContext statVar() {
			return getRuleContext(StatVarContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCALE:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				scaleStatment();
				}
				break;
			case ROT:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				rotStatment();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				forStatment();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				statColor();
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				statSize();
				}
				break;
			case ORIGIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				originStatment();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(36);
				statVar();
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

	public static class OriginStatmentContext extends ParserRuleContext {
		public OriginStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originStatment; }
	 
		public OriginStatmentContext() { }
		public void copyFrom(OriginStatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatOriginContext extends OriginStatmentContext {
		public TerminalNode ORIGIN() { return getToken(DrawGraphParser.ORIGIN, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DrawGraphParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public StatOriginContext(OriginStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitStatOrigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginStatmentContext originStatment() throws RecognitionException {
		OriginStatmentContext _localctx = new OriginStatmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_originStatment);
		try {
			_localctx = new StatOriginContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ORIGIN);
			setState(40);
			match(IS);
			setState(41);
			match(L_BRACKET);
			setState(42);
			expr(0);
			setState(43);
			match(COMMA);
			setState(44);
			expr(0);
			setState(45);
			match(R_BRACKET);
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

	public static class ScaleStatmentContext extends ParserRuleContext {
		public ScaleStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleStatment; }
	 
		public ScaleStatmentContext() { }
		public void copyFrom(ScaleStatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatScaleContext extends ScaleStatmentContext {
		public TerminalNode SCALE() { return getToken(DrawGraphParser.SCALE, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DrawGraphParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public StatScaleContext(ScaleStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitStatScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleStatmentContext scaleStatment() throws RecognitionException {
		ScaleStatmentContext _localctx = new ScaleStatmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scaleStatment);
		try {
			_localctx = new StatScaleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(SCALE);
			setState(48);
			match(IS);
			setState(49);
			match(L_BRACKET);
			setState(50);
			expr(0);
			setState(51);
			match(COMMA);
			setState(52);
			expr(0);
			setState(53);
			match(R_BRACKET);
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

	public static class RotStatmentContext extends ParserRuleContext {
		public RotStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotStatment; }
	 
		public RotStatmentContext() { }
		public void copyFrom(RotStatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatRotContext extends RotStatmentContext {
		public TerminalNode ROT() { return getToken(DrawGraphParser.ROT, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatRotContext(RotStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitStatRot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotStatmentContext rotStatment() throws RecognitionException {
		RotStatmentContext _localctx = new RotStatmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rotStatment);
		try {
			_localctx = new StatRotContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ROT);
			setState(56);
			match(IS);
			setState(57);
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

	public static class ForStatmentContext extends ParserRuleContext {
		public ForStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatment; }
	 
		public ForStatmentContext() { }
		public void copyFrom(ForStatmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatForContext extends ForStatmentContext {
		public TerminalNode FOR() { return getToken(DrawGraphParser.FOR, 0); }
		public TerminalNode T1() { return getToken(DrawGraphParser.T1, 0); }
		public TerminalNode FROM() { return getToken(DrawGraphParser.FROM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(DrawGraphParser.TO, 0); }
		public TerminalNode STEP() { return getToken(DrawGraphParser.STEP, 0); }
		public TerminalNode DRAW() { return getToken(DrawGraphParser.DRAW, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(DrawGraphParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public StatForContext(ForStatmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitStatFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatmentContext forStatment() throws RecognitionException {
		ForStatmentContext _localctx = new ForStatmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStatment);
		try {
			_localctx = new StatForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(FOR);
			setState(60);
			match(T1);
			setState(61);
			match(FROM);
			setState(62);
			expr(0);
			setState(63);
			match(TO);
			setState(64);
			expr(0);
			setState(65);
			match(STEP);
			setState(66);
			expr(0);
			setState(67);
			match(DRAW);
			setState(68);
			match(L_BRACKET);
			setState(69);
			expr(0);
			setState(70);
			match(COMMA);
			setState(71);
			expr(0);
			setState(72);
			match(R_BRACKET);
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

	public static class StatColorContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DrawGraphParser.COLOR, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public TerminalNode RED() { return getToken(DrawGraphParser.RED, 0); }
		public TerminalNode GREEN() { return getToken(DrawGraphParser.GREEN, 0); }
		public TerminalNode BLUE() { return getToken(DrawGraphParser.BLUE, 0); }
		public TerminalNode BLACK() { return getToken(DrawGraphParser.BLACK, 0); }
		public TerminalNode COLORFUL() { return getToken(DrawGraphParser.COLORFUL, 0); }
		public TerminalNode WHITE() { return getToken(DrawGraphParser.WHITE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DrawGraphParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DrawGraphParser.COMMA, i);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public StatColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statColor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitStatColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatColorContext statColor() throws RecognitionException {
		StatColorContext _localctx = new StatColorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(COLOR);
			setState(75);
			match(IS);
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RED:
				{
				setState(76);
				match(RED);
				}
				break;
			case GREEN:
				{
				setState(77);
				match(GREEN);
				}
				break;
			case BLUE:
				{
				setState(78);
				match(BLUE);
				}
				break;
			case BLACK:
				{
				setState(79);
				match(BLACK);
				}
				break;
			case COLORFUL:
				{
				setState(80);
				match(COLORFUL);
				}
				break;
			case WHITE:
				{
				setState(81);
				match(WHITE);
				}
				break;
			case T__0:
				{
				setState(82);
				match(T__0);
				setState(83);
				expr(0);
				setState(84);
				match(COMMA);
				setState(85);
				expr(0);
				setState(86);
				match(COMMA);
				setState(87);
				expr(0);
				setState(88);
				match(R_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatSizeContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(DrawGraphParser.SIZE, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statSize; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitStatSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatSizeContext statSize() throws RecognitionException {
		StatSizeContext _localctx = new StatSizeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(SIZE);
			setState(93);
			match(IS);
			setState(94);
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

	public static class StatVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DrawGraphParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(DrawGraphParser.EQUALS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitStatVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatVarContext statVar() throws RecognitionException {
		StatVarContext _localctx = new StatVarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(ID);
			setState(97);
			match(EQUALS);
			setState(98);
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
	public static class VarExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(DrawGraphParser.ID, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(DrawGraphParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DrawGraphParser.MINUS, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(DrawGraphParser.ID, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POWER() { return getToken(DrawGraphParser.POWER, 0); }
		public PowerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitPowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstContext extends ExprContext {
		public TerminalNode CONST_ID() { return getToken(DrawGraphParser.CONST_ID, 0); }
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedExprContext extends ExprContext {
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public NestedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitNestedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(DrawGraphParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DrawGraphParser.MINUS, 0); }
		public PlusMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitPlusMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarTContext extends ExprContext {
		public TerminalNode T1() { return getToken(DrawGraphParser.T1, 0); }
		public VarTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitVarT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(DrawGraphParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DrawGraphParser.DIV, 0); }
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawGraphVisitor ) return ((DrawGraphVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(101);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				expr(8);
				}
				break;
			case 2:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(CONST_ID);
				}
				break;
			case 3:
				{
				_localctx = new VarTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(T1);
				}
				break;
			case 4:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(ID);
				setState(106);
				match(L_BRACKET);
				setState(107);
				expr(0);
				setState(108);
				match(R_BRACKET);
				}
				break;
			case 5:
				{
				_localctx = new NestedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(L_BRACKET);
				setState(111);
				expr(0);
				setState(112);
				match(R_BRACKET);
				}
				break;
			case 6:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(118);
						match(POWER);
						setState(119);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(121);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(124);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0086\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13v\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0081\n\13\f\13\16"+
		"\13\u0084\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\4\5\3\2"+
		"\6\7\2\u0090\2\33\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b\61\3\2\2\2\n9\3\2\2"+
		"\2\f=\3\2\2\2\16L\3\2\2\2\20^\3\2\2\2\22b\3\2\2\2\24u\3\2\2\2\26\27\5"+
		"\4\3\2\27\30\7\n\2\2\30\32\3\2\2\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31\3"+
		"\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\2\2\3\37\3\3"+
		"\2\2\2 (\5\b\5\2!(\5\n\6\2\"(\5\f\7\2#(\5\16\b\2$(\5\20\t\2%(\5\6\4\2"+
		"&(\5\22\n\2\' \3\2\2\2\'!\3\2\2\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'"+
		"%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*\7\16\2\2*+\7\21\2\2+,\7\13\2\2,-\5\24"+
		"\13\2-.\7\r\2\2./\5\24\13\2/\60\7\f\2\2\60\7\3\2\2\2\61\62\7\17\2\2\62"+
		"\63\7\21\2\2\63\64\7\13\2\2\64\65\5\24\13\2\65\66\7\r\2\2\66\67\5\24\13"+
		"\2\678\7\f\2\28\t\3\2\2\29:\7\20\2\2:;\7\21\2\2;<\5\24\13\2<\13\3\2\2"+
		"\2=>\7\25\2\2>?\7\27\2\2?@\7\26\2\2@A\5\24\13\2AB\7\22\2\2BC\5\24\13\2"+
		"CD\7\23\2\2DE\5\24\13\2EF\7\24\2\2FG\7\13\2\2GH\5\24\13\2HI\7\r\2\2IJ"+
		"\5\24\13\2JK\7\f\2\2K\r\3\2\2\2LM\7\30\2\2M\\\7\21\2\2N]\7\31\2\2O]\7"+
		"\32\2\2P]\7\33\2\2Q]\7\34\2\2R]\7\35\2\2S]\7\36\2\2TU\7\3\2\2UV\5\24\13"+
		"\2VW\7\r\2\2WX\5\24\13\2XY\7\r\2\2YZ\5\24\13\2Z[\7\f\2\2[]\3\2\2\2\\N"+
		"\3\2\2\2\\O\3\2\2\2\\P\3\2\2\2\\Q\3\2\2\2\\R\3\2\2\2\\S\3\2\2\2\\T\3\2"+
		"\2\2]\17\3\2\2\2^_\7\37\2\2_`\7\21\2\2`a\5\24\13\2a\21\3\2\2\2bc\7(\2"+
		"\2cd\7\t\2\2de\5\24\13\2e\23\3\2\2\2fg\b\13\1\2gh\t\2\2\2hv\5\24\13\n"+
		"iv\7%\2\2jv\7\27\2\2kl\7(\2\2lm\7\13\2\2mn\5\24\13\2no\7\f\2\2ov\3\2\2"+
		"\2pq\7\13\2\2qr\5\24\13\2rs\7\f\2\2sv\3\2\2\2tv\7(\2\2uf\3\2\2\2ui\3\2"+
		"\2\2uj\3\2\2\2uk\3\2\2\2up\3\2\2\2ut\3\2\2\2v\u0082\3\2\2\2wx\f\13\2\2"+
		"xy\7\b\2\2y\u0081\5\24\13\13z{\f\t\2\2{|\t\3\2\2|\u0081\5\24\13\n}~\f"+
		"\b\2\2~\177\t\2\2\2\177\u0081\5\24\13\t\u0080w\3\2\2\2\u0080z\3\2\2\2"+
		"\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\25\3\2\2\2\u0084\u0082\3\2\2\2\b\33\'\\u\u0080\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}