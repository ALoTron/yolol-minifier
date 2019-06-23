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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, AlphabeticalChar=16, 
		NumericalChar=17, SpecialSymbols=18, ArithmeticOperator=19, ArithmeticKeyword=20, 
		LogicalOperator=21;
	public static final int
		RULE_chip = 0, RULE_line = 1, RULE_multipleStatements = 2, RULE_singleStatement = 3, 
		RULE_ifStatement = 4, RULE_expression = 5, RULE_expression_recursive = 6, 
		RULE_arithmeticOperation = 7, RULE_logicalOperation = 8, RULE_factorialOperation = 9, 
		RULE_var = 10, RULE_varname = 11, RULE_alphanumericalChar = 12, RULE_const = 13, 
		RULE_everyChar = 14, RULE_number = 15, RULE_varAssignment = 16, RULE_goto = 17, 
		RULE_comment = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"chip", "line", "multipleStatements", "singleStatement", "ifStatement", 
			"expression", "expression_recursive", "arithmeticOperation", "logicalOperation", 
			"factorialOperation", "var", "varname", "alphanumericalChar", "const", 
			"everyChar", "number", "varAssignment", "goto", "comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'if '", "' then '", "' else '", "' end'", "'('", "')'", 
			"'!'", "':'", "'\"'", "'-'", "'.'", "'='", "'goto '", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "AlphabeticalChar", "NumericalChar", "SpecialSymbols", 
			"ArithmeticOperator", "ArithmeticKeyword", "LogicalOperator"
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				line();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << AlphabeticalChar) | (1L << NumericalChar) | (1L << ArithmeticKeyword))) != 0) );
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__5:
			case T__8:
			case T__9:
			case T__10:
			case T__13:
			case AlphabeticalChar:
			case NumericalChar:
			case ArithmeticKeyword:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				multipleStatements();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			singleStatement();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(48);
				match(T__0);
				setState(49);
				singleStatement();
				}
				}
				setState(54);
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
		public GotoContext goto() {
			return getRuleContext(GotoContext.class,0);
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				goto();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<MultipleStatementsContext> multipleStatements() {
			return getRuleContexts(MultipleStatementsContext.class);
		}
		public MultipleStatementsContext multipleStatements(int i) {
			return getRuleContext(MultipleStatementsContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__1);
			setState(62);
			expression();
			setState(63);
			match(T__2);
			setState(64);
			multipleStatements();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(65);
				match(T__3);
				setState(66);
				multipleStatements();
				}
			}

			setState(69);
			match(T__4);
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
		public ConstContext const() {
			return getRuleContext(ConstContext.class,0);
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
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(71);
				match(T__5);
				setState(72);
				expression();
				setState(73);
				match(T__6);
				}
				break;
			case T__8:
			case AlphabeticalChar:
				{
				setState(75);
				var();
				}
				break;
			case T__9:
			case T__10:
			case NumericalChar:
				{
				setState(76);
				const();
				}
				break;
			case ArithmeticKeyword:
				{
				setState(77);
				match(ArithmeticKeyword);
				setState(78);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				arithmeticOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				logicalOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
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
		public TerminalNode ArithmeticOperator() { return getToken(yololParserParser.ArithmeticOperator, 0); }
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
			setState(89);
			match(ArithmeticOperator);
			setState(90);
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
			setState(92);
			match(LogicalOperator);
			setState(93);
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
			setState(95);
			match(T__7);
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
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(97);
				match(T__8);
				}
			}

			setState(100);
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
		public List<TerminalNode> AlphabeticalChar() { return getTokens(yololParserParser.AlphabeticalChar); }
		public TerminalNode AlphabeticalChar(int i) {
			return getToken(yololParserParser.AlphabeticalChar, i);
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
			setState(103); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(102);
					match(AlphabeticalChar);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(105); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(107);
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

	public static class ConstContext extends ParserRuleContext {
		public List<EveryCharContext> everyChar() {
			return getRuleContexts(EveryCharContext.class);
		}
		public EveryCharContext everyChar(int i) {
			return getRuleContext(EveryCharContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstContext const() throws RecognitionException {
		ConstContext _localctx = new ConstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_const);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__9);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AlphabeticalChar) | (1L << NumericalChar) | (1L << SpecialSymbols))) != 0)) {
					{
					{
					setState(110);
					everyChar();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(T__9);
				}
				break;
			case T__10:
			case NumericalChar:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
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
		enterRule(_localctx, 28, RULE_everyChar);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AlphabeticalChar:
			case NumericalChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				alphanumericalChar();
				}
				break;
			case SpecialSymbols:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
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
		enterRule(_localctx, 30, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(124);
				match(T__10);
				}
			}

			setState(128); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(127);
					match(NumericalChar);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(130); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(132);
				match(T__11);
				setState(134); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(133);
						match(NumericalChar);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(136); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ArithmeticOperator() { return getToken(yololParserParser.ArithmeticOperator, 0); }
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
		enterRule(_localctx, 32, RULE_varAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			var();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ArithmeticOperator) {
				{
				setState(141);
				match(ArithmeticOperator);
				}
			}

			setState(144);
			match(T__12);
			setState(145);
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

	public static class GotoContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitGoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yololParserVisitor ) return ((yololParserVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoContext goto() throws RecognitionException {
		GotoContext _localctx = new GotoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_goto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__13);
			setState(148);
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
		enterRule(_localctx, 36, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__14);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					everyChar();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00a0\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\5\3\60\n\3\3\4\3\4"+
		"\3\4\7\4\65\n\4\f\4\16\48\13\4\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6F\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\5\fe\n\f\3\f\3\f\3\r\6\rj\n\r\r\r\16\rk\3\16\3\16\3\17\3\17\7\17r\n\17"+
		"\f\17\16\17u\13\17\3\17\3\17\5\17y\n\17\3\20\3\20\5\20}\n\20\3\21\5\21"+
		"\u0080\n\21\3\21\6\21\u0083\n\21\r\21\16\21\u0084\3\21\3\21\6\21\u0089"+
		"\n\21\r\21\16\21\u008a\5\21\u008d\n\21\3\22\3\22\5\22\u0091\n\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\7\24\u009b\n\24\f\24\16\24\u009e\13"+
		"\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\3\2\22"+
		"\23\2\u00a4\2)\3\2\2\2\4/\3\2\2\2\6\61\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\f"+
		"Q\3\2\2\2\16Y\3\2\2\2\20[\3\2\2\2\22^\3\2\2\2\24a\3\2\2\2\26d\3\2\2\2"+
		"\30i\3\2\2\2\32m\3\2\2\2\34x\3\2\2\2\36|\3\2\2\2 \177\3\2\2\2\"\u008e"+
		"\3\2\2\2$\u0095\3\2\2\2&\u0098\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+"+
		")\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-\60\5\6\4\2.\60\5&\24\2/-\3\2\2\2/.\3\2"+
		"\2\2\60\5\3\2\2\2\61\66\5\b\5\2\62\63\7\3\2\2\63\65\5\b\5\2\64\62\3\2"+
		"\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\7\3\2\2\28\66\3\2\2\2"+
		"9>\5\n\6\2:>\5\"\22\2;>\5\f\7\2<>\5$\23\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2"+
		"\2=<\3\2\2\2>\t\3\2\2\2?@\7\4\2\2@A\5\f\7\2AB\7\5\2\2BE\5\6\4\2CD\7\6"+
		"\2\2DF\5\6\4\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\7\2\2H\13\3\2\2\2IJ\7"+
		"\b\2\2JK\5\f\7\2KL\7\t\2\2LR\3\2\2\2MR\5\26\f\2NR\5\34\17\2OP\7\26\2\2"+
		"PR\5\f\7\2QI\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2RS\3\2\2\2ST\5\16\b"+
		"\2T\r\3\2\2\2UZ\5\20\t\2VZ\5\22\n\2WZ\5\24\13\2XZ\3\2\2\2YU\3\2\2\2YV"+
		"\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\17\3\2\2\2[\\\7\25\2\2\\]\5\f\7\2]\21\3"+
		"\2\2\2^_\7\27\2\2_`\5\f\7\2`\23\3\2\2\2ab\7\n\2\2b\25\3\2\2\2ce\7\13\2"+
		"\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\5\30\r\2g\27\3\2\2\2hj\7\22\2\2ih\3"+
		"\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\31\3\2\2\2mn\t\2\2\2n\33\3\2\2\2"+
		"os\7\f\2\2pr\5\36\20\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2"+
		"\2us\3\2\2\2vy\7\f\2\2wy\5 \21\2xo\3\2\2\2xw\3\2\2\2y\35\3\2\2\2z}\5\32"+
		"\16\2{}\7\24\2\2|z\3\2\2\2|{\3\2\2\2}\37\3\2\2\2~\u0080\7\r\2\2\177~\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\u0083\7\23\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u008c\3\2\2\2\u0086\u0088\7\16\2\2\u0087\u0089\7\23\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"!\3\2\2\2\u008e\u0090\5\26\f\2\u008f\u0091\7\25\2\2\u0090\u008f\3\2\2"+
		"\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\17\2\2\u0093"+
		"\u0094\5\f\7\2\u0094#\3\2\2\2\u0095\u0096\7\20\2\2\u0096\u0097\5\f\7\2"+
		"\u0097%\3\2\2\2\u0098\u009c\7\21\2\2\u0099\u009b\5\36\20\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\'\3\2\2\2\u009e\u009c\3\2\2\2\24+/\66=EQYdksx|\177\u0084\u008a\u008c"+
		"\u0090\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}