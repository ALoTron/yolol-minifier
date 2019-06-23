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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, AlphabeticalChar=16, 
		NumericalChar=17, SpecialSymbols=18, ArithmeticOperator=19, ArithmeticKeyword=20, 
		LogicalOperator=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "AlphabeticalChar", 
			"NumericalChar", "SpecialSymbols", "ArithmeticOperator", "ArithmeticKeyword", 
			"LogicalOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'if '", "' then '", "' else '", "' end'", "'('", "')'", 
			"'!'", "':'", "'\"'", "'-'", "'.'", "'='", "'goto '", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "AlphabeticalChar", "NumericalChar", "SpecialSymbols", 
			"ArithmeticOperator", "ArithmeticKeyword", "LogicalOperator"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u008a\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0095\n\26\2\2\27\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27\3\2\7\6\2\"\"..C\\c|\3\2\62;\6\2##..\60\60A"+
		"A\6\2\'\',-//\61\61\4\2>>@@\2\u00a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\63\3\2\2\2\t:\3\2\2\2\13A\3\2"+
		"\2\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27P\3"+
		"\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37\\\3\2\2\2!_\3\2\2\2#a\3"+
		"\2\2\2%c\3\2\2\2\'e\3\2\2\2)\u0089\3\2\2\2+\u0094\3\2\2\2-.\7\"\2\2.\4"+
		"\3\2\2\2/\60\7k\2\2\60\61\7h\2\2\61\62\7\"\2\2\62\6\3\2\2\2\63\64\7\""+
		"\2\2\64\65\7v\2\2\65\66\7j\2\2\66\67\7g\2\2\678\7p\2\289\7\"\2\29\b\3"+
		"\2\2\2:;\7\"\2\2;<\7g\2\2<=\7n\2\2=>\7u\2\2>?\7g\2\2?@\7\"\2\2@\n\3\2"+
		"\2\2AB\7\"\2\2BC\7g\2\2CD\7p\2\2DE\7f\2\2E\f\3\2\2\2FG\7*\2\2G\16\3\2"+
		"\2\2HI\7+\2\2I\20\3\2\2\2JK\7#\2\2K\22\3\2\2\2LM\7<\2\2M\24\3\2\2\2NO"+
		"\7$\2\2O\26\3\2\2\2PQ\7/\2\2Q\30\3\2\2\2RS\7\60\2\2S\32\3\2\2\2TU\7?\2"+
		"\2U\34\3\2\2\2VW\7i\2\2WX\7q\2\2XY\7v\2\2YZ\7q\2\2Z[\7\"\2\2[\36\3\2\2"+
		"\2\\]\7\61\2\2]^\7\61\2\2^ \3\2\2\2_`\t\2\2\2`\"\3\2\2\2ab\t\3\2\2b$\3"+
		"\2\2\2cd\t\4\2\2d&\3\2\2\2ef\t\5\2\2f(\3\2\2\2gh\7C\2\2hi\7D\2\2i\u008a"+
		"\7U\2\2jk\7U\2\2kl\7S\2\2lm\7T\2\2m\u008a\7V\2\2no\7U\2\2op\7K\2\2p\u008a"+
		"\7P\2\2qr\7E\2\2rs\7Q\2\2s\u008a\7U\2\2tu\7V\2\2uv\7C\2\2v\u008a\7P\2"+
		"\2wx\7C\2\2xy\7T\2\2yz\7E\2\2z{\7U\2\2{|\7K\2\2|\u008a\7P\2\2}~\7C\2\2"+
		"~\177\7T\2\2\177\u0080\7E\2\2\u0080\u0081\7E\2\2\u0081\u0082\7Q\2\2\u0082"+
		"\u008a\7U\2\2\u0083\u0084\7C\2\2\u0084\u0085\7T\2\2\u0085\u0086\7E\2\2"+
		"\u0086\u0087\7V\2\2\u0087\u0088\7C\2\2\u0088\u008a\7P\2\2\u0089g\3\2\2"+
		"\2\u0089j\3\2\2\2\u0089n\3\2\2\2\u0089q\3\2\2\2\u0089t\3\2\2\2\u0089w"+
		"\3\2\2\2\u0089}\3\2\2\2\u0089\u0083\3\2\2\2\u008a*\3\2\2\2\u008b\u0095"+
		"\t\6\2\2\u008c\u008d\7>\2\2\u008d\u0095\7?\2\2\u008e\u008f\7@\2\2\u008f"+
		"\u0095\7?\2\2\u0090\u0091\7#\2\2\u0091\u0095\7?\2\2\u0092\u0093\7?\2\2"+
		"\u0093\u0095\7?\2\2\u0094\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008e"+
		"\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0092\3\2\2\2\u0095,\3\2\2\2\5\2\u0089"+
		"\u0094\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}