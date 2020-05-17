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
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(SlangParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(SlangParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(SlangParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(SlangParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(SlangParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(SlangParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SlangParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SlangParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(SlangParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(SlangParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(SlangParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(SlangParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(SlangParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(SlangParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(SlangParser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(SlangParser.EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(SlangParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(SlangParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(SlangParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(SlangParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(SlangParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(SlangParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionExpression(SlangParser.ExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionExpression(SlangParser.ExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(SlangParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(SlangParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompExpression(SlangParser.CompExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompExpression(SlangParser.CompExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(SlangParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(SlangParser.NullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(SlangParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(SlangParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(SlangParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(SlangParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(SlangParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(SlangParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(SlangParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(SlangParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInputExpression(SlangParser.InputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link SlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInputExpression(SlangParser.InputExpressionContext ctx);
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