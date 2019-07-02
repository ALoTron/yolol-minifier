// Generated from com/yok/parser/Yok.g4 by ANTLR 4.5

    package com.yok.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YokParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, STRING=2, BREAK=3, WHITESPACE=4, IF=5, THEN=6, ELSE=7, END=8, 
		GOTO=9, NOT=10, AND=11, OR=12, ABS=13, SQRT=14, SIN=15, COS=16, TAN=17, 
		ARCSIN=18, ARCCOS=19, ARCTAN=20, FAC=21, LBRACKET=22, RBRACKET=23, LCURLY=24, 
		RCURLY=25, LESS=26, GREATER=27, LESSEQUAL=28, GREATEREQUAL=29, NOTEQUAL=30, 
		EQUAL=31, ASSIGN=32, POW=33, PLUS=34, MINUS=35, MULTIPLY=36, DIVIDE=37, 
		MODULO=38, ADDASSIGN=39, SUBASSIGN=40, MULTITPLYASSIGN=41, DIVIDEASSIGN=42, 
		MODULOASSIGN=43, DOT=44, COLON=45, SEMICOLON=46, INTERNALVARIABLE=47, 
		EXTERNALVARIABLE=48, NUMBER=49;
	public static final int
		RULE_chip = 0, RULE_line = 1, RULE_multipleStatements = 2, RULE_statement = 3, 
		RULE_ifStatement = 4, RULE_expression = 5, RULE_value = 6, RULE_primitive = 7, 
		RULE_number = 8, RULE_string = 9, RULE_var = 10, RULE_internalVar = 11, 
		RULE_externalVar = 12, RULE_increment = 13, RULE_decrement = 14, RULE_mathExpr = 15, 
		RULE_logicalExpression = 16, RULE_arithmeticalExpression = 17, RULE_primaryExpression = 18, 
		RULE_prefixOp = 19, RULE_arithmeticalOp = 20, RULE_logicalOp = 21, RULE_varAssignment = 22, 
		RULE_assignOp = 23, RULE_gotoStatement = 24;
	public static final String[] ruleNames = {
		"chip", "line", "multipleStatements", "statement", "ifStatement", "expression", 
		"value", "primitive", "number", "string", "var", "internalVar", "externalVar", 
		"increment", "decrement", "mathExpr", "logicalExpression", "arithmeticalExpression", 
		"primaryExpression", "prefixOp", "arithmeticalOp", "logicalOp", "varAssignment", 
		"assignOp", "gotoStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\\\\'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'('", 
		"')'", "'{'", "'}'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'='", 
		"'^'", "'+'", "'-'", "'*'", "'/'", "'%'", null, null, null, null, null, 
		"'.'", "':'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "STRING", "BREAK", "WHITESPACE", "IF", "THEN", "ELSE", 
		"END", "GOTO", "NOT", "AND", "OR", "ABS", "SQRT", "SIN", "COS", "TAN", 
		"ARCSIN", "ARCCOS", "ARCTAN", "FAC", "LBRACKET", "RBRACKET", "LCURLY", 
		"RCURLY", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", "NOTEQUAL", 
		"EQUAL", "ASSIGN", "POW", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", 
		"ADDASSIGN", "SUBASSIGN", "MULTITPLYASSIGN", "DIVIDEASSIGN", "MODULOASSIGN", 
		"DOT", "COLON", "SEMICOLON", "INTERNALVARIABLE", "EXTERNALVARIABLE", "NUMBER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Yok.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YokParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChipContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(YokParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(YokParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(YokParser.BREAK, i);
		}
		public ChipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterChip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitChip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitChip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChipContext chip() throws RecognitionException {
		ChipContext _localctx = new ChipContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chip);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					line();
					setState(51);
					match(BREAK);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(58);
				line();
				}
				break;
			}
			setState(61);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public MultipleStatementsContext multipleStatements() {
			return getRuleContext(MultipleStatementsContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(YokParser.COMMENT, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(63);
				multipleStatements();
				}
				break;
			}
			setState(67);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(66);
				match(COMMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleStatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MultipleStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterMultipleStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitMultipleStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitMultipleStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleStatementsContext multipleStatements() throws RecognitionException {
		MultipleStatementsContext _localctx = new MultipleStatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multipleStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << IF) | (1L << GOTO) | (1L << NOT) | (1L << ABS) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << ARCSIN) | (1L << ARCCOS) | (1L << ARCTAN) | (1L << FAC) | (1L << LBRACKET) | (1L << PLUS) | (1L << MINUS) | (1L << INTERNALVARIABLE) | (1L << EXTERNALVARIABLE) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(69);
				statement();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(YokParser.SEMICOLON, 0); }
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(86);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				ifStatement();
				setState(77);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(76);
					match(SEMICOLON);
					}
				}

				}
				break;
			case STRING:
			case GOTO:
			case NOT:
			case ABS:
			case SQRT:
			case SIN:
			case COS:
			case TAN:
			case ARCSIN:
			case ARCCOS:
			case ARCTAN:
			case FAC:
			case LBRACKET:
			case PLUS:
			case MINUS:
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(79);
					varAssignment();
					}
					break;
				case 2:
					{
					setState(80);
					expression();
					}
					break;
				case 3:
					{
					setState(81);
					gotoStatement();
					}
					break;
				}
				setState(84);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(YokParser.IF, 0); }
		public TerminalNode LBRACKET() { return getToken(YokParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(YokParser.RBRACKET, 0); }
		public TerminalNode THEN() { return getToken(YokParser.THEN, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(YokParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(YokParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(YokParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(YokParser.RCURLY, i);
		}
		public List<MultipleStatementsContext> multipleStatements() {
			return getRuleContexts(MultipleStatementsContext.class);
		}
		public MultipleStatementsContext multipleStatements(int i) {
			return getRuleContext(MultipleStatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(YokParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IF);
			setState(89);
			match(LBRACKET);
			setState(90);
			expression();
			setState(91);
			match(RBRACKET);
			setState(92);
			match(THEN);
			setState(93);
			match(LCURLY);
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(94);
				multipleStatements();
				}
				break;
			}
			setState(97);
			match(RCURLY);
			setState(104);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(98);
				match(ELSE);
				setState(99);
				match(LCURLY);
				setState(101);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(100);
					multipleStatements();
					}
					break;
				}
				setState(103);
				match(RCURLY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				mathExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				primitive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				increment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				decrement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitive);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(YokParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(YokParser.MINUS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(120);
				match(MINUS);
				}
			}

			setState(123);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YokParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public InternalVarContext internalVar() {
			return getRuleContext(InternalVarContext.class,0);
		}
		public ExternalVarContext externalVar() {
			return getRuleContext(ExternalVarContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case INTERNALVARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				internalVar();
				}
				break;
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				externalVar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InternalVarContext extends ParserRuleContext {
		public TerminalNode INTERNALVARIABLE() { return getToken(YokParser.INTERNALVARIABLE, 0); }
		public InternalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internalVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterInternalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitInternalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitInternalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InternalVarContext internalVar() throws RecognitionException {
		InternalVarContext _localctx = new InternalVarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_internalVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(INTERNALVARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalVarContext extends ParserRuleContext {
		public TerminalNode EXTERNALVARIABLE() { return getToken(YokParser.EXTERNALVARIABLE, 0); }
		public ExternalVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterExternalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitExternalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitExternalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalVarContext externalVar() throws RecognitionException {
		ExternalVarContext _localctx = new ExternalVarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_externalVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(EXTERNALVARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementContext extends ParserRuleContext {
		public List<TerminalNode> PLUS() { return getTokens(YokParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(YokParser.PLUS, i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_increment);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(PLUS);
				setState(136);
				match(PLUS);
				setState(137);
				var();
				}
				break;
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				var();
				setState(139);
				match(PLUS);
				setState(140);
				match(PLUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecrementContext extends ParserRuleContext {
		public List<TerminalNode> MINUS() { return getTokens(YokParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(YokParser.MINUS, i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decrement);
		try {
			setState(151);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(MINUS);
				setState(145);
				match(MINUS);
				setState(146);
				var();
				}
				break;
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				var();
				setState(148);
				match(MINUS);
				setState(149);
				match(MINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathExprContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mathExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			logicalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<ArithmeticalExpressionContext> arithmeticalExpression() {
			return getRuleContexts(ArithmeticalExpressionContext.class);
		}
		public ArithmeticalExpressionContext arithmeticalExpression(int i) {
			return getRuleContext(ArithmeticalExpressionContext.class,i);
		}
		public List<LogicalOpContext> logicalOp() {
			return getRuleContexts(LogicalOpContext.class);
		}
		public LogicalOpContext logicalOp(int i) {
			return getRuleContext(LogicalOpContext.class,i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			arithmeticalExpression();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << LESS) | (1L << GREATER) | (1L << LESSEQUAL) | (1L << GREATEREQUAL) | (1L << NOTEQUAL) | (1L << EQUAL))) != 0)) {
				{
				{
				setState(156);
				logicalOp();
				setState(157);
				arithmeticalExpression();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticalExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<ArithmeticalOpContext> arithmeticalOp() {
			return getRuleContexts(ArithmeticalOpContext.class);
		}
		public ArithmeticalOpContext arithmeticalOp(int i) {
			return getRuleContext(ArithmeticalOpContext.class,i);
		}
		public ArithmeticalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterArithmeticalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitArithmeticalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitArithmeticalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticalExpressionContext arithmeticalExpression() throws RecognitionException {
		ArithmeticalExpressionContext _localctx = new ArithmeticalExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmeticalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			primaryExpression();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POW) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				{
				setState(165);
				arithmeticalOp();
				setState(166);
				primaryExpression();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(YokParser.LBRACKET, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(YokParser.RBRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primaryExpression);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(LBRACKET);
				setState(174);
				mathExpr();
				setState(175);
				match(RBRACKET);
				}
				break;
			case STRING:
			case PLUS:
			case MINUS:
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				value();
				}
				break;
			case NOT:
			case ABS:
			case SQRT:
			case SIN:
			case COS:
			case TAN:
			case ARCSIN:
			case ARCCOS:
			case ARCTAN:
			case FAC:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				prefixOp();
				setState(179);
				match(LBRACKET);
				setState(180);
				mathExpr();
				setState(181);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOpContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(YokParser.NOT, 0); }
		public TerminalNode ABS() { return getToken(YokParser.ABS, 0); }
		public TerminalNode SQRT() { return getToken(YokParser.SQRT, 0); }
		public TerminalNode SIN() { return getToken(YokParser.SIN, 0); }
		public TerminalNode COS() { return getToken(YokParser.COS, 0); }
		public TerminalNode TAN() { return getToken(YokParser.TAN, 0); }
		public TerminalNode ARCSIN() { return getToken(YokParser.ARCSIN, 0); }
		public TerminalNode ARCCOS() { return getToken(YokParser.ARCCOS, 0); }
		public TerminalNode ARCTAN() { return getToken(YokParser.ARCTAN, 0); }
		public TerminalNode FAC() { return getToken(YokParser.FAC, 0); }
		public PrefixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterPrefixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitPrefixOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitPrefixOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << ABS) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << ARCSIN) | (1L << ARCCOS) | (1L << ARCTAN) | (1L << FAC))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticalOpContext extends ParserRuleContext {
		public TerminalNode POW() { return getToken(YokParser.POW, 0); }
		public TerminalNode PLUS() { return getToken(YokParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(YokParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(YokParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(YokParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(YokParser.MODULO, 0); }
		public ArithmeticalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterArithmeticalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitArithmeticalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitArithmeticalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticalOpContext arithmeticalOp() throws RecognitionException {
		ArithmeticalOpContext _localctx = new ArithmeticalOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arithmeticalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POW) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOpContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(YokParser.LESS, 0); }
		public TerminalNode LESSEQUAL() { return getToken(YokParser.LESSEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(YokParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(YokParser.GREATEREQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(YokParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(YokParser.EQUAL, 0); }
		public TerminalNode AND() { return getToken(YokParser.AND, 0); }
		public TerminalNode OR() { return getToken(YokParser.OR, 0); }
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitLogicalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitLogicalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << LESS) | (1L << GREATER) | (1L << LESSEQUAL) | (1L << GREATEREQUAL) | (1L << NOTEQUAL) | (1L << EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarAssignmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			var();
			setState(192);
			assignOp();
			setState(193);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignOpContext extends ParserRuleContext {
		public TerminalNode ADDASSIGN() { return getToken(YokParser.ADDASSIGN, 0); }
		public TerminalNode SUBASSIGN() { return getToken(YokParser.SUBASSIGN, 0); }
		public TerminalNode MULTITPLYASSIGN() { return getToken(YokParser.MULTITPLYASSIGN, 0); }
		public TerminalNode DIVIDEASSIGN() { return getToken(YokParser.DIVIDEASSIGN, 0); }
		public TerminalNode MODULOASSIGN() { return getToken(YokParser.MODULOASSIGN, 0); }
		public TerminalNode ASSIGN() { return getToken(YokParser.ASSIGN, 0); }
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterAssignOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitAssignOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitAssignOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ADDASSIGN) | (1L << SUBASSIGN) | (1L << MULTITPLYASSIGN) | (1L << DIVIDEASSIGN) | (1L << MODULOASSIGN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(YokParser.GOTO, 0); }
		public TerminalNode LBRACKET() { return getToken(YokParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(YokParser.RBRACKET, 0); }
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YokListener ) ((YokListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YokVisitor ) return ((YokVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(GOTO);
			setState(198);
			match(LBRACKET);
			setState(199);
			expression();
			setState(200);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u00cd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\5\2>\n\2\3\2\3\2\3"+
		"\3\5\3C\n\3\3\3\5\3F\n\3\3\4\7\4I\n\4\f\4\16\4L\13\4\3\5\3\5\5\5P\n\5"+
		"\3\5\3\5\3\5\5\5U\n\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"b\n\6\3\6\3\6\3\6\3\6\5\6h\n\6\3\6\5\6k\n\6\3\7\3\7\5\7o\n\7\3\b\3\b\3"+
		"\b\3\b\5\bu\n\b\3\t\3\t\5\ty\n\t\3\n\5\n|\n\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\5\f\u0084\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0091\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009a\n\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\7\22\u00a2\n\22\f\22\16\22\u00a5\13\22\3"+
		"\23\3\23\3\23\3\23\7\23\u00ab\n\23\f\23\16\23\u00ae\13\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ba\n\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6"+
		"\4\2\f\f\17\27\3\2#(\4\2\r\16\34!\4\2\"\")-\u00cc\29\3\2\2\2\4B\3\2\2"+
		"\2\6J\3\2\2\2\bX\3\2\2\2\nZ\3\2\2\2\fn\3\2\2\2\16t\3\2\2\2\20x\3\2\2\2"+
		"\22{\3\2\2\2\24\177\3\2\2\2\26\u0083\3\2\2\2\30\u0085\3\2\2\2\32\u0087"+
		"\3\2\2\2\34\u0090\3\2\2\2\36\u0099\3\2\2\2 \u009b\3\2\2\2\"\u009d\3\2"+
		"\2\2$\u00a6\3\2\2\2&\u00b9\3\2\2\2(\u00bb\3\2\2\2*\u00bd\3\2\2\2,\u00bf"+
		"\3\2\2\2.\u00c1\3\2\2\2\60\u00c5\3\2\2\2\62\u00c7\3\2\2\2\64\65\5\4\3"+
		"\2\65\66\7\5\2\2\668\3\2\2\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2"+
		"\2\2:=\3\2\2\2;9\3\2\2\2<>\5\4\3\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\2"+
		"\2\3@\3\3\2\2\2AC\5\6\4\2BA\3\2\2\2BC\3\2\2\2CE\3\2\2\2DF\7\3\2\2ED\3"+
		"\2\2\2EF\3\2\2\2F\5\3\2\2\2GI\5\b\5\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK"+
		"\3\2\2\2K\7\3\2\2\2LJ\3\2\2\2MO\5\n\6\2NP\7\60\2\2ON\3\2\2\2OP\3\2\2\2"+
		"PY\3\2\2\2QU\5.\30\2RU\5\f\7\2SU\5\62\32\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2"+
		"\2UV\3\2\2\2VW\7\60\2\2WY\3\2\2\2XM\3\2\2\2XT\3\2\2\2Y\t\3\2\2\2Z[\7\7"+
		"\2\2[\\\7\30\2\2\\]\5\f\7\2]^\7\31\2\2^_\7\b\2\2_a\7\32\2\2`b\5\6\4\2"+
		"a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cj\7\33\2\2de\7\t\2\2eg\7\32\2\2fh\5\6\4"+
		"\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\7\33\2\2jd\3\2\2\2jk\3\2\2\2k\13\3"+
		"\2\2\2lo\5\16\b\2mo\5 \21\2nl\3\2\2\2nm\3\2\2\2o\r\3\2\2\2pu\5\20\t\2"+
		"qu\5\26\f\2ru\5\34\17\2su\5\36\20\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3"+
		"\2\2\2u\17\3\2\2\2vy\5\22\n\2wy\5\24\13\2xv\3\2\2\2xw\3\2\2\2y\21\3\2"+
		"\2\2z|\7%\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\63\2\2~\23\3\2\2\2\177"+
		"\u0080\7\4\2\2\u0080\25\3\2\2\2\u0081\u0084\5\30\r\2\u0082\u0084\5\32"+
		"\16\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\27\3\2\2\2\u0085\u0086"+
		"\7\61\2\2\u0086\31\3\2\2\2\u0087\u0088\7\62\2\2\u0088\33\3\2\2\2\u0089"+
		"\u008a\7$\2\2\u008a\u008b\7$\2\2\u008b\u0091\5\26\f\2\u008c\u008d\5\26"+
		"\f\2\u008d\u008e\7$\2\2\u008e\u008f\7$\2\2\u008f\u0091\3\2\2\2\u0090\u0089"+
		"\3\2\2\2\u0090\u008c\3\2\2\2\u0091\35\3\2\2\2\u0092\u0093\7%\2\2\u0093"+
		"\u0094\7%\2\2\u0094\u009a\5\26\f\2\u0095\u0096\5\26\f\2\u0096\u0097\7"+
		"%\2\2\u0097\u0098\7%\2\2\u0098\u009a\3\2\2\2\u0099\u0092\3\2\2\2\u0099"+
		"\u0095\3\2\2\2\u009a\37\3\2\2\2\u009b\u009c\5\"\22\2\u009c!\3\2\2\2\u009d"+
		"\u00a3\5$\23\2\u009e\u009f\5,\27\2\u009f\u00a0\5$\23\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4#\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ac\5&\24\2"+
		"\u00a7\u00a8\5*\26\2\u00a8\u00a9\5&\24\2\u00a9\u00ab\3\2\2\2\u00aa\u00a7"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"%\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\30\2\2\u00b0\u00b1\5 \21\2"+
		"\u00b1\u00b2\7\31\2\2\u00b2\u00ba\3\2\2\2\u00b3\u00ba\5\16\b\2\u00b4\u00b5"+
		"\5(\25\2\u00b5\u00b6\7\30\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\7\31\2\2"+
		"\u00b8\u00ba\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b4"+
		"\3\2\2\2\u00ba\'\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bc)\3\2\2\2\u00bd\u00be"+
		"\t\3\2\2\u00be+\3\2\2\2\u00bf\u00c0\t\4\2\2\u00c0-\3\2\2\2\u00c1\u00c2"+
		"\5\26\f\2\u00c2\u00c3\5\60\31\2\u00c3\u00c4\5\f\7\2\u00c4/\3\2\2\2\u00c5"+
		"\u00c6\t\5\2\2\u00c6\61\3\2\2\2\u00c7\u00c8\7\13\2\2\u00c8\u00c9\7\30"+
		"\2\2\u00c9\u00ca\5\f\7\2\u00ca\u00cb\7\31\2\2\u00cb\63\3\2\2\2\279=BE"+
		"JOTXagjntx{\u0083\u0090\u0099\u00a3\u00ac\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}