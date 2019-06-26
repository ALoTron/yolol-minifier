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
		BREAK=1, COMMENT=2, STRING=3, IF=4, THEN=5, ELSE=6, END=7, GOTO=8, NOT=9, 
		AND=10, OR=11, ABS=12, SQRT=13, SIN=14, COS=15, TAN=16, ARCSIN=17, ARCCOS=18, 
		ARCTAN=19, LBRACKET=20, RBRACKET=21, LESS=22, GREATER=23, LESSEQUAL=24, 
		GREATEREQUAL=25, NOTEQUAL=26, EQUAL=27, ASSIGN=28, POW=29, PLUS=30, MINUS=31, 
		MULTIPLY=32, DIVIDE=33, MODULO=34, FACTORIAL=35, DOT=36, COLON=37, SPACE=38, 
		INTERNALVARIABLE=39, EXTERNALVARIABLE=40, NUMBER=41;
	public static final int
		RULE_chip = 0, RULE_line = 1, RULE_multipleStatements = 2, RULE_statement = 3, 
		RULE_ifStatement = 4, RULE_thenPart = 5, RULE_elsePart = 6, RULE_expression = 7, 
		RULE_value = 8, RULE_string = 9, RULE_internalVariable = 10, RULE_externalVariable = 11, 
		RULE_number = 12, RULE_increment = 13, RULE_decrement = 14, RULE_mathExpr = 15, 
		RULE_logicalExpression = 16, RULE_arithmeticalExpression = 17, RULE_primaryExpression = 18, 
		RULE_prefixOp = 19, RULE_arithmeticalOp = 20, RULE_logicalOp = 21, RULE_varAssignment = 22, 
		RULE_var = 23, RULE_gotoStat = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"chip", "line", "multipleStatements", "statement", "ifStatement", "thenPart", 
			"elsePart", "expression", "value", "string", "internalVariable", "externalVariable", 
			"number", "increment", "decrement", "mathExpr", "logicalExpression", 
			"arithmeticalExpression", "primaryExpression", "prefixOp", "arithmeticalOp", 
			"logicalOp", "varAssignment", "var", "gotoStat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\n'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'<'", "'>'", 
			"'<='", "'>='", "'!='", "'=='", "'='", "'^'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'!'", "'.'", "':'"
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
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode EOF() { return getToken(yololParserParser.EOF, 0); }
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
			setState(58);
			line();
			setState(59);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(61);
				match(SPACE);
				}
				break;
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << IF) | (1L << GOTO) | (1L << NOT) | (1L << ABS) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << TAN) | (1L << ARCSIN) | (1L << ARCCOS) | (1L << ARCTAN) | (1L << LBRACKET) | (1L << PLUS) | (1L << MINUS) | (1L << INTERNALVARIABLE) | (1L << EXTERNALVARIABLE) | (1L << NUMBER))) != 0)) {
				{
				setState(64);
				multipleStatements();
				}
			}

			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(67);
				match(SPACE);
				}
			}

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(70);
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
		public List<TerminalNode> LBRACKET() { return getTokens(yololParserParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(yololParserParser.LBRACKET, i);
		}
		public MultipleStatementsContext multipleStatements() {
			return getRuleContext(MultipleStatementsContext.class,0);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(yololParserParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(yololParserParser.RBRACKET, i);
		}
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(LBRACKET);
				setState(74);
				multipleStatements();
				setState(75);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(77);
					statement();
					}
					break;
				case 2:
					{
					setState(78);
					match(LBRACKET);
					setState(79);
					statement();
					setState(80);
					match(RBRACKET);
					}
					break;
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(90);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SPACE:
							{
							setState(84);
							match(SPACE);
							setState(85);
							statement();
							}
							break;
						case LBRACKET:
							{
							setState(86);
							match(LBRACKET);
							setState(87);
							statement();
							setState(88);
							match(RBRACKET);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				varAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
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
		public ThenPartContext thenPart() {
			return getRuleContext(ThenPartContext.class,0);
		}
		public TerminalNode END() { return getToken(yololParserParser.END, 0); }
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IF);
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(104);
				match(SPACE);
				setState(105);
				expression();
				setState(106);
				match(SPACE);
				}
				break;
			case LBRACKET:
				{
				setState(108);
				match(LBRACKET);
				setState(109);
				expression();
				setState(110);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114);
			thenPart();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(115);
				elsePart();
				}
			}

			setState(118);
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

	public static class ThenPartContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(yololParserParser.THEN, 0); }
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
		}
		public MultipleStatementsContext multipleStatements() {
			return getRuleContext(MultipleStatementsContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
		public ThenPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterThenPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitThenPart(this);
		}
	}

	public final ThenPartContext thenPart() throws RecognitionException {
		ThenPartContext _localctx = new ThenPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_thenPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(THEN);
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(121);
				match(SPACE);
				setState(122);
				multipleStatements();
				setState(123);
				match(SPACE);
				}
				break;
			case LBRACKET:
				{
				setState(125);
				match(LBRACKET);
				setState(126);
				multipleStatements();
				setState(127);
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

	public static class ElsePartContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(yololParserParser.ELSE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(yololParserParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(yololParserParser.SPACE, i);
		}
		public MultipleStatementsContext multipleStatements() {
			return getRuleContext(MultipleStatementsContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
		public ElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).enterElsePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yololParserListener ) ((yololParserListener)listener).exitElsePart(this);
		}
	}

	public final ElsePartContext elsePart() throws RecognitionException {
		ElsePartContext _localctx = new ElsePartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elsePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ELSE);
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(132);
				match(SPACE);
				setState(133);
				multipleStatements();
				setState(134);
				match(SPACE);
				}
				break;
			case LBRACKET:
				{
				setState(136);
				match(LBRACKET);
				setState(137);
				multipleStatements();
				setState(138);
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
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(LBRACKET);
				setState(143);
				match(SPACE);
				setState(144);
				expression();
				setState(145);
				match(SPACE);
				setState(146);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
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
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				internalVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				externalVariable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				increment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
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
		enterRule(_localctx, 18, RULE_string);
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
		enterRule(_localctx, 20, RULE_internalVariable);
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
		enterRule(_localctx, 22, RULE_externalVariable);
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
		enterRule(_localctx, 24, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
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
		public List<TerminalNode> PLUS() { return getTokens(yololParserParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(yololParserParser.PLUS, i);
		}
		public TerminalNode INTERNALVARIABLE() { return getToken(yololParserParser.INTERNALVARIABLE, 0); }
		public TerminalNode EXTERNALVARIABLE() { return getToken(yololParserParser.EXTERNALVARIABLE, 0); }
		public TerminalNode SPACE() { return getToken(yololParserParser.SPACE, 0); }
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
		enterRule(_localctx, 26, RULE_increment);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(PLUS);
				setState(172);
				match(PLUS);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(173);
					match(SPACE);
					}
				}

				setState(176);
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
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==INTERNALVARIABLE || _la==EXTERNALVARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(178);
					match(SPACE);
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
		public List<TerminalNode> MINUS() { return getTokens(yololParserParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(yololParserParser.MINUS, i);
		}
		public TerminalNode INTERNALVARIABLE() { return getToken(yololParserParser.INTERNALVARIABLE, 0); }
		public TerminalNode EXTERNALVARIABLE() { return getToken(yololParserParser.EXTERNALVARIABLE, 0); }
		public TerminalNode SPACE() { return getToken(yololParserParser.SPACE, 0); }
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
		enterRule(_localctx, 28, RULE_decrement);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(MINUS);
				setState(186);
				match(MINUS);
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
				setState(191);
				_la = _input.LA(1);
				if ( !(_la==INTERNALVARIABLE || _la==EXTERNALVARIABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(192);
					match(SPACE);
					}
				}

				setState(195);
				match(MINUS);
				setState(196);
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
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
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
		enterRule(_localctx, 30, RULE_mathExpr);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(LBRACKET);
				setState(200);
				mathExpr();
				setState(201);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
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
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
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
		enterRule(_localctx, 32, RULE_logicalExpression);
		int _la;
		try {
			int _alt;
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(LBRACKET);
				setState(207);
				logicalExpression();
				setState(208);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				arithmeticalExpression();
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(211);
							match(SPACE);
							}
						}

						setState(214);
						logicalOp();
						setState(216);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(215);
							match(SPACE);
							}
						}

						setState(218);
						arithmeticalExpression();
						}
						} 
					}
					setState(224);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public ArithmeticalExpressionContext arithmeticalExpression() {
			return getRuleContext(ArithmeticalExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
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
		enterRule(_localctx, 34, RULE_arithmeticalExpression);
		int _la;
		try {
			int _alt;
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(LBRACKET);
				setState(228);
				arithmeticalExpression();
				setState(229);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				primaryExpression(0);
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(233);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(232);
							match(SPACE);
							}
						}

						setState(235);
						arithmeticalOp();
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(236);
							match(SPACE);
							}
						}

						setState(239);
						primaryExpression(0);
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(yololParserParser.SPACE, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(249);
				match(LBRACKET);
				setState(250);
				primaryExpression(0);
				setState(251);
				match(RBRACKET);
				}
				break;
			case 2:
				{
				setState(253);
				value();
				}
				break;
			case 3:
				{
				setState(254);
				prefixOp();
				setState(261);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SPACE:
					{
					setState(255);
					match(SPACE);
					setState(256);
					primaryExpression(0);
					}
					break;
				case LBRACKET:
					{
					setState(257);
					match(LBRACKET);
					setState(258);
					mathExpr();
					setState(259);
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
				setState(263);
				match(LBRACKET);
				setState(264);
				mathExpr();
				setState(265);
				match(RBRACKET);
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(266);
					match(FACTORIAL);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
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
					setState(271);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SPACE) {
						{
						setState(272);
						match(SPACE);
						}
					}

					setState(275);
					match(FACTORIAL);
					}
					} 
				}
				setState(280);
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
		enterRule(_localctx, 38, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		enterRule(_localctx, 40, RULE_arithmeticalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		enterRule(_localctx, 42, RULE_logicalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		enterRule(_localctx, 44, RULE_varAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			var();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(288);
				match(SPACE);
				}
			}

			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POW) | (1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) {
				{
				setState(291);
				arithmeticalOp();
				}
			}

			setState(294);
			match(ASSIGN);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(295);
				match(SPACE);
				}
			}

			setState(298);
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
		enterRule(_localctx, 46, RULE_var);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERNALVARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				internalVariable();
				}
				break;
			case EXTERNALVARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
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
		public TerminalNode SPACE() { return getToken(yololParserParser.SPACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(yololParserParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(yololParserParser.RBRACKET, 0); }
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
		enterRule(_localctx, 48, RULE_gotoStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(GOTO);
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				{
				setState(305);
				match(SPACE);
				setState(306);
				expression();
				}
				break;
			case LBRACKET:
				{
				setState(307);
				match(LBRACKET);
				setState(308);
				expression();
				setState(309);
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
		case 18:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u013c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\2\3\3\5\3A\n"+
		"\3\3\3\5\3D\n\3\3\3\5\3G\n\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4U\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\5\4"+
		"b\n\4\3\5\3\5\3\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"s\n\6\3\6\3\6\5\6w\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0084\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0099\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a1"+
		"\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\5\16\u00aa\n\16\3\16\3\16\3\17\3\17"+
		"\3\17\5\17\u00b1\n\17\3\17\3\17\3\17\5\17\u00b6\n\17\3\17\3\17\5\17\u00ba"+
		"\n\17\3\20\3\20\3\20\5\20\u00bf\n\20\3\20\3\20\3\20\5\20\u00c4\n\20\3"+
		"\20\3\20\5\20\u00c8\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00cf\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00d7\n\22\3\22\3\22\5\22\u00db\n\22\3"+
		"\22\3\22\7\22\u00df\n\22\f\22\16\22\u00e2\13\22\5\22\u00e4\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u00ec\n\23\3\23\3\23\5\23\u00f0\n\23\3\23"+
		"\3\23\7\23\u00f4\n\23\f\23\16\23\u00f7\13\23\5\23\u00f9\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0108\n\24"+
		"\3\24\3\24\3\24\3\24\5\24\u010e\n\24\5\24\u0110\n\24\3\24\3\24\5\24\u0114"+
		"\n\24\3\24\7\24\u0117\n\24\f\24\16\24\u011a\13\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\5\30\u0124\n\30\3\30\5\30\u0127\n\30\3\30\3\30\5"+
		"\30\u012b\n\30\3\30\3\30\3\31\3\31\5\31\u0131\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u013a\n\32\3\32\2\3&\33\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\2\6\3\2)*\4\2\13\13\16\25\3\2\37$\3\2\30\35"+
		"\2\u0155\29\3\2\2\2\4@\3\2\2\2\6a\3\2\2\2\bg\3\2\2\2\ni\3\2\2\2\fz\3\2"+
		"\2\2\16\u0085\3\2\2\2\20\u0098\3\2\2\2\22\u00a0\3\2\2\2\24\u00a2\3\2\2"+
		"\2\26\u00a4\3\2\2\2\30\u00a6\3\2\2\2\32\u00a9\3\2\2\2\34\u00b9\3\2\2\2"+
		"\36\u00c7\3\2\2\2 \u00ce\3\2\2\2\"\u00e3\3\2\2\2$\u00f8\3\2\2\2&\u010f"+
		"\3\2\2\2(\u011b\3\2\2\2*\u011d\3\2\2\2,\u011f\3\2\2\2.\u0121\3\2\2\2\60"+
		"\u0130\3\2\2\2\62\u0132\3\2\2\2\64\65\5\4\3\2\65\66\7\3\2\2\668\3\2\2"+
		"\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<"+
		"=\5\4\3\2=>\7\2\2\3>\3\3\2\2\2?A\7(\2\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2"+
		"BD\5\6\4\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\7(\2\2FE\3\2\2\2FG\3\2\2\2"+
		"GI\3\2\2\2HJ\7\4\2\2IH\3\2\2\2IJ\3\2\2\2J\5\3\2\2\2KL\7\26\2\2LM\5\6\4"+
		"\2MN\7\27\2\2Nb\3\2\2\2OU\5\b\5\2PQ\7\26\2\2QR\5\b\5\2RS\7\27\2\2SU\3"+
		"\2\2\2TO\3\2\2\2TP\3\2\2\2U^\3\2\2\2VW\7(\2\2W]\5\b\5\2XY\7\26\2\2YZ\5"+
		"\b\5\2Z[\7\27\2\2[]\3\2\2\2\\V\3\2\2\2\\X\3\2\2\2]`\3\2\2\2^\\\3\2\2\2"+
		"^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aK\3\2\2\2aT\3\2\2\2b\7\3\2\2\2ch\5\n\6"+
		"\2dh\5.\30\2eh\5\20\t\2fh\5\62\32\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3"+
		"\2\2\2h\t\3\2\2\2ir\7\6\2\2jk\7(\2\2kl\5\20\t\2lm\7(\2\2ms\3\2\2\2no\7"+
		"\26\2\2op\5\20\t\2pq\7\27\2\2qs\3\2\2\2rj\3\2\2\2rn\3\2\2\2st\3\2\2\2"+
		"tv\5\f\7\2uw\5\16\b\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\t\2\2y\13\3\2"+
		"\2\2z\u0083\7\7\2\2{|\7(\2\2|}\5\6\4\2}~\7(\2\2~\u0084\3\2\2\2\177\u0080"+
		"\7\26\2\2\u0080\u0081\5\6\4\2\u0081\u0082\7\27\2\2\u0082\u0084\3\2\2\2"+
		"\u0083{\3\2\2\2\u0083\177\3\2\2\2\u0084\r\3\2\2\2\u0085\u008e\7\b\2\2"+
		"\u0086\u0087\7(\2\2\u0087\u0088\5\6\4\2\u0088\u0089\7(\2\2\u0089\u008f"+
		"\3\2\2\2\u008a\u008b\7\26\2\2\u008b\u008c\5\6\4\2\u008c\u008d\7\27\2\2"+
		"\u008d\u008f\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u008a\3\2\2\2\u008f\17"+
		"\3\2\2\2\u0090\u0091\7\26\2\2\u0091\u0092\7(\2\2\u0092\u0093\5\20\t\2"+
		"\u0093\u0094\7(\2\2\u0094\u0095\7\27\2\2\u0095\u0099\3\2\2\2\u0096\u0099"+
		"\5\22\n\2\u0097\u0099\5 \21\2\u0098\u0090\3\2\2\2\u0098\u0096\3\2\2\2"+
		"\u0098\u0097\3\2\2\2\u0099\21\3\2\2\2\u009a\u00a1\5\24\13\2\u009b\u00a1"+
		"\5\26\f\2\u009c\u00a1\5\30\r\2\u009d\u00a1\5\32\16\2\u009e\u00a1\5\34"+
		"\17\2\u009f\u00a1\5\36\20\2\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0"+
		"\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2"+
		"\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\7\5\2\2\u00a3\25\3\2\2\2\u00a4\u00a5"+
		"\7)\2\2\u00a5\27\3\2\2\2\u00a6\u00a7\7*\2\2\u00a7\31\3\2\2\2\u00a8\u00aa"+
		"\7!\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\7+\2\2\u00ac\33\3\2\2\2\u00ad\u00ae\7 \2\2\u00ae\u00b0\7 \2\2\u00af"+
		"\u00b1\7(\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00ba\t\2\2\2\u00b3\u00b5\t\2\2\2\u00b4\u00b6\7(\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7 "+
		"\2\2\u00b8\u00ba\7 \2\2\u00b9\u00ad\3\2\2\2\u00b9\u00b3\3\2\2\2\u00ba"+
		"\35\3\2\2\2\u00bb\u00bc\7!\2\2\u00bc\u00be\7!\2\2\u00bd\u00bf\7(\2\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c8\t\2"+
		"\2\2\u00c1\u00c3\t\2\2\2\u00c2\u00c4\7(\2\2\u00c3\u00c2\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7!\2\2\u00c6\u00c8\7!\2"+
		"\2\u00c7\u00bb\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8\37\3\2\2\2\u00c9\u00ca"+
		"\7\26\2\2\u00ca\u00cb\5 \21\2\u00cb\u00cc\7\27\2\2\u00cc\u00cf\3\2\2\2"+
		"\u00cd\u00cf\5\"\22\2\u00ce\u00c9\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf!\3"+
		"\2\2\2\u00d0\u00d1\7\26\2\2\u00d1\u00d2\5\"\22\2\u00d2\u00d3\7\27\2\2"+
		"\u00d3\u00e4\3\2\2\2\u00d4\u00e0\5$\23\2\u00d5\u00d7\7(\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\5,\27\2\u00d9"+
		"\u00db\7(\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\5$\23\2\u00dd\u00df\3\2\2\2\u00de\u00d6\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00d0\3\2\2\2\u00e3\u00d4\3\2\2\2\u00e4"+
		"#\3\2\2\2\u00e5\u00e6\7\26\2\2\u00e6\u00e7\5$\23\2\u00e7\u00e8\7\27\2"+
		"\2\u00e8\u00f9\3\2\2\2\u00e9\u00f5\5&\24\2\u00ea\u00ec\7(\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\5*\26\2\u00ee"+
		"\u00f0\7(\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\5&\24\2\u00f2\u00f4\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00e5\3\2\2\2\u00f8\u00e9\3\2\2\2\u00f9"+
		"%\3\2\2\2\u00fa\u00fb\b\24\1\2\u00fb\u00fc\7\26\2\2\u00fc\u00fd\5&\24"+
		"\2\u00fd\u00fe\7\27\2\2\u00fe\u0110\3\2\2\2\u00ff\u0110\5\22\n\2\u0100"+
		"\u0107\5(\25\2\u0101\u0102\7(\2\2\u0102\u0108\5&\24\2\u0103\u0104\7\26"+
		"\2\2\u0104\u0105\5 \21\2\u0105\u0106\7\27\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0101\3\2\2\2\u0107\u0103\3\2\2\2\u0108\u0110\3\2\2\2\u0109\u010a\7\26"+
		"\2\2\u010a\u010b\5 \21\2\u010b\u010d\7\27\2\2\u010c\u010e\7%\2\2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u00fa\3\2"+
		"\2\2\u010f\u00ff\3\2\2\2\u010f\u0100\3\2\2\2\u010f\u0109\3\2\2\2\u0110"+
		"\u0118\3\2\2\2\u0111\u0113\f\4\2\2\u0112\u0114\7(\2\2\u0113\u0112\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\7%\2\2\u0116"+
		"\u0111\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\'\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\t\3\2\2\u011c)\3"+
		"\2\2\2\u011d\u011e\t\4\2\2\u011e+\3\2\2\2\u011f\u0120\t\5\2\2\u0120-\3"+
		"\2\2\2\u0121\u0123\5\60\31\2\u0122\u0124\7(\2\2\u0123\u0122\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0127\5*\26\2\u0126\u0125\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\7\36\2\2\u0129"+
		"\u012b\7(\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012d\5\20\t\2\u012d/\3\2\2\2\u012e\u0131\5\26\f\2\u012f\u0131"+
		"\5\30\r\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\61\3\2\2\2\u0132"+
		"\u0139\7\n\2\2\u0133\u0134\7(\2\2\u0134\u013a\5\20\t\2\u0135\u0136\7\26"+
		"\2\2\u0136\u0137\5\20\t\2\u0137\u0138\7\27\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0133\3\2\2\2\u0139\u0135\3\2\2\2\u013a\63\3\2\2\2,9@CFIT\\^agrv\u0083"+
		"\u008e\u0098\u00a0\u00a9\u00b0\u00b5\u00b9\u00be\u00c3\u00c7\u00ce\u00d6"+
		"\u00da\u00e0\u00e3\u00eb\u00ef\u00f5\u00f8\u0107\u010d\u010f\u0113\u0118"+
		"\u0123\u0126\u012a\u0130\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}