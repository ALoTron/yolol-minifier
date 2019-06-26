// Generated from /home/mars/projects/yolol-minifier/src/main/java/parser/yololParser.g4 by ANTLR 4.7.2
package parser;
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BREAK", "COMMENT", "STRING", "IF", "THEN", "ELSE", "END", "GOTO", "NOT", 
			"AND", "OR", "ABS", "SQRT", "SIN", "COS", "TAN", "ARCSIN", "ARCCOS", 
			"ARCTAN", "LBRACKET", "RBRACKET", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", 
			"NOTEQUAL", "EQUAL", "ASSIGN", "POW", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
			"MODULO", "FACTORIAL", "DOT", "COLON", "SPACE", "ALPHABETICAL", "NUMERICAL", 
			"INTERNALVARIABLE", "EXTERNALVARIABLE", "NUMBER", "A", "B", "C", "D", 
			"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
			"S", "T", "U", "V", "W", "X", "Y", "Z"
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
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0173\b\1\4\2\t"+
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
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\6\'\u0116\n\'\r\'"+
		"\16\'\u0117\3(\6(\u011b\n(\r(\16(\u011c\3)\6)\u0120\n)\r)\16)\u0121\3"+
		"*\3*\3*\7*\u0127\n*\f*\16*\u012a\13*\3+\3+\3+\6+\u012f\n+\r+\16+\u0130"+
		"\3,\6,\u0134\n,\r,\16,\u0135\3,\3,\6,\u013a\n,\r,\16,\u013b\5,\u013e\n"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\2\2G\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O\2Q\2S)U*W+Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y"+
		"\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\3\2\37"+
		"\3\2\f\f\4\2C\\c|\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2"+
		"HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4"+
		"\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYy"+
		"y\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0162\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0098"+
		"\3\2\2\2\t\u00a1\3\2\2\2\13\u00a4\3\2\2\2\r\u00a9\3\2\2\2\17\u00ae\3\2"+
		"\2\2\21\u00b2\3\2\2\2\23\u00b7\3\2\2\2\25\u00bb\3\2\2\2\27\u00bf\3\2\2"+
		"\2\31\u00c2\3\2\2\2\33\u00c6\3\2\2\2\35\u00cb\3\2\2\2\37\u00cf\3\2\2\2"+
		"!\u00d3\3\2\2\2#\u00d7\3\2\2\2%\u00de\3\2\2\2\'\u00e5\3\2\2\2)\u00ec\3"+
		"\2\2\2+\u00ee\3\2\2\2-\u00f0\3\2\2\2/\u00f2\3\2\2\2\61\u00f4\3\2\2\2\63"+
		"\u00f7\3\2\2\2\65\u00fa\3\2\2\2\67\u00fd\3\2\2\29\u0100\3\2\2\2;\u0102"+
		"\3\2\2\2=\u0104\3\2\2\2?\u0106\3\2\2\2A\u0108\3\2\2\2C\u010a\3\2\2\2E"+
		"\u010c\3\2\2\2G\u010e\3\2\2\2I\u0110\3\2\2\2K\u0112\3\2\2\2M\u0115\3\2"+
		"\2\2O\u011a\3\2\2\2Q\u011f\3\2\2\2S\u0123\3\2\2\2U\u012b\3\2\2\2W\u0133"+
		"\3\2\2\2Y\u013f\3\2\2\2[\u0141\3\2\2\2]\u0143\3\2\2\2_\u0145\3\2\2\2a"+
		"\u0147\3\2\2\2c\u0149\3\2\2\2e\u014b\3\2\2\2g\u014d\3\2\2\2i\u014f\3\2"+
		"\2\2k\u0151\3\2\2\2m\u0153\3\2\2\2o\u0155\3\2\2\2q\u0157\3\2\2\2s\u0159"+
		"\3\2\2\2u\u015b\3\2\2\2w\u015d\3\2\2\2y\u015f\3\2\2\2{\u0161\3\2\2\2}"+
		"\u0163\3\2\2\2\177\u0165\3\2\2\2\u0081\u0167\3\2\2\2\u0083\u0169\3\2\2"+
		"\2\u0085\u016b\3\2\2\2\u0087\u016d\3\2\2\2\u0089\u016f\3\2\2\2\u008b\u0171"+
		"\3\2\2\2\u008d\u008e\7\f\2\2\u008e\4\3\2\2\2\u008f\u0090\7\61\2\2\u0090"+
		"\u0091\7\61\2\2\u0091\u0095\3\2\2\2\u0092\u0094\n\2\2\2\u0093\u0092\3"+
		"\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\6\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009c\7$\2\2\u0099\u009b\n\2\2\2"+
		"\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7$\2\2\u00a0"+
		"\b\3\2\2\2\u00a1\u00a2\5i\65\2\u00a2\u00a3\5c\62\2\u00a3\n\3\2\2\2\u00a4"+
		"\u00a5\5\177@\2\u00a5\u00a6\5g\64\2\u00a6\u00a7\5a\61\2\u00a7\u00a8\5"+
		"s:\2\u00a8\f\3\2\2\2\u00a9\u00aa\5a\61\2\u00aa\u00ab\5o8\2\u00ab\u00ac"+
		"\5}?\2\u00ac\u00ad\5a\61\2\u00ad\16\3\2\2\2\u00ae\u00af\5a\61\2\u00af"+
		"\u00b0\5s:\2\u00b0\u00b1\5_\60\2\u00b1\20\3\2\2\2\u00b2\u00b3\5e\63\2"+
		"\u00b3\u00b4\5u;\2\u00b4\u00b5\5\177@\2\u00b5\u00b6\5u;\2\u00b6\22\3\2"+
		"\2\2\u00b7\u00b8\5s:\2\u00b8\u00b9\5u;\2\u00b9\u00ba\5\177@\2\u00ba\24"+
		"\3\2\2\2\u00bb\u00bc\5Y-\2\u00bc\u00bd\5s:\2\u00bd\u00be\5_\60\2\u00be"+
		"\26\3\2\2\2\u00bf\u00c0\5u;\2\u00c0\u00c1\5{>\2\u00c1\30\3\2\2\2\u00c2"+
		"\u00c3\5Y-\2\u00c3\u00c4\5[.\2\u00c4\u00c5\5}?\2\u00c5\32\3\2\2\2\u00c6"+
		"\u00c7\5}?\2\u00c7\u00c8\5y=\2\u00c8\u00c9\5{>\2\u00c9\u00ca\5\177@\2"+
		"\u00ca\34\3\2\2\2\u00cb\u00cc\5}?\2\u00cc\u00cd\5i\65\2\u00cd\u00ce\5"+
		"s:\2\u00ce\36\3\2\2\2\u00cf\u00d0\5]/\2\u00d0\u00d1\5u;\2\u00d1\u00d2"+
		"\5}?\2\u00d2 \3\2\2\2\u00d3\u00d4\5\177@\2\u00d4\u00d5\5Y-\2\u00d5\u00d6"+
		"\5s:\2\u00d6\"\3\2\2\2\u00d7\u00d8\5Y-\2\u00d8\u00d9\5{>\2\u00d9\u00da"+
		"\5]/\2\u00da\u00db\5}?\2\u00db\u00dc\5i\65\2\u00dc\u00dd\5s:\2\u00dd$"+
		"\3\2\2\2\u00de\u00df\5Y-\2\u00df\u00e0\5{>\2\u00e0\u00e1\5]/\2\u00e1\u00e2"+
		"\5]/\2\u00e2\u00e3\5u;\2\u00e3\u00e4\5}?\2\u00e4&\3\2\2\2\u00e5\u00e6"+
		"\5Y-\2\u00e6\u00e7\5{>\2\u00e7\u00e8\5]/\2\u00e8\u00e9\5\177@\2\u00e9"+
		"\u00ea\5Y-\2\u00ea\u00eb\5s:\2\u00eb(\3\2\2\2\u00ec\u00ed\7*\2\2\u00ed"+
		"*\3\2\2\2\u00ee\u00ef\7+\2\2\u00ef,\3\2\2\2\u00f0\u00f1\7>\2\2\u00f1."+
		"\3\2\2\2\u00f2\u00f3\7@\2\2\u00f3\60\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5"+
		"\u00f6\7?\2\2\u00f6\62\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8\u00f9\7?\2\2\u00f9"+
		"\64\3\2\2\2\u00fa\u00fb\7#\2\2\u00fb\u00fc\7?\2\2\u00fc\66\3\2\2\2\u00fd"+
		"\u00fe\7?\2\2\u00fe\u00ff\7?\2\2\u00ff8\3\2\2\2\u0100\u0101\7?\2\2\u0101"+
		":\3\2\2\2\u0102\u0103\7`\2\2\u0103<\3\2\2\2\u0104\u0105\7-\2\2\u0105>"+
		"\3\2\2\2\u0106\u0107\7/\2\2\u0107@\3\2\2\2\u0108\u0109\7,\2\2\u0109B\3"+
		"\2\2\2\u010a\u010b\7\61\2\2\u010bD\3\2\2\2\u010c\u010d\7\'\2\2\u010dF"+
		"\3\2\2\2\u010e\u010f\7#\2\2\u010fH\3\2\2\2\u0110\u0111\7\60\2\2\u0111"+
		"J\3\2\2\2\u0112\u0113\7<\2\2\u0113L\3\2\2\2\u0114\u0116\7\"\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118N\3\2\2\2\u0119\u011b\t\3\2\2\u011a\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dP\3\2\2\2\u011e"+
		"\u0120\t\4\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122R\3\2\2\2\u0123\u0128\5O(\2\u0124\u0127"+
		"\5O(\2\u0125\u0127\5Q)\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129T\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012b\u012e\5K&\2\u012c\u012f\5O(\2\u012d\u012f\5"+
		"Q)\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131V\3\2\2\2\u0132\u0134\5Q)\2\u0133"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u013d\3\2\2\2\u0137\u0139\5I%\2\u0138\u013a\5Q)\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0137\3\2\2\2\u013d\u013e\3\2\2\2\u013eX\3\2\2\2"+
		"\u013f\u0140\t\5\2\2\u0140Z\3\2\2\2\u0141\u0142\t\6\2\2\u0142\\\3\2\2"+
		"\2\u0143\u0144\t\7\2\2\u0144^\3\2\2\2\u0145\u0146\t\b\2\2\u0146`\3\2\2"+
		"\2\u0147\u0148\t\t\2\2\u0148b\3\2\2\2\u0149\u014a\t\n\2\2\u014ad\3\2\2"+
		"\2\u014b\u014c\t\13\2\2\u014cf\3\2\2\2\u014d\u014e\t\f\2\2\u014eh\3\2"+
		"\2\2\u014f\u0150\t\r\2\2\u0150j\3\2\2\2\u0151\u0152\t\16\2\2\u0152l\3"+
		"\2\2\2\u0153\u0154\t\17\2\2\u0154n\3\2\2\2\u0155\u0156\t\20\2\2\u0156"+
		"p\3\2\2\2\u0157\u0158\t\21\2\2\u0158r\3\2\2\2\u0159\u015a\t\22\2\2\u015a"+
		"t\3\2\2\2\u015b\u015c\t\23\2\2\u015cv\3\2\2\2\u015d\u015e\t\24\2\2\u015e"+
		"x\3\2\2\2\u015f\u0160\t\25\2\2\u0160z\3\2\2\2\u0161\u0162\t\26\2\2\u0162"+
		"|\3\2\2\2\u0163\u0164\t\27\2\2\u0164~\3\2\2\2\u0165\u0166\t\30\2\2\u0166"+
		"\u0080\3\2\2\2\u0167\u0168\t\31\2\2\u0168\u0082\3\2\2\2\u0169\u016a\t"+
		"\32\2\2\u016a\u0084\3\2\2\2\u016b\u016c\t\33\2\2\u016c\u0086\3\2\2\2\u016d"+
		"\u016e\t\34\2\2\u016e\u0088\3\2\2\2\u016f\u0170\t\35\2\2\u0170\u008a\3"+
		"\2\2\2\u0171\u0172\t\36\2\2\u0172\u008c\3\2\2\2\17\2\u0095\u009c\u0117"+
		"\u011c\u0121\u0126\u0128\u012e\u0130\u0135\u013b\u013d\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}