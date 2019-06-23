// Generated from /home/alphacentauri/Projects/yolol-minifier/src/main/java/parser/yololParser.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link yololParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface yololParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link yololParserParser#chip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChip(yololParserParser.ChipContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(yololParserParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#multipleStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleStatements(yololParserParser.MultipleStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(yololParserParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(yololParserParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(yololParserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#expression_recursive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_recursive(yololParserParser.Expression_recursiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperation(yololParserParser.ArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#logicalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperation(yololParserParser.LogicalOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#factorialOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorialOperation(yololParserParser.FactorialOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(yololParserParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(yololParserParser.VarnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#alphanumericalChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanumericalChar(yololParserParser.AlphanumericalCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(yololParserParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#everyChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEveryChar(yololParserParser.EveryCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(yololParserParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(yololParserParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#goto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto(yololParserParser.GotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link yololParserParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(yololParserParser.CommentContext ctx);
}