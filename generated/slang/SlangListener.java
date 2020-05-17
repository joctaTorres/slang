// Generated from ./slang/Slang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SlangParser}.
 */
public interface SlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SlangParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SlangParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SlangParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SlangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SlangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SlangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SlangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SlangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link SlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierFunctionCall(SlangParser.IdentifierFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link SlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierFunctionCall(SlangParser.IdentifierFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link SlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnFunctionCall(SlangParser.PrintlnFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link SlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnFunctionCall(SlangParser.PrintlnFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link SlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionCall(SlangParser.PrintFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link SlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionCall(SlangParser.PrintFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link SlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAssertFunctionCall(SlangParser.AssertFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link SlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAssertFunctionCall(SlangParser.AssertFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link SlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSizeFunctionCall(SlangParser.SizeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link SlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSizeFunctionCall(SlangParser.SizeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SlangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SlangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(SlangParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(SlangParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(SlangParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(SlangParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(SlangParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(SlangParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(SlangParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(SlangParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SlangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SlangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SlangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SlangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(SlangParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(SlangParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(SlangParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(SlangParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SlangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SlangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(SlangParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(SlangParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SlangParser#indexes}.
	 * @param ctx the parse tree
	 */
	void enterIndexes(SlangParser.IndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SlangParser#indexes}.
	 * @param ctx the parse tree
	 */
	void exitIndexes(SlangParser.IndexesContext ctx);
}