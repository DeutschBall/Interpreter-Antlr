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
		T__0=1, PLUS=2, MINUS=3, DIV=4, MUL=5, POWER=6, SEMICO=7, L_BRACKET=8, 
		R_BRACKET=9, COMMA=10, ORIGIN=11, SCALE=12, ROT=13, IS=14, TO=15, STEP=16, 
		DRAW=17, FOR=18, FROM=19, T1=20, COLOR=21, RED=22, GREEN=23, BLUE=24, 
		BLACK=25, SIZE=26, P=27, I=28, E=29, CONST_ID=30, Integer=31, Real=32, 
		ID=33, WS=34, COMMENT=35, ErrText=36;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_originStatment = 2, RULE_scaleStatment = 3, 
		RULE_rotStatment = 4, RULE_forStatment = 5, RULE_statColor = 6, RULE_expr = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "originStatment", "scaleStatment", "rotStatment", 
			"forStatment", "statColor", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Color('", "'+'", "'-'", "'/'", "'*'", "'**'", "';'", "'('", "')'", 
			"','", "'ORIGIN'", "'SCALE'", "'ROT'", "'IS'", "'TO'", "'STEP'", "'DRAW'", 
			"'FOR'", "'FROM'", "'T'", "'COLOR'", "'RED'", "'GREEN'", "'BLUE'", "'BLACK'", 
			"'SIZE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PLUS", "MINUS", "DIV", "MUL", "POWER", "SEMICO", "L_BRACKET", 
			"R_BRACKET", "COMMA", "ORIGIN", "SCALE", "ROT", "IS", "TO", "STEP", "DRAW", 
			"FOR", "FROM", "T1", "COLOR", "RED", "GREEN", "BLUE", "BLACK", "SIZE", 
			"P", "I", "E", "CONST_ID", "Integer", "Real", "ID", "WS", "COMMENT", 
			"ErrText"
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ORIGIN) | (1L << SCALE) | (1L << ROT) | (1L << FOR) | (1L << COLOR))) != 0)) {
				{
				{
				setState(16);
				statement();
				setState(17);
				match(SEMICO);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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
		public OriginStatmentContext originStatment() {
			return getRuleContext(OriginStatmentContext.class,0);
		}
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
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORIGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				originStatment();
				}
				break;
			case SCALE:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				scaleStatment();
				}
				break;
			case ROT:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				rotStatment();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				forStatment();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				statColor();
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
			setState(33);
			match(ORIGIN);
			setState(34);
			match(IS);
			setState(35);
			match(L_BRACKET);
			setState(36);
			expr(0);
			setState(37);
			match(COMMA);
			setState(38);
			expr(0);
			setState(39);
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
			setState(41);
			match(SCALE);
			setState(42);
			match(IS);
			setState(43);
			match(L_BRACKET);
			setState(44);
			expr(0);
			setState(45);
			match(COMMA);
			setState(46);
			expr(0);
			setState(47);
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
			setState(49);
			match(ROT);
			setState(50);
			match(IS);
			setState(51);
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
			setState(53);
			match(FOR);
			setState(54);
			match(T1);
			setState(55);
			match(FROM);
			setState(56);
			expr(0);
			setState(57);
			match(TO);
			setState(58);
			expr(0);
			setState(59);
			match(STEP);
			setState(60);
			expr(0);
			setState(61);
			match(DRAW);
			setState(62);
			match(L_BRACKET);
			setState(63);
			expr(0);
			setState(64);
			match(COMMA);
			setState(65);
			expr(0);
			setState(66);
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
			setState(68);
			match(COLOR);
			setState(69);
			match(IS);
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RED:
				{
				setState(70);
				match(RED);
				}
				break;
			case GREEN:
				{
				setState(71);
				match(GREEN);
				}
				break;
			case BLUE:
				{
				setState(72);
				match(BLUE);
				}
				break;
			case BLACK:
				{
				setState(73);
				match(BLACK);
				}
				break;
			case T__0:
				{
				setState(74);
				match(T__0);
				setState(75);
				expr(0);
				setState(76);
				match(COMMA);
				setState(77);
				expr(0);
				setState(78);
				match(COMMA);
				setState(79);
				expr(0);
				setState(80);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(86);
				expr(7);
				}
				break;
			case CONST_ID:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(CONST_ID);
				}
				break;
			case T1:
				{
				_localctx = new VarTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(T1);
				}
				break;
			case ID:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(ID);
				setState(90);
				match(L_BRACKET);
				setState(91);
				expr(0);
				setState(92);
				match(R_BRACKET);
				}
				break;
			case L_BRACKET:
				{
				_localctx = new NestedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(L_BRACKET);
				setState(95);
				expr(0);
				setState(96);
				match(R_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(101);
						match(POWER);
						setState(102);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(104);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(107);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(113);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&u\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2\26\n"+
		"\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bU\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\te\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\tp\n\t\f\t\16\ts\13\t\3\t\2\3\20\n\2\4\6\b\n\f\16\20"+
		"\2\4\3\2\4\5\3\2\6\7\2|\2\27\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b+\3\2\2\2"+
		"\n\63\3\2\2\2\f\67\3\2\2\2\16F\3\2\2\2\20d\3\2\2\2\22\23\5\4\3\2\23\24"+
		"\7\t\2\2\24\26\3\2\2\2\25\22\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34\"\5"+
		"\6\4\2\35\"\5\b\5\2\36\"\5\n\6\2\37\"\5\f\7\2 \"\5\16\b\2!\34\3\2\2\2"+
		"!\35\3\2\2\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\7\r\2\2$"+
		"%\7\20\2\2%&\7\n\2\2&\'\5\20\t\2\'(\7\f\2\2()\5\20\t\2)*\7\13\2\2*\7\3"+
		"\2\2\2+,\7\16\2\2,-\7\20\2\2-.\7\n\2\2./\5\20\t\2/\60\7\f\2\2\60\61\5"+
		"\20\t\2\61\62\7\13\2\2\62\t\3\2\2\2\63\64\7\17\2\2\64\65\7\20\2\2\65\66"+
		"\5\20\t\2\66\13\3\2\2\2\678\7\24\2\289\7\26\2\29:\7\25\2\2:;\5\20\t\2"+
		";<\7\21\2\2<=\5\20\t\2=>\7\22\2\2>?\5\20\t\2?@\7\23\2\2@A\7\n\2\2AB\5"+
		"\20\t\2BC\7\f\2\2CD\5\20\t\2DE\7\13\2\2E\r\3\2\2\2FG\7\27\2\2GT\7\20\2"+
		"\2HU\7\30\2\2IU\7\31\2\2JU\7\32\2\2KU\7\33\2\2LM\7\3\2\2MN\5\20\t\2NO"+
		"\7\f\2\2OP\5\20\t\2PQ\7\f\2\2QR\5\20\t\2RS\7\13\2\2SU\3\2\2\2TH\3\2\2"+
		"\2TI\3\2\2\2TJ\3\2\2\2TK\3\2\2\2TL\3\2\2\2U\17\3\2\2\2VW\b\t\1\2WX\t\2"+
		"\2\2Xe\5\20\t\tYe\7 \2\2Ze\7\26\2\2[\\\7#\2\2\\]\7\n\2\2]^\5\20\t\2^_"+
		"\7\13\2\2_e\3\2\2\2`a\7\n\2\2ab\5\20\t\2bc\7\13\2\2ce\3\2\2\2dV\3\2\2"+
		"\2dY\3\2\2\2dZ\3\2\2\2d[\3\2\2\2d`\3\2\2\2eq\3\2\2\2fg\f\n\2\2gh\7\b\2"+
		"\2hp\5\20\t\nij\f\b\2\2jk\t\3\2\2kp\5\20\t\tlm\f\7\2\2mn\t\2\2\2np\5\20"+
		"\t\bof\3\2\2\2oi\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\21\3"+
		"\2\2\2sq\3\2\2\2\b\27!Tdoq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}