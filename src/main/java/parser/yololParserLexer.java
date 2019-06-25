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
		BREAK=1, COMMENT=2, STRING=3, IF=4, THEN=5, ELSE=6, END=7, GOTO=8, ARITHMETICKEYWORD=9, 
		LBRACKET=10, RBRACKET=11, LOGICALOPERATOR=12, ASSIGN=13, PLUS=14, MINUS=15, 
		MULTIPLY=16, DIVIDE=17, MODULO=18, FACTORIAL=19, DOT=20, COLON=21, SPACE=22, 
		VARIABLE=23, NUMBER=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BREAK", "COMMENT", "STRING", "IF", "THEN", "ELSE", "END", "GOTO", "ABS", 
			"SQRT", "SIN", "COS", "TAN", "ARCSIN", "ARCCOS", "ARCTAN", "ARITHMETICKEYWORD", 
			"LBRACKET", "RBRACKET", "LESS", "GREATER", "LESSEQUAL", "GREATEREQUAL", 
			"NOTEQUAL", "EQUAL", "LOGICALOPERATOR", "ASSIGN", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "MODULO", "FACTORIAL", "DOT", "COLON", "SPACE", "ALPHABETICAL", 
			"NUMERICAL", "INTERNALVARIABLE", "EXTERNALVARIABLE", "VARIABLE", "NUMBER", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u017a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\7\3\u0092\n\3\f\3\16\3\u0095\13\3\3\4\3\4\7\4\u0099\n\4\f\4\16\4"+
		"\u009c\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00e8\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0104\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3"+
		"!\3!\3\"\3\"\3#\3#\3$\3$\3%\6%\u0119\n%\r%\16%\u011a\3&\6&\u011e\n&\r"+
		"&\16&\u011f\3\'\6\'\u0123\n\'\r\'\16\'\u0124\3(\3(\3(\7(\u012a\n(\f(\16"+
		"(\u012d\13(\3)\3)\3)\6)\u0132\n)\r)\16)\u0133\3*\3*\5*\u0138\n*\3+\6+"+
		"\u013b\n+\r+\16+\u013c\3+\3+\6+\u0141\n+\r+\16+\u0142\5+\u0145\n+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\2\2F\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\13%\f\'\r)\2+"+
		"\2-\2/\2\61\2\63\2\65\16\67\179\20;\21=\22?\23A\24C\25E\26G\27I\30K\2"+
		"M\2O\2Q\2S\31U\32W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y"+
		"\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\3\2\37\3\2\f\f"+
		"\4\2C\\c|\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2"+
		"IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4"+
		"\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZz"+
		"z\4\2[[{{\4\2\\\\||\2\u0166\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3\u008b\3\2\2\2\5\u008d\3\2\2\2\7\u0096"+
		"\3\2\2\2\t\u009f\3\2\2\2\13\u00a2\3\2\2\2\r\u00a7\3\2\2\2\17\u00ac\3\2"+
		"\2\2\21\u00b0\3\2\2\2\23\u00b5\3\2\2\2\25\u00b9\3\2\2\2\27\u00be\3\2\2"+
		"\2\31\u00c2\3\2\2\2\33\u00c6\3\2\2\2\35\u00ca\3\2\2\2\37\u00d1\3\2\2\2"+
		"!\u00d8\3\2\2\2#\u00e7\3\2\2\2%\u00e9\3\2\2\2\'\u00eb\3\2\2\2)\u00ed\3"+
		"\2\2\2+\u00ef\3\2\2\2-\u00f1\3\2\2\2/\u00f4\3\2\2\2\61\u00f7\3\2\2\2\63"+
		"\u00fa\3\2\2\2\65\u0103\3\2\2\2\67\u0105\3\2\2\29\u0107\3\2\2\2;\u0109"+
		"\3\2\2\2=\u010b\3\2\2\2?\u010d\3\2\2\2A\u010f\3\2\2\2C\u0111\3\2\2\2E"+
		"\u0113\3\2\2\2G\u0115\3\2\2\2I\u0118\3\2\2\2K\u011d\3\2\2\2M\u0122\3\2"+
		"\2\2O\u0126\3\2\2\2Q\u012e\3\2\2\2S\u0137\3\2\2\2U\u013a\3\2\2\2W\u0146"+
		"\3\2\2\2Y\u0148\3\2\2\2[\u014a\3\2\2\2]\u014c\3\2\2\2_\u014e\3\2\2\2a"+
		"\u0150\3\2\2\2c\u0152\3\2\2\2e\u0154\3\2\2\2g\u0156\3\2\2\2i\u0158\3\2"+
		"\2\2k\u015a\3\2\2\2m\u015c\3\2\2\2o\u015e\3\2\2\2q\u0160\3\2\2\2s\u0162"+
		"\3\2\2\2u\u0164\3\2\2\2w\u0166\3\2\2\2y\u0168\3\2\2\2{\u016a\3\2\2\2}"+
		"\u016c\3\2\2\2\177\u016e\3\2\2\2\u0081\u0170\3\2\2\2\u0083\u0172\3\2\2"+
		"\2\u0085\u0174\3\2\2\2\u0087\u0176\3\2\2\2\u0089\u0178\3\2\2\2\u008b\u008c"+
		"\7\f\2\2\u008c\4\3\2\2\2\u008d\u008e\7\61\2\2\u008e\u008f\7\61\2\2\u008f"+
		"\u0093\3\2\2\2\u0090\u0092\n\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\6\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u009a\7$\2\2\u0097\u0099\n\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7$\2\2\u009e\b\3\2\2\2\u009f\u00a0"+
		"\5g\64\2\u00a0\u00a1\5a\61\2\u00a1\n\3\2\2\2\u00a2\u00a3\5}?\2\u00a3\u00a4"+
		"\5e\63\2\u00a4\u00a5\5_\60\2\u00a5\u00a6\5q9\2\u00a6\f\3\2\2\2\u00a7\u00a8"+
		"\5_\60\2\u00a8\u00a9\5m\67\2\u00a9\u00aa\5{>\2\u00aa\u00ab\5_\60\2\u00ab"+
		"\16\3\2\2\2\u00ac\u00ad\5_\60\2\u00ad\u00ae\5q9\2\u00ae\u00af\5]/\2\u00af"+
		"\20\3\2\2\2\u00b0\u00b1\5c\62\2\u00b1\u00b2\5s:\2\u00b2\u00b3\5}?\2\u00b3"+
		"\u00b4\5s:\2\u00b4\22\3\2\2\2\u00b5\u00b6\5W,\2\u00b6\u00b7\5Y-\2\u00b7"+
		"\u00b8\5{>\2\u00b8\24\3\2\2\2\u00b9\u00ba\5{>\2\u00ba\u00bb\5w<\2\u00bb"+
		"\u00bc\5y=\2\u00bc\u00bd\5}?\2\u00bd\26\3\2\2\2\u00be\u00bf\5{>\2\u00bf"+
		"\u00c0\5g\64\2\u00c0\u00c1\5q9\2\u00c1\30\3\2\2\2\u00c2\u00c3\5[.\2\u00c3"+
		"\u00c4\5s:\2\u00c4\u00c5\5{>\2\u00c5\32\3\2\2\2\u00c6\u00c7\5}?\2\u00c7"+
		"\u00c8\5W,\2\u00c8\u00c9\5q9\2\u00c9\34\3\2\2\2\u00ca\u00cb\5W,\2\u00cb"+
		"\u00cc\5y=\2\u00cc\u00cd\5[.\2\u00cd\u00ce\5{>\2\u00ce\u00cf\5g\64\2\u00cf"+
		"\u00d0\5q9\2\u00d0\36\3\2\2\2\u00d1\u00d2\5W,\2\u00d2\u00d3\5y=\2\u00d3"+
		"\u00d4\5[.\2\u00d4\u00d5\5[.\2\u00d5\u00d6\5s:\2\u00d6\u00d7\5{>\2\u00d7"+
		" \3\2\2\2\u00d8\u00d9\5W,\2\u00d9\u00da\5y=\2\u00da\u00db\5[.\2\u00db"+
		"\u00dc\5}?\2\u00dc\u00dd\5W,\2\u00dd\u00de\5q9\2\u00de\"\3\2\2\2\u00df"+
		"\u00e8\5\23\n\2\u00e0\u00e8\5\25\13\2\u00e1\u00e8\5\27\f\2\u00e2\u00e8"+
		"\5\31\r\2\u00e3\u00e8\5\33\16\2\u00e4\u00e8\5\35\17\2\u00e5\u00e8\5\37"+
		"\20\2\u00e6\u00e8\5!\21\2\u00e7\u00df\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7"+
		"\u00e1\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e4\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8$\3\2\2\2\u00e9\u00ea"+
		"\7*\2\2\u00ea&\3\2\2\2\u00eb\u00ec\7+\2\2\u00ec(\3\2\2\2\u00ed\u00ee\7"+
		">\2\2\u00ee*\3\2\2\2\u00ef\u00f0\7@\2\2\u00f0,\3\2\2\2\u00f1\u00f2\7>"+
		"\2\2\u00f2\u00f3\7?\2\2\u00f3.\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8\u00f9\7?\2\2\u00f9\62"+
		"\3\2\2\2\u00fa\u00fb\7?\2\2\u00fb\u00fc\7?\2\2\u00fc\64\3\2\2\2\u00fd"+
		"\u0104\5)\25\2\u00fe\u0104\5+\26\2\u00ff\u0104\5-\27\2\u0100\u0104\5/"+
		"\30\2\u0101\u0104\5\61\31\2\u0102\u0104\5\63\32\2\u0103\u00fd\3\2\2\2"+
		"\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0102\3\2\2\2\u0104\66\3\2\2\2\u0105\u0106\7?\2\2\u0106"+
		"8\3\2\2\2\u0107\u0108\7-\2\2\u0108:\3\2\2\2\u0109\u010a\7/\2\2\u010a<"+
		"\3\2\2\2\u010b\u010c\7,\2\2\u010c>\3\2\2\2\u010d\u010e\7\61\2\2\u010e"+
		"@\3\2\2\2\u010f\u0110\7\'\2\2\u0110B\3\2\2\2\u0111\u0112\7#\2\2\u0112"+
		"D\3\2\2\2\u0113\u0114\7\60\2\2\u0114F\3\2\2\2\u0115\u0116\7<\2\2\u0116"+
		"H\3\2\2\2\u0117\u0119\7\"\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011bJ\3\2\2\2\u011c\u011e\t"+
		"\3\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120L\3\2\2\2\u0121\u0123\t\4\2\2\u0122\u0121\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125N\3"+
		"\2\2\2\u0126\u012b\5K&\2\u0127\u012a\5K&\2\u0128\u012a\5M\'\2\u0129\u0127"+
		"\3\2\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012cP\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0131\5G$\2\u012f"+
		"\u0132\5K&\2\u0130\u0132\5M\'\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2"+
		"\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134R"+
		"\3\2\2\2\u0135\u0138\5O(\2\u0136\u0138\5Q)\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138T\3\2\2\2\u0139\u013b\5M\'\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0144\3\2"+
		"\2\2\u013e\u0140\7\60\2\2\u013f\u0141\5M\'\2\u0140\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2"+
		"\2\2\u0144\u013e\3\2\2\2\u0144\u0145\3\2\2\2\u0145V\3\2\2\2\u0146\u0147"+
		"\t\5\2\2\u0147X\3\2\2\2\u0148\u0149\t\6\2\2\u0149Z\3\2\2\2\u014a\u014b"+
		"\t\7\2\2\u014b\\\3\2\2\2\u014c\u014d\t\b\2\2\u014d^\3\2\2\2\u014e\u014f"+
		"\t\t\2\2\u014f`\3\2\2\2\u0150\u0151\t\n\2\2\u0151b\3\2\2\2\u0152\u0153"+
		"\t\13\2\2\u0153d\3\2\2\2\u0154\u0155\t\f\2\2\u0155f\3\2\2\2\u0156\u0157"+
		"\t\r\2\2\u0157h\3\2\2\2\u0158\u0159\t\16\2\2\u0159j\3\2\2\2\u015a\u015b"+
		"\t\17\2\2\u015bl\3\2\2\2\u015c\u015d\t\20\2\2\u015dn\3\2\2\2\u015e\u015f"+
		"\t\21\2\2\u015fp\3\2\2\2\u0160\u0161\t\22\2\2\u0161r\3\2\2\2\u0162\u0163"+
		"\t\23\2\2\u0163t\3\2\2\2\u0164\u0165\t\24\2\2\u0165v\3\2\2\2\u0166\u0167"+
		"\t\25\2\2\u0167x\3\2\2\2\u0168\u0169\t\26\2\2\u0169z\3\2\2\2\u016a\u016b"+
		"\t\27\2\2\u016b|\3\2\2\2\u016c\u016d\t\30\2\2\u016d~\3\2\2\2\u016e\u016f"+
		"\t\31\2\2\u016f\u0080\3\2\2\2\u0170\u0171\t\32\2\2\u0171\u0082\3\2\2\2"+
		"\u0172\u0173\t\33\2\2\u0173\u0084\3\2\2\2\u0174\u0175\t\34\2\2\u0175\u0086"+
		"\3\2\2\2\u0176\u0177\t\35\2\2\u0177\u0088\3\2\2\2\u0178\u0179\t\36\2\2"+
		"\u0179\u008a\3\2\2\2\22\2\u0093\u009a\u00e7\u0103\u011a\u011f\u0124\u0129"+
		"\u012b\u0131\u0133\u0137\u013c\u0142\u0144\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}