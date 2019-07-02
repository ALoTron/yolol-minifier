// Generated from com/yolol/parser/Yolol.g4 by ANTLR 4.5

    package com.yolol.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YololParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BREAK=1, COMMENT=2, STRING=3, IF=4, THEN=5, ELSE=6, END=7, GOTO=8, NOT=9, 
		AND=10, OR=11, ABS=12, SQRT=13, SIN=14, COS=15, TAN=16, ARCSIN=17, ARCCOS=18, 
		ARCTAN=19, LBRACKET=20, RBRACKET=21, LESS=22, GREATER=23, LESSEQUAL=24, 
		GREATEREQUAL=25, NOTEQUAL=26, EQUAL=27, ASSIGN=28, POW=29, PLUS=30, MINUS=31, 
		MULTIPLY=32, DIVIDE=33, MODULO=34, FACTORIAL=35, DOT=36, COLON=37, SPACE=38, 
		INTERNALVARIABLE=39, EXTERNALVARIABLE=40, NUMBER=41;
	public static final int
		RULE_chip = 0, RULE_line = 1, RULE_multipleStatements = 2, RULE_statement = 3, 
		RULE_ifStatement = 4, RULE_expression = 5, RULE_value = 6, RULE_primitive = 7, 
		RULE_string = 8, RULE_internalVariable = 9, RULE_externalVariable = 10, 
		RULE_number = 11, RULE_increment = 12, RULE_decrement = 13, RULE_mathExpr = 14, 
		RULE_logicalExpression = 15, RULE_arithmeticalExpression = 16, RULE_primaryExpression = 17, 
		RULE_factorial = 18, RULE_prefixOp = 19, RULE_arithmeticalOp = 20, RULE_logicalOp = 21, 
		RULE_varAssignment = 22, RULE_var = 23, RULE_gotoStat = 24, RULE_optionalSpace = 25, 
		RULE_lbracket = 26, RULE_rbracket = 27;
	public static final String[] ruleNames = {
		"chip", "line", "multipleStatements", "statement", "ifStatement", "expression", 
		"value", "primitive", "string", "internalVariable", "externalVariable", 
		"number", "increment", "decrement", "mathExpr", "logicalExpression", "arithmeticalExpression", 
		"primaryExpression", "factorial", "prefixOp", "arithmeticalOp", "logicalOp", 
		"varAssignment", "var", "gotoStat", "optionalSpace", "lbracket", "rbracket"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'('", "')'", "'<'", "'>'", 
		"'<='", "'>='", "'!='", "'=='", "'='", "'^'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'!'", "'.'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BREAK", "COMMENT", "STRING", "IF", "THEN", "ELSE", "END", "GOTO", 
		"NOT", "AND", "OR", "ABS", "SQRT", "SIN", "COS", "TAN", "ARCSIN", "ARCCOS", 
		"ARCTAN", "LBRACKET", "RBRACKET", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", 
		"NOTEQUAL", "EQUAL", "ASSIGN", "POW", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
		"MODULO", "FACTORIAL", "DOT", "COLON", "SPACE", "INTERNALVARIABLE", "EXTERNALVARIABLE", 
		"NUMBER"
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
	public String getGrammarFileName() { return "Yolol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YololParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChipContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(YololParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(YololParser.BREAK, i);
		}
		public TerminalNode EOF() { return getToken(YololParser.EOF, 0); }
		public ChipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterChip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitChip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitChip(this);
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
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					line();
					setState(57);
					match(BREAK);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(64);
			line();
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(65);
				match(EOF);
				}
				break;
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

	public static class LineContext extends ParserRuleContext {
		public List<OptionalSpaceContext> optionalSpace() {
			return getRuleContexts(OptionalSpaceContext.class);
		}
		public OptionalSpaceContext optionalSpace(int i) {
			return getRuleContext(OptionalSpaceContext.class,i);
		}
		public MultipleStatementsContext multipleStatements() {
			return getRuleContext(MultipleStatementsContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(YololParser.COMMENT, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitLine(this);
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
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(68);
				optionalSpace();
				}
				break;
			}
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(71);
				multipleStatements();
				}
				break;
			}
			setState(75);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(74);
				optionalSpace();
				}
			}

			setState(78);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(77);
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
		public List<LbracketContext> lbracket() {
			return getRuleContexts(LbracketContext.class);
		}
		public LbracketContext lbracket(int i) {
			return getRuleContext(LbracketContext.class,i);
		}
		public MultipleStatementsContext multipleStatements() {
			return getRuleContext(MultipleStatementsContext.class,0);
		}
		public List<RbracketContext> rbracket() {
			return getRuleContexts(RbracketContext.class);
		}
		public RbracketContext rbracket(int i) {
			return getRuleContext(RbracketContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(YololParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(YololParser.SPACE, i);
		}
		public MultipleStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterMultipleStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitMultipleStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitMultipleStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleStatementsContext multipleStatements() throws RecognitionException {
		MultipleStatementsContext _localctx = new MultipleStatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multipleStatements);
		try {
			int _alt;
			setState(102);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				lbracket();
				setState(81);
				multipleStatements();
				setState(82);
				rbracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(84);
					statement();
					}
					break;
				case 2:
					{
					setState(85);
					lbracket();
					setState(86);
					statement();
					setState(87);
					rbracket();
					}
					break;
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(97);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(91);
							match(SPACE);
							setState(92);
							statement();
							}
							break;
						case 2:
							{
							setState(93);
							lbracket();
							setState(94);
							statement();
							setState(95);
							rbracket();
							}
							break;
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GotoStatContext gotoStat() {
			return getRuleContext(GotoStatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				gotoStat();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(YololParser.IF, 0); }
		public TerminalNode THEN() { return getToken(YololParser.THEN, 0); }
		public TerminalNode END() { return getToken(YololParser.END, 0); }
		public List<TerminalNode> SPACE() { return getTokens(YololParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(YololParser.SPACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<LbracketContext> lbracket() {
			return getRuleContexts(LbracketContext.class);
		}
		public LbracketContext lbracket(int i) {
			return getRuleContext(LbracketContext.class,i);
		}
		public List<RbracketContext> rbracket() {
			return getRuleContexts(RbracketContext.class);
		}
		public RbracketContext rbracket(int i) {
			return getRuleContext(RbracketContext.class,i);
		}
		public List<MultipleStatementsContext> multipleStatements() {
			return getRuleContexts(MultipleStatementsContext.class);
		}
		public MultipleStatementsContext multipleStatements(int i) {
			return getRuleContext(MultipleStatementsContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(YololParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitIfStatement(this);
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
			setState(110);
			match(IF);
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(111);
				match(SPACE);
				setState(112);
				expression();
				setState(113);
				match(SPACE);
				}
				break;
			case 2:
				{
				setState(115);
				lbracket();
				setState(116);
				expression();
				setState(117);
				rbracket();
				}
				break;
			}
			setState(121);
			match(THEN);
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(122);
				match(SPACE);
				setState(123);
				multipleStatements();
				setState(124);
				match(SPACE);
				}
				break;
			case 2:
				{
				setState(126);
				lbracket();
				setState(127);
				multipleStatements();
				setState(128);
				rbracket();
				}
				break;
			}
			setState(143);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(132);
				match(ELSE);
				setState(141);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(133);
					match(SPACE);
					setState(134);
					multipleStatements();
					setState(135);
					match(SPACE);
					}
					break;
				case 2:
					{
					setState(137);
					lbracket();
					setState(138);
					multipleStatements();
					setState(139);
					rbracket();
					}
					break;
				}
				}
			}

			setState(145);
			match(END);
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
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
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
			if ( listener instanceof YololListener ) ((YololListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				lbracket();
				setState(148);
				expression();
				setState(149);
				rbracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
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
			if ( listener instanceof YololListener ) ((YololListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				primitive();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				increment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
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
			if ( listener instanceof YololListener ) ((YololListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primitive);
		try {
			setState(163);
			switch (_input.LA(1)) {
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(YololParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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

	public static class InternalVariableContext extends ParserRuleContext {
		public TerminalNode INTERNALVARIABLE() { return getToken(YololParser.INTERNALVARIABLE, 0); }
		public InternalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterInternalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitInternalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitInternalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InternalVariableContext internalVariable() throws RecognitionException {
		InternalVariableContext _localctx = new InternalVariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_internalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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

	public static class ExternalVariableContext extends ParserRuleContext {
		public TerminalNode EXTERNALVARIABLE() { return getToken(YololParser.EXTERNALVARIABLE, 0); }
		public ExternalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterExternalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitExternalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitExternalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalVariableContext externalVariable() throws RecognitionException {
		ExternalVariableContext _localctx = new ExternalVariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_externalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(YololParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(YololParser.MINUS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(171);
				match(MINUS);
				}
			}

			setState(174);
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

	public static class IncrementContext extends ParserRuleContext {
		public List<TerminalNode> PLUS() { return getTokens(YololParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(YololParser.PLUS, i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OptionalSpaceContext optionalSpace() {
			return getRuleContext(OptionalSpaceContext.class,0);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_increment);
		int _la;
		try {
			setState(189);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(PLUS);
				setState(177);
				match(PLUS);
				setState(179);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(178);
					optionalSpace();
					}
				}

				setState(181);
				var();
				}
				break;
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				var();
				setState(184);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(183);
					optionalSpace();
					}
				}

				setState(186);
				match(PLUS);
				setState(187);
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
		public List<TerminalNode> MINUS() { return getTokens(YololParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(YololParser.MINUS, i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OptionalSpaceContext optionalSpace() {
			return getRuleContext(OptionalSpaceContext.class,0);
		}
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_decrement);
		int _la;
		try {
			setState(204);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(MINUS);
				setState(192);
				match(MINUS);
				setState(194);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(193);
					optionalSpace();
					}
				}

				setState(196);
				var();
				}
				break;
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				var();
				setState(199);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(198);
					optionalSpace();
					}
				}

				setState(201);
				match(MINUS);
				setState(202);
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
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mathExpr);
		try {
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				lbracket();
				setState(207);
				mathExpr();
				setState(208);
				rbracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				logicalExpression();
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
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
		public List<OptionalSpaceContext> optionalSpace() {
			return getRuleContexts(OptionalSpaceContext.class);
		}
		public OptionalSpaceContext optionalSpace(int i) {
			return getRuleContext(OptionalSpaceContext.class,i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicalExpression);
		try {
			int _alt;
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				lbracket();
				setState(214);
				logicalExpression();
				setState(215);
				rbracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				arithmeticalExpression();
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(219);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(218);
							optionalSpace();
							}
							break;
						}
						setState(221);
						logicalOp();
						setState(223);
						switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
						case 1:
							{
							setState(222);
							optionalSpace();
							}
							break;
						}
						setState(225);
						arithmeticalExpression();
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
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

	public static class ArithmeticalExpressionContext extends ParserRuleContext {
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public ArithmeticalExpressionContext arithmeticalExpression() {
			return getRuleContext(ArithmeticalExpressionContext.class,0);
		}
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
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
		public List<OptionalSpaceContext> optionalSpace() {
			return getRuleContexts(OptionalSpaceContext.class);
		}
		public OptionalSpaceContext optionalSpace(int i) {
			return getRuleContext(OptionalSpaceContext.class,i);
		}
		public ArithmeticalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterArithmeticalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitArithmeticalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitArithmeticalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticalExpressionContext arithmeticalExpression() throws RecognitionException {
		ArithmeticalExpressionContext _localctx = new ArithmeticalExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arithmeticalExpression);
		int _la;
		try {
			int _alt;
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				lbracket();
				setState(235);
				arithmeticalExpression();
				setState(236);
				rbracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				primaryExpression(0);
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(240);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(239);
							optionalSpace();
							}
						}

						setState(242);
						arithmeticalOp();
						setState(244);
						switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
							{
							setState(243);
							optionalSpace();
							}
							break;
						}
						setState(246);
						primaryExpression(0);
						}
						} 
					}
					setState(252);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(YololParser.SPACE, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public FactorialContext factorial() {
			return getRuleContext(FactorialContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_primaryExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(256);
				lbracket();
				setState(257);
				primaryExpression(0);
				setState(258);
				rbracket();
				}
				break;
			case 2:
				{
				setState(260);
				value();
				}
				break;
			case 3:
				{
				setState(261);
				prefixOp();
				setState(268);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(262);
					match(SPACE);
					setState(263);
					primaryExpression(0);
					}
					break;
				case 2:
					{
					setState(264);
					lbracket();
					setState(265);
					mathExpr();
					setState(266);
					rbracket();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(270);
				lbracket();
				setState(271);
				mathExpr();
				setState(272);
				rbracket();
				setState(274);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(273);
					factorial();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
					setState(278);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(279);
					factorial();
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorialContext extends ParserRuleContext {
		public TerminalNode FACTORIAL() { return getToken(YololParser.FACTORIAL, 0); }
		public OptionalSpaceContext optionalSpace() {
			return getRuleContext(OptionalSpaceContext.class,0);
		}
		public FactorialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterFactorial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitFactorial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitFactorial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorialContext factorial() throws RecognitionException {
		FactorialContext _localctx = new FactorialContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_factorial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(285);
				optionalSpace();
				}
			}

			setState(288);
			match(FACTORIAL);
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
		public TerminalNode NOT() { return getToken(YololParser.NOT, 0); }
		public TerminalNode ABS() { return getToken(YololParser.ABS, 0); }
		public TerminalNode SQRT() { return getToken(YololParser.SQRT, 0); }
		public TerminalNode SIN() { return getToken(YololParser.SIN, 0); }
		public TerminalNode COS() { return getToken(YololParser.COS, 0); }
		public TerminalNode TAN() { return getToken(YololParser.TAN, 0); }
		public TerminalNode ARCSIN() { return getToken(YololParser.ARCSIN, 0); }
		public TerminalNode ARCCOS() { return getToken(YololParser.ARCCOS, 0); }
		public TerminalNode ARCTAN() { return getToken(YololParser.ARCTAN, 0); }
		public PrefixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterPrefixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitPrefixOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitPrefixOp(this);
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
			setState(290);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << ABS) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << ARCSIN) | (1L << ARCCOS) | (1L << ARCTAN))) != 0)) ) {
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
		public TerminalNode POW() { return getToken(YololParser.POW, 0); }
		public TerminalNode PLUS() { return getToken(YololParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(YololParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(YololParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(YololParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(YololParser.MODULO, 0); }
		public ArithmeticalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterArithmeticalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitArithmeticalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitArithmeticalOp(this);
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
			setState(292);
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
		public TerminalNode LESS() { return getToken(YololParser.LESS, 0); }
		public TerminalNode LESSEQUAL() { return getToken(YololParser.LESSEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(YololParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(YololParser.GREATEREQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(YololParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(YololParser.EQUAL, 0); }
		public List<TerminalNode> SPACE() { return getTokens(YololParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(YololParser.SPACE, i);
		}
		public TerminalNode AND() { return getToken(YololParser.AND, 0); }
		public TerminalNode OR() { return getToken(YololParser.OR, 0); }
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitLogicalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitLogicalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalOp);
		try {
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(LESS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(LESSEQUAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(GREATER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(GREATEREQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				match(NOTEQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(299);
				match(EQUAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(300);
				match(SPACE);
				setState(301);
				match(AND);
				setState(302);
				match(SPACE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(303);
				match(SPACE);
				setState(304);
				match(OR);
				setState(305);
				match(SPACE);
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(YololParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<OptionalSpaceContext> optionalSpace() {
			return getRuleContexts(OptionalSpaceContext.class);
		}
		public OptionalSpaceContext optionalSpace(int i) {
			return getRuleContext(OptionalSpaceContext.class,i);
		}
		public ArithmeticalOpContext arithmeticalOp() {
			return getRuleContext(ArithmeticalOpContext.class,0);
		}
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_varAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			var();
			setState(310);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(309);
				optionalSpace();
				}
			}

			setState(313);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POW) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				setState(312);
				arithmeticalOp();
				}
			}

			setState(315);
			match(ASSIGN);
			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(316);
				optionalSpace();
				}
				break;
			}
			setState(319);
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

	public static class VarContext extends ParserRuleContext {
		public InternalVariableContext internalVariable() {
			return getRuleContext(InternalVariableContext.class,0);
		}
		public ExternalVariableContext externalVariable() {
			return getRuleContext(ExternalVariableContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_var);
		try {
			setState(323);
			switch (_input.LA(1)) {
			case INTERNALVARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				internalVariable();
				}
				break;
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				externalVariable();
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

	public static class GotoStatContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(YololParser.GOTO, 0); }
		public TerminalNode SPACE() { return getToken(YololParser.SPACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LbracketContext lbracket() {
			return getRuleContext(LbracketContext.class,0);
		}
		public RbracketContext rbracket() {
			return getRuleContext(RbracketContext.class,0);
		}
		public GotoStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterGotoStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitGotoStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitGotoStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatContext gotoStat() throws RecognitionException {
		GotoStatContext _localctx = new GotoStatContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_gotoStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(GOTO);
			setState(332);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(326);
				match(SPACE);
				setState(327);
				expression();
				}
				break;
			case 2:
				{
				setState(328);
				lbracket();
				setState(329);
				expression();
				setState(330);
				rbracket();
				}
				break;
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

	public static class OptionalSpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(YololParser.SPACE, 0); }
		public OptionalSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalSpace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterOptionalSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitOptionalSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitOptionalSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalSpaceContext optionalSpace() throws RecognitionException {
		OptionalSpaceContext _localctx = new OptionalSpaceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_optionalSpace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(SPACE);
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

	public static class LbracketContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(YololParser.LBRACKET, 0); }
		public List<OptionalSpaceContext> optionalSpace() {
			return getRuleContexts(OptionalSpaceContext.class);
		}
		public OptionalSpaceContext optionalSpace(int i) {
			return getRuleContext(OptionalSpaceContext.class,i);
		}
		public LbracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterLbracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitLbracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitLbracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LbracketContext lbracket() throws RecognitionException {
		LbracketContext _localctx = new LbracketContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lbracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(336);
				optionalSpace();
				}
			}

			setState(339);
			match(LBRACKET);
			setState(341);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(340);
				optionalSpace();
				}
				break;
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

	public static class RbracketContext extends ParserRuleContext {
		public TerminalNode RBRACKET() { return getToken(YololParser.RBRACKET, 0); }
		public List<OptionalSpaceContext> optionalSpace() {
			return getRuleContexts(OptionalSpaceContext.class);
		}
		public OptionalSpaceContext optionalSpace(int i) {
			return getRuleContext(OptionalSpaceContext.class,i);
		}
		public RbracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rbracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).enterRbracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YololListener ) ((YololListener)listener).exitRbracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YololVisitor ) return ((YololVisitor<? extends T>)visitor).visitRbracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RbracketContext rbracket() throws RecognitionException {
		RbracketContext _localctx = new RbracketContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rbracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(343);
				optionalSpace();
				}
			}

			setState(346);
			match(RBRACKET);
			setState(348);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(347);
				optionalSpace();
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0161\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\7\2>\n\2\f\2\16\2"+
		"A\13\2\3\2\3\2\5\2E\n\2\3\3\5\3H\n\3\3\3\5\3K\n\3\3\3\5\3N\n\3\3\3\5\3"+
		"Q\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\\\n\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4d\n\4\f\4\16\4g\13\4\5\4i\n\4\3\5\3\5\3\5\3\5\5\5o\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u0085\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0090\n\6"+
		"\5\6\u0092\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009c\n\7\3\b\3\b\3"+
		"\b\3\b\5\b\u00a2\n\b\3\t\3\t\5\t\u00a6\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\5\r\u00af\n\r\3\r\3\r\3\16\3\16\3\16\5\16\u00b6\n\16\3\16\3\16\3\16"+
		"\5\16\u00bb\n\16\3\16\3\16\3\16\5\16\u00c0\n\16\3\17\3\17\3\17\5\17\u00c5"+
		"\n\17\3\17\3\17\3\17\5\17\u00ca\n\17\3\17\3\17\3\17\5\17\u00cf\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00d6\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00de\n\21\3\21\3\21\5\21\u00e2\n\21\3\21\3\21\7\21\u00e6\n\21\f"+
		"\21\16\21\u00e9\13\21\5\21\u00eb\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00f3\n\22\3\22\3\22\5\22\u00f7\n\22\3\22\3\22\7\22\u00fb\n\22\f\22"+
		"\16\22\u00fe\13\22\5\22\u0100\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u010f\n\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0115\n\23\5\23\u0117\n\23\3\23\3\23\7\23\u011b\n\23\f\23\16\23\u011e"+
		"\13\23\3\24\5\24\u0121\n\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0135\n\27\3\30"+
		"\3\30\5\30\u0139\n\30\3\30\5\30\u013c\n\30\3\30\3\30\5\30\u0140\n\30\3"+
		"\30\3\30\3\31\3\31\5\31\u0146\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u014f\n\32\3\33\3\33\3\34\5\34\u0154\n\34\3\34\3\34\5\34\u0158\n"+
		"\34\3\35\5\35\u015b\n\35\3\35\3\35\5\35\u015f\n\35\3\35\2\3$\36\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\4\4\2\13\13"+
		"\16\25\3\2\37$\u0182\2?\3\2\2\2\4G\3\2\2\2\6h\3\2\2\2\bn\3\2\2\2\np\3"+
		"\2\2\2\f\u009b\3\2\2\2\16\u00a1\3\2\2\2\20\u00a5\3\2\2\2\22\u00a7\3\2"+
		"\2\2\24\u00a9\3\2\2\2\26\u00ab\3\2\2\2\30\u00ae\3\2\2\2\32\u00bf\3\2\2"+
		"\2\34\u00ce\3\2\2\2\36\u00d5\3\2\2\2 \u00ea\3\2\2\2\"\u00ff\3\2\2\2$\u0116"+
		"\3\2\2\2&\u0120\3\2\2\2(\u0124\3\2\2\2*\u0126\3\2\2\2,\u0134\3\2\2\2."+
		"\u0136\3\2\2\2\60\u0145\3\2\2\2\62\u0147\3\2\2\2\64\u0150\3\2\2\2\66\u0153"+
		"\3\2\2\28\u015a\3\2\2\2:;\5\4\3\2;<\7\3\2\2<>\3\2\2\2=:\3\2\2\2>A\3\2"+
		"\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BD\5\4\3\2CE\7\2\2\3DC\3\2"+
		"\2\2DE\3\2\2\2E\3\3\2\2\2FH\5\64\33\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IK"+
		"\5\6\4\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\5\64\33\2ML\3\2\2\2MN\3\2\2\2"+
		"NP\3\2\2\2OQ\7\4\2\2PO\3\2\2\2PQ\3\2\2\2Q\5\3\2\2\2RS\5\66\34\2ST\5\6"+
		"\4\2TU\58\35\2Ui\3\2\2\2V\\\5\b\5\2WX\5\66\34\2XY\5\b\5\2YZ\58\35\2Z\\"+
		"\3\2\2\2[V\3\2\2\2[W\3\2\2\2\\e\3\2\2\2]^\7(\2\2^d\5\b\5\2_`\5\66\34\2"+
		"`a\5\b\5\2ab\58\35\2bd\3\2\2\2c]\3\2\2\2c_\3\2\2\2dg\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hR\3\2\2\2h[\3\2\2\2i\7\3\2\2\2jo\5\n\6"+
		"\2ko\5.\30\2lo\5\f\7\2mo\5\62\32\2nj\3\2\2\2nk\3\2\2\2nl\3\2\2\2nm\3\2"+
		"\2\2o\t\3\2\2\2py\7\6\2\2qr\7(\2\2rs\5\f\7\2st\7(\2\2tz\3\2\2\2uv\5\66"+
		"\34\2vw\5\f\7\2wx\58\35\2xz\3\2\2\2yq\3\2\2\2yu\3\2\2\2z{\3\2\2\2{\u0084"+
		"\7\7\2\2|}\7(\2\2}~\5\6\4\2~\177\7(\2\2\177\u0085\3\2\2\2\u0080\u0081"+
		"\5\66\34\2\u0081\u0082\5\6\4\2\u0082\u0083\58\35\2\u0083\u0085\3\2\2\2"+
		"\u0084|\3\2\2\2\u0084\u0080\3\2\2\2\u0085\u0091\3\2\2\2\u0086\u008f\7"+
		"\b\2\2\u0087\u0088\7(\2\2\u0088\u0089\5\6\4\2\u0089\u008a\7(\2\2\u008a"+
		"\u0090\3\2\2\2\u008b\u008c\5\66\34\2\u008c\u008d\5\6\4\2\u008d\u008e\5"+
		"8\35\2\u008e\u0090\3\2\2\2\u008f\u0087\3\2\2\2\u008f\u008b\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u0086\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\7\t\2\2\u0094\13\3\2\2\2\u0095\u0096\5\66\34\2\u0096"+
		"\u0097\5\f\7\2\u0097\u0098\58\35\2\u0098\u009c\3\2\2\2\u0099\u009c\5\16"+
		"\b\2\u009a\u009c\5\36\20\2\u009b\u0095\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\r\3\2\2\2\u009d\u00a2\5\20\t\2\u009e\u00a2\5\60\31"+
		"\2\u009f\u00a2\5\32\16\2\u00a0\u00a2\5\34\17\2\u00a1\u009d\3\2\2\2\u00a1"+
		"\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\17\3\2\2"+
		"\2\u00a3\u00a6\5\30\r\2\u00a4\u00a6\5\22\n\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\21\3\2\2\2\u00a7\u00a8\7\5\2\2\u00a8\23\3\2\2\2\u00a9"+
		"\u00aa\7)\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\7*\2\2\u00ac\27\3\2\2\2\u00ad"+
		"\u00af\7!\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\7+\2\2\u00b1\31\3\2\2\2\u00b2\u00b3\7 \2\2\u00b3\u00b5"+
		"\7 \2\2\u00b4\u00b6\5\64\33\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00c0\5\60\31\2\u00b8\u00ba\5\60\31\2\u00b9"+
		"\u00bb\5\64\33\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3"+
		"\2\2\2\u00bc\u00bd\7 \2\2\u00bd\u00be\7 \2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00b2\3\2\2\2\u00bf\u00b8\3\2\2\2\u00c0\33\3\2\2\2\u00c1\u00c2\7!\2\2"+
		"\u00c2\u00c4\7!\2\2\u00c3\u00c5\5\64\33\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cf\5\60\31\2\u00c7\u00c9\5\60\31"+
		"\2\u00c8\u00ca\5\64\33\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\7!\2\2\u00cc\u00cd\7!\2\2\u00cd\u00cf\3\2\2"+
		"\2\u00ce\u00c1\3\2\2\2\u00ce\u00c7\3\2\2\2\u00cf\35\3\2\2\2\u00d0\u00d1"+
		"\5\66\34\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\58\35\2\u00d3\u00d6\3\2\2"+
		"\2\u00d4\u00d6\5 \21\2\u00d5\u00d0\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\37"+
		"\3\2\2\2\u00d7\u00d8\5\66\34\2\u00d8\u00d9\5 \21\2\u00d9\u00da\58\35\2"+
		"\u00da\u00eb\3\2\2\2\u00db\u00e7\5\"\22\2\u00dc\u00de\5\64\33\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\5,"+
		"\27\2\u00e0\u00e2\5\64\33\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e6\3\2\2\2\u00e5\u00dd\3"+
		"\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00d7\3\2\2\2\u00ea\u00db\3\2"+
		"\2\2\u00eb!\3\2\2\2\u00ec\u00ed\5\66\34\2\u00ed\u00ee\5\"\22\2\u00ee\u00ef"+
		"\58\35\2\u00ef\u0100\3\2\2\2\u00f0\u00fc\5$\23\2\u00f1\u00f3\5\64\33\2"+
		"\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6"+
		"\5*\26\2\u00f5\u00f7\5\64\33\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\u00f9\5$\23\2\u00f9\u00fb\3\2\2\2\u00fa\u00f2"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u00ec\3\2\2\2\u00ff\u00f0\3\2"+
		"\2\2\u0100#\3\2\2\2\u0101\u0102\b\23\1\2\u0102\u0103\5\66\34\2\u0103\u0104"+
		"\5$\23\2\u0104\u0105\58\35\2\u0105\u0117\3\2\2\2\u0106\u0117\5\16\b\2"+
		"\u0107\u010e\5(\25\2\u0108\u0109\7(\2\2\u0109\u010f\5$\23\2\u010a\u010b"+
		"\5\66\34\2\u010b\u010c\5\36\20\2\u010c\u010d\58\35\2\u010d\u010f\3\2\2"+
		"\2\u010e\u0108\3\2\2\2\u010e\u010a\3\2\2\2\u010f\u0117\3\2\2\2\u0110\u0111"+
		"\5\66\34\2\u0111\u0112\5\36\20\2\u0112\u0114\58\35\2\u0113\u0115\5&\24"+
		"\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0101"+
		"\3\2\2\2\u0116\u0106\3\2\2\2\u0116\u0107\3\2\2\2\u0116\u0110\3\2\2\2\u0117"+
		"\u011c\3\2\2\2\u0118\u0119\f\4\2\2\u0119\u011b\5&\24\2\u011a\u0118\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"%\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\5\64\33\2\u0120\u011f\3\2\2"+
		"\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7%\2\2\u0123\'"+
		"\3\2\2\2\u0124\u0125\t\2\2\2\u0125)\3\2\2\2\u0126\u0127\t\3\2\2\u0127"+
		"+\3\2\2\2\u0128\u0135\7\30\2\2\u0129\u0135\7\32\2\2\u012a\u0135\7\31\2"+
		"\2\u012b\u0135\7\33\2\2\u012c\u0135\7\34\2\2\u012d\u0135\7\35\2\2\u012e"+
		"\u012f\7(\2\2\u012f\u0130\7\f\2\2\u0130\u0135\7(\2\2\u0131\u0132\7(\2"+
		"\2\u0132\u0133\7\r\2\2\u0133\u0135\7(\2\2\u0134\u0128\3\2\2\2\u0134\u0129"+
		"\3\2\2\2\u0134\u012a\3\2\2\2\u0134\u012b\3\2\2\2\u0134\u012c\3\2\2\2\u0134"+
		"\u012d\3\2\2\2\u0134\u012e\3\2\2\2\u0134\u0131\3\2\2\2\u0135-\3\2\2\2"+
		"\u0136\u0138\5\60\31\2\u0137\u0139\5\64\33\2\u0138\u0137\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u013c\5*\26\2\u013b\u013a\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\7\36\2\2\u013e"+
		"\u0140\5\64\33\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3"+
		"\2\2\2\u0141\u0142\5\f\7\2\u0142/\3\2\2\2\u0143\u0146\5\24\13\2\u0144"+
		"\u0146\5\26\f\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\61\3\2\2"+
		"\2\u0147\u014e\7\n\2\2\u0148\u0149\7(\2\2\u0149\u014f\5\f\7\2\u014a\u014b"+
		"\5\66\34\2\u014b\u014c\5\f\7\2\u014c\u014d\58\35\2\u014d\u014f\3\2\2\2"+
		"\u014e\u0148\3\2\2\2\u014e\u014a\3\2\2\2\u014f\63\3\2\2\2\u0150\u0151"+
		"\7(\2\2\u0151\65\3\2\2\2\u0152\u0154\5\64\33\2\u0153\u0152\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\7\26\2\2\u0156\u0158\5"+
		"\64\33\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\67\3\2\2\2\u0159"+
		"\u015b\5\64\33\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015c\u015e\7\27\2\2\u015d\u015f\5\64\33\2\u015e\u015d\3\2\2\2"+
		"\u015e\u015f\3\2\2\2\u015f9\3\2\2\2\63?DGJMP[cehny\u0084\u008f\u0091\u009b"+
		"\u00a1\u00a5\u00ae\u00b5\u00ba\u00bf\u00c4\u00c9\u00ce\u00d5\u00dd\u00e1"+
		"\u00e7\u00ea\u00f2\u00f6\u00fc\u00ff\u010e\u0114\u0116\u011c\u0120\u0134"+
		"\u0138\u013b\u013f\u0145\u014e\u0153\u0157\u015a\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}