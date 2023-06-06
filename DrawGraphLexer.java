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
		T__0=1, PLUS=2, MINUS=3, DIV=4, MUL=5, POWER=6, EQUALS=7, SEMICO=8, L_BRACKET=9, 
		R_BRACKET=10, COMMA=11, ORIGIN=12, SCALE=13, ROT=14, IS=15, TO=16, STEP=17, 
		DRAW=18, FOR=19, FROM=20, T1=21, COLOR=22, RED=23, GREEN=24, BLUE=25, 
		BLACK=26, COLORFUL=27, WHITE=28, SIZE=29, BACKGROUND=30, WATERMAKER=31, 
		P=32, I=33, E=34, CONST_ID=35, Integer=36, Real=37, ID=38, WS=39, COMMENT=40, 
		ErrText=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PLUS", "MINUS", "DIV", "MUL", "POWER", "EQUALS", "SEMICO", "L_BRACKET", 
			"R_BRACKET", "COMMA", "ORIGIN", "SCALE", "ROT", "IS", "TO", "STEP", "DRAW", 
			"FOR", "FROM", "T1", "COLOR", "RED", "GREEN", "BLUE", "BLACK", "COLORFUL", 
			"WHITE", "SIZE", "BACKGROUND", "WATERMAKER", "P", "I", "E", "NamedConst", 
			"CONST_ID", "Integer", "Real", "ID", "WS", "COMMENT", "ErrText"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Color('", "'+'", "'-'", "'/'", "'*'", "'**'", "'='", "';'", "'('", 
			"')'", "','", "'ORIGIN'", "'SCALE'", "'ROT'", "'IS'", "'TO'", "'STEP'", 
			"'DRAW'", "'FOR'", "'FROM'", "'T'", "'COLOR'", "'RED'", "'GREEN'", "'BLUE'", 
			"'BLACK'", "'COLORFUL'", "'WHITE'", "'SIZE'", "'BACKGROUND'", "'WATERMAKER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PLUS", "MINUS", "DIV", "MUL", "POWER", "EQUALS", "SEMICO", 
			"L_BRACKET", "R_BRACKET", "COMMA", "ORIGIN", "SCALE", "ROT", "IS", "TO", 
			"STEP", "DRAW", "FOR", "FROM", "T1", "COLOR", "RED", "GREEN", "BLUE", 
			"BLACK", "COLORFUL", "WHITE", "SIZE", "BACKGROUND", "WATERMAKER", "P", 
			"I", "E", "CONST_ID", "Integer", "Real", "ID", "WS", "COMMENT", "ErrText"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u012f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\5$\u00ef\n$\3%\3%"+
		"\3%\5%\u00f4\n%\3&\6&\u00f7\n&\r&\16&\u00f8\3\'\3\'\3\'\3\'\3(\3(\7(\u0101"+
		"\n(\f(\16(\u0104\13(\3)\6)\u0107\n)\r)\16)\u0108\3)\3)\3*\3*\3*\3*\7*"+
		"\u0111\n*\f*\16*\u0114\13*\3*\3*\3*\3*\7*\u011a\n*\f*\16*\u011d\13*\3"+
		"*\3*\3*\3*\7*\u0123\n*\f*\16*\u0126\13*\3*\3*\5*\u012a\n*\3*\3*\3+\3+"+
		"\3\u0124\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G\2I%K&M\'O(Q)S*U+\3\2\n\4\2RRrr\4\2KKkk\4\2GGg"+
		"g\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2"+
		"\u0138\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\3W\3\2\2\2\5^\3\2\2\2\7`\3\2\2\2\tb\3\2\2\2\13d\3\2\2\2\rf\3\2"+
		"\2\2\17i\3\2\2\2\21k\3\2\2\2\23m\3\2\2\2\25o\3\2\2\2\27q\3\2\2\2\31s\3"+
		"\2\2\2\33z\3\2\2\2\35\u0080\3\2\2\2\37\u0084\3\2\2\2!\u0087\3\2\2\2#\u008a"+
		"\3\2\2\2%\u008f\3\2\2\2\'\u0094\3\2\2\2)\u0098\3\2\2\2+\u009d\3\2\2\2"+
		"-\u009f\3\2\2\2/\u00a5\3\2\2\2\61\u00a9\3\2\2\2\63\u00af\3\2\2\2\65\u00b4"+
		"\3\2\2\2\67\u00ba\3\2\2\29\u00c3\3\2\2\2;\u00c9\3\2\2\2=\u00ce\3\2\2\2"+
		"?\u00d9\3\2\2\2A\u00e4\3\2\2\2C\u00e6\3\2\2\2E\u00e8\3\2\2\2G\u00ee\3"+
		"\2\2\2I\u00f3\3\2\2\2K\u00f6\3\2\2\2M\u00fa\3\2\2\2O\u00fe\3\2\2\2Q\u0106"+
		"\3\2\2\2S\u0129\3\2\2\2U\u012d\3\2\2\2WX\7E\2\2XY\7q\2\2YZ\7n\2\2Z[\7"+
		"q\2\2[\\\7t\2\2\\]\7*\2\2]\4\3\2\2\2^_\7-\2\2_\6\3\2\2\2`a\7/\2\2a\b\3"+
		"\2\2\2bc\7\61\2\2c\n\3\2\2\2de\7,\2\2e\f\3\2\2\2fg\7,\2\2gh\7,\2\2h\16"+
		"\3\2\2\2ij\7?\2\2j\20\3\2\2\2kl\7=\2\2l\22\3\2\2\2mn\7*\2\2n\24\3\2\2"+
		"\2op\7+\2\2p\26\3\2\2\2qr\7.\2\2r\30\3\2\2\2st\7Q\2\2tu\7T\2\2uv\7K\2"+
		"\2vw\7I\2\2wx\7K\2\2xy\7P\2\2y\32\3\2\2\2z{\7U\2\2{|\7E\2\2|}\7C\2\2}"+
		"~\7N\2\2~\177\7G\2\2\177\34\3\2\2\2\u0080\u0081\7T\2\2\u0081\u0082\7Q"+
		"\2\2\u0082\u0083\7V\2\2\u0083\36\3\2\2\2\u0084\u0085\7K\2\2\u0085\u0086"+
		"\7U\2\2\u0086 \3\2\2\2\u0087\u0088\7V\2\2\u0088\u0089\7Q\2\2\u0089\"\3"+
		"\2\2\2\u008a\u008b\7U\2\2\u008b\u008c\7V\2\2\u008c\u008d\7G\2\2\u008d"+
		"\u008e\7R\2\2\u008e$\3\2\2\2\u008f\u0090\7F\2\2\u0090\u0091\7T\2\2\u0091"+
		"\u0092\7C\2\2\u0092\u0093\7Y\2\2\u0093&\3\2\2\2\u0094\u0095\7H\2\2\u0095"+
		"\u0096\7Q\2\2\u0096\u0097\7T\2\2\u0097(\3\2\2\2\u0098\u0099\7H\2\2\u0099"+
		"\u009a\7T\2\2\u009a\u009b\7Q\2\2\u009b\u009c\7O\2\2\u009c*\3\2\2\2\u009d"+
		"\u009e\7V\2\2\u009e,\3\2\2\2\u009f\u00a0\7E\2\2\u00a0\u00a1\7Q\2\2\u00a1"+
		"\u00a2\7N\2\2\u00a2\u00a3\7Q\2\2\u00a3\u00a4\7T\2\2\u00a4.\3\2\2\2\u00a5"+
		"\u00a6\7T\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7F\2\2\u00a8\60\3\2\2\2\u00a9"+
		"\u00aa\7I\2\2\u00aa\u00ab\7T\2\2\u00ab\u00ac\7G\2\2\u00ac\u00ad\7G\2\2"+
		"\u00ad\u00ae\7P\2\2\u00ae\62\3\2\2\2\u00af\u00b0\7D\2\2\u00b0\u00b1\7"+
		"N\2\2\u00b1\u00b2\7W\2\2\u00b2\u00b3\7G\2\2\u00b3\64\3\2\2\2\u00b4\u00b5"+
		"\7D\2\2\u00b5\u00b6\7N\2\2\u00b6\u00b7\7C\2\2\u00b7\u00b8\7E\2\2\u00b8"+
		"\u00b9\7M\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7E\2\2\u00bb\u00bc\7Q\2\2\u00bc"+
		"\u00bd\7N\2\2\u00bd\u00be\7Q\2\2\u00be\u00bf\7T\2\2\u00bf\u00c0\7H\2\2"+
		"\u00c0\u00c1\7W\2\2\u00c1\u00c2\7N\2\2\u00c28\3\2\2\2\u00c3\u00c4\7Y\2"+
		"\2\u00c4\u00c5\7J\2\2\u00c5\u00c6\7K\2\2\u00c6\u00c7\7V\2\2\u00c7\u00c8"+
		"\7G\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7U\2\2\u00ca\u00cb\7K\2\2\u00cb\u00cc"+
		"\7\\\2\2\u00cc\u00cd\7G\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7D\2\2\u00cf\u00d0"+
		"\7C\2\2\u00d0\u00d1\7E\2\2\u00d1\u00d2\7M\2\2\u00d2\u00d3\7I\2\2\u00d3"+
		"\u00d4\7T\2\2\u00d4\u00d5\7Q\2\2\u00d5\u00d6\7W\2\2\u00d6\u00d7\7P\2\2"+
		"\u00d7\u00d8\7F\2\2\u00d8>\3\2\2\2\u00d9\u00da\7Y\2\2\u00da\u00db\7C\2"+
		"\2\u00db\u00dc\7V\2\2\u00dc\u00dd\7G\2\2\u00dd\u00de\7T\2\2\u00de\u00df"+
		"\7O\2\2\u00df\u00e0\7C\2\2\u00e0\u00e1\7M\2\2\u00e1\u00e2\7G\2\2\u00e2"+
		"\u00e3\7T\2\2\u00e3@\3\2\2\2\u00e4\u00e5\t\2\2\2\u00e5B\3\2\2\2\u00e6"+
		"\u00e7\t\3\2\2\u00e7D\3\2\2\2\u00e8\u00e9\t\4\2\2\u00e9F\3\2\2\2\u00ea"+
		"\u00eb\5A!\2\u00eb\u00ec\5C\"\2\u00ec\u00ef\3\2\2\2\u00ed\u00ef\5E#\2"+
		"\u00ee\u00ea\3\2\2\2\u00ee\u00ed\3\2\2\2\u00efH\3\2\2\2\u00f0\u00f4\5"+
		"K&\2\u00f1\u00f4\5M\'\2\u00f2\u00f4\5G$\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4J\3\2\2\2\u00f5\u00f7\t\5\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9L\3\2\2\2\u00fa\u00fb\5K&\2\u00fb\u00fc\7\60\2\2\u00fc\u00fd"+
		"\5K&\2\u00fdN\3\2\2\2\u00fe\u0102\t\6\2\2\u00ff\u0101\t\7\2\2\u0100\u00ff"+
		"\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"P\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\t\b\2\2\u0106\u0105\3\2\2\2"+
		"\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\b)\2\2\u010bR\3\2\2\2\u010c\u010d\7\61\2\2\u010d"+
		"\u010e\7\61\2\2\u010e\u0112\3\2\2\2\u010f\u0111\n\t\2\2\u0110\u010f\3"+
		"\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u012a\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7/\2\2\u0116\u0117\7/\2"+
		"\2\u0117\u011b\3\2\2\2\u0118\u011a\n\t\2\2\u0119\u0118\3\2\2\2\u011a\u011d"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u012a\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\7\61\2\2\u011f\u0120\7,\2\2\u0120\u0124\3\2"+
		"\2\2\u0121\u0123\13\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0128\7,\2\2\u0128\u012a\7\61\2\2\u0129\u010c\3\2\2\2\u0129"+
		"\u0115\3\2\2\2\u0129\u011e\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b*"+
		"\2\2\u012cT\3\2\2\2\u012d\u012e\13\2\2\2\u012eV\3\2\2\2\f\2\u00ee\u00f3"+
		"\u00f8\u0102\u0108\u0112\u011b\u0124\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}