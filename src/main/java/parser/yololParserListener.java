// Generated from /home/alphacentauri/Projects/yolol-minifier/src/main/java/parser/yololParser.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link yololParserParser}.
 */
public interface yololParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link yololParserParser#chip}.
	 * @param ctx the parse tree
	 */
	void enterChip(yololParserParser.ChipContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#chip}.
	 * @param ctx the parse tree
	 */
	void exitChip(yololParserParser.ChipContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(yololParserParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(yololParserParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#multipleStatements}.
	 * @param ctx the parse tree
	 */
	void enterMultipleStatements(yololParserParser.MultipleStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#multipleStatements}.
	 * @param ctx the parse tree
	 */
	void exitMultipleStatements(yololParserParser.MultipleStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(yololParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(yololParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(yololParserParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(yololParserParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#thenPart}.
	 * @param ctx the parse tree
	 */
	void enterThenPart(yololParserParser.ThenPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#thenPart}.
	 * @param ctx the parse tree
	 */
	void exitThenPart(yololParserParser.ThenPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void enterElsePart(yololParserParser.ElsePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void exitElsePart(yololParserParser.ElsePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(yololParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(yololParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(yololParserParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(yololParserParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(yololParserParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(yololParserParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#internalVariable}.
	 * @param ctx the parse tree
	 */
	void enterInternalVariable(yololParserParser.InternalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#internalVariable}.
	 * @param ctx the parse tree
	 */
	void exitInternalVariable(yololParserParser.InternalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#externalVariable}.
	 * @param ctx the parse tree
	 */
	void enterExternalVariable(yololParserParser.ExternalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#externalVariable}.
	 * @param ctx the parse tree
	 */
	void exitExternalVariable(yololParserParser.ExternalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(yololParserParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(yololParserParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(yololParserParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(yololParserParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(yololParserParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(yololParserParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(yololParserParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(yololParserParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(yololParserParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(yololParserParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#arithmeticalExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticalExpression(yololParserParser.ArithmeticalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#arithmeticalExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticalExpression(yololParserParser.ArithmeticalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(yololParserParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(yololParserParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOp(yololParserParser.PrefixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOp(yololParserParser.PrefixOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#arithmeticalOp}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticalOp(yololParserParser.ArithmeticalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#arithmeticalOp}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticalOp(yololParserParser.ArithmeticalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(yololParserParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(yololParserParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(yololParserParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(yololParserParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(yololParserParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(yololParserParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#gotoStat}.
	 * @param ctx the parse tree
	 */
	void enterGotoStat(yololParserParser.GotoStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#gotoStat}.
	 * @param ctx the parse tree
	 */
	void exitGotoStat(yololParserParser.GotoStatContext ctx);
}