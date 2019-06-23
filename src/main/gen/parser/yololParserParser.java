// Generated from /home/alphacentauri/Projects/yolol-minifier/src/main/java/parser/yololParser.g4 by ANTLR 4.7.2
package parser;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, AlphabeticalChar=15, 
		NumericalChar=16, SpecialSymbols=17, ArithmeticKeyword=18, LogicalOperator=19, 
		IF=20, THEN=21, ELSE=22, END=23, GOTO=24, ABS=25, SQRT=26, SIN=27, COS=28, 
		TAN=29, ARCSIN=30, ARCCOS=31, ARCTAN=32;
	public static final int
		RULE_chip = 0, RULE_line = 1, RULE_multipleStatements = 2, RULE_singleStatement = 3, 
		RULE_ifStatement = 4, RULE_expression = 5, RULE_expression_recursive = 6, 
		RULE_arithmeticOperation = 7, RULE_logicalOperation = 8, RULE_factorialOperation = 9, 
		RULE_var = 10, RULE_varname = 11, RULE_alphanumericalChar = 12, RULE_literal = 13, 
		RULE_string = 14, RULE_everyChar = 15, RULE_number = 16, RULE_arithmeticOperator = 17, 
		RULE_varAssignment = 18, RULE_gotoExpr = 19, RULE_comment = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"chip", "line", "multipleStatements", "singleStatement", "ifStatement", 
			"expression", "expression_recursive", "arithmeticOperation", "logicalOperation", 
			"factorialOperation", "var", "varname", "alphanumericalChar", "literal", 
			"string", "everyChar", "number", "arithmeticOperator", "varAssignment", 
			"gotoExpr", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'('", "')'", "'!'", "':'", "'\"'", "'-'", "'.'", "'+'", 
			"'*'", "'/'", "'%'", "'='", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "AlphabeticalChar", "NumericalChar", "SpecialSymbols", 
			"ArithmeticKeyword", "LogicalOperator", "IF", "THEN", "ELSE", "END", 
			"GOTO", "ABS", "SQRT", "SIN", "COS", "TAN", "ARCSIN", "ARCCOS", "ARCTAN"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitChip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChipContext chip() throws RecognitionException {
		ChipContext _localctx = new ChipContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chip);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__13) | (1L << AlphabeticalChar) | (1L << NumericalChar) | (1L << ArithmeticKeyword) | (1L << IF) | (1L << GOTO))) != 0)) {
				{
				{
				setState(42);
				line();
				}
				}
				setState(47);
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

	public static class LineContext extends ParserRuleContext {
		public MultipleStatementsContext multipleStatements() {
			return getRuleContext(MultipleStatementsContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case AlphabeticalChar:
			case NumericalChar:
			case ArithmeticKeyword:
			case IF:
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				multipleStatements();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				comment();
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

	public static class MultipleStatementsContext extends ParserRuleContext {
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitMultipleStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleStatementsContext multipleStatements() throws RecognitionException {
		MultipleStatementsContext _localctx = new MultipleStatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multipleStatements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			singleStatement();
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53);
					match(T__0);
					setState(54);
					singleStatement();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleStatement);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IF);
			setState(67);
			match(T__0);
			setState(68);
			expression();
			setState(69);
			match(T__0);
			setState(70);
			match(THEN);
			setState(71);
			match(T__0);
			setState(72);
			multipleStatements();
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(73);
				match(T__0);
				setState(74);
				match(ELSE);
				setState(75);
				match(T__0);
				setState(76);
				multipleStatements();
				}
				break;
			}
			setState(79);
			match(T__0);
			setState(80);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ArithmeticKeyword() { return getToken(yololParserParser.ArithmeticKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(82);
				match(T__1);
				setState(83);
				expression();
				setState(84);
				match(T__2);
				}
				break;
			case T__4:
			case AlphabeticalChar:
				{
				setState(86);
				var();
				}
				break;
			case T__5:
			case T__6:
			case NumericalChar:
				{
				setState(87);
				literal();
				}
				break;
			case ArithmeticKeyword:
				{
				setState(88);
				match(ArithmeticKeyword);
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(89);
					match(T__0);
					setState(90);
					expression();
					}
					break;
				case T__1:
					{
					setState(91);
					match(T__1);
					setState(92);
					expression();
					setState(93);
					match(T__2);
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
			setState(99);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitExpression_recursive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_recursiveContext expression_recursive() throws RecognitionException {
		Expression_recursiveContext _localctx = new Expression_recursiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression_recursive);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				arithmeticOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				logicalOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperationContext arithmeticOperation() throws RecognitionException {
		ArithmeticOperationContext _localctx = new ArithmeticOperationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arithmeticOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			arithmeticOperator();
			setState(108);
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

	public static class LogicalOperationContext extends ParserRuleContext {
		public TerminalNode LogicalOperator() { return getToken(yololParserParser.LogicalOperator, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitLogicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperationContext logicalOperation() throws RecognitionException {
		LogicalOperationContext _localctx = new LogicalOperationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicalOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LogicalOperator);
			setState(111);
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

	public static class FactorialOperationContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitFactorialOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorialOperationContext factorialOperation() throws RecognitionException {
		FactorialOperationContext _localctx = new FactorialOperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factorialOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__3);
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
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(115);
				match(T__4);
				}
			}

			setState(118);
			varname();
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

	public static class VarnameContext extends ParserRuleContext {
		public TerminalNode AlphabeticalChar() { return getToken(yololParserParser.AlphabeticalChar, 0); }
		public List<AlphanumericalCharContext> alphanumericalChar() {
			return getRuleContexts(AlphanumericalCharContext.class);
		}
		public AlphanumericalCharContext alphanumericalChar(int i) {
			return getRuleContext(AlphanumericalCharContext.class,i);
		}
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitVarname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitVarname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varname);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(AlphabeticalChar);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					alphanumericalChar();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class AlphanumericalCharContext extends ParserRuleContext {
		public TerminalNode AlphabeticalChar() { return getToken(yololParserParser.AlphabeticalChar, 0); }
		public TerminalNode NumericalChar() { return getToken(yololParserParser.NumericalChar, 0); }
		public AlphanumericalCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanumericalChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterAlphanumericalChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitAlphanumericalChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitAlphanumericalChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphanumericalCharContext alphanumericalChar() throws RecognitionException {
		AlphanumericalCharContext _localctx = new AlphanumericalCharContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_alphanumericalChar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==AlphabeticalChar || _la==NumericalChar) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				string();
				}
				break;
			case T__6:
			case NumericalChar:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
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

	public static class StringContext extends ParserRuleContext {
		public List<EveryCharContext> everyChar() {
			return getRuleContexts(EveryCharContext.class);
		}
		public EveryCharContext everyChar(int i) {
			return getRuleContext(EveryCharContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__5);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << AlphabeticalChar) | (1L << NumericalChar) | (1L << SpecialSymbols))) != 0)) {
				{
				setState(136);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AlphabeticalChar:
				case NumericalChar:
				case SpecialSymbols:
					{
					setState(134);
					everyChar();
					}
					break;
				case T__0:
					{
					setState(135);
					match(T__0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__5);
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

	public static class EveryCharContext extends ParserRuleContext {
		public AlphanumericalCharContext alphanumericalChar() {
			return getRuleContext(AlphanumericalCharContext.class,0);
		}
		public TerminalNode SpecialSymbols() { return getToken(yololParserParser.SpecialSymbols, 0); }
		public EveryCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_everyChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterEveryChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitEveryChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitEveryChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EveryCharContext everyChar() throws RecognitionException {
		EveryCharContext _localctx = new EveryCharContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_everyChar);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AlphabeticalChar:
			case NumericalChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				alphanumericalChar();
				}
				break;
			case SpecialSymbols:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(SpecialSymbols);
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
		public List<TerminalNode> NumericalChar() { return getTokens(yololParserParser.NumericalChar); }
		public TerminalNode NumericalChar(int i) {
			return getToken(yololParserParser.NumericalChar, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(147);
				match(T__6);
				}
			}

			setState(151); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(150);
					match(NumericalChar);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(155);
				match(T__7);
				setState(157); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(156);
						match(NumericalChar);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(159); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			var();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				setState(166);
				arithmeticOperator();
				}
			}

			setState(169);
			match(T__12);
			setState(170);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitGotoExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoExprContext gotoExpr() throws RecognitionException {
		GotoExprContext _localctx = new GotoExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_gotoExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(GOTO);
			setState(173);
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

	public static class CommentContext extends ParserRuleContext {
		public List<EveryCharContext> everyChar() {
			return getRuleContexts(EveryCharContext.class);
		}
		public EveryCharContext everyChar(int i) {
			return getRuleContext(EveryCharContext.class,i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__13);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					everyChar();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\3\3\3\5\3\65\n\3\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\3\5\3\5\3"+
		"\5\5\5C\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\5"+
		"\7d\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\5\fw\n\f\3\f\3\f\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\3\16\3"+
		"\16\3\17\3\17\5\17\u0086\n\17\3\20\3\20\3\20\7\20\u008b\n\20\f\20\16\20"+
		"\u008e\13\20\3\20\3\20\3\21\3\21\5\21\u0094\n\21\3\22\5\22\u0097\n\22"+
		"\3\22\6\22\u009a\n\22\r\22\16\22\u009b\3\22\3\22\6\22\u00a0\n\22\r\22"+
		"\16\22\u00a1\5\22\u00a4\n\22\3\23\3\23\3\24\3\24\5\24\u00aa\n\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\7\26\u00b4\n\26\f\26\16\26\u00b7\13"+
		"\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\4\3\2"+
		"\21\22\4\2\t\t\13\16\2\u00bd\2/\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\bB\3"+
		"\2\2\2\nD\3\2\2\2\fc\3\2\2\2\16k\3\2\2\2\20m\3\2\2\2\22p\3\2\2\2\24s\3"+
		"\2\2\2\26v\3\2\2\2\30z\3\2\2\2\32\u0081\3\2\2\2\34\u0085\3\2\2\2\36\u0087"+
		"\3\2\2\2 \u0093\3\2\2\2\"\u0096\3\2\2\2$\u00a5\3\2\2\2&\u00a7\3\2\2\2"+
		"(\u00ae\3\2\2\2*\u00b1\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2"+
		"\2/\60\3\2\2\2\60\3\3\2\2\2\61/\3\2\2\2\62\65\5\6\4\2\63\65\5*\26\2\64"+
		"\62\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\66;\5\b\5\2\678\7\3\2\28:\5\b\5"+
		"\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=;\3\2\2\2>C\5"+
		"\n\6\2?C\5&\24\2@C\5\f\7\2AC\5(\25\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3"+
		"\2\2\2C\t\3\2\2\2DE\7\26\2\2EF\7\3\2\2FG\5\f\7\2GH\7\3\2\2HI\7\27\2\2"+
		"IJ\7\3\2\2JO\5\6\4\2KL\7\3\2\2LM\7\30\2\2MN\7\3\2\2NP\5\6\4\2OK\3\2\2"+
		"\2OP\3\2\2\2PQ\3\2\2\2QR\7\3\2\2RS\7\31\2\2S\13\3\2\2\2TU\7\4\2\2UV\5"+
		"\f\7\2VW\7\5\2\2Wd\3\2\2\2Xd\5\26\f\2Yd\5\34\17\2Za\7\24\2\2[\\\7\3\2"+
		"\2\\b\5\f\7\2]^\7\4\2\2^_\5\f\7\2_`\7\5\2\2`b\3\2\2\2a[\3\2\2\2a]\3\2"+
		"\2\2bd\3\2\2\2cT\3\2\2\2cX\3\2\2\2cY\3\2\2\2cZ\3\2\2\2de\3\2\2\2ef\5\16"+
		"\b\2f\r\3\2\2\2gl\5\20\t\2hl\5\22\n\2il\5\24\13\2jl\3\2\2\2kg\3\2\2\2"+
		"kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\17\3\2\2\2mn\5$\23\2no\5\f\7\2o\21\3\2"+
		"\2\2pq\7\25\2\2qr\5\f\7\2r\23\3\2\2\2st\7\6\2\2t\25\3\2\2\2uw\7\7\2\2"+
		"vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\5\30\r\2y\27\3\2\2\2z~\7\21\2\2{}\5\32"+
		"\16\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\31\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0082\t\2\2\2\u0082\33\3\2\2\2\u0083\u0086\5\36\20\2\u0084"+
		"\u0086\5\"\22\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\35\3\2\2"+
		"\2\u0087\u008c\7\b\2\2\u0088\u008b\5 \21\2\u0089\u008b\7\3\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\b"+
		"\2\2\u0090\37\3\2\2\2\u0091\u0094\5\32\16\2\u0092\u0094\7\23\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094!\3\2\2\2\u0095\u0097\7\t\2\2"+
		"\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u009a"+
		"\7\22\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009b\u009c\3\2\2\2\u009c\u00a3\3\2\2\2\u009d\u009f\7\n\2\2\u009e\u00a0"+
		"\7\22\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4#\3\2\2\2\u00a5\u00a6\t\3\2\2\u00a6%\3\2\2\2\u00a7\u00a9"+
		"\5\26\f\2\u00a8\u00aa\5$\23\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\5\f\7\2\u00ad\'"+
		"\3\2\2\2\u00ae\u00af\7\32\2\2\u00af\u00b0\5\f\7\2\u00b0)\3\2\2\2\u00b1"+
		"\u00b5\7\20\2\2\u00b2\u00b4\5 \21\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6+\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\26/\64;BOackv~\u0085\u008a\u008c\u0093\u0096\u009b\u00a1\u00a3"+
		"\u00a9\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}