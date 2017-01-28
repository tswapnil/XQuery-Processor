// Generated from xquery.g4 by ANTLR 4.6
package edu.ucsd.cse.xprocessor.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xqueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, WS=23;
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_f = 2;
	public static final String[] ruleNames = {
		"ap", "rp", "f"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc(\"'", "'\")'", "'/'", "'//'", "'*'", "'.'", "'..'", "'text()'", 
		"'@'", "'('", "')'", "'['", "']'", "','", "'='", "'eq'", "'=='", "'is'", 
		"'and'", "'or'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "ID", "WS"
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

	@Override
	public String getGrammarFileName() { return "xquery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xqueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApSlashFileContext extends ApContext {
		public TerminalNode ID() { return getToken(xqueryParser.ID, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApSlashFileContext(ApContext ctx) { copyFrom(ctx); }
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(16);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ApSlashFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(T__0);
				setState(7);
				match(ID);
				setState(8);
				match(T__1);
				setState(9);
				match(T__2);
				setState(10);
				rp(0);
				}
				break;
			case 2:
				_localctx = new ApSlashFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				match(T__0);
				setState(12);
				match(ID);
				setState(13);
				match(T__1);
				setState(14);
				match(T__3);
				setState(15);
				rp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RpDblSlashExprContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpDblSlashExprContext(RpContext ctx) { copyFrom(ctx); }
	}
	public static class RpDotContext extends RpContext {
		public RpDotContext(RpContext ctx) { copyFrom(ctx); }
	}
	public static class RpTextContext extends RpContext {
		public RpTextContext(RpContext ctx) { copyFrom(ctx); }
	}
	public static class RpConcatExprContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpConcatExprContext(RpContext ctx) { copyFrom(ctx); }
	}
	public static class RpSlashExprContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpSlashExprContext(RpContext ctx) { copyFrom(ctx); }
	}
	public static class RpFilterExprContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public RpFilterExprContext(RpContext ctx) { copyFrom(ctx); }
	}
	public static class RpTagNameContext extends RpContext {
		public TerminalNode ID() { return getToken(xqueryParser.ID, 0); }
		public RpTagNameContext(RpContext ctx) { copyFrom(ctx); }
	}
	public static class RpDblDotContext extends RpContext {
		public RpDblDotContext(RpContext ctx) { copyFrom(ctx); }
	}
	public static class RpAttrNameContext extends RpContext {
		public TerminalNode ID() { return getToken(xqueryParser.ID, 0); }
		public RpAttrNameContext(RpContext ctx) { copyFrom(ctx); }
	}
	public static class RpWildcardContext extends RpContext {
		public RpWildcardContext(RpContext ctx) { copyFrom(ctx); }
	}
	public static class RpParenExprContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpParenExprContext(RpContext ctx) { copyFrom(ctx); }
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new RpTagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				match(ID);
				}
				break;
			case T__4:
				{
				_localctx = new RpWildcardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(T__4);
				}
				break;
			case T__5:
				{
				_localctx = new RpDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(T__5);
				}
				break;
			case T__6:
				{
				_localctx = new RpDblDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(T__6);
				}
				break;
			case T__7:
				{
				_localctx = new RpTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				match(T__7);
				}
				break;
			case T__8:
				{
				_localctx = new RpAttrNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(T__8);
				setState(25);
				match(ID);
				}
				break;
			case T__9:
				{
				_localctx = new RpParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(T__9);
				setState(27);
				rp(0);
				setState(28);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(46);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new RpSlashExprContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(32);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(33);
						match(T__2);
						setState(34);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpDblSlashExprContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(35);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(36);
						match(T__3);
						setState(37);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpConcatExprContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(38);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(39);
						match(T__13);
						setState(40);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpFilterExprContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(41);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(42);
						match(T__11);
						setState(43);
						f(0);
						setState(44);
						match(T__12);
						}
						break;
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilterAndExprContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FilterAndExprContext(FContext ctx) { copyFrom(ctx); }
	}
	public static class FilterRpContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterRpContext(FContext ctx) { copyFrom(ctx); }
	}
	public static class FilterEqualValContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterEqualValContext(FContext ctx) { copyFrom(ctx); }
	}
	public static class FilterOrExprContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FilterOrExprContext(FContext ctx) { copyFrom(ctx); }
	}
	public static class FilterParenExprContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FilterParenExprContext(FContext ctx) { copyFrom(ctx); }
	}
	public static class FilterNotExprContext extends FContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FilterNotExprContext(FContext ctx) { copyFrom(ctx); }
	}
	public static class FilterEqualIdContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterEqualIdContext(FContext ctx) { copyFrom(ctx); }
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_f, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new FilterRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FilterEqualValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				rp(0);
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(55);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FilterEqualIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				rp(0);
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(59);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FilterParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(T__9);
				setState(62);
				f(0);
				setState(63);
				match(T__10);
				}
				break;
			case 5:
				{
				_localctx = new FilterNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__20);
				setState(66);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new FilterAndExprContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(69);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(70);
						match(T__18);
						setState(71);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FilterOrExprContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(72);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(73);
						match(T__19);
						setState(74);
						f(3);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 2:
			return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31S\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4F\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\4\2\4\4\6\5\2\4\6\2\4"+
		"\3\2\21\22\3\2\23\24`\2\22\3\2\2\2\4 \3\2\2\2\6E\3\2\2\2\b\t\7\3\2\2\t"+
		"\n\7\30\2\2\n\13\7\4\2\2\13\f\7\5\2\2\f\23\5\4\3\2\r\16\7\3\2\2\16\17"+
		"\7\30\2\2\17\20\7\4\2\2\20\21\7\6\2\2\21\23\5\4\3\2\22\b\3\2\2\2\22\r"+
		"\3\2\2\2\23\3\3\2\2\2\24\25\b\3\1\2\25!\7\30\2\2\26!\7\7\2\2\27!\7\b\2"+
		"\2\30!\7\t\2\2\31!\7\n\2\2\32\33\7\13\2\2\33!\7\30\2\2\34\35\7\f\2\2\35"+
		"\36\5\4\3\2\36\37\7\r\2\2\37!\3\2\2\2 \24\3\2\2\2 \26\3\2\2\2 \27\3\2"+
		"\2\2 \30\3\2\2\2 \31\3\2\2\2 \32\3\2\2\2 \34\3\2\2\2!\62\3\2\2\2\"#\f"+
		"\6\2\2#$\7\5\2\2$\61\5\4\3\7%&\f\5\2\2&\'\7\6\2\2\'\61\5\4\3\6()\f\3\2"+
		"\2)*\7\20\2\2*\61\5\4\3\4+,\f\4\2\2,-\7\16\2\2-.\5\6\4\2./\7\17\2\2/\61"+
		"\3\2\2\2\60\"\3\2\2\2\60%\3\2\2\2\60(\3\2\2\2\60+\3\2\2\2\61\64\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65\66\b\4\1"+
		"\2\66F\5\4\3\2\678\5\4\3\289\t\2\2\29:\5\4\3\2:F\3\2\2\2;<\5\4\3\2<=\t"+
		"\3\2\2=>\5\4\3\2>F\3\2\2\2?@\7\f\2\2@A\5\6\4\2AB\7\r\2\2BF\3\2\2\2CD\7"+
		"\27\2\2DF\5\6\4\3E\65\3\2\2\2E\67\3\2\2\2E;\3\2\2\2E?\3\2\2\2EC\3\2\2"+
		"\2FO\3\2\2\2GH\f\5\2\2HI\7\25\2\2IN\5\6\4\6JK\f\4\2\2KL\7\26\2\2LN\5\6"+
		"\4\5MG\3\2\2\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QO\3"+
		"\2\2\2\t\22 \60\62EMO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}