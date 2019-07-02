// Generated from com/yok/parser/Yok.g4 by ANTLR 4.5

    package com.yok.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YokParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YokVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YokParser#chip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChip(YokParser.ChipContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(YokParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#multipleStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleStatements(YokParser.MultipleStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(YokParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(YokParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(YokParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(YokParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(YokParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(YokParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(YokParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(YokParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#internalVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalVar(YokParser.InternalVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#externalVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalVar(YokParser.ExternalVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(YokParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(YokParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(YokParser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(YokParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#arithmeticalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticalExpression(YokParser.ArithmeticalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(YokParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOp(YokParser.PrefixOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#arithmeticalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticalOp(YokParser.ArithmeticalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#logicalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOp(YokParser.LogicalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#varAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(YokParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#assignOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignOp(YokParser.AssignOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link YokParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(YokParser.GotoStatementContext ctx);
}