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
	private static String[] makeRuleNames() {
		return new String[] {
			"chip", "line", "multipleStatements", "statement", "ifStatement", "expression", 
			"value", "string", "internalVariable", "externalVariable", "number", 
			"increment", "decrement", "mathExpr", "logicalExpression", "arithmeticalExpression", 
			"primaryExpression", "prefixOp", "arithmeticalOp", "logicalOp", "varAssignment", 
			"var", "gotoStat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'('", "')'", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'=='", "'='", "'^'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'!'", "'.'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "COMMENT", "STRING", "IF", "THEN", "ELSE", "END", "GOTO", 
			"NOT", "AND", "OR", "ABS", "SQRT", "SIN", "COS", "TAN", "ARCSIN", "ARCCOS", 
			"ARCTAN", "LBRACKET", "RBRACKET", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", 
			"NOTEQUAL", "EQUAL", "ASSIGN", "POW", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"MODULO", "FACTORIAL", "DOT", "COLON", "SPACE", "INTERNALVARIABLE", "EXTERNALVARIABLE", 
			"NUMBER"
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(54);
				line();
				}
				break;
			}
			setState(57);
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(59);
				match(SPACE);
				}
				break;
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << IF) | (1L << GOTO) | (1L << NOT) | (1L << ABS) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << ARCSIN) | (1L << ARCCOS) | (1L << ARCTAN) | (1L << LBRACKET) | (1L << PLUS) | (1L << MINUS) | (1L << INTERNALVARIABLE) | (1L << EXTERNALVARIABLE) | (1L << NUMBER))) != 0)) {
				{
				setState(62);
				multipleStatements();
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(65);
				match(SPACE);
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(68);
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
			setState(71);
			statement();
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(72);
					match(SPACE);
					setState(73);
					statement();
					}
					} 
				}
				setState(78);
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
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
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
			setState(85);
			match(IF);
			setState(86);
			match(SPACE);
			setState(87);
			expression();
			setState(88);
			match(SPACE);
			setState(89);
			match(THEN);
			setState(90);
			match(SPACE);
			setState(91);
			multipleStatements();
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(92);
				match(SPACE);
				setState(93);
				match(ELSE);
				setState(94);
				match(SPACE);
				setState(95);
				multipleStatements();
				}
				break;
			}
			setState(98);
			match(SPACE);
			setState(99);
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
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(LBRACKET);
				setState(102);
				match(SPACE);
				setState(103);
				expression();
				setState(104);
				match(SPACE);
				setState(105);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
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
		public InternalVariableContext internalVariable() {
			return getRuleContext(InternalVariableContext.class,0);
		}
		public ExternalVariableContext externalVariable() {
			return getRuleContext(ExternalVariableContext.class,0);
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
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				internalVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				externalVariable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				increment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
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
		enterRule(_localctx, 14, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		public TerminalNode INTERNALVARIABLE() { return getToken(yololParserParser.INTERNALVARIABLE, 0); }
		public InternalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterInternalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitInternalVariable(this);
		}
	}

	public final InternalVariableContext internalVariable() throws RecognitionException {
		InternalVariableContext _localctx = new InternalVariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_internalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		public TerminalNode EXTERNALVARIABLE() { return getToken(yololParserParser.EXTERNALVARIABLE, 0); }
		public ExternalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterExternalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitExternalVariable(this);
		}
	}

	public final ExternalVariableContext externalVariable() throws RecognitionException {
		ExternalVariableContext _localctx = new ExternalVariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_externalVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		enterRule(_localctx, 20, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(125);
				match(MINUS);
				}
			}

			setState(128);
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
		public List<TerminalNode> PLUS() { return getTokens(yololParserParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(yololParserParser.PLUS, i);
		}
		public TerminalNode SPACE() { return getToken(yololParserParser.SPACE, 0); }
		public TerminalNode INTERNALVARIABLE() { return getToken(yololParserParser.INTERNALVARIABLE, 0); }
		public TerminalNode EXTERNALVARIABLE() { return getToken(yololParserParser.EXTERNALVARIABLE, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_increment);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(PLUS);
				setState(131);
				match(PLUS);
				setState(132);
				match(SPACE);
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==INTERNALVARIABLE || _la==EXTERNALVARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==INTERNALVARIABLE || _la==EXTERNALVARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				match(SPACE);
				setState(136);
				match(PLUS);
				setState(137);
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
		public List<TerminalNode> MINUS() { return getTokens(yololParserParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(yololParserParser.MINUS, i);
		}
		public TerminalNode SPACE() { return getToken(yololParserParser.SPACE, 0); }
		public TerminalNode INTERNALVARIABLE() { return getToken(yololParserParser.INTERNALVARIABLE, 0); }
		public TerminalNode EXTERNALVARIABLE() { return getToken(yololParserParser.EXTERNALVARIABLE, 0); }
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitDecrement(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decrement);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(MINUS);
				setState(141);
				match(MINUS);
				setState(142);
				match(SPACE);
				setState(143);
				_la = _input.LA(1);
				if ( !(_la==INTERNALVARIABLE || _la==EXTERNALVARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				_la = _input.LA(1);
				if ( !(_la==INTERNALVARIABLE || _la==EXTERNALVARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				match(SPACE);
				setState(146);
				match(MINUS);
				setState(147);
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
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitMathExpr(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mathExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logicalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			arithmeticalExpression();
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(153);
						match(SPACE);
						}
					}

					setState(156);
					logicalOp();
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(157);
						match(SPACE);
						}
					}

					setState(160);
					arithmeticalExpression();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
		}
		public ArithmeticalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterArithmeticalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitArithmeticalExpression(this);
		}
	}

	public final ArithmeticalExpressionContext arithmeticalExpression() throws RecognitionException {
		ArithmeticalExpressionContext _localctx = new ArithmeticalExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arithmeticalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			primaryExpression(0);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(168);
						match(SPACE);
						}
					}

					setState(171);
					arithmeticalOp();
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(172);
						match(SPACE);
						}
					}

					setState(175);
					primaryExpression(0);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
		public TerminalNode FACTORIAL() { return getToken(yololParserParser.FACTORIAL, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitPrimaryExpression(this);
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
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case PLUS:
			case MINUS:
			case INTERNALVARIABLE:
			case EXTERNALVARIABLE:
			case NUMBER:
				{
				setState(183);
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
				{
				setState(184);
				prefixOp();
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(185);
					match(SPACE);
					setState(186);
					primaryExpression(0);
					}
					break;
				case 2:
					{
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(187);
						match(SPACE);
						}
					}

					setState(190);
					match(LBRACKET);
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(191);
						match(SPACE);
						}
					}

					setState(194);
					mathExpr();
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(195);
						match(SPACE);
						}
					}

					setState(198);
					match(RBRACKET);
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(199);
						match(SPACE);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case LBRACKET:
				{
				setState(204);
				match(LBRACKET);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(205);
					match(SPACE);
					}
				}

				setState(208);
				mathExpr();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(209);
					match(SPACE);
					}
				}

				setState(212);
				match(RBRACKET);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(213);
					match(SPACE);
					}
				}

				setState(216);
				match(FACTORIAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
					setState(220);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(221);
						match(SPACE);
						}
					}

					setState(224);
					match(FACTORIAL);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public TerminalNode NOT() { return getToken(yololParserParser.NOT, 0); }
		public TerminalNode ABS() { return getToken(yololParserParser.ABS, 0); }
		public TerminalNode SQRT() { return getToken(yololParserParser.SQRT, 0); }
		public TerminalNode SIN() { return getToken(yololParserParser.SIN, 0); }
		public TerminalNode COS() { return getToken(yololParserParser.COS, 0); }
		public TerminalNode TAN() { return getToken(yololParserParser.TAN, 0); }
		public TerminalNode ARCSIN() { return getToken(yololParserParser.ARCSIN, 0); }
		public TerminalNode ARCCOS() { return getToken(yololParserParser.ARCCOS, 0); }
		public TerminalNode ARCTAN() { return getToken(yololParserParser.ARCTAN, 0); }
		public PrefixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterPrefixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitPrefixOp(this);
		}
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << ABS) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << ARCSIN) | (1L << ARCCOS) | (1L << ARCTAN))) != 0)) ) {
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

	public static class ArithmeticalOpContext extends ParserRuleContext {
		public TerminalNode POW() { return getToken(yololParserParser.POW, 0); }
		public TerminalNode PLUS() { return getToken(yololParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(yololParserParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(yololParserParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(yololParserParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(yololParserParser.MODULO, 0); }
		public ArithmeticalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterArithmeticalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitArithmeticalOp(this);
		}
	}

	public final ArithmeticalOpContext arithmeticalOp() throws RecognitionException {
		ArithmeticalOpContext _localctx = new ArithmeticalOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arithmeticalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POW) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
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

	public static class LogicalOpContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(yololParserParser.LESS, 0); }
		public TerminalNode LESSEQUAL() { return getToken(yololParserParser.LESSEQUAL, 0); }
		public TerminalNode GREATER() { return getToken(yololParserParser.GREATER, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(yololParserParser.GREATEREQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(yololParserParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(yololParserParser.EQUAL, 0); }
		public LogicalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterLogicalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitLogicalOp(this);
		}
	}

	public final LogicalOpContext logicalOp() throws RecognitionException {
		LogicalOpContext _localctx = new LogicalOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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

	public static class VarAssignmentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(yololParserParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
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
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitVarAssignment(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			var();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(237);
				match(SPACE);
				}
			}

			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POW) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				setState(240);
				arithmeticalOp();
				}
			}

			setState(243);
			match(ASSIGN);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(244);
				match(SPACE);
				}
			}

			setState(247);
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
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERNALVARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				internalVariable();
				}
				break;
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
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
		public TerminalNode GOTO() { return getToken(yololParserParser.GOTO, 0); }
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public GotoStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterGotoStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitGotoStat(this);
		}
	}

	public final GotoStatContext gotoStat() throws RecognitionException {
		GotoStatContext _localctx = new GotoStatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_gotoStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(GOTO);
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(254);
				match(SPACE);
				setState(255);
				expression();
				}
				break;
			case 2:
				{
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(256);
					match(SPACE);
					}
				}

				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(259);
					match(LBRACKET);
					}
					break;
				}
				setState(262);
				expression();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(263);
					match(SPACE);
					}
				}

				setState(266);
				match(RBRACKET);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\5\2:\n\2\3\2\3\2\3\3\5\3?\n\3\3\3\5"+
		"\3B\n\3\3\3\5\3E\n\3\3\3\5\3H\n\3\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4"+
		"\3\5\3\5\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6c\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\bx\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\5\f\u0081\n\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\20\3\20\5\20\u009d"+
		"\n\20\3\20\3\20\5\20\u00a1\n\20\3\20\3\20\7\20\u00a5\n\20\f\20\16\20\u00a8"+
		"\13\20\3\21\3\21\5\21\u00ac\n\21\3\21\3\21\5\21\u00b0\n\21\3\21\3\21\7"+
		"\21\u00b4\n\21\f\21\16\21\u00b7\13\21\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00bf\n\22\3\22\3\22\5\22\u00c3\n\22\3\22\3\22\5\22\u00c7\n\22\3\22"+
		"\3\22\5\22\u00cb\n\22\5\22\u00cd\n\22\3\22\3\22\5\22\u00d1\n\22\3\22\3"+
		"\22\5\22\u00d5\n\22\3\22\3\22\5\22\u00d9\n\22\3\22\3\22\5\22\u00dd\n\22"+
		"\3\22\3\22\5\22\u00e1\n\22\3\22\7\22\u00e4\n\22\f\22\16\22\u00e7\13\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u00f1\n\26\3\26\5\26\u00f4"+
		"\n\26\3\26\3\26\5\26\u00f8\n\26\3\26\3\26\3\27\3\27\5\27\u00fe\n\27\3"+
		"\30\3\30\3\30\3\30\5\30\u0104\n\30\3\30\5\30\u0107\n\30\3\30\3\30\5\30"+
		"\u010b\n\30\3\30\3\30\5\30\u010f\n\30\3\30\2\3\"\31\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\2\6\3\2)*\4\2\13\13\16\25\3\2\37$\3\2\30"+
		"\35\2\u0128\2\65\3\2\2\2\4>\3\2\2\2\6I\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2\f"+
		"o\3\2\2\2\16w\3\2\2\2\20y\3\2\2\2\22{\3\2\2\2\24}\3\2\2\2\26\u0080\3\2"+
		"\2\2\30\u008c\3\2\2\2\32\u0096\3\2\2\2\34\u0098\3\2\2\2\36\u009a\3\2\2"+
		"\2 \u00a9\3\2\2\2\"\u00dc\3\2\2\2$\u00e8\3\2\2\2&\u00ea\3\2\2\2(\u00ec"+
		"\3\2\2\2*\u00ee\3\2\2\2,\u00fd\3\2\2\2.\u00ff\3\2\2\2\60\61\5\4\3\2\61"+
		"\62\7\3\2\2\62\64\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65"+
		"\66\3\2\2\2\669\3\2\2\2\67\65\3\2\2\28:\5\4\3\298\3\2\2\29:\3\2\2\2:;"+
		"\3\2\2\2;<\7\2\2\3<\3\3\2\2\2=?\7(\2\2>=\3\2\2\2>?\3\2\2\2?A\3\2\2\2@"+
		"B\5\6\4\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\7(\2\2DC\3\2\2\2DE\3\2\2\2E"+
		"G\3\2\2\2FH\7\4\2\2GF\3\2\2\2GH\3\2\2\2H\5\3\2\2\2IN\5\b\5\2JK\7(\2\2"+
		"KM\5\b\5\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\7\3\2\2\2PN\3\2\2"+
		"\2QV\5\n\6\2RV\5*\26\2SV\5\f\7\2TV\5.\30\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2"+
		"\2UT\3\2\2\2V\t\3\2\2\2WX\7\6\2\2XY\7(\2\2YZ\5\f\7\2Z[\7(\2\2[\\\7\7\2"+
		"\2\\]\7(\2\2]b\5\6\4\2^_\7(\2\2_`\7\b\2\2`a\7(\2\2ac\5\6\4\2b^\3\2\2\2"+
		"bc\3\2\2\2cd\3\2\2\2de\7(\2\2ef\7\t\2\2f\13\3\2\2\2gh\7\26\2\2hi\7(\2"+
		"\2ij\5\f\7\2jk\7(\2\2kl\7\27\2\2lp\3\2\2\2mp\5\16\b\2np\5\34\17\2og\3"+
		"\2\2\2om\3\2\2\2on\3\2\2\2p\r\3\2\2\2qx\5\20\t\2rx\5\22\n\2sx\5\24\13"+
		"\2tx\5\26\f\2ux\5\30\r\2vx\5\32\16\2wq\3\2\2\2wr\3\2\2\2ws\3\2\2\2wt\3"+
		"\2\2\2wu\3\2\2\2wv\3\2\2\2x\17\3\2\2\2yz\7\5\2\2z\21\3\2\2\2{|\7)\2\2"+
		"|\23\3\2\2\2}~\7*\2\2~\25\3\2\2\2\177\u0081\7!\2\2\u0080\177\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7+\2\2\u0083\27\3\2\2\2"+
		"\u0084\u0085\7 \2\2\u0085\u0086\7 \2\2\u0086\u0087\7(\2\2\u0087\u008d"+
		"\t\2\2\2\u0088\u0089\t\2\2\2\u0089\u008a\7(\2\2\u008a\u008b\7 \2\2\u008b"+
		"\u008d\7 \2\2\u008c\u0084\3\2\2\2\u008c\u0088\3\2\2\2\u008d\31\3\2\2\2"+
		"\u008e\u008f\7!\2\2\u008f\u0090\7!\2\2\u0090\u0091\7(\2\2\u0091\u0097"+
		"\t\2\2\2\u0092\u0093\t\2\2\2\u0093\u0094\7(\2\2\u0094\u0095\7!\2\2\u0095"+
		"\u0097\7!\2\2\u0096\u008e\3\2\2\2\u0096\u0092\3\2\2\2\u0097\33\3\2\2\2"+
		"\u0098\u0099\5\36\20\2\u0099\35\3\2\2\2\u009a\u00a6\5 \21\2\u009b\u009d"+
		"\7(\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a0\5(\25\2\u009f\u00a1\7(\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u009c\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\37\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00b5\5\"\22\2\u00aa\u00ac"+
		"\7(\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00af\5&\24\2\u00ae\u00b0\7(\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5\"\22\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00ab\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6!\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\b\22\1\2\u00b9\u00dd"+
		"\5\16\b\2\u00ba\u00cc\5$\23\2\u00bb\u00bc\7(\2\2\u00bc\u00cd\5\"\22\2"+
		"\u00bd\u00bf\7(\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\7\26\2\2\u00c1\u00c3\7(\2\2\u00c2\u00c1\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\5\34\17\2\u00c5\u00c7\7"+
		"(\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\7\27\2\2\u00c9\u00cb\7(\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00bb\3\2\2\2\u00cc\u00be\3\2\2\2\u00cd"+
		"\u00dd\3\2\2\2\u00ce\u00d0\7\26\2\2\u00cf\u00d1\7(\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\5\34\17\2\u00d3"+
		"\u00d5\7(\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d8\7\27\2\2\u00d7\u00d9\7(\2\2\u00d8\u00d7\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7%\2\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00b8\3\2\2\2\u00dc\u00ba\3\2\2\2\u00dc\u00ce\3\2\2\2\u00dd"+
		"\u00e5\3\2\2\2\u00de\u00e0\f\4\2\2\u00df\u00e1\7(\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\7%\2\2\u00e3"+
		"\u00de\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6#\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\t\3\2\2\u00e9%\3\2"+
		"\2\2\u00ea\u00eb\t\4\2\2\u00eb\'\3\2\2\2\u00ec\u00ed\t\5\2\2\u00ed)\3"+
		"\2\2\2\u00ee\u00f0\5,\27\2\u00ef\u00f1\7(\2\2\u00f0\u00ef\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\5&\24\2\u00f3\u00f2\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\7\36\2\2\u00f6"+
		"\u00f8\7(\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fa\5\f\7\2\u00fa+\3\2\2\2\u00fb\u00fe\5\22\n\2\u00fc\u00fe"+
		"\5\24\13\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe-\3\2\2\2\u00ff"+
		"\u010e\7\n\2\2\u0100\u0101\7(\2\2\u0101\u010f\5\f\7\2\u0102\u0104\7(\2"+
		"\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107"+
		"\7\26\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u010a\5\f\7\2\u0109\u010b\7(\2\2\u010a\u0109\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7\27\2\2\u010d\u010f\3\2\2\2"+
		"\u010e\u0100\3\2\2\2\u010e\u0103\3\2\2\2\u010f/\3\2\2\2)\659>ADGNUbow"+
		"\u0080\u008c\u0096\u009c\u00a0\u00a6\u00ab\u00af\u00b5\u00be\u00c2\u00c6"+
		"\u00ca\u00cc\u00d0\u00d4\u00d8\u00dc\u00e0\u00e5\u00f0\u00f3\u00f7\u00fd"+
		"\u0103\u0106\u010a\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}