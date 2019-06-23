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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, AlphabeticalChar=15, 
		NumericalChar=16, SpecialSymbols=17, ArithmeticKeyword=18, LogicalOperator=19, 
		IF=20, THEN=21, ELSE=22, END=23, GOTO=24, ABS=25, SQRT=26, SIN=27, COS=28, 
		TAN=29, ARCSIN=30, ARCCOS=31, ARCTAN=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "AlphabeticalChar", "NumericalChar", 
			"SpecialSymbols", "ArithmeticKeyword", "LogicalOperator", "IF", "THEN", 
			"ELSE", "END", "GOTO", "ABS", "SQRT", "SIN", "COS", "TAN", "ARCSIN", 
			"ARCCOS", "ARCTAN", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
			"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
			"Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'('", "')'", "'!'", "':'", "'\"'", "'-'", "'.'", "'+'", 
			"'*'", "'/'", "'%'", "'='", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "AlphabeticalChar", "NumericalChar", "SpecialSymbols", 
			"ArithmeticKeyword", "LogicalOperator", "IF", "THEN", "ELSE", "END", 
			"GOTO", "ABS", "SQRT", "SIN", "COS", "TAN", "ARCSIN", "ARCCOS", "ARCTAN"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0123\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a3\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00ae\n\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\2\2<\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C\2E\2G\2I\2K\2M\2"+
		"O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2\3\2 \4\2"+
		"C\\c|\3\2\62;\6\2##..\60\60AA\4\2>>@@\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff"+
		"\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2O"+
		"Ooo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0113\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t}\3\2\2\2\13\177\3"+
		"\2\2\2\r\u0081\3\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2\2\2\23\u0087\3\2"+
		"\2\2\25\u0089\3\2\2\2\27\u008b\3\2\2\2\31\u008d\3\2\2\2\33\u008f\3\2\2"+
		"\2\35\u0091\3\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2\2%\u00a2"+
		"\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b2\3\2\2\2-\u00b7\3\2\2\2"+
		"/\u00bc\3\2\2\2\61\u00c0\3\2\2\2\63\u00c5\3\2\2\2\65\u00c9\3\2\2\2\67"+
		"\u00ce\3\2\2\29\u00d2\3\2\2\2;\u00d6\3\2\2\2=\u00da\3\2\2\2?\u00e1\3\2"+
		"\2\2A\u00e8\3\2\2\2C\u00ef\3\2\2\2E\u00f1\3\2\2\2G\u00f3\3\2\2\2I\u00f5"+
		"\3\2\2\2K\u00f7\3\2\2\2M\u00f9\3\2\2\2O\u00fb\3\2\2\2Q\u00fd\3\2\2\2S"+
		"\u00ff\3\2\2\2U\u0101\3\2\2\2W\u0103\3\2\2\2Y\u0105\3\2\2\2[\u0107\3\2"+
		"\2\2]\u0109\3\2\2\2_\u010b\3\2\2\2a\u010d\3\2\2\2c\u010f\3\2\2\2e\u0111"+
		"\3\2\2\2g\u0113\3\2\2\2i\u0115\3\2\2\2k\u0117\3\2\2\2m\u0119\3\2\2\2o"+
		"\u011b\3\2\2\2q\u011d\3\2\2\2s\u011f\3\2\2\2u\u0121\3\2\2\2wx\7\"\2\2"+
		"x\4\3\2\2\2yz\7*\2\2z\6\3\2\2\2{|\7+\2\2|\b\3\2\2\2}~\7#\2\2~\n\3\2\2"+
		"\2\177\u0080\7<\2\2\u0080\f\3\2\2\2\u0081\u0082\7$\2\2\u0082\16\3\2\2"+
		"\2\u0083\u0084\7/\2\2\u0084\20\3\2\2\2\u0085\u0086\7\60\2\2\u0086\22\3"+
		"\2\2\2\u0087\u0088\7-\2\2\u0088\24\3\2\2\2\u0089\u008a\7,\2\2\u008a\26"+
		"\3\2\2\2\u008b\u008c\7\61\2\2\u008c\30\3\2\2\2\u008d\u008e\7\'\2\2\u008e"+
		"\32\3\2\2\2\u008f\u0090\7?\2\2\u0090\34\3\2\2\2\u0091\u0092\7\61\2\2\u0092"+
		"\u0093\7\61\2\2\u0093\36\3\2\2\2\u0094\u0095\t\2\2\2\u0095 \3\2\2\2\u0096"+
		"\u0097\t\3\2\2\u0097\"\3\2\2\2\u0098\u0099\t\4\2\2\u0099$\3\2\2\2\u009a"+
		"\u00a3\5\63\32\2\u009b\u00a3\5\65\33\2\u009c\u00a3\5\67\34\2\u009d\u00a3"+
		"\59\35\2\u009e\u00a3\5;\36\2\u009f\u00a3\5=\37\2\u00a0\u00a3\5? \2\u00a1"+
		"\u00a3\5A!\2\u00a2\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009c\3\2\2"+
		"\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3&\3\2\2\2\u00a4\u00ae\t\5\2\2\u00a5"+
		"\u00a6\7>\2\2\u00a6\u00ae\7?\2\2\u00a7\u00a8\7@\2\2\u00a8\u00ae\7?\2\2"+
		"\u00a9\u00aa\7#\2\2\u00aa\u00ae\7?\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ae"+
		"\7?\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad"+
		"\u00a9\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae(\3\2\2\2\u00af\u00b0\5S*\2\u00b0"+
		"\u00b1\5M\'\2\u00b1*\3\2\2\2\u00b2\u00b3\5i\65\2\u00b3\u00b4\5Q)\2\u00b4"+
		"\u00b5\5K&\2\u00b5\u00b6\5]/\2\u00b6,\3\2\2\2\u00b7\u00b8\5K&\2\u00b8"+
		"\u00b9\5Y-\2\u00b9\u00ba\5g\64\2\u00ba\u00bb\5K&\2\u00bb.\3\2\2\2\u00bc"+
		"\u00bd\5K&\2\u00bd\u00be\5]/\2\u00be\u00bf\5I%\2\u00bf\60\3\2\2\2\u00c0"+
		"\u00c1\5O(\2\u00c1\u00c2\5_\60\2\u00c2\u00c3\5i\65\2\u00c3\u00c4\5_\60"+
		"\2\u00c4\62\3\2\2\2\u00c5\u00c6\5C\"\2\u00c6\u00c7\5E#\2\u00c7\u00c8\5"+
		"g\64\2\u00c8\64\3\2\2\2\u00c9\u00ca\5g\64\2\u00ca\u00cb\5c\62\2\u00cb"+
		"\u00cc\5e\63\2\u00cc\u00cd\5i\65\2\u00cd\66\3\2\2\2\u00ce\u00cf\5g\64"+
		"\2\u00cf\u00d0\5S*\2\u00d0\u00d1\5]/\2\u00d18\3\2\2\2\u00d2\u00d3\5G$"+
		"\2\u00d3\u00d4\5_\60\2\u00d4\u00d5\5g\64\2\u00d5:\3\2\2\2\u00d6\u00d7"+
		"\5i\65\2\u00d7\u00d8\5C\"\2\u00d8\u00d9\5]/\2\u00d9<\3\2\2\2\u00da\u00db"+
		"\5C\"\2\u00db\u00dc\5e\63\2\u00dc\u00dd\5G$\2\u00dd\u00de\5g\64\2\u00de"+
		"\u00df\5S*\2\u00df\u00e0\5]/\2\u00e0>\3\2\2\2\u00e1\u00e2\5C\"\2\u00e2"+
		"\u00e3\5e\63\2\u00e3\u00e4\5G$\2\u00e4\u00e5\5G$\2\u00e5\u00e6\5_\60\2"+
		"\u00e6\u00e7\5g\64\2\u00e7@\3\2\2\2\u00e8\u00e9\5C\"\2\u00e9\u00ea\5e"+
		"\63\2\u00ea\u00eb\5G$\2\u00eb\u00ec\5i\65\2\u00ec\u00ed\5C\"\2\u00ed\u00ee"+
		"\5]/\2\u00eeB\3\2\2\2\u00ef\u00f0\t\6\2\2\u00f0D\3\2\2\2\u00f1\u00f2\t"+
		"\7\2\2\u00f2F\3\2\2\2\u00f3\u00f4\t\b\2\2\u00f4H\3\2\2\2\u00f5\u00f6\t"+
		"\t\2\2\u00f6J\3\2\2\2\u00f7\u00f8\t\n\2\2\u00f8L\3\2\2\2\u00f9\u00fa\t"+
		"\13\2\2\u00faN\3\2\2\2\u00fb\u00fc\t\f\2\2\u00fcP\3\2\2\2\u00fd\u00fe"+
		"\t\r\2\2\u00feR\3\2\2\2\u00ff\u0100\t\16\2\2\u0100T\3\2\2\2\u0101\u0102"+
		"\t\17\2\2\u0102V\3\2\2\2\u0103\u0104\t\20\2\2\u0104X\3\2\2\2\u0105\u0106"+
		"\t\21\2\2\u0106Z\3\2\2\2\u0107\u0108\t\22\2\2\u0108\\\3\2\2\2\u0109\u010a"+
		"\t\23\2\2\u010a^\3\2\2\2\u010b\u010c\t\24\2\2\u010c`\3\2\2\2\u010d\u010e"+
		"\t\25\2\2\u010eb\3\2\2\2\u010f\u0110\t\26\2\2\u0110d\3\2\2\2\u0111\u0112"+
		"\t\27\2\2\u0112f\3\2\2\2\u0113\u0114\t\30\2\2\u0114h\3\2\2\2\u0115\u0116"+
		"\t\31\2\2\u0116j\3\2\2\2\u0117\u0118\t\32\2\2\u0118l\3\2\2\2\u0119\u011a"+
		"\t\33\2\2\u011an\3\2\2\2\u011b\u011c\t\34\2\2\u011cp\3\2\2\2\u011d\u011e"+
		"\t\35\2\2\u011er\3\2\2\2\u011f\u0120\t\36\2\2\u0120t\3\2\2\2\u0121\u0122"+
		"\t\37\2\2\u0122v\3\2\2\2\5\2\u00a2\u00ad\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}