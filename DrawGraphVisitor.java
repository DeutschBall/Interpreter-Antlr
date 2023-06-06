// Generated from DrawGraph.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DrawGraphParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DrawGraphVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DrawGraphParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DrawGraphParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawGraphParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DrawGraphParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statOrigin}
	 * labeled alternative in {@link DrawGraphParser#originStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatOrigin(DrawGraphParser.StatOriginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statScale}
	 * labeled alternative in {@link DrawGraphParser#scaleStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatScale(DrawGraphParser.StatScaleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statRot}
	 * labeled alternative in {@link DrawGraphParser#rotStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatRot(DrawGraphParser.StatRotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statFor}
	 * labeled alternative in {@link DrawGraphParser#forStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatFor(DrawGraphParser.StatForContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawGraphParser#statColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatColor(DrawGraphParser.StatColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawGraphParser#statSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatSize(DrawGraphParser.StatSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawGraphParser#statVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatVar(DrawGraphParser.StatVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(DrawGraphParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(DrawGraphParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(DrawGraphParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powerExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(DrawGraphParser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(DrawGraphParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpr(DrawGraphParser.NestedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinusExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpr(DrawGraphParser.PlusMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varT}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarT(DrawGraphParser.VarTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(DrawGraphParser.MulDivExprContext ctx);
}