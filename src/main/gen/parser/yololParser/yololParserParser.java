// Generated from ./yololParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class yololParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, BREAK=4, STRING=5, IF=6, THEN=7, ELSE=8, END=9, 
		GOTO=10, ARITHMETICKEYWORD=11, LESS=12, GREATER=13, LESSEQUAL=14, GREATEREQUAL=15, 
		NOTEQUAL=16, EQUAL=17, PLUS=18, MINUS=19, MULTIPLY=20, DIVIDE=21, MODULO=22, 
		FACTORIAL=23, DOT=24, COLON=25, COMMENT=26, SPACE=27, VARIABLE=28, NUMBER=29;
	public static final int
		RULE_chip = 0, RULE_line = 1, RULE_multipleStatements = 2, RULE_singleStatement = 3, 
		RULE_ifStatement = 4, RULE_expression = 5, RULE_expression_recursive = 6, 
		RULE_arithmeticOperation = 7, RULE_arithmeticOperator = 8, RULE_logicalOperation = 9, 
		RULE_logicalOperator = 10, RULE_factorialOperation = 11, RULE_literal = 12, 
		RULE_number = 13, RULE_varAssignment = 14, RULE_gotoExpr = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"chip", "line", "multipleStatements", "singleStatement", "ifStatement", 
			"expression", "expression_recursive", "arithmeticOperation", "arithmeticOperator", 
			"logicalOperation", "logicalOperator", "factorialOperation", "literal", 
			"number", "varAssignment", "gotoExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "'\n'", null, null, null, null, null, null, 
			null, "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'!'", "'.'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "BREAK", "STRING", "IF", "THEN", "ELSE", "END", 
			"GOTO", "ARITHMETICKEYWORD", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", 
			"NOTEQUAL", "EQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", 
			"FACTORIAL", "DOT", "COLON", "COMMENT", "SPACE", "VARIABLE", "NUMBER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "yololParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public yololParserParser(TokenStream input) {
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
		public ChipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterChip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitChip(this);
		}
	}

	public final ChipContext chip() throws RecognitionException {
		ChipContext _localctx = new ChipContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chip);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(32);
					line();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		public TerminalNode BREAK() { return getToken(yololParserParser.BREAK, 0); }
		public TerminalNode EOF() { return getToken(yololParserParser.EOF, 0); }
		public MultipleStatementsContext multipleStatements() {
			return getRuleContext(MultipleStatementsContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(yololParserParser.COMMENT, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << STRING) | (1L << IF) | (1L << GOTO) | (1L << ARITHMETICKEYWORD) | (1L << MINUS) | (1L << VARIABLE) | (1L << NUMBER))) != 0)) {
				{
				setState(38);
				multipleStatements();
				}
			}

			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(41);
				match(COMMENT);
				}
			}

			setState(44);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==BREAK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class MultipleStatementsContext extends ParserRuleContext {
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
		}
		public MultipleStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterMultipleStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitMultipleStatements(this);
		}
	}

	public final MultipleStatementsContext multipleStatements() throws RecognitionException {
		MultipleStatementsContext _localctx = new MultipleStatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multipleStatements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			singleStatement();
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					match(SPACE);
					setState(48);
					singleStatement();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class SingleStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GotoExprContext gotoExpr() {
			return getRuleContext(GotoExprContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitSingleStatement(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleStatement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				gotoExpr();
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
		public TerminalNode IF() { return getToken(yololParserParser.IF, 0); }
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(yololParserParser.THEN, 0); }
		public List<MultipleStatementsContext> multipleStatements() {
			return getRuleContexts(MultipleStatementsContext.class);
		}
		public MultipleStatementsContext multipleStatements(int i) {
			return getRuleContext(MultipleStatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(yololParserParser.END, 0); }
		public TerminalNode ELSE() { return getToken(yololParserParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(IF);
			setState(61);
			match(SPACE);
			setState(62);
			expression();
			setState(63);
			match(SPACE);
			setState(64);
			match(THEN);
			setState(65);
			match(SPACE);
			setState(66);
			multipleStatements();
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(67);
				match(SPACE);
				setState(68);
				match(ELSE);
				setState(69);
				match(SPACE);
				setState(70);
				multipleStatements();
				}
				break;
			}
			setState(73);
			match(SPACE);
			setState(74);
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
		public Expression_recursiveContext expression_recursive() {
			return getRuleContext(Expression_recursiveContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(yololParserParser.VARIABLE, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ARITHMETICKEYWORD() { return getToken(yololParserParser.ARITHMETICKEYWORD, 0); }
		public TerminalNode SPACE() { return getToken(yololParserParser.SPACE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(76);
				match(T__0);
				setState(77);
				expression();
				setState(78);
				match(T__1);
				}
				break;
			case VARIABLE:
				{
				setState(80);
				match(VARIABLE);
				}
				break;
			case STRING:
			case MINUS:
			case NUMBER:
				{
				setState(81);
				literal();
				}
				break;
			case ARITHMETICKEYWORD:
				{
				setState(82);
				match(ARITHMETICKEYWORD);
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(83);
					match(SPACE);
					setState(84);
					expression();
					}
					break;
				case T__0:
					{
					setState(85);
					match(T__0);
					setState(86);
					expression();
					setState(87);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			expression_recursive();
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

	public static class Expression_recursiveContext extends ParserRuleContext {
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public LogicalOperationContext logicalOperation() {
			return getRuleContext(LogicalOperationContext.class,0);
		}
		public FactorialOperationContext factorialOperation() {
			return getRuleContext(FactorialOperationContext.class,0);
		}
		public Expression_recursiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_recursive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterExpression_recursive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitExpression_recursive(this);
		}
	}

	public final Expression_recursiveContext expression_recursive() throws RecognitionException {
		Expression_recursiveContext _localctx = new Expression_recursiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression_recursive);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				arithmeticOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				logicalOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				factorialOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class ArithmeticOperationContext extends ParserRuleContext {
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitArithmeticOperation(this);
		}
	}

	public final ArithmeticOperationContext arithmeticOperation() throws RecognitionException {
		ArithmeticOperationContext _localctx = new ArithmeticOperationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arithmeticOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			arithmeticOperator();
			setState(102);
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(yololParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(yololParserParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(yololParserParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(yololParserParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(yololParserParser.MODULO, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitArithmeticOperator(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class LogicalOperationContext extends ParserRuleContext {
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterLogicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitLogicalOperation(this);
		}
	}

	public final LogicalOperationContext logicalOperation() throws RecognitionException {
		LogicalOperationContext _localctx = new LogicalOperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logicalOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			logicalOperator();
			setState(107);
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

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(yololParserParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(yololParserParser.GREATER, 0); }
		public TerminalNode LESSEQUAL() { return getToken(yololParserParser.LESSEQUAL, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(yololParserParser.GREATEREQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(yololParserParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(yololParserParser.EQUAL, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << LESSEQUAL) | (1L << GREATEREQUAL) | (1L << NOTEQUAL) | (1L << EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class FactorialOperationContext extends ParserRuleContext {
		public TerminalNode FACTORIAL() { return getToken(yololParserParser.FACTORIAL, 0); }
		public FactorialOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorialOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterFactorialOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitFactorialOperation(this);
		}
	}

	public final FactorialOperationContext factorialOperation() throws RecognitionException {
		FactorialOperationContext _localctx = new FactorialOperationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factorialOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(yololParserParser.STRING, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(STRING);
				}
				break;
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				number();
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
		public TerminalNode NUMBER() { return getToken(yololParserParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(yololParserParser.MINUS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(117);
				match(MINUS);
				}
			}

			setState(120);
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(yololParserParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitVarAssignment(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(VARIABLE);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				setState(123);
				arithmeticOperator();
				}
			}

			setState(126);
			match(T__2);
			setState(127);
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

	public static class GotoExprContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(yololParserParser.GOTO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GotoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterGotoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitGotoExpr(this);
		}
	}

	public final GotoExprContext gotoExpr() throws RecognitionException {
		GotoExprContext _localctx = new GotoExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_gotoExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(GOTO);
			setState(130);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\3\5\3*\n\3\3\3\5\3-\n\3\3\3\3\3\3\4\3\4\3\4\7"+
		"\4\64\n\4\f\4\16\4\67\13\4\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\5\7^\n\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\5\bf\n\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\5\16v\n\16\3\17\5\17y\n\17\3\17\3\17\3\20\3\20\5\20\177\n\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \2\5\3\3\6\6\3\2\24\30\3\2\16\23\2\u0088\2%\3\2\2\2\4)\3\2\2\2"+
		"\6\60\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\f]\3\2\2\2\16e\3\2\2\2\20g\3\2\2\2"+
		"\22j\3\2\2\2\24l\3\2\2\2\26o\3\2\2\2\30q\3\2\2\2\32u\3\2\2\2\34x\3\2\2"+
		"\2\36|\3\2\2\2 \u0083\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2"+
		"\2%&\3\2\2\2&\3\3\2\2\2\'%\3\2\2\2(*\5\6\4\2)(\3\2\2\2)*\3\2\2\2*,\3\2"+
		"\2\2+-\7\34\2\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\t\2\2\2/\5\3\2\2\2\60"+
		"\65\5\b\5\2\61\62\7\35\2\2\62\64\5\b\5\2\63\61\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67\65\3\2\2\28=\5\n\6\29=\5\36"+
		"\20\2:=\5\f\7\2;=\5 \21\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\t\3"+
		"\2\2\2>?\7\b\2\2?@\7\35\2\2@A\5\f\7\2AB\7\35\2\2BC\7\t\2\2CD\7\35\2\2"+
		"DI\5\6\4\2EF\7\35\2\2FG\7\n\2\2GH\7\35\2\2HJ\5\6\4\2IE\3\2\2\2IJ\3\2\2"+
		"\2JK\3\2\2\2KL\7\35\2\2LM\7\13\2\2M\13\3\2\2\2NO\7\3\2\2OP\5\f\7\2PQ\7"+
		"\4\2\2Q^\3\2\2\2R^\7\36\2\2S^\5\32\16\2T[\7\r\2\2UV\7\35\2\2V\\\5\f\7"+
		"\2WX\7\3\2\2XY\5\f\7\2YZ\7\4\2\2Z\\\3\2\2\2[U\3\2\2\2[W\3\2\2\2\\^\3\2"+
		"\2\2]N\3\2\2\2]R\3\2\2\2]S\3\2\2\2]T\3\2\2\2^_\3\2\2\2_`\5\16\b\2`\r\3"+
		"\2\2\2af\5\20\t\2bf\5\24\13\2cf\5\30\r\2df\3\2\2\2ea\3\2\2\2eb\3\2\2\2"+
		"ec\3\2\2\2ed\3\2\2\2f\17\3\2\2\2gh\5\22\n\2hi\5\f\7\2i\21\3\2\2\2jk\t"+
		"\3\2\2k\23\3\2\2\2lm\5\26\f\2mn\5\f\7\2n\25\3\2\2\2op\t\4\2\2p\27\3\2"+
		"\2\2qr\7\31\2\2r\31\3\2\2\2sv\7\7\2\2tv\5\34\17\2us\3\2\2\2ut\3\2\2\2"+
		"v\33\3\2\2\2wy\7\25\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\37\2\2{\35\3"+
		"\2\2\2|~\7\36\2\2}\177\5\22\n\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0081\7\5\2\2\u0081\u0082\5\f\7\2\u0082\37\3\2\2\2\u0083\u0084"+
		"\7\f\2\2\u0084\u0085\5\f\7\2\u0085!\3\2\2\2\16%),\65<I[]eux~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}