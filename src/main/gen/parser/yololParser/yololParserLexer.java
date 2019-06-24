// Generated from ./yololParser.g4 by ANTLR 4.7.2
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
		T__0=1, T__1=2, T__2=3, BREAK=4, STRING=5, IF=6, THEN=7, ELSE=8, END=9, 
		GOTO=10, ARITHMETICKEYWORD=11, LESS=12, GREATER=13, LESSEQUAL=14, GREATEREQUAL=15, 
		NOTEQUAL=16, EQUAL=17, PLUS=18, MINUS=19, MULTIPLY=20, DIVIDE=21, MODULO=22, 
		FACTORIAL=23, DOT=24, COLON=25, COMMENT=26, SPACE=27, VARIABLE=28, NUMBER=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "BREAK", "STRING", "IF", "THEN", "ELSE", "END", 
			"GOTO", "ABS", "SQRT", "SIN", "COS", "TAN", "ARCSIN", "ARCCOS", "ARCTAN", 
			"ARITHMETICKEYWORD", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", 
			"NOTEQUAL", "EQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MODULO", 
			"FACTORIAL", "DOT", "COLON", "COMMENT", "SPACE", "ALPHABETICAL", "NUMERICAL", 
			"INTERNALVARIABLE", "EXTERNALVARIABLE", "VARIABLE", "NUMBER", "A", "B", 
			"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0170\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e3\n\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3#\3#\7#\u0109\n#\f#\16#\u010c\13#\3$\6$\u010f\n$\r$\16$\u0110\3%\6"+
		"%\u0114\n%\r%\16%\u0115\3&\6&\u0119\n&\r&\16&\u011a\3\'\3\'\3\'\7\'\u0120"+
		"\n\'\f\'\16\'\u0123\13\'\3(\3(\3(\6(\u0128\n(\r(\16(\u0129\3)\3)\5)\u012e"+
		"\n)\3*\6*\u0131\n*\r*\16*\u0132\3*\3*\6*\u0137\n*\r*\16*\u0138\5*\u013b"+
		"\n*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\4\u0095\u010a\2E"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\r)\16+\17-\20/\21\61\22\63\23\65\24\67\259\26;\27=\30?\31"+
		"A\32C\33E\34G\35I\2K\2M\2O\2Q\36S\37U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2"+
		"k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\3"+
		"\2\37\3\2\f\f\4\2C\\c|\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGg"+
		"g\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2"+
		"PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4"+
		"\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u015d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3\u0089\3\2\2\2\5\u008b\3\2\2\2\7"+
		"\u008d\3\2\2\2\t\u008f\3\2\2\2\13\u0091\3\2\2\2\r\u009a\3\2\2\2\17\u009d"+
		"\3\2\2\2\21\u00a2\3\2\2\2\23\u00a7\3\2\2\2\25\u00ab\3\2\2\2\27\u00b0\3"+
		"\2\2\2\31\u00b4\3\2\2\2\33\u00b9\3\2\2\2\35\u00bd\3\2\2\2\37\u00c1\3\2"+
		"\2\2!\u00c5\3\2\2\2#\u00cc\3\2\2\2%\u00d3\3\2\2\2\'\u00e2\3\2\2\2)\u00e4"+
		"\3\2\2\2+\u00e6\3\2\2\2-\u00e8\3\2\2\2/\u00eb\3\2\2\2\61\u00ee\3\2\2\2"+
		"\63\u00f1\3\2\2\2\65\u00f4\3\2\2\2\67\u00f6\3\2\2\29\u00f8\3\2\2\2;\u00fa"+
		"\3\2\2\2=\u00fc\3\2\2\2?\u00fe\3\2\2\2A\u0100\3\2\2\2C\u0102\3\2\2\2E"+
		"\u0104\3\2\2\2G\u010e\3\2\2\2I\u0113\3\2\2\2K\u0118\3\2\2\2M\u011c\3\2"+
		"\2\2O\u0124\3\2\2\2Q\u012d\3\2\2\2S\u0130\3\2\2\2U\u013c\3\2\2\2W\u013e"+
		"\3\2\2\2Y\u0140\3\2\2\2[\u0142\3\2\2\2]\u0144\3\2\2\2_\u0146\3\2\2\2a"+
		"\u0148\3\2\2\2c\u014a\3\2\2\2e\u014c\3\2\2\2g\u014e\3\2\2\2i\u0150\3\2"+
		"\2\2k\u0152\3\2\2\2m\u0154\3\2\2\2o\u0156\3\2\2\2q\u0158\3\2\2\2s\u015a"+
		"\3\2\2\2u\u015c\3\2\2\2w\u015e\3\2\2\2y\u0160\3\2\2\2{\u0162\3\2\2\2}"+
		"\u0164\3\2\2\2\177\u0166\3\2\2\2\u0081\u0168\3\2\2\2\u0083\u016a\3\2\2"+
		"\2\u0085\u016c\3\2\2\2\u0087\u016e\3\2\2\2\u0089\u008a\7*\2\2\u008a\4"+
		"\3\2\2\2\u008b\u008c\7+\2\2\u008c\6\3\2\2\2\u008d\u008e\7?\2\2\u008e\b"+
		"\3\2\2\2\u008f\u0090\7\f\2\2\u0090\n\3\2\2\2\u0091\u0095\7$\2\2\u0092"+
		"\u0094\n\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0099\7$\2\2\u0099\f\3\2\2\2\u009a\u009b\5e\63\2\u009b\u009c\5_\60\2"+
		"\u009c\16\3\2\2\2\u009d\u009e\5{>\2\u009e\u009f\5c\62\2\u009f\u00a0\5"+
		"]/\2\u00a0\u00a1\5o8\2\u00a1\20\3\2\2\2\u00a2\u00a3\5]/\2\u00a3\u00a4"+
		"\5k\66\2\u00a4\u00a5\5y=\2\u00a5\u00a6\5]/\2\u00a6\22\3\2\2\2\u00a7\u00a8"+
		"\5]/\2\u00a8\u00a9\5o8\2\u00a9\u00aa\5[.\2\u00aa\24\3\2\2\2\u00ab\u00ac"+
		"\5a\61\2\u00ac\u00ad\5q9\2\u00ad\u00ae\5{>\2\u00ae\u00af\5q9\2\u00af\26"+
		"\3\2\2\2\u00b0\u00b1\5U+\2\u00b1\u00b2\5W,\2\u00b2\u00b3\5y=\2\u00b3\30"+
		"\3\2\2\2\u00b4\u00b5\5y=\2\u00b5\u00b6\5u;\2\u00b6\u00b7\5w<\2\u00b7\u00b8"+
		"\5{>\2\u00b8\32\3\2\2\2\u00b9\u00ba\5y=\2\u00ba\u00bb\5e\63\2\u00bb\u00bc"+
		"\5o8\2\u00bc\34\3\2\2\2\u00bd\u00be\5Y-\2\u00be\u00bf\5q9\2\u00bf\u00c0"+
		"\5y=\2\u00c0\36\3\2\2\2\u00c1\u00c2\5{>\2\u00c2\u00c3\5U+\2\u00c3\u00c4"+
		"\5o8\2\u00c4 \3\2\2\2\u00c5\u00c6\5U+\2\u00c6\u00c7\5w<\2\u00c7\u00c8"+
		"\5Y-\2\u00c8\u00c9\5y=\2\u00c9\u00ca\5e\63\2\u00ca\u00cb\5o8\2\u00cb\""+
		"\3\2\2\2\u00cc\u00cd\5U+\2\u00cd\u00ce\5w<\2\u00ce\u00cf\5Y-\2\u00cf\u00d0"+
		"\5Y-\2\u00d0\u00d1\5q9\2\u00d1\u00d2\5y=\2\u00d2$\3\2\2\2\u00d3\u00d4"+
		"\5U+\2\u00d4\u00d5\5w<\2\u00d5\u00d6\5Y-\2\u00d6\u00d7\5{>\2\u00d7\u00d8"+
		"\5U+\2\u00d8\u00d9\5o8\2\u00d9&\3\2\2\2\u00da\u00e3\5\27\f\2\u00db\u00e3"+
		"\5\31\r\2\u00dc\u00e3\5\33\16\2\u00dd\u00e3\5\35\17\2\u00de\u00e3\5\37"+
		"\20\2\u00df\u00e3\5!\21\2\u00e0\u00e3\5#\22\2\u00e1\u00e3\5%\23\2\u00e2"+
		"\u00da\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00dd\3\2"+
		"\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3(\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5*\3\2\2\2\u00e6"+
		"\u00e7\7@\2\2\u00e7,\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7?\2\2\u00ea"+
		".\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec\u00ed\7?\2\2\u00ed\60\3\2\2\2\u00ee"+
		"\u00ef\7#\2\2\u00ef\u00f0\7?\2\2\u00f0\62\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2"+
		"\u00f3\7?\2\2\u00f3\64\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5\66\3\2\2\2\u00f6"+
		"\u00f7\7/\2\2\u00f78\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9:\3\2\2\2\u00fa\u00fb"+
		"\7\61\2\2\u00fb<\3\2\2\2\u00fc\u00fd\7\'\2\2\u00fd>\3\2\2\2\u00fe\u00ff"+
		"\7#\2\2\u00ff@\3\2\2\2\u0100\u0101\7\60\2\2\u0101B\3\2\2\2\u0102\u0103"+
		"\7<\2\2\u0103D\3\2\2\2\u0104\u0105\7\61\2\2\u0105\u0106\7\61\2\2\u0106"+
		"\u010a\3\2\2\2\u0107\u0109\n\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010bF\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010d\u010f\7\"\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111H\3\2\2\2\u0112\u0114\t\3\2\2"+
		"\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116J\3\2\2\2\u0117\u0119\t\4\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011bL\3\2\2\2"+
		"\u011c\u0121\5I%\2\u011d\u0120\5I%\2\u011e\u0120\5K&\2\u011f\u011d\3\2"+
		"\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122N\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0127\5C\"\2\u0125"+
		"\u0128\5I%\2\u0126\u0128\5K&\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aP\3"+
		"\2\2\2\u012b\u012e\5M\'\2\u012c\u012e\5O(\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012c\3\2\2\2\u012eR\3\2\2\2\u012f\u0131\5K&\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u013a\3\2"+
		"\2\2\u0134\u0136\7\60\2\2\u0135\u0137\5K&\2\u0136\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u0134\3\2\2\2\u013a\u013b\3\2\2\2\u013bT\3\2\2\2\u013c\u013d"+
		"\t\5\2\2\u013dV\3\2\2\2\u013e\u013f\t\6\2\2\u013fX\3\2\2\2\u0140\u0141"+
		"\t\7\2\2\u0141Z\3\2\2\2\u0142\u0143\t\b\2\2\u0143\\\3\2\2\2\u0144\u0145"+
		"\t\t\2\2\u0145^\3\2\2\2\u0146\u0147\t\n\2\2\u0147`\3\2\2\2\u0148\u0149"+
		"\t\13\2\2\u0149b\3\2\2\2\u014a\u014b\t\f\2\2\u014bd\3\2\2\2\u014c\u014d"+
		"\t\r\2\2\u014df\3\2\2\2\u014e\u014f\t\16\2\2\u014fh\3\2\2\2\u0150\u0151"+
		"\t\17\2\2\u0151j\3\2\2\2\u0152\u0153\t\20\2\2\u0153l\3\2\2\2\u0154\u0155"+
		"\t\21\2\2\u0155n\3\2\2\2\u0156\u0157\t\22\2\2\u0157p\3\2\2\2\u0158\u0159"+
		"\t\23\2\2\u0159r\3\2\2\2\u015a\u015b\t\24\2\2\u015bt\3\2\2\2\u015c\u015d"+
		"\t\25\2\2\u015dv\3\2\2\2\u015e\u015f\t\26\2\2\u015fx\3\2\2\2\u0160\u0161"+
		"\t\27\2\2\u0161z\3\2\2\2\u0162\u0163\t\30\2\2\u0163|\3\2\2\2\u0164\u0165"+
		"\t\31\2\2\u0165~\3\2\2\2\u0166\u0167\t\32\2\2\u0167\u0080\3\2\2\2\u0168"+
		"\u0169\t\33\2\2\u0169\u0082\3\2\2\2\u016a\u016b\t\34\2\2\u016b\u0084\3"+
		"\2\2\2\u016c\u016d\t\35\2\2\u016d\u0086\3\2\2\2\u016e\u016f\t\36\2\2\u016f"+
		"\u0088\3\2\2\2\21\2\u0095\u00e2\u010a\u0110\u0115\u011a\u011f\u0121\u0127"+
		"\u0129\u012d\u0132\u0138\u013a\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}