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
		RULE_arithmeticalExpression = 15, RULE_primaryExpression = 16, RULE_factorial = 17, 
		RULE_prefixOp = 18, RULE_arithmeticalOp = 19, RULE_logicalOp = 20, RULE_varAssignment = 21, 
		RULE_var = 22, RULE_gotoStat = 23, RULE_optionalSpace = 24, RULE_lbracket = 25, 
		RULE_rbracket = 26;
	public static final String[] ruleNames = {
		"chip", "line", "multipleStatements", "statement", "ifStatement", "expression", 
		"value", "string", "internalVariable", "externalVariable", "number", "increment", 
		"decrement", "mathExpr", "logicalExpression", "arithmeticalExpression", 
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
	}

	public final ChipContext chip() throws RecognitionException {
		ChipContext _localctx = new ChipContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chip);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					line();
					setState(55);
					match(BREAK);
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(62);
			line();
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(63);
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
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(66);
				optionalSpace();
				}
				break;
			}
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(69);
				multipleStatements();
				}
				break;
			}
			setState(73);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(72);
				optionalSpace();
				}
			}

			setState(76);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(75);
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
	}

	public final MultipleStatementsContext multipleStatements() throws RecognitionException {
		MultipleStatementsContext _localctx = new MultipleStatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multipleStatements);
		try {
			int _alt;
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				lbracket();
				setState(79);
				multipleStatements();
				setState(80);
				rbracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(82);
					statement();
					}
					break;
				case 2:
					{
					setState(83);
					lbracket();
					setState(84);
					statement();
					setState(85);
					rbracket();
					}
					break;
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(95);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(89);
							match(SPACE);
							setState(90);
							statement();
							}
							break;
						case 2:
							{
							setState(91);
							lbracket();
							setState(92);
							statement();
							setState(93);
							rbracket();
							}
							break;
						}
						} 
					}
					setState(99);
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
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IF);
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(109);
				match(SPACE);
				setState(110);
				expression();
				setState(111);
				match(SPACE);
				}
				break;
			case 2:
				{
				setState(113);
				lbracket();
				setState(114);
				expression();
				setState(115);
				rbracket();
				}
				break;
			}
			setState(119);
			match(THEN);
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(120);
				match(SPACE);
				setState(121);
				multipleStatements();
				setState(122);
				match(SPACE);
				}
				break;
			case 2:
				{
				setState(124);
				lbracket();
				setState(125);
				multipleStatements();
				setState(126);
				rbracket();
				}
				break;
			}
			setState(141);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(130);
				match(ELSE);
				setState(139);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(131);
					match(SPACE);
					setState(132);
					multipleStatements();
					setState(133);
					match(SPACE);
					}
					break;
				case 2:
					{
					setState(135);
					lbracket();
					setState(136);
					multipleStatements();
					setState(137);
					rbracket();
					}
					break;
				}
				}
			}

			setState(143);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				lbracket();
				setState(146);
				expression();
				setState(147);
				rbracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
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
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				increment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
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
			setState(160);
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
			setState(162);
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
			setState(164);
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
			setState(167);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(166);
				match(MINUS);
				}
			}

			setState(169);
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
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_increment);
		int _la;
		try {
			setState(184);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(PLUS);
				setState(172);
				match(PLUS);
				setState(174);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(173);
					optionalSpace();
					}
				}

				setState(176);
				var();
				}
				break;
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				var();
				setState(179);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(178);
					optionalSpace();
					}
				}

				setState(181);
				match(PLUS);
				setState(182);
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
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decrement);
		int _la;
		try {
			setState(199);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(MINUS);
				setState(187);
				match(MINUS);
				setState(189);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(188);
					optionalSpace();
					}
				}

				setState(191);
				var();
				}
				break;
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				var();
				setState(194);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(193);
					optionalSpace();
					}
				}

				setState(196);
				match(MINUS);
				setState(197);
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
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mathExpr);
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				lbracket();
				setState(202);
				mathExpr();
				setState(203);
				rbracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
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
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalExpression);
		try {
			int _alt;
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				lbracket();
				setState(209);
				logicalExpression();
				setState(210);
				rbracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				arithmeticalExpression();
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(214);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(213);
							optionalSpace();
							}
							break;
						}
						setState(216);
						logicalOp();
						setState(218);
						switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
						case 1:
							{
							setState(217);
							optionalSpace();
							}
							break;
						}
						setState(220);
						arithmeticalExpression();
						}
						} 
					}
					setState(226);
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
	}

	public final ArithmeticalExpressionContext arithmeticalExpression() throws RecognitionException {
		ArithmeticalExpressionContext _localctx = new ArithmeticalExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arithmeticalExpression);
		int _la;
		try {
			int _alt;
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				lbracket();
				setState(230);
				arithmeticalExpression();
				setState(231);
				rbracket();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				primaryExpression(0);
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(235);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(234);
							optionalSpace();
							}
						}

						setState(237);
						arithmeticalOp();
						setState(239);
						switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
						case 1:
							{
							setState(238);
							optionalSpace();
							}
							break;
						}
						setState(241);
						primaryExpression(0);
						}
						} 
					}
					setState(247);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(251);
				lbracket();
				setState(252);
				primaryExpression(0);
				setState(253);
				rbracket();
				}
				break;
			case 2:
				{
				setState(255);
				value();
				}
				break;
			case 3:
				{
				setState(256);
				prefixOp();
				setState(263);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(257);
					match(SPACE);
					setState(258);
					primaryExpression(0);
					}
					break;
				case 2:
					{
					setState(259);
					lbracket();
					setState(260);
					mathExpr();
					setState(261);
					rbracket();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(265);
				lbracket();
				setState(266);
				mathExpr();
				setState(267);
				rbracket();
				setState(269);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(268);
					factorial();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
					setState(273);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(274);
					factorial();
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
	}

	public final FactorialContext factorial() throws RecognitionException {
		FactorialContext _localctx = new FactorialContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factorial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(280);
				optionalSpace();
				}
			}

			setState(283);
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
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		enterRule(_localctx, 38, RULE_arithmeticalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logicalOp);
		try {
			setState(301);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(LESS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(LESSEQUAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(GREATER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(GREATEREQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				match(NOTEQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(294);
				match(EQUAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(295);
				match(SPACE);
				setState(296);
				match(AND);
				setState(297);
				match(SPACE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(298);
				match(SPACE);
				setState(299);
				match(OR);
				setState(300);
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
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			var();
			setState(305);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(304);
				optionalSpace();
				}
			}

			setState(308);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POW) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				setState(307);
				arithmeticalOp();
				}
			}

			setState(310);
			match(ASSIGN);
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(311);
				optionalSpace();
				}
				break;
			}
			setState(314);
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
		enterRule(_localctx, 44, RULE_var);
		try {
			setState(318);
			switch (_input.LA(1)) {
			case INTERNALVARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				internalVariable();
				}
				break;
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
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
	}

	public final GotoStatContext gotoStat() throws RecognitionException {
		GotoStatContext _localctx = new GotoStatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_gotoStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(GOTO);
			setState(327);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(321);
				match(SPACE);
				setState(322);
				expression();
				}
				break;
			case 2:
				{
				setState(323);
				lbracket();
				setState(324);
				expression();
				setState(325);
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
	}

	public final OptionalSpaceContext optionalSpace() throws RecognitionException {
		OptionalSpaceContext _localctx = new OptionalSpaceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_optionalSpace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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
	}

	public final LbracketContext lbracket() throws RecognitionException {
		LbracketContext _localctx = new LbracketContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lbracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(331);
				optionalSpace();
				}
			}

			setState(334);
			match(LBRACKET);
			setState(336);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(335);
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
	}

	public final RbracketContext rbracket() throws RecognitionException {
		RbracketContext _localctx = new RbracketContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rbracket);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(338);
				optionalSpace();
				}
			}

			setState(341);
			match(RBRACKET);
			setState(343);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(342);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u015c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2"+
		"\3\2\5\2C\n\2\3\3\5\3F\n\3\3\3\5\3I\n\3\3\3\5\3L\n\3\3\3\5\3O\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"b\n\4\f\4\16\4e\13\4\5\4g\n\4\3\5\3\5\3\5\3\5\5\5m\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6x\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0083\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008e\n\6\5\6\u0090"+
		"\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00a1\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\5\f\u00aa\n\f\3\f\3\f\3\r"+
		"\3\r\3\r\5\r\u00b1\n\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\r\3\r\3\r\5\r\u00bb"+
		"\n\r\3\16\3\16\3\16\5\16\u00c0\n\16\3\16\3\16\3\16\5\16\u00c5\n\16\3\16"+
		"\3\16\3\16\5\16\u00ca\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00d1\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d9\n\20\3\20\3\20\5\20\u00dd\n\20"+
		"\3\20\3\20\7\20\u00e1\n\20\f\20\16\20\u00e4\13\20\5\20\u00e6\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00ee\n\21\3\21\3\21\5\21\u00f2\n\21\3"+
		"\21\3\21\7\21\u00f6\n\21\f\21\16\21\u00f9\13\21\5\21\u00fb\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010a"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u0110\n\22\5\22\u0112\n\22\3\22\3\22\7"+
		"\22\u0116\n\22\f\22\16\22\u0119\13\22\3\23\5\23\u011c\n\23\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0130\n\26\3\27\3\27\5\27\u0134\n\27\3\27\5\27\u0137\n\27"+
		"\3\27\3\27\5\27\u013b\n\27\3\27\3\27\3\30\3\30\5\30\u0141\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u014a\n\31\3\32\3\32\3\33\5\33\u014f"+
		"\n\33\3\33\3\33\5\33\u0153\n\33\3\34\5\34\u0156\n\34\3\34\3\34\5\34\u015a"+
		"\n\34\3\34\2\3\"\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\66\2\4\4\2\13\13\16\25\3\2\37$\u017e\2=\3\2\2\2\4E\3\2\2\2\6f\3"+
		"\2\2\2\bl\3\2\2\2\nn\3\2\2\2\f\u0099\3\2\2\2\16\u00a0\3\2\2\2\20\u00a2"+
		"\3\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2\2\2\26\u00a9\3\2\2\2\30\u00ba\3"+
		"\2\2\2\32\u00c9\3\2\2\2\34\u00d0\3\2\2\2\36\u00e5\3\2\2\2 \u00fa\3\2\2"+
		"\2\"\u0111\3\2\2\2$\u011b\3\2\2\2&\u011f\3\2\2\2(\u0121\3\2\2\2*\u012f"+
		"\3\2\2\2,\u0131\3\2\2\2.\u0140\3\2\2\2\60\u0142\3\2\2\2\62\u014b\3\2\2"+
		"\2\64\u014e\3\2\2\2\66\u0155\3\2\2\289\5\4\3\29:\7\3\2\2:<\3\2\2\2;8\3"+
		"\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@B\5\4\3\2AC\7"+
		"\2\2\3BA\3\2\2\2BC\3\2\2\2C\3\3\2\2\2DF\5\62\32\2ED\3\2\2\2EF\3\2\2\2"+
		"FH\3\2\2\2GI\5\6\4\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\62\32\2KJ\3\2\2"+
		"\2KL\3\2\2\2LN\3\2\2\2MO\7\4\2\2NM\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PQ\5\64"+
		"\33\2QR\5\6\4\2RS\5\66\34\2Sg\3\2\2\2TZ\5\b\5\2UV\5\64\33\2VW\5\b\5\2"+
		"WX\5\66\34\2XZ\3\2\2\2YT\3\2\2\2YU\3\2\2\2Zc\3\2\2\2[\\\7(\2\2\\b\5\b"+
		"\5\2]^\5\64\33\2^_\5\b\5\2_`\5\66\34\2`b\3\2\2\2a[\3\2\2\2a]\3\2\2\2b"+
		"e\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fP\3\2\2\2fY\3\2\2\2"+
		"g\7\3\2\2\2hm\5\n\6\2im\5,\27\2jm\5\f\7\2km\5\60\31\2lh\3\2\2\2li\3\2"+
		"\2\2lj\3\2\2\2lk\3\2\2\2m\t\3\2\2\2nw\7\6\2\2op\7(\2\2pq\5\f\7\2qr\7("+
		"\2\2rx\3\2\2\2st\5\64\33\2tu\5\f\7\2uv\5\66\34\2vx\3\2\2\2wo\3\2\2\2w"+
		"s\3\2\2\2xy\3\2\2\2y\u0082\7\7\2\2z{\7(\2\2{|\5\6\4\2|}\7(\2\2}\u0083"+
		"\3\2\2\2~\177\5\64\33\2\177\u0080\5\6\4\2\u0080\u0081\5\66\34\2\u0081"+
		"\u0083\3\2\2\2\u0082z\3\2\2\2\u0082~\3\2\2\2\u0083\u008f\3\2\2\2\u0084"+
		"\u008d\7\b\2\2\u0085\u0086\7(\2\2\u0086\u0087\5\6\4\2\u0087\u0088\7(\2"+
		"\2\u0088\u008e\3\2\2\2\u0089\u008a\5\64\33\2\u008a\u008b\5\6\4\2\u008b"+
		"\u008c\5\66\34\2\u008c\u008e\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0089\3"+
		"\2\2\2\u008e\u0090\3\2\2\2\u008f\u0084\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\7\t\2\2\u0092\13\3\2\2\2\u0093\u0094\5\64\33"+
		"\2\u0094\u0095\5\f\7\2\u0095\u0096\5\66\34\2\u0096\u009a\3\2\2\2\u0097"+
		"\u009a\5\16\b\2\u0098\u009a\5\34\17\2\u0099\u0093\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\r\3\2\2\2\u009b\u00a1\5\20\t\2\u009c"+
		"\u00a1\5.\30\2\u009d\u00a1\5\26\f\2\u009e\u00a1\5\30\r\2\u009f\u00a1\5"+
		"\32\16\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\17\3\2\2\2\u00a2\u00a3\7\5\2"+
		"\2\u00a3\21\3\2\2\2\u00a4\u00a5\7)\2\2\u00a5\23\3\2\2\2\u00a6\u00a7\7"+
		"*\2\2\u00a7\25\3\2\2\2\u00a8\u00aa\7!\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7+\2\2\u00ac\27\3\2\2\2\u00ad"+
		"\u00ae\7 \2\2\u00ae\u00b0\7 \2\2\u00af\u00b1\5\62\32\2\u00b0\u00af\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00bb\5.\30\2\u00b3"+
		"\u00b5\5.\30\2\u00b4\u00b6\5\62\32\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7 \2\2\u00b8\u00b9\7 \2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00ad\3\2\2\2\u00ba\u00b3\3\2\2\2\u00bb\31\3\2\2"+
		"\2\u00bc\u00bd\7!\2\2\u00bd\u00bf\7!\2\2\u00be\u00c0\5\62\32\2\u00bf\u00be"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00ca\5.\30\2\u00c2"+
		"\u00c4\5.\30\2\u00c3\u00c5\5\62\32\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7!\2\2\u00c7\u00c8\7!\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00bc\3\2\2\2\u00c9\u00c2\3\2\2\2\u00ca\33\3\2\2"+
		"\2\u00cb\u00cc\5\64\33\2\u00cc\u00cd\5\34\17\2\u00cd\u00ce\5\66\34\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00d1\5\36\20\2\u00d0\u00cb\3\2\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\35\3\2\2\2\u00d2\u00d3\5\64\33\2\u00d3\u00d4\5\36\20\2\u00d4"+
		"\u00d5\5\66\34\2\u00d5\u00e6\3\2\2\2\u00d6\u00e2\5 \21\2\u00d7\u00d9\5"+
		"\62\32\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00dc\5*\26\2\u00db\u00dd\5\62\32\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\5 \21\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00d8\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00d2\3\2\2\2\u00e5"+
		"\u00d6\3\2\2\2\u00e6\37\3\2\2\2\u00e7\u00e8\5\64\33\2\u00e8\u00e9\5 \21"+
		"\2\u00e9\u00ea\5\66\34\2\u00ea\u00fb\3\2\2\2\u00eb\u00f7\5\"\22\2\u00ec"+
		"\u00ee\5\62\32\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00f1\5(\25\2\u00f0\u00f2\5\62\32\2\u00f1\u00f0\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\5\"\22\2\u00f4\u00f6\3"+
		"\2\2\2\u00f5\u00ed\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00e7\3\2"+
		"\2\2\u00fa\u00eb\3\2\2\2\u00fb!\3\2\2\2\u00fc\u00fd\b\22\1\2\u00fd\u00fe"+
		"\5\64\33\2\u00fe\u00ff\5\"\22\2\u00ff\u0100\5\66\34\2\u0100\u0112\3\2"+
		"\2\2\u0101\u0112\5\16\b\2\u0102\u0109\5&\24\2\u0103\u0104\7(\2\2\u0104"+
		"\u010a\5\"\22\2\u0105\u0106\5\64\33\2\u0106\u0107\5\34\17\2\u0107\u0108"+
		"\5\66\34\2\u0108\u010a\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u0105\3\2\2\2"+
		"\u010a\u0112\3\2\2\2\u010b\u010c\5\64\33\2\u010c\u010d\5\34\17\2\u010d"+
		"\u010f\5\66\34\2\u010e\u0110\5$\23\2\u010f\u010e\3\2\2\2\u010f\u0110\3"+
		"\2\2\2\u0110\u0112\3\2\2\2\u0111\u00fc\3\2\2\2\u0111\u0101\3\2\2\2\u0111"+
		"\u0102\3\2\2\2\u0111\u010b\3\2\2\2\u0112\u0117\3\2\2\2\u0113\u0114\f\4"+
		"\2\2\u0114\u0116\5$\23\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118#\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\u011a\u011c\5\62\32\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011e\7%\2\2\u011e%\3\2\2\2\u011f\u0120\t\2\2\2\u0120\'"+
		"\3\2\2\2\u0121\u0122\t\3\2\2\u0122)\3\2\2\2\u0123\u0130\7\30\2\2\u0124"+
		"\u0130\7\32\2\2\u0125\u0130\7\31\2\2\u0126\u0130\7\33\2\2\u0127\u0130"+
		"\7\34\2\2\u0128\u0130\7\35\2\2\u0129\u012a\7(\2\2\u012a\u012b\7\f\2\2"+
		"\u012b\u0130\7(\2\2\u012c\u012d\7(\2\2\u012d\u012e\7\r\2\2\u012e\u0130"+
		"\7(\2\2\u012f\u0123\3\2\2\2\u012f\u0124\3\2\2\2\u012f\u0125\3\2\2\2\u012f"+
		"\u0126\3\2\2\2\u012f\u0127\3\2\2\2\u012f\u0128\3\2\2\2\u012f\u0129\3\2"+
		"\2\2\u012f\u012c\3\2\2\2\u0130+\3\2\2\2\u0131\u0133\5.\30\2\u0132\u0134"+
		"\5\62\32\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2"+
		"\u0135\u0137\5(\25\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u013a\7\36\2\2\u0139\u013b\5\62\32\2\u013a\u0139\3\2\2"+
		"\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\5\f\7\2\u013d-"+
		"\3\2\2\2\u013e\u0141\5\22\n\2\u013f\u0141\5\24\13\2\u0140\u013e\3\2\2"+
		"\2\u0140\u013f\3\2\2\2\u0141/\3\2\2\2\u0142\u0149\7\n\2\2\u0143\u0144"+
		"\7(\2\2\u0144\u014a\5\f\7\2\u0145\u0146\5\64\33\2\u0146\u0147\5\f\7\2"+
		"\u0147\u0148\5\66\34\2\u0148\u014a\3\2\2\2\u0149\u0143\3\2\2\2\u0149\u0145"+
		"\3\2\2\2\u014a\61\3\2\2\2\u014b\u014c\7(\2\2\u014c\63\3\2\2\2\u014d\u014f"+
		"\5\62\32\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2"+
		"\u0150\u0152\7\26\2\2\u0151\u0153\5\62\32\2\u0152\u0151\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\65\3\2\2\2\u0154\u0156\5\62\32\2\u0155\u0154\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\7\27\2\2\u0158"+
		"\u015a\5\62\32\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\67\3\2"+
		"\2\2\62=BEHKNYacflw\u0082\u008d\u008f\u0099\u00a0\u00a9\u00b0\u00b5\u00ba"+
		"\u00bf\u00c4\u00c9\u00d0\u00d8\u00dc\u00e2\u00e5\u00ed\u00f1\u00f7\u00fa"+
		"\u0109\u010f\u0111\u0117\u011b\u012f\u0133\u0136\u013a\u0140\u0149\u014e"+
		"\u0152\u0155\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}