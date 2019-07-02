// Generated from com/yok/parser/Yok.g4 by ANTLR 4.5

    package com.yok.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YokLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, STRING=2, BREAK=3, WHITESPACE=4, IF=5, THEN=6, ELSE=7, END=8, 
		GOTO=9, NOT=10, AND=11, OR=12, ABS=13, SQRT=14, SIN=15, COS=16, TAN=17, 
		ARCSIN=18, ARCCOS=19, ARCTAN=20, FAC=21, LBRACKET=22, RBRACKET=23, LCURLY=24, 
		RCURLY=25, LESS=26, GREATER=27, LESSEQUAL=28, GREATEREQUAL=29, NOTEQUAL=30, 
		EQUAL=31, ASSIGN=32, POW=33, PLUS=34, MINUS=35, MULTIPLY=36, DIVIDE=37, 
		MODULO=38, ADDASSIGN=39, SUBASSIGN=40, MULTITPLYASSIGN=41, DIVIDEASSIGN=42, 
		MODULOASSIGN=43, DOT=44, COLON=45, SEMICOLON=46, INTERNALVARIABLE=47, 
		EXTERNALVARIABLE=48, NUMBER=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "STRING", "BREAK", "WHITESPACE", "IF", "THEN", "ELSE", "END", 
		"GOTO", "NOT", "AND", "OR", "ABS", "SQRT", "SIN", "COS", "TAN", "ARCSIN", 
		"ARCCOS", "ARCTAN", "FAC", "LBRACKET", "RBRACKET", "LCURLY", "RCURLY", 
		"LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", "NOTEQUAL", "EQUAL", "ASSIGN", 
		"POW", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", "ADDASSIGN", "SUBASSIGN", 
		"MULTITPLYASSIGN", "DIVIDEASSIGN", "MODULOASSIGN", "DOT", "COLON", "SEMICOLON", 
		"ALPHABETICAL", "NUMERICAL", "INTERNALVARIABLE", "EXTERNALVARIABLE", "NUMBER", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'\\\\'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'('", 
		"')'", "'{'", "'}'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'='", 
		"'^'", "'+'", "'-'", "'*'", "'/'", "'%'", null, null, null, null, null, 
		"'.'", "':'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "STRING", "BREAK", "WHITESPACE", "IF", "THEN", "ELSE", 
		"END", "GOTO", "NOT", "AND", "OR", "ABS", "SQRT", "SIN", "COS", "TAN", 
		"ARCSIN", "ARCCOS", "ARCTAN", "FAC", "LBRACKET", "RBRACKET", "LCURLY", 
		"RCURLY", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", "NOTEQUAL", 
		"EQUAL", "ASSIGN", "POW", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", 
		"ADDASSIGN", "SUBASSIGN", "MULTITPLYASSIGN", "DIVIDEASSIGN", "MODULOASSIGN", 
		"DOT", "COLON", "SEMICOLON", "INTERNALVARIABLE", "EXTERNALVARIABLE", "NUMBER"
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


	public YokLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Yok.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u019e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\2\3\2\7\2\u00a2\n\2\f\2\16"+
		"\2\u00a5\13\2\3\2\3\2\5\2\u00a9\n\2\3\3\3\3\7\3\u00ad\n\3\f\3\16\3\u00b0"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3\60\6\60\u0146\n\60\r\60\16\60\u0147\3\61\6\61\u014b\n\61\r\61\16"+
		"\61\u014c\3\62\3\62\3\62\7\62\u0152\n\62\f\62\16\62\u0155\13\62\3\63\3"+
		"\63\3\63\6\63\u015a\n\63\r\63\16\63\u015b\3\64\6\64\u015f\n\64\r\64\16"+
		"\64\u0160\3\64\3\64\6\64\u0165\n\64\r\64\16\64\u0166\5\64\u0169\n\64\3"+
		"\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3"+
		"J\3J\3K\3K\3L\3L\3M\3M\3N\3N\4\u00a3\u00ae\2O\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\2a\2c\61e\62g\63i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2"+
		"\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091"+
		"\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\3\2 \3\2\f\f\4\2\13\f\"\"\4"+
		"\2C\\c|\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2II"+
		"ii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\u018d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3\u009d\3\2\2\2\5\u00aa\3\2\2"+
		"\2\7\u00b3\3\2\2\2\t\u00b6\3\2\2\2\13\u00ba\3\2\2\2\r\u00bd\3\2\2\2\17"+
		"\u00c2\3\2\2\2\21\u00c7\3\2\2\2\23\u00cb\3\2\2\2\25\u00d0\3\2\2\2\27\u00d4"+
		"\3\2\2\2\31\u00d8\3\2\2\2\33\u00db\3\2\2\2\35\u00df\3\2\2\2\37\u00e4\3"+
		"\2\2\2!\u00e8\3\2\2\2#\u00ec\3\2\2\2%\u00f0\3\2\2\2\'\u00f7\3\2\2\2)\u00fe"+
		"\3\2\2\2+\u0105\3\2\2\2-\u0109\3\2\2\2/\u010b\3\2\2\2\61\u010d\3\2\2\2"+
		"\63\u010f\3\2\2\2\65\u0111\3\2\2\2\67\u0113\3\2\2\29\u0115\3\2\2\2;\u0118"+
		"\3\2\2\2=\u011b\3\2\2\2?\u011e\3\2\2\2A\u0121\3\2\2\2C\u0123\3\2\2\2E"+
		"\u0125\3\2\2\2G\u0127\3\2\2\2I\u0129\3\2\2\2K\u012b\3\2\2\2M\u012d\3\2"+
		"\2\2O\u012f\3\2\2\2Q\u0132\3\2\2\2S\u0135\3\2\2\2U\u0138\3\2\2\2W\u013b"+
		"\3\2\2\2Y\u013e\3\2\2\2[\u0140\3\2\2\2]\u0142\3\2\2\2_\u0145\3\2\2\2a"+
		"\u014a\3\2\2\2c\u014e\3\2\2\2e\u0156\3\2\2\2g\u015e\3\2\2\2i\u016a\3\2"+
		"\2\2k\u016c\3\2\2\2m\u016e\3\2\2\2o\u0170\3\2\2\2q\u0172\3\2\2\2s\u0174"+
		"\3\2\2\2u\u0176\3\2\2\2w\u0178\3\2\2\2y\u017a\3\2\2\2{\u017c\3\2\2\2}"+
		"\u017e\3\2\2\2\177\u0180\3\2\2\2\u0081\u0182\3\2\2\2\u0083\u0184\3\2\2"+
		"\2\u0085\u0186\3\2\2\2\u0087\u0188\3\2\2\2\u0089\u018a\3\2\2\2\u008b\u018c"+
		"\3\2\2\2\u008d\u018e\3\2\2\2\u008f\u0190\3\2\2\2\u0091\u0192\3\2\2\2\u0093"+
		"\u0194\3\2\2\2\u0095\u0196\3\2\2\2\u0097\u0198\3\2\2\2\u0099\u019a\3\2"+
		"\2\2\u009b\u019c\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f\7\61\2\2\u009f"+
		"\u00a3\3\2\2\2\u00a0\u00a2\n\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a8\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a9\7\f\2\2\u00a7\u00a9\5\7\4\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\4\3\2\2\2\u00aa\u00ae\7$\2\2\u00ab\u00ad"+
		"\n\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7$"+
		"\2\2\u00b2\6\3\2\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b5\7^\2\2\u00b5\b\3\2"+
		"\2\2\u00b6\u00b7\t\3\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\5\2\2\u00b9"+
		"\n\3\2\2\2\u00ba\u00bb\5y=\2\u00bb\u00bc\5s:\2\u00bc\f\3\2\2\2\u00bd\u00be"+
		"\5\u008fH\2\u00be\u00bf\5w<\2\u00bf\u00c0\5q9\2\u00c0\u00c1\5\u0083B\2"+
		"\u00c1\16\3\2\2\2\u00c2\u00c3\5q9\2\u00c3\u00c4\5\177@\2\u00c4\u00c5\5"+
		"\u008dG\2\u00c5\u00c6\5q9\2\u00c6\20\3\2\2\2\u00c7\u00c8\5q9\2\u00c8\u00c9"+
		"\5\u0083B\2\u00c9\u00ca\5o8\2\u00ca\22\3\2\2\2\u00cb\u00cc\5u;\2\u00cc"+
		"\u00cd\5\u0085C\2\u00cd\u00ce\5\u008fH\2\u00ce\u00cf\5\u0085C\2\u00cf"+
		"\24\3\2\2\2\u00d0\u00d1\5\u0083B\2\u00d1\u00d2\5\u0085C\2\u00d2\u00d3"+
		"\5\u008fH\2\u00d3\26\3\2\2\2\u00d4\u00d5\5i\65\2\u00d5\u00d6\5\u0083B"+
		"\2\u00d6\u00d7\5o8\2\u00d7\30\3\2\2\2\u00d8\u00d9\5\u0085C\2\u00d9\u00da"+
		"\5\u008bF\2\u00da\32\3\2\2\2\u00db\u00dc\5i\65\2\u00dc\u00dd\5k\66\2\u00dd"+
		"\u00de\5\u008dG\2\u00de\34\3\2\2\2\u00df\u00e0\5\u008dG\2\u00e0\u00e1"+
		"\5\u0089E\2\u00e1\u00e2\5\u008bF\2\u00e2\u00e3\5\u008fH\2\u00e3\36\3\2"+
		"\2\2\u00e4\u00e5\5\u008dG\2\u00e5\u00e6\5y=\2\u00e6\u00e7\5\u0083B\2\u00e7"+
		" \3\2\2\2\u00e8\u00e9\5m\67\2\u00e9\u00ea\5\u0085C\2\u00ea\u00eb\5\u008d"+
		"G\2\u00eb\"\3\2\2\2\u00ec\u00ed\5\u008fH\2\u00ed\u00ee\5i\65\2\u00ee\u00ef"+
		"\5\u0083B\2\u00ef$\3\2\2\2\u00f0\u00f1\5i\65\2\u00f1\u00f2\5\u008bF\2"+
		"\u00f2\u00f3\5m\67\2\u00f3\u00f4\5\u008dG\2\u00f4\u00f5\5y=\2\u00f5\u00f6"+
		"\5\u0083B\2\u00f6&\3\2\2\2\u00f7\u00f8\5i\65\2\u00f8\u00f9\5\u008bF\2"+
		"\u00f9\u00fa\5m\67\2\u00fa\u00fb\5m\67\2\u00fb\u00fc\5\u0085C\2\u00fc"+
		"\u00fd\5\u008dG\2\u00fd(\3\2\2\2\u00fe\u00ff\5i\65\2\u00ff\u0100\5\u008b"+
		"F\2\u0100\u0101\5m\67\2\u0101\u0102\5\u008fH\2\u0102\u0103\5i\65\2\u0103"+
		"\u0104\5\u0083B\2\u0104*\3\2\2\2\u0105\u0106\5s:\2\u0106\u0107\5i\65\2"+
		"\u0107\u0108\5m\67\2\u0108,\3\2\2\2\u0109\u010a\7*\2\2\u010a.\3\2\2\2"+
		"\u010b\u010c\7+\2\2\u010c\60\3\2\2\2\u010d\u010e\7}\2\2\u010e\62\3\2\2"+
		"\2\u010f\u0110\7\177\2\2\u0110\64\3\2\2\2\u0111\u0112\7>\2\2\u0112\66"+
		"\3\2\2\2\u0113\u0114\7@\2\2\u01148\3\2\2\2\u0115\u0116\7>\2\2\u0116\u0117"+
		"\7?\2\2\u0117:\3\2\2\2\u0118\u0119\7@\2\2\u0119\u011a\7?\2\2\u011a<\3"+
		"\2\2\2\u011b\u011c\7#\2\2\u011c\u011d\7?\2\2\u011d>\3\2\2\2\u011e\u011f"+
		"\7?\2\2\u011f\u0120\7?\2\2\u0120@\3\2\2\2\u0121\u0122\7?\2\2\u0122B\3"+
		"\2\2\2\u0123\u0124\7`\2\2\u0124D\3\2\2\2\u0125\u0126\7-\2\2\u0126F\3\2"+
		"\2\2\u0127\u0128\7/\2\2\u0128H\3\2\2\2\u0129\u012a\7,\2\2\u012aJ\3\2\2"+
		"\2\u012b\u012c\7\61\2\2\u012cL\3\2\2\2\u012d\u012e\7\'\2\2\u012eN\3\2"+
		"\2\2\u012f\u0130\5E#\2\u0130\u0131\5A!\2\u0131P\3\2\2\2\u0132\u0133\5"+
		"G$\2\u0133\u0134\5A!\2\u0134R\3\2\2\2\u0135\u0136\5I%\2\u0136\u0137\5"+
		"A!\2\u0137T\3\2\2\2\u0138\u0139\5K&\2\u0139\u013a\5A!\2\u013aV\3\2\2\2"+
		"\u013b\u013c\5M\'\2\u013c\u013d\5A!\2\u013dX\3\2\2\2\u013e\u013f\7\60"+
		"\2\2\u013fZ\3\2\2\2\u0140\u0141\7<\2\2\u0141\\\3\2\2\2\u0142\u0143\7="+
		"\2\2\u0143^\3\2\2\2\u0144\u0146\t\4\2\2\u0145\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148`\3\2\2\2\u0149"+
		"\u014b\t\5\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014db\3\2\2\2\u014e\u0153\5_\60\2\u014f\u0152"+
		"\5_\60\2\u0150\u0152\5a\61\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154d\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0156\u0159\5[.\2\u0157\u015a\5_\60\2\u0158\u015a"+
		"\5a\61\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015cf\3\2\2\2\u015d\u015f\5a\61\2"+
		"\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0168\3\2\2\2\u0162\u0164\5Y-\2\u0163\u0165\5a\61\2\u0164"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u0169\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"h\3\2\2\2\u016a\u016b\t\6\2\2\u016bj\3\2\2\2\u016c\u016d\t\7\2\2\u016d"+
		"l\3\2\2\2\u016e\u016f\t\b\2\2\u016fn\3\2\2\2\u0170\u0171\t\t\2\2\u0171"+
		"p\3\2\2\2\u0172\u0173\t\n\2\2\u0173r\3\2\2\2\u0174\u0175\t\13\2\2\u0175"+
		"t\3\2\2\2\u0176\u0177\t\f\2\2\u0177v\3\2\2\2\u0178\u0179\t\r\2\2\u0179"+
		"x\3\2\2\2\u017a\u017b\t\16\2\2\u017bz\3\2\2\2\u017c\u017d\t\17\2\2\u017d"+
		"|\3\2\2\2\u017e\u017f\t\20\2\2\u017f~\3\2\2\2\u0180\u0181\t\21\2\2\u0181"+
		"\u0080\3\2\2\2\u0182\u0183\t\22\2\2\u0183\u0082\3\2\2\2\u0184\u0185\t"+
		"\23\2\2\u0185\u0084\3\2\2\2\u0186\u0187\t\24\2\2\u0187\u0086\3\2\2\2\u0188"+
		"\u0189\t\25\2\2\u0189\u0088\3\2\2\2\u018a\u018b\t\26\2\2\u018b\u008a\3"+
		"\2\2\2\u018c\u018d\t\27\2\2\u018d\u008c\3\2\2\2\u018e\u018f\t\30\2\2\u018f"+
		"\u008e\3\2\2\2\u0190\u0191\t\31\2\2\u0191\u0090\3\2\2\2\u0192\u0193\t"+
		"\32\2\2\u0193\u0092\3\2\2\2\u0194\u0195\t\33\2\2\u0195\u0094\3\2\2\2\u0196"+
		"\u0197\t\34\2\2\u0197\u0096\3\2\2\2\u0198\u0199\t\35\2\2\u0199\u0098\3"+
		"\2\2\2\u019a\u019b\t\36\2\2\u019b\u009a\3\2\2\2\u019c\u019d\t\37\2\2\u019d"+
		"\u009c\3\2\2\2\17\2\u00a3\u00a8\u00ae\u0147\u014c\u0151\u0153\u0159\u015b"+
		"\u0160\u0166\u0168\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}