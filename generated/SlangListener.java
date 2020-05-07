// Generated from ./Slang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlangParser}.
 */
public interface SlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SlangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SlangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SlangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SlangParser.ExprContext ctx);
}