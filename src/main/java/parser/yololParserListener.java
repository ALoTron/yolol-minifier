// Generated from /home/mars/projects/yolol-minifier/src/main/java/parser/yololParser.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link yololParserParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(yololParserParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(yololParserParser.SingleStatementContext ctx);
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
	 * Enter a parse tree produced by {@link yololParserParser#expression_recursive}.
	 * @param ctx the parse tree
	 */
	void enterExpression_recursive(yololParserParser.Expression_recursiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#expression_recursive}.
	 * @param ctx the parse tree
	 */
	void exitExpression_recursive(yololParserParser.Expression_recursiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperation(yololParserParser.ArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperation(yololParserParser.ArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(yololParserParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(yololParserParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperation(yololParserParser.LogicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#logicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperation(yololParserParser.LogicalOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(yololParserParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(yololParserParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#factorialOperation}.
	 * @param ctx the parse tree
	 */
	void enterFactorialOperation(yololParserParser.FactorialOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#factorialOperation}.
	 * @param ctx the parse tree
	 */
	void exitFactorialOperation(yololParserParser.FactorialOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(yololParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(yololParserParser.LiteralContext ctx);
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
	 * Enter a parse tree produced by {@link yololParserParser#gotoExpr}.
	 * @param ctx the parse tree
	 */
	void enterGotoExpr(yololParserParser.GotoExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#gotoExpr}.
	 * @param ctx the parse tree
	 */
	void exitGotoExpr(yololParserParser.GotoExprContext ctx);
}