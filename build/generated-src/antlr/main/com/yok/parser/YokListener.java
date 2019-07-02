// Generated from com/yok/parser/Yok.g4 by ANTLR 4.5

    package com.yok.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YokParser}.
 */
public interface YokListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YokParser#chip}.
	 * @param ctx the parse tree
	 */
	void enterChip(YokParser.ChipContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#chip}.
	 * @param ctx the parse tree
	 */
	void exitChip(YokParser.ChipContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(YokParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(YokParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#multipleStatements}.
	 * @param ctx the parse tree
	 */
	void enterMultipleStatements(YokParser.MultipleStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#multipleStatements}.
	 * @param ctx the parse tree
	 */
	void exitMultipleStatements(YokParser.MultipleStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YokParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YokParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(YokParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(YokParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(YokParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(YokParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(YokParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(YokParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(YokParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(YokParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(YokParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(YokParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(YokParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(YokParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(YokParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(YokParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#internalVar}.
	 * @param ctx the parse tree
	 */
	void enterInternalVar(YokParser.InternalVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#internalVar}.
	 * @param ctx the parse tree
	 */
	void exitInternalVar(YokParser.InternalVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#externalVar}.
	 * @param ctx the parse tree
	 */
	void enterExternalVar(YokParser.ExternalVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#externalVar}.
	 * @param ctx the parse tree
	 */
	void exitExternalVar(YokParser.ExternalVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(YokParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(YokParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(YokParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(YokParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(YokParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(YokParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(YokParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(YokParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#arithmeticalExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticalExpression(YokParser.ArithmeticalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#arithmeticalExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticalExpression(YokParser.ArithmeticalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(YokParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(YokParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOp(YokParser.PrefixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOp(YokParser.PrefixOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#arithmeticalOp}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticalOp(YokParser.ArithmeticalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#arithmeticalOp}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticalOp(YokParser.ArithmeticalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(YokParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(YokParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(YokParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(YokParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(YokParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(YokParser.AssignOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link YokParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(YokParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YokParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(YokParser.GotoStatementContext ctx);
}