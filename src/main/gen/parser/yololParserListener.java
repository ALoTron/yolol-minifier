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
	 * Enter a parse tree produced by {@link yololParserParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(yololParserParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(yololParserParser.VarnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#alphanumericalChar}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumericalChar(yololParserParser.AlphanumericalCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#alphanumericalChar}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumericalChar(yololParserParser.AlphanumericalCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#const}.
	 * @param ctx the parse tree
	 */
	void enterConst(yololParserParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#const}.
	 * @param ctx the parse tree
	 */
	void exitConst(yololParserParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#everyChar}.
	 * @param ctx the parse tree
	 */
	void enterEveryChar(yololParserParser.EveryCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#everyChar}.
	 * @param ctx the parse tree
	 */
	void exitEveryChar(yololParserParser.EveryCharContext ctx);
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
	 * Enter a parse tree produced by {@link yololParserParser#goto}.
	 * @param ctx the parse tree
	 */
	void enterGoto(yololParserParser.GotoContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#goto}.
	 * @param ctx the parse tree
	 */
	void exitGoto(yololParserParser.GotoContext ctx);
	/**
	 * Enter a parse tree produced by {@link yololParserParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(yololParserParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link yololParserParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(yololParserParser.CommentContext ctx);
}