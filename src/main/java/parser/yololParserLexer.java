// Generated from /home/alphacentauri/Projects/yolol-minifier/src/main/java/parser/yololParser.g4 by ANTLR 4.7.2
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
		GREATEREQUAL=25, NOTEQUAL=26, EQUAL=27, ASSIGN=28, PLUS=29, MINUS=30, 
		MULTIPLY=31, DIVIDE=32, MODULO=33, FACTORIAL=34, DOT=35, COLON=36, SPACE=37, 
		INTERNALVARIABLE=38, EXTERNALVARIABLE=39, NUMBER=40;
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
			"NOTEQUAL", "EQUAL", "ASSIGN", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
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
			"'>'", "'<='", "'>='", "'!='", "'=='", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'!'", "'.'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BREAK", "COMMENT", "STRING", "IF", "THEN", "ELSE", "END", "GOTO", 
			"NOT", "AND", "OR", "ABS", "SQRT", "SIN", "COS", "TAN", "ARCSIN", "ARCCOS", 
			"ARCTAN", "LBRACKET", "RBRACKET", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", 
			"NOTEQUAL", "EQUAL", "ASSIGN", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u016f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\7\3\u0092\n\3\f\3\16\3\u0095\13\3\3\4\3\4\7\4\u0099\n\4\f\4\16\4\u009c"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\6&\u0112\n&\r&\16&\u0113\3\'\6\'"+
		"\u0117\n\'\r\'\16\'\u0118\3(\6(\u011c\n(\r(\16(\u011d\3)\3)\3)\7)\u0123"+
		"\n)\f)\16)\u0126\13)\3*\3*\3*\6*\u012b\n*\r*\16*\u012c\3+\6+\u0130\n+"+
		"\r+\16+\u0131\3+\3+\6+\u0136\n+\r+\16+\u0137\5+\u013a\n+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\2\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q(S)U"+
		"*W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081"+
		"\2\u0083\2\u0085\2\u0087\2\u0089\2\3\2\37\3\2\f\f\4\2C\\c|\3\2\62;\4\2"+
		"CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4"+
		"\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTt"+
		"t\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2"+
		"\u015e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3\u008b"+
		"\3\2\2\2\5\u008d\3\2\2\2\7\u0096\3\2\2\2\t\u009f\3\2\2\2\13\u00a2\3\2"+
		"\2\2\r\u00a7\3\2\2\2\17\u00ac\3\2\2\2\21\u00b0\3\2\2\2\23\u00b5\3\2\2"+
		"\2\25\u00b9\3\2\2\2\27\u00bd\3\2\2\2\31\u00c0\3\2\2\2\33\u00c4\3\2\2\2"+
		"\35\u00c9\3\2\2\2\37\u00cd\3\2\2\2!\u00d1\3\2\2\2#\u00d5\3\2\2\2%\u00dc"+
		"\3\2\2\2\'\u00e3\3\2\2\2)\u00ea\3\2\2\2+\u00ec\3\2\2\2-\u00ee\3\2\2\2"+
		"/\u00f0\3\2\2\2\61\u00f2\3\2\2\2\63\u00f5\3\2\2\2\65\u00f8\3\2\2\2\67"+
		"\u00fb\3\2\2\29\u00fe\3\2\2\2;\u0100\3\2\2\2=\u0102\3\2\2\2?\u0104\3\2"+
		"\2\2A\u0106\3\2\2\2C\u0108\3\2\2\2E\u010a\3\2\2\2G\u010c\3\2\2\2I\u010e"+
		"\3\2\2\2K\u0111\3\2\2\2M\u0116\3\2\2\2O\u011b\3\2\2\2Q\u011f\3\2\2\2S"+
		"\u0127\3\2\2\2U\u012f\3\2\2\2W\u013b\3\2\2\2Y\u013d\3\2\2\2[\u013f\3\2"+
		"\2\2]\u0141\3\2\2\2_\u0143\3\2\2\2a\u0145\3\2\2\2c\u0147\3\2\2\2e\u0149"+
		"\3\2\2\2g\u014b\3\2\2\2i\u014d\3\2\2\2k\u014f\3\2\2\2m\u0151\3\2\2\2o"+
		"\u0153\3\2\2\2q\u0155\3\2\2\2s\u0157\3\2\2\2u\u0159\3\2\2\2w\u015b\3\2"+
		"\2\2y\u015d\3\2\2\2{\u015f\3\2\2\2}\u0161\3\2\2\2\177\u0163\3\2\2\2\u0081"+
		"\u0165\3\2\2\2\u0083\u0167\3\2\2\2\u0085\u0169\3\2\2\2\u0087\u016b\3\2"+
		"\2\2\u0089\u016d\3\2\2\2\u008b\u008c\7\f\2\2\u008c\4\3\2\2\2\u008d\u008e"+
		"\7\61\2\2\u008e\u008f\7\61\2\2\u008f\u0093\3\2\2\2\u0090\u0092\n\2\2\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\6\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u009a\7$\2\2\u0097"+
		"\u0099\n\2\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\7$\2\2\u009e\b\3\2\2\2\u009f\u00a0\5g\64\2\u00a0\u00a1\5a\61\2"+
		"\u00a1\n\3\2\2\2\u00a2\u00a3\5}?\2\u00a3\u00a4\5e\63\2\u00a4\u00a5\5_"+
		"\60\2\u00a5\u00a6\5q9\2\u00a6\f\3\2\2\2\u00a7\u00a8\5_\60\2\u00a8\u00a9"+
		"\5m\67\2\u00a9\u00aa\5{>\2\u00aa\u00ab\5_\60\2\u00ab\16\3\2\2\2\u00ac"+
		"\u00ad\5_\60\2\u00ad\u00ae\5q9\2\u00ae\u00af\5]/\2\u00af\20\3\2\2\2\u00b0"+
		"\u00b1\5c\62\2\u00b1\u00b2\5s:\2\u00b2\u00b3\5}?\2\u00b3\u00b4\5s:\2\u00b4"+
		"\22\3\2\2\2\u00b5\u00b6\5q9\2\u00b6\u00b7\5s:\2\u00b7\u00b8\5}?\2\u00b8"+
		"\24\3\2\2\2\u00b9\u00ba\5W,\2\u00ba\u00bb\5q9\2\u00bb\u00bc\5]/\2\u00bc"+
		"\26\3\2\2\2\u00bd\u00be\5s:\2\u00be\u00bf\5y=\2\u00bf\30\3\2\2\2\u00c0"+
		"\u00c1\5W,\2\u00c1\u00c2\5Y-\2\u00c2\u00c3\5{>\2\u00c3\32\3\2\2\2\u00c4"+
		"\u00c5\5{>\2\u00c5\u00c6\5w<\2\u00c6\u00c7\5y=\2\u00c7\u00c8\5}?\2\u00c8"+
		"\34\3\2\2\2\u00c9\u00ca\5{>\2\u00ca\u00cb\5g\64\2\u00cb\u00cc\5q9\2\u00cc"+
		"\36\3\2\2\2\u00cd\u00ce\5[.\2\u00ce\u00cf\5s:\2\u00cf\u00d0\5{>\2\u00d0"+
		" \3\2\2\2\u00d1\u00d2\5}?\2\u00d2\u00d3\5W,\2\u00d3\u00d4\5q9\2\u00d4"+
		"\"\3\2\2\2\u00d5\u00d6\5W,\2\u00d6\u00d7\5y=\2\u00d7\u00d8\5[.\2\u00d8"+
		"\u00d9\5{>\2\u00d9\u00da\5g\64\2\u00da\u00db\5q9\2\u00db$\3\2\2\2\u00dc"+
		"\u00dd\5W,\2\u00dd\u00de\5y=\2\u00de\u00df\5[.\2\u00df\u00e0\5[.\2\u00e0"+
		"\u00e1\5s:\2\u00e1\u00e2\5{>\2\u00e2&\3\2\2\2\u00e3\u00e4\5W,\2\u00e4"+
		"\u00e5\5y=\2\u00e5\u00e6\5[.\2\u00e6\u00e7\5}?\2\u00e7\u00e8\5W,\2\u00e8"+
		"\u00e9\5q9\2\u00e9(\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb*\3\2\2\2\u00ec\u00ed"+
		"\7+\2\2\u00ed,\3\2\2\2\u00ee\u00ef\7>\2\2\u00ef.\3\2\2\2\u00f0\u00f1\7"+
		"@\2\2\u00f1\60\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3\u00f4\7?\2\2\u00f4\62"+
		"\3\2\2\2\u00f5\u00f6\7@\2\2\u00f6\u00f7\7?\2\2\u00f7\64\3\2\2\2\u00f8"+
		"\u00f9\7#\2\2\u00f9\u00fa\7?\2\2\u00fa\66\3\2\2\2\u00fb\u00fc\7?\2\2\u00fc"+
		"\u00fd\7?\2\2\u00fd8\3\2\2\2\u00fe\u00ff\7?\2\2\u00ff:\3\2\2\2\u0100\u0101"+
		"\7-\2\2\u0101<\3\2\2\2\u0102\u0103\7/\2\2\u0103>\3\2\2\2\u0104\u0105\7"+
		",\2\2\u0105@\3\2\2\2\u0106\u0107\7\61\2\2\u0107B\3\2\2\2\u0108\u0109\7"+
		"\'\2\2\u0109D\3\2\2\2\u010a\u010b\7#\2\2\u010bF\3\2\2\2\u010c\u010d\7"+
		"\60\2\2\u010dH\3\2\2\2\u010e\u010f\7<\2\2\u010fJ\3\2\2\2\u0110\u0112\7"+
		"\"\2\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114L\3\2\2\2\u0115\u0117\t\3\2\2\u0116\u0115\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119N\3"+
		"\2\2\2\u011a\u011c\t\4\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eP\3\2\2\2\u011f\u0124\5M\'\2\u0120"+
		"\u0123\5M\'\2\u0121\u0123\5O(\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2"+
		"\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125R"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u012a\5I%\2\u0128\u012b\5M\'\2\u0129"+
		"\u012b\5O(\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2"+
		"\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012dT\3\2\2\2\u012e\u0130"+
		"\5O(\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0139\3\2\2\2\u0133\u0135\5G$\2\u0134\u0136\5O(\2"+
		"\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0133\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"V\3\2\2\2\u013b\u013c\t\5\2\2\u013cX\3\2\2\2\u013d\u013e\t\6\2\2\u013e"+
		"Z\3\2\2\2\u013f\u0140\t\7\2\2\u0140\\\3\2\2\2\u0141\u0142\t\b\2\2\u0142"+
		"^\3\2\2\2\u0143\u0144\t\t\2\2\u0144`\3\2\2\2\u0145\u0146\t\n\2\2\u0146"+
		"b\3\2\2\2\u0147\u0148\t\13\2\2\u0148d\3\2\2\2\u0149\u014a\t\f\2\2\u014a"+
		"f\3\2\2\2\u014b\u014c\t\r\2\2\u014ch\3\2\2\2\u014d\u014e\t\16\2\2\u014e"+
		"j\3\2\2\2\u014f\u0150\t\17\2\2\u0150l\3\2\2\2\u0151\u0152\t\20\2\2\u0152"+
		"n\3\2\2\2\u0153\u0154\t\21\2\2\u0154p\3\2\2\2\u0155\u0156\t\22\2\2\u0156"+
		"r\3\2\2\2\u0157\u0158\t\23\2\2\u0158t\3\2\2\2\u0159\u015a\t\24\2\2\u015a"+
		"v\3\2\2\2\u015b\u015c\t\25\2\2\u015cx\3\2\2\2\u015d\u015e\t\26\2\2\u015e"+
		"z\3\2\2\2\u015f\u0160\t\27\2\2\u0160|\3\2\2\2\u0161\u0162\t\30\2\2\u0162"+
		"~\3\2\2\2\u0163\u0164\t\31\2\2\u0164\u0080\3\2\2\2\u0165\u0166\t\32\2"+
		"\2\u0166\u0082\3\2\2\2\u0167\u0168\t\33\2\2\u0168\u0084\3\2\2\2\u0169"+
		"\u016a\t\34\2\2\u016a\u0086\3\2\2\2\u016b\u016c\t\35\2\2\u016c\u0088\3"+
		"\2\2\2\u016d\u016e\t\36\2\2\u016e\u008a\3\2\2\2\17\2\u0093\u009a\u0113"+
		"\u0118\u011d\u0122\u0124\u012a\u012c\u0131\u0137\u0139\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}