package parser;
// Generated from Csp.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CspLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, EQ=3, NEQ=4, LT=5, GT=6, LTEQ=7, GTEQ=8, NOT=9, PLUS=10, 
		TIMES=11, MINUS=12, DIV=13, MOD=14, IF=15, THEN=16, ELSE=17, Skip=18, 
		Stop=19, DIVERGE=20, TRUE=21, FALSE=22, GUARD=23, LPAREN=24, RPAREN=25, 
		LBRACKET=26, RBRACKET=27, LSYNC=28, RSYNC=29, INTL=30, ECHOICE=31, PARALL=32, 
		ICHOICE=33, COMMA=34, COLLON=35, SEMICOL=36, ARROW=37, QUERY=38, PLING=39, 
		CHANNEL=40, DOT=41, LBRACE=42, RBRACE=43, EQUAL=44, BACKSLASH=45, TIMEOUT=46, 
		INTR=47, ASSERT=48, DEADLOCK=49, DETERMINISTIC=50, DIVERGENCE=51, FAILUREDIVE=52, 
		FAILURE=53, TRACE=54, FREE=55, DIGIT=56, ID=57, LINECOMMENT=58, WS=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "OR", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "NOT", "PLUS", 
			"TIMES", "MINUS", "DIV", "MOD", "IF", "THEN", "ELSE", "Skip", "Stop", 
			"DIVERGE", "TRUE", "FALSE", "GUARD", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "LSYNC", "RSYNC", "INTL", "ECHOICE", "PARALL", "ICHOICE", 
			"COMMA", "COLLON", "SEMICOL", "ARROW", "QUERY", "PLING", "CHANNEL", "DOT", 
			"LBRACE", "RBRACE", "EQUAL", "BACKSLASH", "TIMEOUT", "INTR", "ASSERT", 
			"DEADLOCK", "DETERMINISTIC", "DIVERGENCE", "FAILUREDIVE", "FAILURE", 
			"TRACE", "FREE", "DIGIT", "ID", "LINECOMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"'not'", "'+'", "'*'", "'-'", "'/'", "'%'", "'if'", "'then'", "'else'", 
			"'SKIP'", "'STOP'", "'div'", "'true'", "'false'", "'&'", "'('", "')'", 
			"'['", "']'", "'[|'", "'|]'", "'|||'", "'[]'", "'||'", "'|~|'", "','", 
			"':'", "';'", "'->'", "'?'", "'!'", "'channel'", "'.'", "'{'", "'}'", 
			"'='", "'\\'", "'[>'", "'/\\'", "'assert'", "'deadlock'", "'deterministic'", 
			"'divergence'", "' [FD]'", "' [F]'", "' [T]'", "' free'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "NOT", "PLUS", 
			"TIMES", "MINUS", "DIV", "MOD", "IF", "THEN", "ELSE", "Skip", "Stop", 
			"DIVERGE", "TRUE", "FALSE", "GUARD", "LPAREN", "RPAREN", "LBRACKET", 
			"RBRACKET", "LSYNC", "RSYNC", "INTL", "ECHOICE", "PARALL", "ICHOICE", 
			"COMMA", "COLLON", "SEMICOL", "ARROW", "QUERY", "PLING", "CHANNEL", "DOT", 
			"LBRACE", "RBRACE", "EQUAL", "BACKSLASH", "TIMEOUT", "INTR", "ASSERT", 
			"DEADLOCK", "DETERMINISTIC", "DIVERGENCE", "FAILUREDIVE", "FAILURE", 
			"TRACE", "FREE", "DIGIT", "ID", "LINECOMMENT", "WS"
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


	public CspLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Csp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u015f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\3:\6:\u014a"+
		"\n:\r:\16:\u014b\3;\3;\3;\3;\7;\u0152\n;\f;\16;\u0155\13;\3;\3;\3<\6<"+
		"\u015a\n<\r<\16<\u015b\3<\3<\2\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=\3\2\5\4\2C\\c|\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\2\u0161\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\3y\3\2\2\2\5}\3\2\2\2\7\u0080\3\2\2\2\t\u0083\3\2\2\2"+
		"\13\u0086\3\2\2\2\r\u0088\3\2\2\2\17\u008a\3\2\2\2\21\u008d\3\2\2\2\23"+
		"\u0090\3\2\2\2\25\u0094\3\2\2\2\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u009a"+
		"\3\2\2\2\35\u009c\3\2\2\2\37\u009e\3\2\2\2!\u00a1\3\2\2\2#\u00a6\3\2\2"+
		"\2%\u00ab\3\2\2\2\'\u00b0\3\2\2\2)\u00b5\3\2\2\2+\u00b9\3\2\2\2-\u00be"+
		"\3\2\2\2/\u00c4\3\2\2\2\61\u00c6\3\2\2\2\63\u00c8\3\2\2\2\65\u00ca\3\2"+
		"\2\2\67\u00cc\3\2\2\29\u00ce\3\2\2\2;\u00d1\3\2\2\2=\u00d4\3\2\2\2?\u00d8"+
		"\3\2\2\2A\u00db\3\2\2\2C\u00de\3\2\2\2E\u00e2\3\2\2\2G\u00e4\3\2\2\2I"+
		"\u00e6\3\2\2\2K\u00e8\3\2\2\2M\u00eb\3\2\2\2O\u00ed\3\2\2\2Q\u00ef\3\2"+
		"\2\2S\u00f7\3\2\2\2U\u00f9\3\2\2\2W\u00fb\3\2\2\2Y\u00fd\3\2\2\2[\u00ff"+
		"\3\2\2\2]\u0101\3\2\2\2_\u0104\3\2\2\2a\u0107\3\2\2\2c\u010e\3\2\2\2e"+
		"\u0117\3\2\2\2g\u0125\3\2\2\2i\u0130\3\2\2\2k\u0136\3\2\2\2m\u013b\3\2"+
		"\2\2o\u0140\3\2\2\2q\u0146\3\2\2\2s\u0149\3\2\2\2u\u014d\3\2\2\2w\u0159"+
		"\3\2\2\2yz\7c\2\2z{\7p\2\2{|\7f\2\2|\4\3\2\2\2}~\7q\2\2~\177\7t\2\2\177"+
		"\6\3\2\2\2\u0080\u0081\7?\2\2\u0081\u0082\7?\2\2\u0082\b\3\2\2\2\u0083"+
		"\u0084\7#\2\2\u0084\u0085\7?\2\2\u0085\n\3\2\2\2\u0086\u0087\7>\2\2\u0087"+
		"\f\3\2\2\2\u0088\u0089\7@\2\2\u0089\16\3\2\2\2\u008a\u008b\7>\2\2\u008b"+
		"\u008c\7?\2\2\u008c\20\3\2\2\2\u008d\u008e\7@\2\2\u008e\u008f\7?\2\2\u008f"+
		"\22\3\2\2\2\u0090\u0091\7p\2\2\u0091\u0092\7q\2\2\u0092\u0093\7v\2\2\u0093"+
		"\24\3\2\2\2\u0094\u0095\7-\2\2\u0095\26\3\2\2\2\u0096\u0097\7,\2\2\u0097"+
		"\30\3\2\2\2\u0098\u0099\7/\2\2\u0099\32\3\2\2\2\u009a\u009b\7\61\2\2\u009b"+
		"\34\3\2\2\2\u009c\u009d\7\'\2\2\u009d\36\3\2\2\2\u009e\u009f\7k\2\2\u009f"+
		"\u00a0\7h\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7j\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\u00a8\7n\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7g\2\2\u00aa$\3\2\2\2\u00ab"+
		"\u00ac\7U\2\2\u00ac\u00ad\7M\2\2\u00ad\u00ae\7K\2\2\u00ae\u00af\7R\2\2"+
		"\u00af&\3\2\2\2\u00b0\u00b1\7U\2\2\u00b1\u00b2\7V\2\2\u00b2\u00b3\7Q\2"+
		"\2\u00b3\u00b4\7R\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7"+
		"k\2\2\u00b7\u00b8\7x\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb"+
		"\7t\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7g\2\2\u00bd,\3\2\2\2\u00be\u00bf"+
		"\7h\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7u\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3.\3\2\2\2\u00c4\u00c5\7(\2\2\u00c5\60\3\2\2\2\u00c6"+
		"\u00c7\7*\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7+\2\2\u00c9\64\3\2\2\2\u00ca"+
		"\u00cb\7]\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\7_\2\2\u00cd8\3\2\2\2\u00ce"+
		"\u00cf\7]\2\2\u00cf\u00d0\7~\2\2\u00d0:\3\2\2\2\u00d1\u00d2\7~\2\2\u00d2"+
		"\u00d3\7_\2\2\u00d3<\3\2\2\2\u00d4\u00d5\7~\2\2\u00d5\u00d6\7~\2\2\u00d6"+
		"\u00d7\7~\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7]\2\2\u00d9\u00da\7_\2\2\u00da"+
		"@\3\2\2\2\u00db\u00dc\7~\2\2\u00dc\u00dd\7~\2\2\u00ddB\3\2\2\2\u00de\u00df"+
		"\7~\2\2\u00df\u00e0\7\u0080\2\2\u00e0\u00e1\7~\2\2\u00e1D\3\2\2\2\u00e2"+
		"\u00e3\7.\2\2\u00e3F\3\2\2\2\u00e4\u00e5\7<\2\2\u00e5H\3\2\2\2\u00e6\u00e7"+
		"\7=\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea\7@\2\2\u00eaL\3"+
		"\2\2\2\u00eb\u00ec\7A\2\2\u00ecN\3\2\2\2\u00ed\u00ee\7#\2\2\u00eeP\3\2"+
		"\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7j\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3"+
		"\7p\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"R\3\2\2\2\u00f7\u00f8\7\60\2\2\u00f8T\3\2\2\2\u00f9\u00fa\7}\2\2\u00fa"+
		"V\3\2\2\2\u00fb\u00fc\7\177\2\2\u00fcX\3\2\2\2\u00fd\u00fe\7?\2\2\u00fe"+
		"Z\3\2\2\2\u00ff\u0100\7^\2\2\u0100\\\3\2\2\2\u0101\u0102\7]\2\2\u0102"+
		"\u0103\7@\2\2\u0103^\3\2\2\2\u0104\u0105\7\61\2\2\u0105\u0106\7^\2\2\u0106"+
		"`\3\2\2\2\u0107\u0108\7c\2\2\u0108\u0109\7u\2\2\u0109\u010a\7u\2\2\u010a"+
		"\u010b\7g\2\2\u010b\u010c\7t\2\2\u010c\u010d\7v\2\2\u010db\3\2\2\2\u010e"+
		"\u010f\7f\2\2\u010f\u0110\7g\2\2\u0110\u0111\7c\2\2\u0111\u0112\7f\2\2"+
		"\u0112\u0113\7n\2\2\u0113\u0114\7q\2\2\u0114\u0115\7e\2\2\u0115\u0116"+
		"\7m\2\2\u0116d\3\2\2\2\u0117\u0118\7f\2\2\u0118\u0119\7g\2\2\u0119\u011a"+
		"\7v\2\2\u011a\u011b\7g\2\2\u011b\u011c\7t\2\2\u011c\u011d\7o\2\2\u011d"+
		"\u011e\7k\2\2\u011e\u011f\7p\2\2\u011f\u0120\7k\2\2\u0120\u0121\7u\2\2"+
		"\u0121\u0122\7v\2\2\u0122\u0123\7k\2\2\u0123\u0124\7e\2\2\u0124f\3\2\2"+
		"\2\u0125\u0126\7f\2\2\u0126\u0127\7k\2\2\u0127\u0128\7x\2\2\u0128\u0129"+
		"\7g\2\2\u0129\u012a\7t\2\2\u012a\u012b\7i\2\2\u012b\u012c\7g\2\2\u012c"+
		"\u012d\7p\2\2\u012d\u012e\7e\2\2\u012e\u012f\7g\2\2\u012fh\3\2\2\2\u0130"+
		"\u0131\7\"\2\2\u0131\u0132\7]\2\2\u0132\u0133\7H\2\2\u0133\u0134\7F\2"+
		"\2\u0134\u0135\7_\2\2\u0135j\3\2\2\2\u0136\u0137\7\"\2\2\u0137\u0138\7"+
		"]\2\2\u0138\u0139\7H\2\2\u0139\u013a\7_\2\2\u013al\3\2\2\2\u013b\u013c"+
		"\7\"\2\2\u013c\u013d\7]\2\2\u013d\u013e\7V\2\2\u013e\u013f\7_\2\2\u013f"+
		"n\3\2\2\2\u0140\u0141\7\"\2\2\u0141\u0142\7h\2\2\u0142\u0143\7t\2\2\u0143"+
		"\u0144\7g\2\2\u0144\u0145\7g\2\2\u0145p\3\2\2\2\u0146\u0147\4\62;\2\u0147"+
		"r\3\2\2\2\u0148\u014a\t\2\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014ct\3\2\2\2\u014d\u014e\7"+
		"/\2\2\u014e\u014f\7/\2\2\u014f\u0153\3\2\2\2\u0150\u0152\n\3\2\2\u0151"+
		"\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\b;\2\2\u0157"+
		"v\3\2\2\2\u0158\u015a\t\4\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2"+
		"\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e"+
		"\b<\2\2\u015ex\3\2\2\2\6\2\u014b\u0153\u015b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}