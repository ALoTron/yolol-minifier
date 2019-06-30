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
		RULE_ifStatement = 4, RULE_expression = 5, RULE_value = 6, RULE_string = 7, 
		RULE_internalVariable = 8, RULE_externalVariable = 9, RULE_number = 10, 
		RULE_increment = 11, RULE_decrement = 12, RULE_mathExpr = 13, RULE_logicalExpression = 14, 
		RULE_arithmeticalExpression = 15, RULE_primaryExpression = 16, RULE_prefixOp = 17, 
		RULE_arithmeticalOp = 18, RULE_logicalOp = 19, RULE_varAssignment = 20, 
		RULE_var = 21, RULE_gotoStat = 22;
	public static final String[] ruleNames = {
		"chip", "line", "multipleStatements", "statement", "ifStatement", "expression", 
		"value", "string", "internalVariable", "externalVariable", "number", "increment", 
		"decrement", "mathExpr", "logicalExpression", "arithmeticalExpression", 
		"primaryExpression", "prefixOp", "arithmeticalOp", "logicalOp", "varAssignment", 
		"var", "gotoStat"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'<'", "'>'", 
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
	}

	public final ChipContext chip() throws RecognitionException {
		ChipContext _localctx = new ChipContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chip);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					line();
					setState(47);
					match(BREAK);
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(54);
			line();
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(55);
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
		public List<TerminalNode> SPACE() { return getTokens(YololParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(YololParser.SPACE, i);
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
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(58);
				match(SPACE);
				}
				break;
			}
			setState(62);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << IF) | (1L << GOTO) | (1L << NOT) | (1L << ABS) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << ARCSIN) | (1L << ARCCOS) | (1L << ARCTAN) | (1L << LBRACKET) | (1L << PLUS) | (1L << MINUS) | (1L << INTERNALVARIABLE) | (1L << EXTERNALVARIABLE) | (1L << NUMBER))) != 0)) {
				{
				setState(61);
				multipleStatements();
				}
			}

			setState(65);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(64);
				match(SPACE);
				}
			}

			setState(68);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(67);
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
		public List<TerminalNode> LBRACKET() { return getTokens(YololParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(YololParser.LBRACKET, i);
		}
		public MultipleStatementsContext multipleStatements() {
			return getRuleContext(MultipleStatementsContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(YololParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(YololParser.RBRACKET, i);
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
	}

	public final MultipleStatementsContext multipleStatements() throws RecognitionException {
		MultipleStatementsContext _localctx = new MultipleStatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multipleStatements);
		try {
			int _alt;
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(LBRACKET);
				setState(71);
				multipleStatements();
				setState(72);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(74);
					statement();
					}
					break;
				case 2:
					{
					setState(75);
					match(LBRACKET);
					setState(76);
					statement();
					setState(77);
					match(RBRACKET);
					}
					break;
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(87);
						switch (_input.LA(1)) {
						case SPACE:
							{
							setState(81);
							match(SPACE);
							setState(82);
							statement();
							}
							break;
						case LBRACKET:
							{
							setState(83);
							match(LBRACKET);
							setState(84);
							statement();
							setState(85);
							match(RBRACKET);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(91);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
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
		public List<TerminalNode> LBRACKET() { return getTokens(YololParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(YololParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(YololParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(YololParser.RBRACKET, i);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IF);
			setState(109);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(101);
				match(SPACE);
				setState(102);
				expression();
				setState(103);
				match(SPACE);
				}
				break;
			case LBRACKET:
				{
				setState(105);
				match(LBRACKET);
				setState(106);
				expression();
				setState(107);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(111);
			match(THEN);
			setState(120);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(112);
				match(SPACE);
				setState(113);
				multipleStatements();
				setState(114);
				match(SPACE);
				}
				break;
			case LBRACKET:
				{
				setState(116);
				match(LBRACKET);
				setState(117);
				multipleStatements();
				setState(118);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(133);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(122);
				match(ELSE);
				setState(131);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(123);
					match(SPACE);
					setState(124);
					multipleStatements();
					setState(125);
					match(SPACE);
					}
					break;
				case LBRACKET:
					{
					setState(127);
					match(LBRACKET);
					setState(128);
					multipleStatements();
					setState(129);
					match(RBRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(135);
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
		public TerminalNode LBRACKET() { return getToken(YololParser.LBRACKET, 0); }
		public List<TerminalNode> SPACE() { return getTokens(YololParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(YololParser.SPACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(YololParser.RBRACKET, 0); }
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(LBRACKET);
				setState(138);
				match(SPACE);
				setState(139);
				expression();
				setState(140);
				match(SPACE);
				setState(141);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				increment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
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
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
	}

	public final InternalVariableContext internalVariable() throws RecognitionException {
		InternalVariableContext _localctx = new InternalVariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_internalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
	}

	public final ExternalVariableContext externalVariable() throws RecognitionException {
		ExternalVariableContext _localctx = new ExternalVariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_externalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(160);
				match(MINUS);
				}
			}

			setState(163);
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
		public TerminalNode SPACE() { return getToken(YololParser.SPACE, 0); }
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
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_increment);
		int _la;
		try {
			setState(178);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(PLUS);
				setState(166);
				match(PLUS);
				setState(168);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(167);
					match(SPACE);
					}
				}

				setState(170);
				var();
				}
				break;
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				var();
				setState(173);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(172);
					match(SPACE);
					}
				}

				setState(175);
				match(PLUS);
				setState(176);
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
		public TerminalNode SPACE() { return getToken(YololParser.SPACE, 0); }
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
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decrement);
		int _la;
		try {
			setState(193);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(MINUS);
				setState(181);
				match(MINUS);
				setState(183);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(182);
					match(SPACE);
					}
				}

				setState(185);
				var();
				}
				break;
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				var();
				setState(188);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(187);
					match(SPACE);
					}
				}

				setState(190);
				match(MINUS);
				setState(191);
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
		public TerminalNode LBRACKET() { return getToken(YololParser.LBRACKET, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(YololParser.RBRACKET, 0); }
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
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mathExpr);
		try {
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(LBRACKET);
				setState(196);
				mathExpr();
				setState(197);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
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
		public TerminalNode LBRACKET() { return getToken(YololParser.LBRACKET, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(YololParser.RBRACKET, 0); }
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
		public List<TerminalNode> SPACE() { return getTokens(YololParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(YololParser.SPACE, i);
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
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalExpression);
		int _la;
		try {
			int _alt;
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(LBRACKET);
				setState(203);
				logicalExpression();
				setState(204);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				arithmeticalExpression();
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(208);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(207);
							match(SPACE);
							}
						}

						setState(210);
						logicalOp();
						setState(212);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(211);
							match(SPACE);
							}
						}

						setState(214);
						arithmeticalExpression();
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public TerminalNode LBRACKET() { return getToken(YololParser.LBRACKET, 0); }
		public ArithmeticalExpressionContext arithmeticalExpression() {
			return getRuleContext(ArithmeticalExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(YololParser.RBRACKET, 0); }
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
		public List<TerminalNode> SPACE() { return getTokens(YololParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(YololParser.SPACE, i);
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
	}

	public final ArithmeticalExpressionContext arithmeticalExpression() throws RecognitionException {
		ArithmeticalExpressionContext _localctx = new ArithmeticalExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arithmeticalExpression);
		int _la;
		try {
			int _alt;
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(LBRACKET);
				setState(224);
				arithmeticalExpression();
				setState(225);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				primaryExpression(0);
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(229);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(228);
							match(SPACE);
							}
						}

						setState(231);
						arithmeticalOp();
						setState(233);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(232);
							match(SPACE);
							}
						}

						setState(235);
						primaryExpression(0);
						}
						} 
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public TerminalNode LBRACKET() { return getToken(YololParser.LBRACKET, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(YololParser.RBRACKET, 0); }
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
		public TerminalNode FACTORIAL() { return getToken(YololParser.FACTORIAL, 0); }
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
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(245);
				match(LBRACKET);
				setState(246);
				primaryExpression(0);
				setState(247);
				match(RBRACKET);
				}
				break;
			case 2:
				{
				setState(249);
				value();
				}
				break;
			case 3:
				{
				setState(250);
				prefixOp();
				setState(257);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(251);
					match(SPACE);
					setState(252);
					primaryExpression(0);
					}
					break;
				case LBRACKET:
					{
					setState(253);
					match(LBRACKET);
					setState(254);
					mathExpr();
					setState(255);
					match(RBRACKET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				{
				setState(259);
				match(LBRACKET);
				setState(260);
				mathExpr();
				setState(261);
				match(RBRACKET);
				setState(263);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(262);
					match(FACTORIAL);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
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
					setState(267);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(269);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(268);
						match(SPACE);
						}
					}

					setState(271);
					match(FACTORIAL);
					}
					} 
				}
				setState(276);
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
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
	}

	public final ArithmeticalOpContext arithmeticalOp() throws RecognitionException {
		ArithmeticalOpContext _localctx = new ArithmeticalOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arithmeticalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << LESSEQUAL) | (1L << GREATEREQUAL) | (1L << NOTEQUAL) | (1L << EQUAL))) != 0)) ) {
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
		public TerminalNode ASSIGN() { return getToken(YololParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(YololParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(YololParser.SPACE, i);
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
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			var();
			setState(285);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(284);
				match(SPACE);
				}
			}

			setState(288);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POW) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				setState(287);
				arithmeticalOp();
				}
			}

			setState(290);
			match(ASSIGN);
			setState(292);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(291);
				match(SPACE);
				}
			}

			setState(294);
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
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var);
		try {
			setState(298);
			switch (_input.LA(1)) {
			case INTERNALVARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				internalVariable();
				}
				break;
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
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
		public TerminalNode LBRACKET() { return getToken(YololParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(YololParser.RBRACKET, 0); }
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
	}

	public final GotoStatContext gotoStat() throws RecognitionException {
		GotoStatContext _localctx = new GotoStatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_gotoStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(GOTO);
			setState(307);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(301);
				match(SPACE);
				setState(302);
				expression();
				}
				break;
			case LBRACKET:
				{
				setState(303);
				match(LBRACKET);
				setState(304);
				expression();
				setState(305);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 16:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\5\2;\n\2\3\3\5\3>\n\3\3\3\5\3A"+
		"\n\3\3\3\5\3D\n\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"R\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\5\4_\n\4\3\5\3\5"+
		"\3\5\3\5\5\5e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0086\n\6\5\6\u0088\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u0094\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u009b\n\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\5\f\u00a4\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u00ab\n\r\3\r\3\r\3\r"+
		"\5\r\u00b0\n\r\3\r\3\r\3\r\5\r\u00b5\n\r\3\16\3\16\3\16\5\16\u00ba\n\16"+
		"\3\16\3\16\3\16\5\16\u00bf\n\16\3\16\3\16\3\16\5\16\u00c4\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00cb\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00d3\n\20\3\20\3\20\5\20\u00d7\n\20\3\20\3\20\7\20\u00db\n\20\f\20\16"+
		"\20\u00de\13\20\5\20\u00e0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e8"+
		"\n\21\3\21\3\21\5\21\u00ec\n\21\3\21\3\21\7\21\u00f0\n\21\f\21\16\21\u00f3"+
		"\13\21\5\21\u00f5\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u0104\n\22\3\22\3\22\3\22\3\22\5\22\u010a\n\22"+
		"\5\22\u010c\n\22\3\22\3\22\5\22\u0110\n\22\3\22\7\22\u0113\n\22\f\22\16"+
		"\22\u0116\13\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u0120\n\26"+
		"\3\26\5\26\u0123\n\26\3\26\3\26\5\26\u0127\n\26\3\26\3\26\3\27\3\27\5"+
		"\27\u012d\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0136\n\30\3\30"+
		"\2\3\"\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\5\4\2\13\13"+
		"\16\25\3\2\37$\3\2\30\35\u0153\2\65\3\2\2\2\4=\3\2\2\2\6^\3\2\2\2\bd\3"+
		"\2\2\2\nf\3\2\2\2\f\u0093\3\2\2\2\16\u009a\3\2\2\2\20\u009c\3\2\2\2\22"+
		"\u009e\3\2\2\2\24\u00a0\3\2\2\2\26\u00a3\3\2\2\2\30\u00b4\3\2\2\2\32\u00c3"+
		"\3\2\2\2\34\u00ca\3\2\2\2\36\u00df\3\2\2\2 \u00f4\3\2\2\2\"\u010b\3\2"+
		"\2\2$\u0117\3\2\2\2&\u0119\3\2\2\2(\u011b\3\2\2\2*\u011d\3\2\2\2,\u012c"+
		"\3\2\2\2.\u012e\3\2\2\2\60\61\5\4\3\2\61\62\7\3\2\2\62\64\3\2\2\2\63\60"+
		"\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3"+
		"\2\2\28:\5\4\3\29;\7\2\2\3:9\3\2\2\2:;\3\2\2\2;\3\3\2\2\2<>\7(\2\2=<\3"+
		"\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\6\4\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\7"+
		"(\2\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\7\4\2\2FE\3\2\2\2FG\3\2\2\2G\5\3"+
		"\2\2\2HI\7\26\2\2IJ\5\6\4\2JK\7\27\2\2K_\3\2\2\2LR\5\b\5\2MN\7\26\2\2"+
		"NO\5\b\5\2OP\7\27\2\2PR\3\2\2\2QL\3\2\2\2QM\3\2\2\2R[\3\2\2\2ST\7(\2\2"+
		"TZ\5\b\5\2UV\7\26\2\2VW\5\b\5\2WX\7\27\2\2XZ\3\2\2\2YS\3\2\2\2YU\3\2\2"+
		"\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^H\3\2\2\2^Q\3\2"+
		"\2\2_\7\3\2\2\2`e\5\n\6\2ae\5*\26\2be\5\f\7\2ce\5.\30\2d`\3\2\2\2da\3"+
		"\2\2\2db\3\2\2\2dc\3\2\2\2e\t\3\2\2\2fo\7\6\2\2gh\7(\2\2hi\5\f\7\2ij\7"+
		"(\2\2jp\3\2\2\2kl\7\26\2\2lm\5\f\7\2mn\7\27\2\2np\3\2\2\2og\3\2\2\2ok"+
		"\3\2\2\2pq\3\2\2\2qz\7\7\2\2rs\7(\2\2st\5\6\4\2tu\7(\2\2u{\3\2\2\2vw\7"+
		"\26\2\2wx\5\6\4\2xy\7\27\2\2y{\3\2\2\2zr\3\2\2\2zv\3\2\2\2{\u0087\3\2"+
		"\2\2|\u0085\7\b\2\2}~\7(\2\2~\177\5\6\4\2\177\u0080\7(\2\2\u0080\u0086"+
		"\3\2\2\2\u0081\u0082\7\26\2\2\u0082\u0083\5\6\4\2\u0083\u0084\7\27\2\2"+
		"\u0084\u0086\3\2\2\2\u0085}\3\2\2\2\u0085\u0081\3\2\2\2\u0086\u0088\3"+
		"\2\2\2\u0087|\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\7\t\2\2\u008a\13\3\2\2\2\u008b\u008c\7\26\2\2\u008c\u008d\7(\2\2\u008d"+
		"\u008e\5\f\7\2\u008e\u008f\7(\2\2\u008f\u0090\7\27\2\2\u0090\u0094\3\2"+
		"\2\2\u0091\u0094\5\16\b\2\u0092\u0094\5\34\17\2\u0093\u008b\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\r\3\2\2\2\u0095\u009b\5\20\t"+
		"\2\u0096\u009b\5,\27\2\u0097\u009b\5\26\f\2\u0098\u009b\5\30\r\2\u0099"+
		"\u009b\5\32\16\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\17\3\2\2\2\u009c"+
		"\u009d\7\5\2\2\u009d\21\3\2\2\2\u009e\u009f\7)\2\2\u009f\23\3\2\2\2\u00a0"+
		"\u00a1\7*\2\2\u00a1\25\3\2\2\2\u00a2\u00a4\7!\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7+\2\2\u00a6\27\3"+
		"\2\2\2\u00a7\u00a8\7 \2\2\u00a8\u00aa\7 \2\2\u00a9\u00ab\7(\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b5\5,"+
		"\27\2\u00ad\u00af\5,\27\2\u00ae\u00b0\7(\2\2\u00af\u00ae\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7 \2\2\u00b2\u00b3\7 \2"+
		"\2\u00b3\u00b5\3\2\2\2\u00b4\u00a7\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b5\31"+
		"\3\2\2\2\u00b6\u00b7\7!\2\2\u00b7\u00b9\7!\2\2\u00b8\u00ba\7(\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c4\5,"+
		"\27\2\u00bc\u00be\5,\27\2\u00bd\u00bf\7(\2\2\u00be\u00bd\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7!\2\2\u00c1\u00c2\7!\2"+
		"\2\u00c2\u00c4\3\2\2\2\u00c3\u00b6\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c4\33"+
		"\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6\u00c7\5\34\17\2\u00c7\u00c8\7\27\2"+
		"\2\u00c8\u00cb\3\2\2\2\u00c9\u00cb\5\36\20\2\u00ca\u00c5\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\35\3\2\2\2\u00cc\u00cd\7\26\2\2\u00cd\u00ce\5\36"+
		"\20\2\u00ce\u00cf\7\27\2\2\u00cf\u00e0\3\2\2\2\u00d0\u00dc\5 \21\2\u00d1"+
		"\u00d3\7(\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d6\5(\25\2\u00d5\u00d7\7(\2\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\5 \21\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d2\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00cc\3\2"+
		"\2\2\u00df\u00d0\3\2\2\2\u00e0\37\3\2\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00e3"+
		"\5 \21\2\u00e3\u00e4\7\27\2\2\u00e4\u00f5\3\2\2\2\u00e5\u00f1\5\"\22\2"+
		"\u00e6\u00e8\7(\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00eb\5&\24\2\u00ea\u00ec\7(\2\2\u00eb\u00ea\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5\"\22\2\u00ee\u00f0\3"+
		"\2\2\2\u00ef\u00e7\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00e1\3\2"+
		"\2\2\u00f4\u00e5\3\2\2\2\u00f5!\3\2\2\2\u00f6\u00f7\b\22\1\2\u00f7\u00f8"+
		"\7\26\2\2\u00f8\u00f9\5\"\22\2\u00f9\u00fa\7\27\2\2\u00fa\u010c\3\2\2"+
		"\2\u00fb\u010c\5\16\b\2\u00fc\u0103\5$\23\2\u00fd\u00fe\7(\2\2\u00fe\u0104"+
		"\5\"\22\2\u00ff\u0100\7\26\2\2\u0100\u0101\5\34\17\2\u0101\u0102\7\27"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u00ff\3\2\2\2\u0104"+
		"\u010c\3\2\2\2\u0105\u0106\7\26\2\2\u0106\u0107\5\34\17\2\u0107\u0109"+
		"\7\27\2\2\u0108\u010a\7%\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u00f6\3\2\2\2\u010b\u00fb\3\2\2\2\u010b\u00fc\3\2"+
		"\2\2\u010b\u0105\3\2\2\2\u010c\u0114\3\2\2\2\u010d\u010f\f\4\2\2\u010e"+
		"\u0110\7(\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0113\7%\2\2\u0112\u010d\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115#\3\2\2\2\u0116\u0114\3\2\2\2"+
		"\u0117\u0118\t\2\2\2\u0118%\3\2\2\2\u0119\u011a\t\3\2\2\u011a\'\3\2\2"+
		"\2\u011b\u011c\t\4\2\2\u011c)\3\2\2\2\u011d\u011f\5,\27\2\u011e\u0120"+
		"\7(\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u0123\5&\24\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0126\7\36\2\2\u0125\u0127\7(\2\2\u0126\u0125\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5\f\7\2\u0129+\3\2\2\2"+
		"\u012a\u012d\5\22\n\2\u012b\u012d\5\24\13\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012d-\3\2\2\2\u012e\u0135\7\n\2\2\u012f\u0130\7(\2\2\u0130"+
		"\u0136\5\f\7\2\u0131\u0132\7\26\2\2\u0132\u0133\5\f\7\2\u0133\u0134\7"+
		"\27\2\2\u0134\u0136\3\2\2\2\u0135\u012f\3\2\2\2\u0135\u0131\3\2\2\2\u0136"+
		"/\3\2\2\2-\65:=@CFQY[^doz\u0085\u0087\u0093\u009a\u00a3\u00aa\u00af\u00b4"+
		"\u00b9\u00be\u00c3\u00ca\u00d2\u00d6\u00dc\u00df\u00e7\u00eb\u00f1\u00f4"+
		"\u0103\u0109\u010b\u010f\u0114\u011f\u0122\u0126\u012c\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}