// Generated from com/yolol/parser/yololParser.g4 by ANTLR 4.5

    package com.yolol.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class yololParserLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BREAK", "COMMENT", "STRING", "IF", "THEN", "ELSE", "END", "GOTO", "NOT", 
		"AND", "OR", "ABS", "SQRT", "SIN", "COS", "TAN", "ARCSIN", "ARCCOS", "ARCTAN", 
		"LBRACKET", "RBRACKET", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", 
		"NOTEQUAL", "EQUAL", "ASSIGN", "POW", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
		"MODULO", "FACTORIAL", "DOT", "COLON", "SPACE", "ALPHABETICAL", "NUMERICAL", 
		"INTERNALVARIABLE", "EXTERNALVARIABLE", "NUMBER", "A", "B", "C", "D", 
		"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
		"S", "T", "U", "V", "W", "X", "Y", "Z"
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


	public yololParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "yololParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0178\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\7\3\u0094\n\3\f\3\16\3\u0097\13\3\3\4\3\4\7\4\u009b\n\4\f\4\16"+
		"\4\u009e\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\5\25\u00ef\n\25\3\26\5\26\u00f2\n\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\6\'\u011b\n\'\r\'\16\'\u011c\3(\6(\u0120\n(\r(\16"+
		"(\u0121\3)\6)\u0125\n)\r)\16)\u0126\3*\3*\3*\7*\u012c\n*\f*\16*\u012f"+
		"\13*\3+\3+\3+\6+\u0134\n+\r+\16+\u0135\3,\6,\u0139\n,\r,\16,\u013a\3,"+
		"\3,\6,\u013f\n,\r,\16,\u0140\5,\u0143\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3"+
		"C\3D\3D\3E\3E\3F\3F\2\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S)U*W+Y\2[\2]\2_\2a\2"+
		"c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\3\2\37\3\2\f\f\4\2C\\c|\3\2\62;\4\2CCcc\4\2"+
		"DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4"+
		"\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUu"+
		"u\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u0169\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3\u008d"+
		"\3\2\2\2\5\u008f\3\2\2\2\7\u0098\3\2\2\2\t\u00a1\3\2\2\2\13\u00a4\3\2"+
		"\2\2\r\u00a9\3\2\2\2\17\u00ae\3\2\2\2\21\u00b2\3\2\2\2\23\u00b7\3\2\2"+
		"\2\25\u00bb\3\2\2\2\27\u00bf\3\2\2\2\31\u00c2\3\2\2\2\33\u00c6\3\2\2\2"+
		"\35\u00cb\3\2\2\2\37\u00cf\3\2\2\2!\u00d3\3\2\2\2#\u00d7\3\2\2\2%\u00de"+
		"\3\2\2\2\'\u00e5\3\2\2\2)\u00ec\3\2\2\2+\u00f1\3\2\2\2-\u00f5\3\2\2\2"+
		"/\u00f7\3\2\2\2\61\u00f9\3\2\2\2\63\u00fc\3\2\2\2\65\u00ff\3\2\2\2\67"+
		"\u0102\3\2\2\29\u0105\3\2\2\2;\u0107\3\2\2\2=\u0109\3\2\2\2?\u010b\3\2"+
		"\2\2A\u010d\3\2\2\2C\u010f\3\2\2\2E\u0111\3\2\2\2G\u0113\3\2\2\2I\u0115"+
		"\3\2\2\2K\u0117\3\2\2\2M\u011a\3\2\2\2O\u011f\3\2\2\2Q\u0124\3\2\2\2S"+
		"\u0128\3\2\2\2U\u0130\3\2\2\2W\u0138\3\2\2\2Y\u0144\3\2\2\2[\u0146\3\2"+
		"\2\2]\u0148\3\2\2\2_\u014a\3\2\2\2a\u014c\3\2\2\2c\u014e\3\2\2\2e\u0150"+
		"\3\2\2\2g\u0152\3\2\2\2i\u0154\3\2\2\2k\u0156\3\2\2\2m\u0158\3\2\2\2o"+
		"\u015a\3\2\2\2q\u015c\3\2\2\2s\u015e\3\2\2\2u\u0160\3\2\2\2w\u0162\3\2"+
		"\2\2y\u0164\3\2\2\2{\u0166\3\2\2\2}\u0168\3\2\2\2\177\u016a\3\2\2\2\u0081"+
		"\u016c\3\2\2\2\u0083\u016e\3\2\2\2\u0085\u0170\3\2\2\2\u0087\u0172\3\2"+
		"\2\2\u0089\u0174\3\2\2\2\u008b\u0176\3\2\2\2\u008d\u008e\7\f\2\2\u008e"+
		"\4\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7\61\2\2\u0091\u0095\3\2\2"+
		"\2\u0092\u0094\n\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\6\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009c\7$\2\2\u0099\u009b\n\2\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\7$\2\2\u00a0\b\3\2\2\2\u00a1\u00a2\5i\65\2"+
		"\u00a2\u00a3\5c\62\2\u00a3\n\3\2\2\2\u00a4\u00a5\5\177@\2\u00a5\u00a6"+
		"\5g\64\2\u00a6\u00a7\5a\61\2\u00a7\u00a8\5s:\2\u00a8\f\3\2\2\2\u00a9\u00aa"+
		"\5a\61\2\u00aa\u00ab\5o8\2\u00ab\u00ac\5}?\2\u00ac\u00ad\5a\61\2\u00ad"+
		"\16\3\2\2\2\u00ae\u00af\5a\61\2\u00af\u00b0\5s:\2\u00b0\u00b1\5_\60\2"+
		"\u00b1\20\3\2\2\2\u00b2\u00b3\5e\63\2\u00b3\u00b4\5u;\2\u00b4\u00b5\5"+
		"\177@\2\u00b5\u00b6\5u;\2\u00b6\22\3\2\2\2\u00b7\u00b8\5s:\2\u00b8\u00b9"+
		"\5u;\2\u00b9\u00ba\5\177@\2\u00ba\24\3\2\2\2\u00bb\u00bc\5Y-\2\u00bc\u00bd"+
		"\5s:\2\u00bd\u00be\5_\60\2\u00be\26\3\2\2\2\u00bf\u00c0\5u;\2\u00c0\u00c1"+
		"\5{>\2\u00c1\30\3\2\2\2\u00c2\u00c3\5Y-\2\u00c3\u00c4\5[.\2\u00c4\u00c5"+
		"\5}?\2\u00c5\32\3\2\2\2\u00c6\u00c7\5}?\2\u00c7\u00c8\5y=\2\u00c8\u00c9"+
		"\5{>\2\u00c9\u00ca\5\177@\2\u00ca\34\3\2\2\2\u00cb\u00cc\5}?\2\u00cc\u00cd"+
		"\5i\65\2\u00cd\u00ce\5s:\2\u00ce\36\3\2\2\2\u00cf\u00d0\5]/\2\u00d0\u00d1"+
		"\5u;\2\u00d1\u00d2\5}?\2\u00d2 \3\2\2\2\u00d3\u00d4\5\177@\2\u00d4\u00d5"+
		"\5Y-\2\u00d5\u00d6\5s:\2\u00d6\"\3\2\2\2\u00d7\u00d8\5Y-\2\u00d8\u00d9"+
		"\5{>\2\u00d9\u00da\5]/\2\u00da\u00db\5}?\2\u00db\u00dc\5i\65\2\u00dc\u00dd"+
		"\5s:\2\u00dd$\3\2\2\2\u00de\u00df\5Y-\2\u00df\u00e0\5{>\2\u00e0\u00e1"+
		"\5]/\2\u00e1\u00e2\5]/\2\u00e2\u00e3\5u;\2\u00e3\u00e4\5}?\2\u00e4&\3"+
		"\2\2\2\u00e5\u00e6\5Y-\2\u00e6\u00e7\5{>\2\u00e7\u00e8\5]/\2\u00e8\u00e9"+
		"\5\177@\2\u00e9\u00ea\5Y-\2\u00ea\u00eb\5s:\2\u00eb(\3\2\2\2\u00ec\u00ee"+
		"\7*\2\2\u00ed\u00ef\5M\'\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"*\3\2\2\2\u00f0\u00f2\5M\'\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4,\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6"+
		".\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8\60\3\2\2\2\u00f9\u00fa\7>\2\2\u00fa"+
		"\u00fb\7?\2\2\u00fb\62\3\2\2\2\u00fc\u00fd\7@\2\2\u00fd\u00fe\7?\2\2\u00fe"+
		"\64\3\2\2\2\u00ff\u0100\7#\2\2\u0100\u0101\7?\2\2\u0101\66\3\2\2\2\u0102"+
		"\u0103\7?\2\2\u0103\u0104\7?\2\2\u01048\3\2\2\2\u0105\u0106\7?\2\2\u0106"+
		":\3\2\2\2\u0107\u0108\7`\2\2\u0108<\3\2\2\2\u0109\u010a\7-\2\2\u010a>"+
		"\3\2\2\2\u010b\u010c\7/\2\2\u010c@\3\2\2\2\u010d\u010e\7,\2\2\u010eB\3"+
		"\2\2\2\u010f\u0110\7\61\2\2\u0110D\3\2\2\2\u0111\u0112\7\'\2\2\u0112F"+
		"\3\2\2\2\u0113\u0114\7#\2\2\u0114H\3\2\2\2\u0115\u0116\7\60\2\2\u0116"+
		"J\3\2\2\2\u0117\u0118\7<\2\2\u0118L\3\2\2\2\u0119\u011b\7\"\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011dN\3\2\2\2\u011e\u0120\t\3\2\2\u011f\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122P\3\2\2\2\u0123"+
		"\u0125\t\4\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127R\3\2\2\2\u0128\u012d\5O(\2\u0129\u012c"+
		"\5O(\2\u012a\u012c\5Q)\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012eT\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u0130\u0133\5K&\2\u0131\u0134\5O(\2\u0132\u0134\5"+
		"Q)\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136V\3\2\2\2\u0137\u0139\5Q)\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u0142\3\2\2\2\u013c\u013e\5I%\2\u013d\u013f\5Q)\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u013c\3\2\2\2\u0142\u0143\3\2\2\2\u0143X\3\2\2\2"+
		"\u0144\u0145\t\5\2\2\u0145Z\3\2\2\2\u0146\u0147\t\6\2\2\u0147\\\3\2\2"+
		"\2\u0148\u0149\t\7\2\2\u0149^\3\2\2\2\u014a\u014b\t\b\2\2\u014b`\3\2\2"+
		"\2\u014c\u014d\t\t\2\2\u014db\3\2\2\2\u014e\u014f\t\n\2\2\u014fd\3\2\2"+
		"\2\u0150\u0151\t\13\2\2\u0151f\3\2\2\2\u0152\u0153\t\f\2\2\u0153h\3\2"+
		"\2\2\u0154\u0155\t\r\2\2\u0155j\3\2\2\2\u0156\u0157\t\16\2\2\u0157l\3"+
		"\2\2\2\u0158\u0159\t\17\2\2\u0159n\3\2\2\2\u015a\u015b\t\20\2\2\u015b"+
		"p\3\2\2\2\u015c\u015d\t\21\2\2\u015dr\3\2\2\2\u015e\u015f\t\22\2\2\u015f"+
		"t\3\2\2\2\u0160\u0161\t\23\2\2\u0161v\3\2\2\2\u0162\u0163\t\24\2\2\u0163"+
		"x\3\2\2\2\u0164\u0165\t\25\2\2\u0165z\3\2\2\2\u0166\u0167\t\26\2\2\u0167"+
		"|\3\2\2\2\u0168\u0169\t\27\2\2\u0169~\3\2\2\2\u016a\u016b\t\30\2\2\u016b"+
		"\u0080\3\2\2\2\u016c\u016d\t\31\2\2\u016d\u0082\3\2\2\2\u016e\u016f\t"+
		"\32\2\2\u016f\u0084\3\2\2\2\u0170\u0171\t\33\2\2\u0171\u0086\3\2\2\2\u0172"+
		"\u0173\t\34\2\2\u0173\u0088\3\2\2\2\u0174\u0175\t\35\2\2\u0175\u008a\3"+
		"\2\2\2\u0176\u0177\t\36\2\2\u0177\u008c\3\2\2\2\21\2\u0095\u009c\u00ee"+
		"\u00f1\u011c\u0121\u0126\u012b\u012d\u0133\u0135\u013a\u0140\u0142\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}