// Generated from com/yolol/parser/Yolol.g4 by ANTLR 4.5

    package com.yolol.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YololParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YololVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YololParser#chip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChip(YololParser.ChipContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(YololParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#multipleStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleStatements(YololParser.MultipleStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(YololParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(YololParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(YololParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(YololParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(YololParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(YololParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#internalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalVariable(YololParser.InternalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#externalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalVariable(YololParser.ExternalVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(YololParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(YololParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(YololParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(YololParser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(YololParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#arithmeticalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticalExpression(YololParser.ArithmeticalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(YololParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#factorial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorial(YololParser.FactorialContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOp(YololParser.PrefixOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#arithmeticalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticalOp(YololParser.ArithmeticalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOp(YololParser.LogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(YololParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(YololParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#gotoStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStat(YololParser.GotoStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#optionalSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalSpace(YololParser.OptionalSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#lbracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbracket(YololParser.LbracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link YololParser#rbracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRbracket(YololParser.RbracketContext ctx);
}