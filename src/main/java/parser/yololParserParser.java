// Generated from /home/mars/projects/yolol-minifier/src/main/java/parser/yololParser.g4 by ANTLR 4.7.2
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
		BREAK=1, COMMENT=2, STRING=3, IF=4, THEN=5, ELSE=6, END=7, GOTO=8, ARITHMETICKEYWORD=9, 
		LBRACKET=10, RBRACKET=11, LOGICALOPERATOR=12, ASSIGN=13, PLUS=14, MINUS=15, 
		MULTIPLY=16, DIVIDE=17, MODULO=18, FACTORIAL=19, DOT=20, COLON=21, SPACE=22, 
		VARIABLE=23, NUMBER=24;
	public static final int
		RULE_chip = 0, RULE_line = 1, RULE_multipleStatements = 2, RULE_singleStatement = 3, 
		RULE_ifStatement = 4, RULE_expression = 5, RULE_expression_recursive = 6, 
		RULE_arithmeticOperation = 7, RULE_arithmeticOperator = 8, RULE_logicalOperation = 9, 
		RULE_logicalOperator = 10, RULE_factorialOperation = 11, RULE_literal = 12, 
		RULE_string = 13, RULE_number = 14, RULE_varAssignment = 15, RULE_gotoExpr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"chip", "line", "multipleStatements", "singleStatement", "ifStatement", 
			"expression", "expression_recursive", "arithmeticOperation", "arithmeticOperator", 
			"logicalOperation", "logicalOperator", "factorialOperation", "literal", 
			"string", "number", "varAssignment", "gotoExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", null, null, null, null, null, null, null, null, "'('", 
			"')'", null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'.'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "COMMENT", "STRING", "IF", "THEN", "ELSE", "END", "GOTO", 
			"ARITHMETICKEYWORD", "LBRACKET", "RBRACKET", "LOGICALOPERATOR", "ASSIGN", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "FACTORIAL", "DOT", 
			"COLON", "SPACE", "VARIABLE", "NUMBER"
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
		public TerminalNode EOF() { return getToken(yololParserParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(yololParserParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(yololParserParser.BREAK, i);
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
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					line();
					setState(35);
					match(BREAK);
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(42);
				line();
				}
				break;
			}
			setState(45);
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
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
		}
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
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(47);
				match(SPACE);
				}
				break;
			}
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << IF) | (1L << GOTO) | (1L << ARITHMETICKEYWORD) | (1L << LBRACKET) | (1L << MINUS) | (1L << VARIABLE) | (1L << NUMBER))) != 0)) {
				{
				setState(50);
				multipleStatements();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(53);
				match(SPACE);
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(56);
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
			setState(59);
			singleStatement();
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					match(SPACE);
					setState(61);
					singleStatement();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
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
			setState(73);
			match(IF);
			setState(74);
			match(SPACE);
			setState(75);
			expression();
			setState(76);
			match(SPACE);
			setState(77);
			match(THEN);
			setState(78);
			match(SPACE);
			setState(79);
			multipleStatements();
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(80);
				match(SPACE);
				setState(81);
				match(ELSE);
				setState(82);
				match(SPACE);
				setState(83);
				multipleStatements();
				}
				break;
			}
			setState(86);
			match(SPACE);
			setState(87);
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
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				{
				setState(89);
				match(LBRACKET);
				setState(90);
				expression();
				setState(91);
				match(RBRACKET);
				}
				break;
			case VARIABLE:
				{
				setState(93);
				match(VARIABLE);
				}
				break;
			case STRING:
			case MINUS:
			case NUMBER:
				{
				setState(94);
				literal();
				}
				break;
			case ARITHMETICKEYWORD:
				{
				setState(95);
				match(ARITHMETICKEYWORD);
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(96);
					match(SPACE);
					setState(97);
					expression();
					}
					break;
				case LBRACKET:
					{
					setState(98);
					match(LBRACKET);
					setState(99);
					expression();
					setState(100);
					match(RBRACKET);
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
			setState(106);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				arithmeticOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				logicalOperation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
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
			setState(114);
			arithmeticOperator();
			setState(115);
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
			setState(117);
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
			setState(119);
			logicalOperator();
			setState(120);
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
		public TerminalNode LOGICALOPERATOR() { return getToken(yololParserParser.LOGICALOPERATOR, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LOGICALOPERATOR);
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
			setState(124);
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
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				string();
				}
				break;
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
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
		public TerminalNode STRING() { return getToken(yololParserParser.STRING, 0); }
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
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		enterRule(_localctx, 28, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(132);
				match(MINUS);
				}
			}

			setState(135);
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
		public TerminalNode ASSIGN() { return getToken(yololParserParser.ASSIGN, 0); }
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
		enterRule(_localctx, 30, RULE_varAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(VARIABLE);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				setState(138);
				arithmeticOperator();
				}
			}

			setState(141);
			match(ASSIGN);
			setState(142);
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
		public TerminalNode SPACE() { return getToken(yololParserParser.SPACE, 0); }
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
		enterRule(_localctx, 32, RULE_gotoExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(GOTO);
			setState(145);
			match(SPACE);
			setState(146);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\5\2.\n\2\3\2\3\2\3\3\5\3\63\n"+
		"\3\3\3\5\3\66\n\3\3\3\5\39\n\3\3\3\5\3<\n\3\3\4\3\4\3\4\7\4A\n\4\f\4\16"+
		"\4D\13\4\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6W\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7i\n\7\5\7k\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bs\n\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u0083\n\16"+
		"\3\17\3\17\3\20\5\20\u0088\n\20\3\20\3\20\3\21\3\21\5\21\u008e\n\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\3\3\2\20\24\2\u009a\2)\3\2\2\2\4\62\3\2\2\2\6=\3"+
		"\2\2\2\bI\3\2\2\2\nK\3\2\2\2\fj\3\2\2\2\16r\3\2\2\2\20t\3\2\2\2\22w\3"+
		"\2\2\2\24y\3\2\2\2\26|\3\2\2\2\30~\3\2\2\2\32\u0082\3\2\2\2\34\u0084\3"+
		"\2\2\2\36\u0087\3\2\2\2 \u008b\3\2\2\2\"\u0092\3\2\2\2$%\5\4\3\2%&\7\3"+
		"\2\2&(\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*-\3\2\2\2+)\3"+
		"\2\2\2,.\5\4\3\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\2\2\3\60\3\3\2\2"+
		"\2\61\63\7\30\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\5\6"+
		"\4\2\65\64\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\679\7\30\2\28\67\3\2\2\2"+
		"89\3\2\2\29;\3\2\2\2:<\7\4\2\2;:\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=B\5\b\5"+
		"\2>?\7\30\2\2?A\5\b\5\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2"+
		"\2\2DB\3\2\2\2EJ\5\n\6\2FJ\5 \21\2GJ\5\f\7\2HJ\5\"\22\2IE\3\2\2\2IF\3"+
		"\2\2\2IG\3\2\2\2IH\3\2\2\2J\t\3\2\2\2KL\7\6\2\2LM\7\30\2\2MN\5\f\7\2N"+
		"O\7\30\2\2OP\7\7\2\2PQ\7\30\2\2QV\5\6\4\2RS\7\30\2\2ST\7\b\2\2TU\7\30"+
		"\2\2UW\5\6\4\2VR\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\30\2\2YZ\7\t\2\2Z\13"+
		"\3\2\2\2[\\\7\f\2\2\\]\5\f\7\2]^\7\r\2\2^k\3\2\2\2_k\7\31\2\2`k\5\32\16"+
		"\2ah\7\13\2\2bc\7\30\2\2ci\5\f\7\2de\7\f\2\2ef\5\f\7\2fg\7\r\2\2gi\3\2"+
		"\2\2hb\3\2\2\2hd\3\2\2\2ik\3\2\2\2j[\3\2\2\2j_\3\2\2\2j`\3\2\2\2ja\3\2"+
		"\2\2kl\3\2\2\2lm\5\16\b\2m\r\3\2\2\2ns\5\20\t\2os\5\24\13\2ps\5\30\r\2"+
		"qs\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\17\3\2\2\2tu\5\22"+
		"\n\2uv\5\f\7\2v\21\3\2\2\2wx\t\2\2\2x\23\3\2\2\2yz\5\26\f\2z{\5\f\7\2"+
		"{\25\3\2\2\2|}\7\16\2\2}\27\3\2\2\2~\177\7\25\2\2\177\31\3\2\2\2\u0080"+
		"\u0083\5\34\17\2\u0081\u0083\5\36\20\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\33\3\2\2\2\u0084\u0085\7\5\2\2\u0085\35\3\2\2\2\u0086\u0088"+
		"\7\21\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u008a\7\32\2\2\u008a\37\3\2\2\2\u008b\u008d\7\31\2\2\u008c\u008e"+
		"\5\22\n\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2"+
		"\u008f\u0090\7\17\2\2\u0090\u0091\5\f\7\2\u0091!\3\2\2\2\u0092\u0093\7"+
		"\n\2\2\u0093\u0094\7\30\2\2\u0094\u0095\5\f\7\2\u0095#\3\2\2\2\21)-\62"+
		"\658;BIVhjr\u0082\u0087\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}