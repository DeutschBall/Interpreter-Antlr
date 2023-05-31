// Generated from DrawGraph.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawGraphLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PLUS=2, MINUS=3, DIV=4, MUL=5, POWER=6, SEMICO=7, L_BRACKET=8, 
		R_BRACKET=9, COMMA=10, ORIGIN=11, SCALE=12, ROT=13, IS=14, TO=15, STEP=16, 
		DRAW=17, FOR=18, FROM=19, T1=20, COLOR=21, RED=22, GREEN=23, BLUE=24, 
		BLACK=25, SIZE=26, P=27, I=28, E=29, CONST_ID=30, Integer=31, Real=32, 
		ID=33, WS=34, COMMENT=35, ErrText=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PLUS", "MINUS", "DIV", "MUL", "POWER", "SEMICO", "L_BRACKET", 
			"R_BRACKET", "COMMA", "ORIGIN", "SCALE", "ROT", "IS", "TO", "STEP", "DRAW", 
			"FOR", "FROM", "T1", "COLOR", "RED", "GREEN", "BLUE", "BLACK", "SIZE", 
			"P", "I", "E", "NamedConst", "CONST_ID", "Integer", "Real", "ID", "WS", 
			"COMMENT", "ErrText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Color('", "'+'", "'-'", "'/'", "'*'", "'**'", "';'", "'('", "')'", 
			"','", "'ORIGIN'", "'SCALE'", "'ROT'", "'IS'", "'TO'", "'STEP'", "'DRAW'", 
			"'FOR'", "'FROM'", "'T'", "'COLOR'", "'RED'", "'GREEN'", "'BLUE'", "'BLACK'", 
			"'SIZE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PLUS", "MINUS", "DIV", "MUL", "POWER", "SEMICO", "L_BRACKET", 
			"R_BRACKET", "COMMA", "ORIGIN", "SCALE", "ROT", "IS", "TO", "STEP", "DRAW", 
			"FOR", "FROM", "T1", "COLOR", "RED", "GREEN", "BLUE", "BLACK", "SIZE", 
			"P", "I", "E", "CONST_ID", "Integer", "Real", "ID", "WS", "COMMENT", 
			"ErrText"
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


	public DrawGraphLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DrawGraph.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00fe\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\5\37\u00be\n\37\3 \3 \3 \5 \u00c3\n \3!\6!\u00c6\n!\r!\16!\u00c7\3\""+
		"\3\"\3\"\3\"\3#\3#\7#\u00d0\n#\f#\16#\u00d3\13#\3$\6$\u00d6\n$\r$\16$"+
		"\u00d7\3$\3$\3%\3%\3%\3%\7%\u00e0\n%\f%\16%\u00e3\13%\3%\3%\3%\3%\7%\u00e9"+
		"\n%\f%\16%\u00ec\13%\3%\3%\3%\3%\7%\u00f2\n%\f%\16%\u00f5\13%\3%\3%\5"+
		"%\u00f9\n%\3%\3%\3&\3&\3\u00f3\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37=\2? A!C\"E#G$I%K&\3\2\n\4\2RRrr\4"+
		"\2KKkk\4\2GGgg\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4"+
		"\2\f\f\17\17\2\u0107\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5T\3\2\2\2\7V\3\2\2\2\tX"+
		"\3\2\2\2\13Z\3\2\2\2\r\\\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25"+
		"e\3\2\2\2\27g\3\2\2\2\31n\3\2\2\2\33t\3\2\2\2\35x\3\2\2\2\37{\3\2\2\2"+
		"!~\3\2\2\2#\u0083\3\2\2\2%\u0088\3\2\2\2\'\u008c\3\2\2\2)\u0091\3\2\2"+
		"\2+\u0093\3\2\2\2-\u0099\3\2\2\2/\u009d\3\2\2\2\61\u00a3\3\2\2\2\63\u00a8"+
		"\3\2\2\2\65\u00ae\3\2\2\2\67\u00b3\3\2\2\29\u00b5\3\2\2\2;\u00b7\3\2\2"+
		"\2=\u00bd\3\2\2\2?\u00c2\3\2\2\2A\u00c5\3\2\2\2C\u00c9\3\2\2\2E\u00cd"+
		"\3\2\2\2G\u00d5\3\2\2\2I\u00f8\3\2\2\2K\u00fc\3\2\2\2MN\7E\2\2NO\7q\2"+
		"\2OP\7n\2\2PQ\7q\2\2QR\7t\2\2RS\7*\2\2S\4\3\2\2\2TU\7-\2\2U\6\3\2\2\2"+
		"VW\7/\2\2W\b\3\2\2\2XY\7\61\2\2Y\n\3\2\2\2Z[\7,\2\2[\f\3\2\2\2\\]\7,\2"+
		"\2]^\7,\2\2^\16\3\2\2\2_`\7=\2\2`\20\3\2\2\2ab\7*\2\2b\22\3\2\2\2cd\7"+
		"+\2\2d\24\3\2\2\2ef\7.\2\2f\26\3\2\2\2gh\7Q\2\2hi\7T\2\2ij\7K\2\2jk\7"+
		"I\2\2kl\7K\2\2lm\7P\2\2m\30\3\2\2\2no\7U\2\2op\7E\2\2pq\7C\2\2qr\7N\2"+
		"\2rs\7G\2\2s\32\3\2\2\2tu\7T\2\2uv\7Q\2\2vw\7V\2\2w\34\3\2\2\2xy\7K\2"+
		"\2yz\7U\2\2z\36\3\2\2\2{|\7V\2\2|}\7Q\2\2} \3\2\2\2~\177\7U\2\2\177\u0080"+
		"\7V\2\2\u0080\u0081\7G\2\2\u0081\u0082\7R\2\2\u0082\"\3\2\2\2\u0083\u0084"+
		"\7F\2\2\u0084\u0085\7T\2\2\u0085\u0086\7C\2\2\u0086\u0087\7Y\2\2\u0087"+
		"$\3\2\2\2\u0088\u0089\7H\2\2\u0089\u008a\7Q\2\2\u008a\u008b\7T\2\2\u008b"+
		"&\3\2\2\2\u008c\u008d\7H\2\2\u008d\u008e\7T\2\2\u008e\u008f\7Q\2\2\u008f"+
		"\u0090\7O\2\2\u0090(\3\2\2\2\u0091\u0092\7V\2\2\u0092*\3\2\2\2\u0093\u0094"+
		"\7E\2\2\u0094\u0095\7Q\2\2\u0095\u0096\7N\2\2\u0096\u0097\7Q\2\2\u0097"+
		"\u0098\7T\2\2\u0098,\3\2\2\2\u0099\u009a\7T\2\2\u009a\u009b\7G\2\2\u009b"+
		"\u009c\7F\2\2\u009c.\3\2\2\2\u009d\u009e\7I\2\2\u009e\u009f\7T\2\2\u009f"+
		"\u00a0\7G\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2\7P\2\2\u00a2\60\3\2\2\2\u00a3"+
		"\u00a4\7D\2\2\u00a4\u00a5\7N\2\2\u00a5\u00a6\7W\2\2\u00a6\u00a7\7G\2\2"+
		"\u00a7\62\3\2\2\2\u00a8\u00a9\7D\2\2\u00a9\u00aa\7N\2\2\u00aa\u00ab\7"+
		"C\2\2\u00ab\u00ac\7E\2\2\u00ac\u00ad\7M\2\2\u00ad\64\3\2\2\2\u00ae\u00af"+
		"\7U\2\2\u00af\u00b0\7K\2\2\u00b0\u00b1\7\\\2\2\u00b1\u00b2\7G\2\2\u00b2"+
		"\66\3\2\2\2\u00b3\u00b4\t\2\2\2\u00b48\3\2\2\2\u00b5\u00b6\t\3\2\2\u00b6"+
		":\3\2\2\2\u00b7\u00b8\t\4\2\2\u00b8<\3\2\2\2\u00b9\u00ba\5\67\34\2\u00ba"+
		"\u00bb\59\35\2\u00bb\u00be\3\2\2\2\u00bc\u00be\5;\36\2\u00bd\u00b9\3\2"+
		"\2\2\u00bd\u00bc\3\2\2\2\u00be>\3\2\2\2\u00bf\u00c3\5A!\2\u00c0\u00c3"+
		"\5C\"\2\u00c1\u00c3\5=\37\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3@\3\2\2\2\u00c4\u00c6\t\5\2\2\u00c5\u00c4\3\2\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8B\3"+
		"\2\2\2\u00c9\u00ca\5A!\2\u00ca\u00cb\7\60\2\2\u00cb\u00cc\5A!\2\u00cc"+
		"D\3\2\2\2\u00cd\u00d1\t\6\2\2\u00ce\u00d0\t\7\2\2\u00cf\u00ce\3\2\2\2"+
		"\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2F\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\t\b\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\b$\2\2\u00daH\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc\u00dd"+
		"\7\61\2\2\u00dd\u00e1\3\2\2\2\u00de\u00e0\n\t\2\2\u00df\u00de\3\2\2\2"+
		"\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00f9"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7/\2\2\u00e5\u00e6\7/\2\2\u00e6"+
		"\u00ea\3\2\2\2\u00e7\u00e9\n\t\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f9\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\7\61\2\2\u00ee\u00ef\7,\2\2\u00ef\u00f3\3\2"+
		"\2\2\u00f0\u00f2\13\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f6\u00f7\7,\2\2\u00f7\u00f9\7\61\2\2\u00f8\u00db\3\2\2\2\u00f8"+
		"\u00e4\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b%"+
		"\2\2\u00fbJ\3\2\2\2\u00fc\u00fd\13\2\2\2\u00fdL\3\2\2\2\f\2\u00bd\u00c2"+
		"\u00c7\u00d1\u00d7\u00e1\u00ea\u00f3\u00f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}