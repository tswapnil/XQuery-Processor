// Generated from XQuery.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, FILE=39, 
		STRING=40, VAR=41, WS=42;
	public static final int
		RULE_start = 0, RULE_xq = 1, RULE_forClause = 2, RULE_letClause = 3, RULE_whereClause = 4, 
		RULE_returnClause = 5, RULE_cond = 6, RULE_joinClause = 7, RULE_ap = 8, 
		RULE_rp = 9, RULE_f = 10;
	public static final String[] ruleNames = {
		"start", "xq", "forClause", "letClause", "whereClause", "returnClause", 
		"cond", "joinClause", "ap", "rp", "f"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'/'", "'//'", "'<'", "'>'", "'{'", "'}'", 
		"'</'", "'for'", "'in'", "'let'", "':='", "'where'", "'return'", "'='", 
		"'eq'", "'=='", "'is'", "'empty'", "'some'", "'satisfies'", "'and'", "'or'", 
		"'not'", "'join'", "'['", "'\"'", "']'", "'doc(\"'", "'\")'", "'*'", "'.'", 
		"'..'", "'text()'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "FILE", "STRING", "VAR", "WS"
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
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			xq(0);
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

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XqApContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public XqApContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqAp(this);
		}
	}
	public static class XqJoinExprContext extends XqContext {
		public JoinClauseContext join;
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public XqJoinExprContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqJoinExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqJoinExpr(this);
		}
	}
	public static class XqVarContext extends XqContext {
		public Token var;
		public TerminalNode VAR() { return getToken(XQueryParser.VAR, 0); }
		public XqVarContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqVar(this);
		}
	}
	public static class XqContTagExprContext extends XqContext {
		public Token openTagName;
		public XqContext query;
		public Token closeTagName;
		public List<TerminalNode> ID() { return getTokens(XQueryParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XQueryParser.ID, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqContTagExprContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqContTagExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqContTagExpr(this);
		}
	}
	public static class XqConcatExprContext extends XqContext {
		public XqContext leftQuery;
		public XqContext rightQuery;
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XqConcatExprContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqConcatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqConcatExpr(this);
		}
	}
	public static class XqParenExprContext extends XqContext {
		public XqContext query;
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqParenExprContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqParenExpr(this);
		}
	}
	public static class XqStrConstDefContext extends XqContext {
		public Token strConst;
		public TerminalNode STRING() { return getToken(XQueryParser.STRING, 0); }
		public XqStrConstDefContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqStrConstDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqStrConstDef(this);
		}
	}
	public static class XqLetExprContext extends XqContext {
		public LetClauseContext declaration;
		public XqContext query;
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqLetExprContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqLetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqLetExpr(this);
		}
	}
	public static class XqDblSlashExprContext extends XqContext {
		public XqContext query;
		public RpContext relPath;
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqDblSlashExprContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqDblSlashExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqDblSlashExpr(this);
		}
	}
	public static class XqForExprContext extends XqContext {
		public ForClauseContext loop;
		public LetClauseContext declaration;
		public WhereClauseContext condition;
		public ReturnClauseContext output;
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public List<LetClauseContext> letClause() {
			return getRuleContexts(LetClauseContext.class);
		}
		public LetClauseContext letClause(int i) {
			return getRuleContext(LetClauseContext.class,i);
		}
		public List<WhereClauseContext> whereClause() {
			return getRuleContexts(WhereClauseContext.class);
		}
		public WhereClauseContext whereClause(int i) {
			return getRuleContext(WhereClauseContext.class,i);
		}
		public XqForExprContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqForExpr(this);
		}
	}
	public static class XqSlashExprContext extends XqContext {
		public XqContext query;
		public RpContext relPath;
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqSlashExprContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqSlashExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqSlashExpr(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new XqVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25);
				((XqVarContext)_localctx).var = match(VAR);
				}
				break;
			case STRING:
				{
				_localctx = new XqStrConstDefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				((XqStrConstDefContext)_localctx).strConst = match(STRING);
				}
				break;
			case T__30:
				{
				_localctx = new XqApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				ap();
				}
				break;
			case T__0:
				{
				_localctx = new XqParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(T__0);
				setState(29);
				((XqParenExprContext)_localctx).query = xq(0);
				setState(30);
				match(T__1);
				}
				break;
			case T__5:
				{
				_localctx = new XqContTagExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(T__5);
				setState(33);
				((XqContTagExprContext)_localctx).openTagName = match(ID);
				setState(34);
				match(T__6);
				setState(35);
				match(T__7);
				setState(36);
				((XqContTagExprContext)_localctx).query = xq(0);
				setState(37);
				match(T__8);
				setState(38);
				match(T__9);
				setState(39);
				((XqContTagExprContext)_localctx).closeTagName = match(ID);
				setState(40);
				match(T__6);
				}
				break;
			case T__10:
				{
				_localctx = new XqForExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				((XqForExprContext)_localctx).loop = forClause();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(43);
					((XqForExprContext)_localctx).declaration = letClause();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(49);
					((XqForExprContext)_localctx).condition = whereClause();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				((XqForExprContext)_localctx).output = returnClause();
				}
				break;
			case T__12:
				{
				_localctx = new XqLetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				((XqLetExprContext)_localctx).declaration = letClause();
				setState(58);
				((XqLetExprContext)_localctx).query = xq(2);
				}
				break;
			case T__26:
				{
				_localctx = new XqJoinExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				((XqJoinExprContext)_localctx).join = joinClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new XqConcatExprContext(new XqContext(_parentctx, _parentState));
						((XqConcatExprContext)_localctx).leftQuery = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(63);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(64);
						match(T__2);
						setState(65);
						((XqConcatExprContext)_localctx).rightQuery = xq(8);
						}
						break;
					case 2:
						{
						_localctx = new XqSlashExprContext(new XqContext(_parentctx, _parentState));
						((XqSlashExprContext)_localctx).query = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(66);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(67);
						match(T__3);
						setState(68);
						((XqSlashExprContext)_localctx).relPath = rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XqDblSlashExprContext(new XqContext(_parentctx, _parentState));
						((XqDblSlashExprContext)_localctx).query = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(69);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(70);
						match(T__4);
						setState(71);
						((XqDblSlashExprContext)_localctx).relPath = rp(0);
						}
						break;
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ForClauseContext extends ParserRuleContext {
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
	 
		public ForClauseContext() { }
		public void copyFrom(ForClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForVarIterContext extends ForClauseContext {
		public Token VAR;
		public List<Token> varList = new ArrayList<Token>();
		public XqContext xq;
		public List<XqContext> queryList = new ArrayList<XqContext>();
		public List<TerminalNode> VAR() { return getTokens(XQueryParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(XQueryParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForVarIterContext(ForClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterForVarIter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitForVarIter(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forClause);
		int _la;
		try {
			_localctx = new ForVarIterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__10);
			setState(78);
			((ForVarIterContext)_localctx).VAR = match(VAR);
			((ForVarIterContext)_localctx).varList.add(((ForVarIterContext)_localctx).VAR);
			setState(79);
			match(T__11);
			setState(80);
			((ForVarIterContext)_localctx).xq = xq(0);
			((ForVarIterContext)_localctx).queryList.add(((ForVarIterContext)_localctx).xq);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(81);
				match(T__2);
				setState(82);
				((ForVarIterContext)_localctx).VAR = match(VAR);
				((ForVarIterContext)_localctx).varList.add(((ForVarIterContext)_localctx).VAR);
				setState(83);
				match(T__11);
				setState(84);
				((ForVarIterContext)_localctx).xq = xq(0);
				((ForVarIterContext)_localctx).queryList.add(((ForVarIterContext)_localctx).xq);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class LetClauseContext extends ParserRuleContext {
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
	 
		public LetClauseContext() { }
		public void copyFrom(LetClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetVarDefContext extends LetClauseContext {
		public Token VAR;
		public List<Token> varList = new ArrayList<Token>();
		public XqContext xq;
		public List<XqContext> queryList = new ArrayList<XqContext>();
		public List<TerminalNode> VAR() { return getTokens(XQueryParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(XQueryParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetVarDefContext(LetClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterLetVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitLetVarDef(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letClause);
		int _la;
		try {
			_localctx = new LetVarDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__12);
			setState(91);
			((LetVarDefContext)_localctx).VAR = match(VAR);
			((LetVarDefContext)_localctx).varList.add(((LetVarDefContext)_localctx).VAR);
			setState(92);
			match(T__13);
			setState(93);
			((LetVarDefContext)_localctx).xq = xq(0);
			((LetVarDefContext)_localctx).queryList.add(((LetVarDefContext)_localctx).xq);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(94);
				match(T__2);
				setState(95);
				((LetVarDefContext)_localctx).VAR = match(VAR);
				((LetVarDefContext)_localctx).varList.add(((LetVarDefContext)_localctx).VAR);
				setState(96);
				match(T__13);
				setState(97);
				((LetVarDefContext)_localctx).xq = xq(0);
				((LetVarDefContext)_localctx).queryList.add(((LetVarDefContext)_localctx).xq);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class WhereClauseContext extends ParserRuleContext {
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	 
		public WhereClauseContext() { }
		public void copyFrom(WhereClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhereCondExprContext extends WhereClauseContext {
		public CondContext condition;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereCondExprContext(WhereClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterWhereCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitWhereCondExpr(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereClause);
		try {
			_localctx = new WhereCondExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__14);
			setState(104);
			((WhereCondExprContext)_localctx).condition = cond(0);
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

	public static class ReturnClauseContext extends ParserRuleContext {
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
	 
		public ReturnClauseContext() { }
		public void copyFrom(ReturnClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnQueryContext extends ReturnClauseContext {
		public XqContext query;
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnQueryContext(ReturnClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterReturnQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitReturnQuery(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnClause);
		try {
			_localctx = new ReturnQueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__15);
			setState(107);
			((ReturnQueryContext)_localctx).query = xq(0);
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondEmptyContext extends CondContext {
		public XqContext query;
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public CondEmptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondEmpty(this);
		}
	}
	public static class CondVarCheckContext extends CondContext {
		public Token VAR;
		public List<Token> varList = new ArrayList<Token>();
		public XqContext xq;
		public List<XqContext> queryList = new ArrayList<XqContext>();
		public CondContext condition;
		public List<TerminalNode> VAR() { return getTokens(XQueryParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(XQueryParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondVarCheckContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondVarCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondVarCheck(this);
		}
	}
	public static class CondOrExprContext extends CondContext {
		public CondContext leftCondition;
		public CondContext rightCondition;
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrExprContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondOrExpr(this);
		}
	}
	public static class CondParenExprContext extends CondContext {
		public CondContext condition;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondParenExprContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondParenExpr(this);
		}
	}
	public static class CondEqualValContext extends CondContext {
		public XqContext leftQuery;
		public XqContext rightQuery;
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondEqualValContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondEqualVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondEqualVal(this);
		}
	}
	public static class CondAndExprContext extends CondContext {
		public CondContext leftCondition;
		public CondContext rightCondition;
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndExprContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondAndExpr(this);
		}
	}
	public static class CondEqualIdContext extends CondContext {
		public XqContext leftQuery;
		public XqContext rightQuery;
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondEqualIdContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondEqualId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondEqualId(this);
		}
	}
	public static class CondNotExprContext extends CondContext {
		public CondContext condition;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotExprContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterCondNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitCondNotExpr(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new CondEqualValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(110);
				((CondEqualValContext)_localctx).leftQuery = xq(0);
				setState(111);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(112);
				((CondEqualValContext)_localctx).rightQuery = xq(0);
				}
				break;
			case 2:
				{
				_localctx = new CondEqualIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				((CondEqualIdContext)_localctx).leftQuery = xq(0);
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				((CondEqualIdContext)_localctx).rightQuery = xq(0);
				}
				break;
			case 3:
				{
				_localctx = new CondEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(T__20);
				setState(119);
				match(T__0);
				setState(120);
				((CondEmptyContext)_localctx).query = xq(0);
				setState(121);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new CondVarCheckContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(T__21);
				setState(124);
				((CondVarCheckContext)_localctx).VAR = match(VAR);
				((CondVarCheckContext)_localctx).varList.add(((CondVarCheckContext)_localctx).VAR);
				setState(125);
				match(T__11);
				setState(126);
				((CondVarCheckContext)_localctx).xq = xq(0);
				((CondVarCheckContext)_localctx).queryList.add(((CondVarCheckContext)_localctx).xq);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(127);
					match(T__2);
					setState(128);
					((CondVarCheckContext)_localctx).VAR = match(VAR);
					((CondVarCheckContext)_localctx).varList.add(((CondVarCheckContext)_localctx).VAR);
					setState(129);
					match(T__11);
					setState(130);
					((CondVarCheckContext)_localctx).xq = xq(0);
					((CondVarCheckContext)_localctx).queryList.add(((CondVarCheckContext)_localctx).xq);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(T__22);
				setState(137);
				((CondVarCheckContext)_localctx).condition = cond(5);
				}
				break;
			case 5:
				{
				_localctx = new CondParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(T__0);
				setState(140);
				((CondParenExprContext)_localctx).condition = cond(0);
				setState(141);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new CondNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(T__25);
				setState(144);
				((CondNotExprContext)_localctx).condition = cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndExprContext(new CondContext(_parentctx, _parentState));
						((CondAndExprContext)_localctx).leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(147);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(148);
						match(T__23);
						setState(149);
						((CondAndExprContext)_localctx).rightCondition = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrExprContext(new CondContext(_parentctx, _parentState));
						((CondOrExprContext)_localctx).leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(150);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(151);
						match(T__24);
						setState(152);
						((CondOrExprContext)_localctx).rightCondition = cond(3);
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class JoinClauseContext extends ParserRuleContext {
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
	 
		public JoinClauseContext() { }
		public void copyFrom(JoinClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinDefContext extends JoinClauseContext {
		public XqContext query1;
		public XqContext query2;
		public Token ID;
		public List<Token> attrList1 = new ArrayList<Token>();
		public List<Token> attrList2 = new ArrayList<Token>();
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(XQueryParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XQueryParser.ID, i);
		}
		public JoinDefContext(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterJoinDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitJoinDef(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_joinClause);
		int _la;
		try {
			_localctx = new JoinDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__26);
			setState(159);
			match(T__0);
			setState(160);
			((JoinDefContext)_localctx).query1 = xq(0);
			setState(161);
			match(T__2);
			setState(162);
			((JoinDefContext)_localctx).query2 = xq(0);
			setState(163);
			match(T__2);
			setState(164);
			match(T__27);
			setState(165);
			match(T__28);
			setState(166);
			((JoinDefContext)_localctx).ID = match(ID);
			((JoinDefContext)_localctx).attrList1.add(((JoinDefContext)_localctx).ID);
			setState(167);
			match(T__28);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(168);
				match(T__2);
				setState(169);
				match(T__28);
				setState(170);
				((JoinDefContext)_localctx).ID = match(ID);
				((JoinDefContext)_localctx).attrList1.add(((JoinDefContext)_localctx).ID);
				setState(171);
				match(T__28);
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(T__29);
			setState(178);
			match(T__2);
			setState(179);
			match(T__27);
			setState(180);
			match(T__28);
			setState(181);
			((JoinDefContext)_localctx).ID = match(ID);
			((JoinDefContext)_localctx).attrList2.add(((JoinDefContext)_localctx).ID);
			setState(182);
			match(T__28);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(183);
				match(T__2);
				setState(184);
				match(T__28);
				setState(185);
				((JoinDefContext)_localctx).ID = match(ID);
				((JoinDefContext)_localctx).attrList2.add(((JoinDefContext)_localctx).ID);
				setState(186);
				match(T__28);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(T__29);
			setState(193);
			match(T__1);
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
		public Token docName;
		public RpContext relpath;
		public TerminalNode FILE() { return getToken(XQueryParser.FILE, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApSlashFileContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterApSlashFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitApSlashFile(this);
		}
	}
	public static class ApDblSlashFileContext extends ApContext {
		public Token docName;
		public RpContext relpath;
		public TerminalNode FILE() { return getToken(XQueryParser.FILE, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApDblSlashFileContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterApDblSlashFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitApDblSlashFile(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ap);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ApSlashFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__30);
				setState(196);
				((ApSlashFileContext)_localctx).docName = match(FILE);
				setState(197);
				match(T__31);
				setState(198);
				match(T__3);
				setState(199);
				((ApSlashFileContext)_localctx).relpath = rp(0);
				}
				break;
			case 2:
				_localctx = new ApDblSlashFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(T__30);
				setState(201);
				((ApDblSlashFileContext)_localctx).docName = match(FILE);
				setState(202);
				match(T__31);
				setState(203);
				match(T__4);
				setState(204);
				((ApDblSlashFileContext)_localctx).relpath = rp(0);
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
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpDblSlashExprContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpDblSlashExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpDblSlashExpr(this);
		}
	}
	public static class RpDotContext extends RpContext {
		public RpDotContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpDot(this);
		}
	}
	public static class RpTextContext extends RpContext {
		public RpTextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpText(this);
		}
	}
	public static class RpConcatExprContext extends RpContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpConcatExprContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpConcatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpConcatExpr(this);
		}
	}
	public static class RpSlashExprContext extends RpContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpSlashExprContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpSlashExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpSlashExpr(this);
		}
	}
	public static class RpFilterExprContext extends RpContext {
		public RpContext relpath;
		public FContext filter;
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public RpFilterExprContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpFilterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpFilterExpr(this);
		}
	}
	public static class RpTagNameContext extends RpContext {
		public Token tagName;
		public TerminalNode ID() { return getToken(XQueryParser.ID, 0); }
		public RpTagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpTagName(this);
		}
	}
	public static class RpDblDotContext extends RpContext {
		public RpDblDotContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpDblDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpDblDot(this);
		}
	}
	public static class RpAttrNameContext extends RpContext {
		public Token attrName;
		public TerminalNode ID() { return getToken(XQueryParser.ID, 0); }
		public RpAttrNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpAttrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpAttrName(this);
		}
	}
	public static class RpWildcardContext extends RpContext {
		public RpWildcardContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpWildcard(this);
		}
	}
	public static class RpParenExprContext extends RpContext {
		public RpContext relpath;
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpParenExprContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterRpParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitRpParenExpr(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new RpTagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(208);
				((RpTagNameContext)_localctx).tagName = match(ID);
				}
				break;
			case T__32:
				{
				_localctx = new RpWildcardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(T__32);
				}
				break;
			case T__33:
				{
				_localctx = new RpDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__33);
				}
				break;
			case T__34:
				{
				_localctx = new RpDblDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(T__34);
				}
				break;
			case T__35:
				{
				_localctx = new RpTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				match(T__35);
				}
				break;
			case T__36:
				{
				_localctx = new RpAttrNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(T__36);
				setState(214);
				((RpAttrNameContext)_localctx).attrName = match(ID);
				}
				break;
			case T__0:
				{
				_localctx = new RpParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(T__0);
				setState(216);
				((RpParenExprContext)_localctx).relpath = rp(0);
				setState(217);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new RpSlashExprContext(new RpContext(_parentctx, _parentState));
						((RpSlashExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(221);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(222);
						match(T__3);
						setState(223);
						((RpSlashExprContext)_localctx).right = rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpDblSlashExprContext(new RpContext(_parentctx, _parentState));
						((RpDblSlashExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(224);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(225);
						match(T__4);
						setState(226);
						((RpDblSlashExprContext)_localctx).right = rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpConcatExprContext(new RpContext(_parentctx, _parentState));
						((RpConcatExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(227);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(228);
						match(T__2);
						setState(229);
						((RpConcatExprContext)_localctx).right = rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpFilterExprContext(new RpContext(_parentctx, _parentState));
						((RpFilterExprContext)_localctx).relpath = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(230);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(231);
						match(T__27);
						setState(232);
						((RpFilterExprContext)_localctx).filter = f(0);
						setState(233);
						match(T__29);
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public FContext leftf;
		public FContext rightf;
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FilterAndExprContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilterAndExpr(this);
		}
	}
	public static class FilterRpContext extends FContext {
		public RpContext relPath;
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterRpContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilterRp(this);
		}
	}
	public static class FilterEqualValContext extends FContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterEqualValContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilterEqualVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilterEqualVal(this);
		}
	}
	public static class FilterOrExprContext extends FContext {
		public FContext leftf;
		public FContext rightf;
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public FilterOrExprContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilterOrExpr(this);
		}
	}
	public static class FilterParenExprContext extends FContext {
		public FContext filter;
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FilterParenExprContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilterParenExpr(this);
		}
	}
	public static class FilterNotExprContext extends FContext {
		public FContext filter;
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FilterNotExprContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilterNotExpr(this);
		}
	}
	public static class FilterEqualIdContext extends FContext {
		public RpContext left;
		public RpContext right;
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterEqualIdContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterFilterEqualId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitFilterEqualId(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_f, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new FilterRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(241);
				((FilterRpContext)_localctx).relPath = rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FilterEqualValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				((FilterEqualValContext)_localctx).left = rp(0);
				setState(243);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(244);
				((FilterEqualValContext)_localctx).right = rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FilterEqualIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246);
				((FilterEqualIdContext)_localctx).left = rp(0);
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(248);
				((FilterEqualIdContext)_localctx).right = rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FilterParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				match(T__0);
				setState(251);
				((FilterParenExprContext)_localctx).filter = f(0);
				setState(252);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FilterNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(T__25);
				setState(255);
				((FilterNotExprContext)_localctx).filter = f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new FilterAndExprContext(new FContext(_parentctx, _parentState));
						((FilterAndExprContext)_localctx).leftf = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(258);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(259);
						match(T__23);
						setState(260);
						((FilterAndExprContext)_localctx).rightf = f(4);
						}
						break;
					case 2:
						{
						_localctx = new FilterOrExprContext(new FContext(_parentctx, _parentState));
						((FilterOrExprContext)_localctx).leftf = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(261);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(262);
						match(T__24);
						setState(263);
						((FilterOrExprContext)_localctx).rightf = f(3);
						}
						break;
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			return xq_sempred((XqContext)_localctx, predIndex);
		case 6:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 9:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 10:
			return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0110\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3\7\3\65\n"+
		"\3\f\3\16\38\13\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4X\n\4\f\4\16\4[\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5e\n\5\f"+
		"\5\16\5h\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0086\n\b"+
		"\f\b\16\b\u0089\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0094\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00af\n\t\f\t\16\t\u00b2"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00be\n\t\f\t\16\t\u00c1"+
		"\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d0\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00de"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00ee\n\13\f\13\16\13\u00f1\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0103\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u010b\n\f\f\f\16\f\u010e\13\f\3\f\2\6\4\16\24\26\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\4\3\2\23\24\3\2\25\26\u012d\2\30\3\2\2\2\4?\3\2"+
		"\2\2\6O\3\2\2\2\b\\\3\2\2\2\ni\3\2\2\2\fl\3\2\2\2\16\u0093\3\2\2\2\20"+
		"\u00a0\3\2\2\2\22\u00cf\3\2\2\2\24\u00dd\3\2\2\2\26\u0102\3\2\2\2\30\31"+
		"\5\4\3\2\31\3\3\2\2\2\32\33\b\3\1\2\33@\7+\2\2\34@\7*\2\2\35@\5\22\n\2"+
		"\36\37\7\3\2\2\37 \5\4\3\2 !\7\4\2\2!@\3\2\2\2\"#\7\b\2\2#$\7(\2\2$%\7"+
		"\t\2\2%&\7\n\2\2&\'\5\4\3\2\'(\7\13\2\2()\7\f\2\2)*\7(\2\2*+\7\t\2\2+"+
		"@\3\2\2\2,\60\5\6\4\2-/\5\b\5\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\66\3\2\2\2\62\60\3\2\2\2\63\65\5\n\6\2\64\63\3\2\2\2\658\3"+
		"\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\5\f\7\2:"+
		"@\3\2\2\2;<\5\b\5\2<=\5\4\3\4=@\3\2\2\2>@\5\20\t\2?\32\3\2\2\2?\34\3\2"+
		"\2\2?\35\3\2\2\2?\36\3\2\2\2?\"\3\2\2\2?,\3\2\2\2?;\3\2\2\2?>\3\2\2\2"+
		"@L\3\2\2\2AB\f\t\2\2BC\7\5\2\2CK\5\4\3\nDE\f\b\2\2EF\7\6\2\2FK\5\24\13"+
		"\2GH\f\7\2\2HI\7\7\2\2IK\5\24\13\2JA\3\2\2\2JD\3\2\2\2JG\3\2\2\2KN\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NL\3\2\2\2OP\7\r\2\2PQ\7+\2\2QR\7\16"+
		"\2\2RY\5\4\3\2ST\7\5\2\2TU\7+\2\2UV\7\16\2\2VX\5\4\3\2WS\3\2\2\2X[\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z\7\3\2\2\2[Y\3\2\2\2\\]\7\17\2\2]^\7+\2\2^_\7"+
		"\20\2\2_f\5\4\3\2`a\7\5\2\2ab\7+\2\2bc\7\20\2\2ce\5\4\3\2d`\3\2\2\2eh"+
		"\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\t\3\2\2\2hf\3\2\2\2ij\7\21\2\2jk\5\16\b"+
		"\2k\13\3\2\2\2lm\7\22\2\2mn\5\4\3\2n\r\3\2\2\2op\b\b\1\2pq\5\4\3\2qr\t"+
		"\2\2\2rs\5\4\3\2s\u0094\3\2\2\2tu\5\4\3\2uv\t\3\2\2vw\5\4\3\2w\u0094\3"+
		"\2\2\2xy\7\27\2\2yz\7\3\2\2z{\5\4\3\2{|\7\4\2\2|\u0094\3\2\2\2}~\7\30"+
		"\2\2~\177\7+\2\2\177\u0080\7\16\2\2\u0080\u0087\5\4\3\2\u0081\u0082\7"+
		"\5\2\2\u0082\u0083\7+\2\2\u0083\u0084\7\16\2\2\u0084\u0086\5\4\3\2\u0085"+
		"\u0081\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\31\2\2\u008b"+
		"\u008c\5\16\b\7\u008c\u0094\3\2\2\2\u008d\u008e\7\3\2\2\u008e\u008f\5"+
		"\16\b\2\u008f\u0090\7\4\2\2\u0090\u0094\3\2\2\2\u0091\u0092\7\34\2\2\u0092"+
		"\u0094\5\16\b\3\u0093o\3\2\2\2\u0093t\3\2\2\2\u0093x\3\2\2\2\u0093}\3"+
		"\2\2\2\u0093\u008d\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u009d\3\2\2\2\u0095"+
		"\u0096\f\5\2\2\u0096\u0097\7\32\2\2\u0097\u009c\5\16\b\6\u0098\u0099\f"+
		"\4\2\2\u0099\u009a\7\33\2\2\u009a\u009c\5\16\b\5\u009b\u0095\3\2\2\2\u009b"+
		"\u0098\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\17\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\35\2\2\u00a1\u00a2"+
		"\7\3\2\2\u00a2\u00a3\5\4\3\2\u00a3\u00a4\7\5\2\2\u00a4\u00a5\5\4\3\2\u00a5"+
		"\u00a6\7\5\2\2\u00a6\u00a7\7\36\2\2\u00a7\u00a8\7\37\2\2\u00a8\u00a9\7"+
		"(\2\2\u00a9\u00b0\7\37\2\2\u00aa\u00ab\7\5\2\2\u00ab\u00ac\7\37\2\2\u00ac"+
		"\u00ad\7(\2\2\u00ad\u00af\7\37\2\2\u00ae\u00aa\3\2\2\2\u00af\u00b2\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\7 \2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\7\36"+
		"\2\2\u00b6\u00b7\7\37\2\2\u00b7\u00b8\7(\2\2\u00b8\u00bf\7\37\2\2\u00b9"+
		"\u00ba\7\5\2\2\u00ba\u00bb\7\37\2\2\u00bb\u00bc\7(\2\2\u00bc\u00be\7\37"+
		"\2\2\u00bd\u00b9\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7 "+
		"\2\2\u00c3\u00c4\7\4\2\2\u00c4\21\3\2\2\2\u00c5\u00c6\7!\2\2\u00c6\u00c7"+
		"\7)\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\7\6\2\2\u00c9\u00d0\5\24\13\2"+
		"\u00ca\u00cb\7!\2\2\u00cb\u00cc\7)\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce"+
		"\7\7\2\2\u00ce\u00d0\5\24\13\2\u00cf\u00c5\3\2\2\2\u00cf\u00ca\3\2\2\2"+
		"\u00d0\23\3\2\2\2\u00d1\u00d2\b\13\1\2\u00d2\u00de\7(\2\2\u00d3\u00de"+
		"\7#\2\2\u00d4\u00de\7$\2\2\u00d5\u00de\7%\2\2\u00d6\u00de\7&\2\2\u00d7"+
		"\u00d8\7\'\2\2\u00d8\u00de\7(\2\2\u00d9\u00da\7\3\2\2\u00da\u00db\5\24"+
		"\13\2\u00db\u00dc\7\4\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d1\3\2\2\2\u00dd"+
		"\u00d3\3\2\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d6\3\2"+
		"\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de\u00ef\3\2\2\2\u00df"+
		"\u00e0\f\6\2\2\u00e0\u00e1\7\6\2\2\u00e1\u00ee\5\24\13\7\u00e2\u00e3\f"+
		"\5\2\2\u00e3\u00e4\7\7\2\2\u00e4\u00ee\5\24\13\6\u00e5\u00e6\f\3\2\2\u00e6"+
		"\u00e7\7\5\2\2\u00e7\u00ee\5\24\13\4\u00e8\u00e9\f\4\2\2\u00e9\u00ea\7"+
		"\36\2\2\u00ea\u00eb\5\26\f\2\u00eb\u00ec\7 \2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00df\3\2\2\2\u00ed\u00e2\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e8\3\2"+
		"\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\25\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\b\f\1\2\u00f3\u0103\5\24\13"+
		"\2\u00f4\u00f5\5\24\13\2\u00f5\u00f6\t\2\2\2\u00f6\u00f7\5\24\13\2\u00f7"+
		"\u0103\3\2\2\2\u00f8\u00f9\5\24\13\2\u00f9\u00fa\t\3\2\2\u00fa\u00fb\5"+
		"\24\13\2\u00fb\u0103\3\2\2\2\u00fc\u00fd\7\3\2\2\u00fd\u00fe\5\26\f\2"+
		"\u00fe\u00ff\7\4\2\2\u00ff\u0103\3\2\2\2\u0100\u0101\7\34\2\2\u0101\u0103"+
		"\5\26\f\3\u0102\u00f2\3\2\2\2\u0102\u00f4\3\2\2\2\u0102\u00f8\3\2\2\2"+
		"\u0102\u00fc\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u010c\3\2\2\2\u0104\u0105"+
		"\f\5\2\2\u0105\u0106\7\32\2\2\u0106\u010b\5\26\f\6\u0107\u0108\f\4\2\2"+
		"\u0108\u0109\7\33\2\2\u0109\u010b\5\26\f\5\u010a\u0104\3\2\2\2\u010a\u0107"+
		"\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\27\3\2\2\2\u010e\u010c\3\2\2\2\26\60\66?JLYf\u0087\u0093\u009b\u009d"+
		"\u00b0\u00bf\u00cf\u00dd\u00ed\u00ef\u0102\u010a\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}