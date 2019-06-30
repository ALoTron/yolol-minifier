// Generated from com/yolol/parser/Yolol.g4 by ANTLR 4.5

    package com.yolol.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YololParser}.
 */
public interface YololListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YololParser#chip}.
	 * @param ctx the parse tree
	 */
	void enterChip(YololParser.ChipContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#chip}.
	 * @param ctx the parse tree
	 */
	void exitChip(YololParser.ChipContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(YololParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(YololParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#multipleStatements}.
	 * @param ctx the parse tree
	 */
	void enterMultipleStatements(YololParser.MultipleStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#multipleStatements}.
	 * @param ctx the parse tree
	 */
	void exitMultipleStatements(YololParser.MultipleStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(YololParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(YololParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(YololParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(YololParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(YololParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(YololParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(YololParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(YololParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(YololParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(YololParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#internalVariable}.
	 * @param ctx the parse tree
	 */
	void enterInternalVariable(YololParser.InternalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#internalVariable}.
	 * @param ctx the parse tree
	 */
	void exitInternalVariable(YololParser.InternalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#externalVariable}.
	 * @param ctx the parse tree
	 */
	void enterExternalVariable(YololParser.ExternalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#externalVariable}.
	 * @param ctx the parse tree
	 */
	void exitExternalVariable(YololParser.ExternalVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(YololParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(YololParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(YololParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(YololParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(YololParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(YololParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(YololParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(YololParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(YololParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(YololParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#arithmeticalExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticalExpression(YololParser.ArithmeticalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#arithmeticalExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticalExpression(YololParser.ArithmeticalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(YololParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(YololParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOp(YololParser.PrefixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOp(YololParser.PrefixOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#arithmeticalOp}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticalOp(YololParser.ArithmeticalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#arithmeticalOp}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticalOp(YololParser.ArithmeticalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOp(YololParser.LogicalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#logicalOp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOp(YololParser.LogicalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(YololParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(YololParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(YololParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(YololParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link YololParser#gotoStat}.
	 * @param ctx the parse tree
	 */
	void enterGotoStat(YololParser.GotoStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link YololParser#gotoStat}.
	 * @param ctx the parse tree
	 */
	void exitGotoStat(YololParser.GotoStatContext ctx);
}