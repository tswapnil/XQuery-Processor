// Generated from XQuery.g4 by ANTLR 4.4

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
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__36=1, T__35=2, T__34=3, T__33=4, T__32=5, T__31=6, T__30=7, T__29=8, 
		T__28=9, T__27=10, T__26=11, T__25=12, T__24=13, T__23=14, T__22=15, T__21=16, 
		T__20=17, T__19=18, T__18=19, T__17=20, T__16=21, T__15=22, T__14=23, 
		T__13=24, T__12=25, T__11=26, T__10=27, T__9=28, T__8=29, T__7=30, T__6=31, 
		T__5=32, T__4=33, T__3=34, T__2=35, T__1=36, T__0=37, ID=38, FILE=39, 
		STRING=40, VAR=41, WS=42;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'some'", "'text()'", "'return'", "'{'", "'..'", "'='", 
		"'}'", "'for'", "':='", "'\"'", "'\")'", "'satisfies'", "'eq'", "'('", 
		"'is'", "'*'", "','", "'.'", "'join'", "'</'", "'doc(\"'", "'['", "'=='", 
		"'<'", "'//'", "']'", "'>'", "'@'", "'or'", "'where'", "'let'", "'in'", 
		"')'", "'and'", "'not'", "'empty'", "ID", "FILE", "STRING", "VAR", "WS"
	};
	public static final int
		RULE_start = 0, RULE_xq = 1, RULE_tagClause = 2, RULE_forClause = 3, RULE_letClause = 4, 
		RULE_whereClause = 5, RULE_returnClause = 6, RULE_cond = 7, RULE_joinClause = 8, 
		RULE_ap = 9, RULE_rp = 10, RULE_f = 11;
	public static final String[] ruleNames = {
		"start", "xq", "tagClause", "forClause", "letClause", "whereClause", "returnClause", 
		"cond", "joinClause", "ap", "rp", "f"
	};

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); xq(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqAp(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqJoinExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqContTagExprContext extends XqContext {
		public XqContTagExprContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqContTagExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqContTagExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqContTagExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqConcatExprContext extends XqContext {
		public XqContext leftQuery;
		public XqContext rightQuery;
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqConcatExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqParenExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqStrConstDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqLetExprContext extends XqContext {
		public LetClauseContext declaration;
		public XqContext query;
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqLetExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqDblSlashExprContext extends XqContext {
		public XqContext query;
		public RpContext relPath;
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqDblSlashExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqForExprContext extends XqContext {
		public ForClauseContext loop;
		public LetClauseContext declaration;
		public WhereClauseContext condition;
		public ReturnClauseContext output;
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
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
		public List<LetClauseContext> letClause() {
			return getRuleContexts(LetClauseContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqForExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqTagClauseContext extends XqContext {
		public TagClauseContext tClause;
		public TagClauseContext tagClause() {
			return getRuleContext(TagClauseContext.class,0);
		}
		public XqTagClauseContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterXqTagClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitXqTagClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqTagClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqSlashExprContext extends XqContext {
		public XqContext query;
		public RpContext relPath;
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqSlashExpr(this);
			else return visitor.visitChildren(this);
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
			setState(55);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new XqLetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(27); ((XqLetExprContext)_localctx).declaration = letClause();
				setState(28); ((XqLetExprContext)_localctx).query = xq(3);
				}
				break;
			case 2:
				{
				_localctx = new XqVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30); ((XqVarContext)_localctx).var = match(VAR);
				}
				break;
			case 3:
				{
				_localctx = new XqStrConstDefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31); ((XqStrConstDefContext)_localctx).strConst = match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new XqApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32); ap();
				}
				break;
			case 5:
				{
				_localctx = new XqParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33); match(T__22);
				setState(34); ((XqParenExprContext)_localctx).query = xq(0);
				setState(35); match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new XqContTagExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				}
				break;
			case 7:
				{
				_localctx = new XqForExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38); ((XqForExprContext)_localctx).loop = forClause();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(39); ((XqForExprContext)_localctx).declaration = letClause();
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(45); ((XqForExprContext)_localctx).condition = whereClause();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51); ((XqForExprContext)_localctx).output = returnClause();
				}
				break;
			case 8:
				{
				_localctx = new XqJoinExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53); ((XqJoinExprContext)_localctx).join = joinClause();
				}
				break;
			case 9:
				{
				_localctx = new XqTagClauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54); ((XqTagClauseContext)_localctx).tClause = tagClause();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new XqConcatExprContext(new XqContext(_parentctx, _parentState));
						((XqConcatExprContext)_localctx).leftQuery = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(57);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(58); match(T__19);
						setState(59); ((XqConcatExprContext)_localctx).rightQuery = xq(9);
						}
						break;
					case 2:
						{
						_localctx = new XqSlashExprContext(new XqContext(_parentctx, _parentState));
						((XqSlashExprContext)_localctx).query = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(60);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(61); match(T__36);
						setState(62); ((XqSlashExprContext)_localctx).relPath = rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XqDblSlashExprContext(new XqContext(_parentctx, _parentState));
						((XqDblSlashExprContext)_localctx).query = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(63);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(64); match(T__11);
						setState(65); ((XqDblSlashExprContext)_localctx).relPath = rp(0);
						}
						break;
					}
					} 
				}
				setState(70);
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

	public static class TagClauseContext extends ParserRuleContext {
		public TagClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagClause; }
	 
		public TagClauseContext() { }
		public void copyFrom(TagClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TagClauseImplContext extends TagClauseContext {
		public Token ID;
		public List<Token> openTagNameList = new ArrayList<Token>();
		public XqContext xq;
		public List<XqContext> queryList = new ArrayList<XqContext>();
		public List<Token> closeTagNameList = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(XQueryParser.ID); }
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(XQueryParser.ID, i);
		}
		public TagClauseImplContext(TagClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).enterTagClauseImpl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQueryListener ) ((XQueryListener)listener).exitTagClauseImpl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagClauseImpl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagClauseContext tagClause() throws RecognitionException {
		TagClauseContext _localctx = new TagClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tagClause);
		try {
			int _alt;
			_localctx = new TagClauseImplContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(T__12);
			setState(72); ((TagClauseImplContext)_localctx).ID = match(ID);
			((TagClauseImplContext)_localctx).openTagNameList.add(((TagClauseImplContext)_localctx).ID);
			setState(73); match(T__9);
			setState(74); match(T__32);
			setState(75); ((TagClauseImplContext)_localctx).xq = xq(0);
			((TagClauseImplContext)_localctx).queryList.add(((TagClauseImplContext)_localctx).xq);
			setState(76); match(T__29);
			setState(77); match(T__16);
			setState(78); ((TagClauseImplContext)_localctx).ID = match(ID);
			((TagClauseImplContext)_localctx).closeTagNameList.add(((TagClauseImplContext)_localctx).ID);
			setState(79); match(T__9);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80); match(T__12);
					setState(81); ((TagClauseImplContext)_localctx).ID = match(ID);
					((TagClauseImplContext)_localctx).openTagNameList.add(((TagClauseImplContext)_localctx).ID);
					setState(82); match(T__9);
					setState(83); match(T__32);
					setState(84); ((TagClauseImplContext)_localctx).xq = xq(0);
					((TagClauseImplContext)_localctx).queryList.add(((TagClauseImplContext)_localctx).xq);
					setState(85); match(T__29);
					setState(86); match(T__16);
					setState(87); ((TagClauseImplContext)_localctx).ID = match(ID);
					((TagClauseImplContext)_localctx).closeTagNameList.add(((TagClauseImplContext)_localctx).ID);
					setState(88); match(T__9);
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode VAR(int i) {
			return getToken(XQueryParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitForVarIter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forClause);
		int _la;
		try {
			_localctx = new ForVarIterContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(T__28);
			setState(96); ((ForVarIterContext)_localctx).VAR = match(VAR);
			((ForVarIterContext)_localctx).varList.add(((ForVarIterContext)_localctx).VAR);
			setState(97); match(T__4);
			setState(98); ((ForVarIterContext)_localctx).xq = xq(0);
			((ForVarIterContext)_localctx).queryList.add(((ForVarIterContext)_localctx).xq);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(99); match(T__19);
				setState(100); ((ForVarIterContext)_localctx).VAR = match(VAR);
				((ForVarIterContext)_localctx).varList.add(((ForVarIterContext)_localctx).VAR);
				setState(101); match(T__4);
				setState(102); ((ForVarIterContext)_localctx).xq = xq(0);
				((ForVarIterContext)_localctx).queryList.add(((ForVarIterContext)_localctx).xq);
				}
				}
				setState(107);
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
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode VAR(int i) {
			return getToken(XQueryParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_letClause);
		try {
			int _alt;
			_localctx = new LetVarDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(T__5);
			setState(109); ((LetVarDefContext)_localctx).VAR = match(VAR);
			((LetVarDefContext)_localctx).varList.add(((LetVarDefContext)_localctx).VAR);
			setState(110); match(T__27);
			setState(111); ((LetVarDefContext)_localctx).xq = xq(0);
			((LetVarDefContext)_localctx).queryList.add(((LetVarDefContext)_localctx).xq);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112); match(T__19);
					setState(113); ((LetVarDefContext)_localctx).VAR = match(VAR);
					((LetVarDefContext)_localctx).varList.add(((LetVarDefContext)_localctx).VAR);
					setState(114); match(T__27);
					setState(115); ((LetVarDefContext)_localctx).xq = xq(0);
					((LetVarDefContext)_localctx).queryList.add(((LetVarDefContext)_localctx).xq);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhereCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whereClause);
		try {
			_localctx = new WhereCondExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(T__6);
			setState(122); ((WhereCondExprContext)_localctx).condition = cond(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturnQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnClause);
		try {
			_localctx = new ReturnQueryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(T__33);
			setState(125); ((ReturnQueryContext)_localctx).query = xq(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondVarCheckContext extends CondContext {
		public Token VAR;
		public List<Token> varList = new ArrayList<Token>();
		public XqContext xq;
		public List<XqContext> queryList = new ArrayList<XqContext>();
		public CondContext condition;
		public List<TerminalNode> VAR() { return getTokens(XQueryParser.VAR); }
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode VAR(int i) {
			return getToken(XQueryParser.VAR, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondVarCheck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondOrExprContext extends CondContext {
		public CondContext leftCondition;
		public CondContext rightCondition;
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondOrExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondEqualValContext extends CondContext {
		public XqContext leftQuery;
		public XqContext rightQuery;
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondEqualVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondAndExprContext extends CondContext {
		public CondContext leftCondition;
		public CondContext rightCondition;
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondEqualIdContext extends CondContext {
		public XqContext leftQuery;
		public XqContext rightQuery;
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondEqualId(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondNotExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new CondVarCheckContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(128); match(T__35);
				setState(129); ((CondVarCheckContext)_localctx).VAR = match(VAR);
				((CondVarCheckContext)_localctx).varList.add(((CondVarCheckContext)_localctx).VAR);
				setState(130); match(T__4);
				setState(131); ((CondVarCheckContext)_localctx).xq = xq(0);
				((CondVarCheckContext)_localctx).queryList.add(((CondVarCheckContext)_localctx).xq);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19) {
					{
					{
					setState(132); match(T__19);
					setState(133); ((CondVarCheckContext)_localctx).VAR = match(VAR);
					((CondVarCheckContext)_localctx).varList.add(((CondVarCheckContext)_localctx).VAR);
					setState(134); match(T__4);
					setState(135); ((CondVarCheckContext)_localctx).xq = xq(0);
					((CondVarCheckContext)_localctx).queryList.add(((CondVarCheckContext)_localctx).xq);
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141); match(T__24);
				setState(142); ((CondVarCheckContext)_localctx).condition = cond(5);
				}
				break;
			case 2:
				{
				_localctx = new CondNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144); match(T__1);
				setState(145); ((CondNotExprContext)_localctx).condition = cond(1);
				}
				break;
			case 3:
				{
				_localctx = new CondEqualValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146); ((CondEqualValContext)_localctx).leftQuery = xq(0);
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(148); ((CondEqualValContext)_localctx).rightQuery = xq(0);
				}
				break;
			case 4:
				{
				_localctx = new CondEqualIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150); ((CondEqualIdContext)_localctx).leftQuery = xq(0);
				setState(151);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(152); ((CondEqualIdContext)_localctx).rightQuery = xq(0);
				}
				break;
			case 5:
				{
				_localctx = new CondEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154); match(T__0);
				setState(155); match(T__22);
				setState(156); ((CondEmptyContext)_localctx).query = xq(0);
				setState(157); match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new CondParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159); match(T__22);
				setState(160); ((CondParenExprContext)_localctx).condition = cond(0);
				setState(161); match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndExprContext(new CondContext(_parentctx, _parentState));
						((CondAndExprContext)_localctx).leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166); match(T__2);
						setState(167); ((CondAndExprContext)_localctx).rightCondition = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrExprContext(new CondContext(_parentctx, _parentState));
						((CondOrExprContext)_localctx).leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(168);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(169); match(T__7);
						setState(170); ((CondOrExprContext)_localctx).rightCondition = cond(3);
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public List<TerminalNode> ID() { return getTokens(XQueryParser.ID); }
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitJoinDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_joinClause);
		int _la;
		try {
			_localctx = new JoinDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(T__17);
			setState(177); match(T__22);
			setState(178); ((JoinDefContext)_localctx).query1 = xq(0);
			setState(179); match(T__19);
			setState(180); ((JoinDefContext)_localctx).query2 = xq(0);
			setState(181); match(T__19);
			setState(182); match(T__14);
			setState(183); match(T__26);
			setState(184); ((JoinDefContext)_localctx).ID = match(ID);
			((JoinDefContext)_localctx).attrList1.add(((JoinDefContext)_localctx).ID);
			setState(185); match(T__26);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(186); match(T__19);
				setState(187); match(T__26);
				setState(188); ((JoinDefContext)_localctx).ID = match(ID);
				((JoinDefContext)_localctx).attrList1.add(((JoinDefContext)_localctx).ID);
				setState(189); match(T__26);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195); match(T__10);
			setState(196); match(T__19);
			setState(197); match(T__14);
			setState(198); match(T__26);
			setState(199); ((JoinDefContext)_localctx).ID = match(ID);
			((JoinDefContext)_localctx).attrList2.add(((JoinDefContext)_localctx).ID);
			setState(200); match(T__26);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(201); match(T__19);
				setState(202); match(T__26);
				setState(203); ((JoinDefContext)_localctx).ID = match(ID);
				((JoinDefContext)_localctx).attrList2.add(((JoinDefContext)_localctx).ID);
				setState(204); match(T__26);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210); match(T__10);
			setState(211); match(T__3);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitApSlashFile(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitApDblSlashFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ap);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ApSlashFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213); match(T__15);
				setState(214); ((ApSlashFileContext)_localctx).docName = match(FILE);
				setState(215); match(T__25);
				setState(216); match(T__36);
				setState(217); ((ApSlashFileContext)_localctx).relpath = rp(0);
				}
				break;
			case 2:
				_localctx = new ApDblSlashFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(T__15);
				setState(219); ((ApDblSlashFileContext)_localctx).docName = match(FILE);
				setState(220); match(T__25);
				setState(221); match(T__11);
				setState(222); ((ApDblSlashFileContext)_localctx).relpath = rp(0);
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
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpDblSlashExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpDot(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpConcatExprContext extends RpContext {
		public RpContext left;
		public RpContext right;
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpConcatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpSlashExprContext extends RpContext {
		public RpContext left;
		public RpContext right;
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpSlashExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpFilterExprContext extends RpContext {
		public RpContext relpath;
		public FContext filter;
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpFilterExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpTagName(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpDblDot(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpAttrName(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpWildcard(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpParenExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new RpTagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(226); ((RpTagNameContext)_localctx).tagName = match(ID);
				}
				break;
			case T__20:
				{
				_localctx = new RpWildcardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227); match(T__20);
				}
				break;
			case T__18:
				{
				_localctx = new RpDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228); match(T__18);
				}
				break;
			case T__31:
				{
				_localctx = new RpDblDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229); match(T__31);
				}
				break;
			case T__34:
				{
				_localctx = new RpTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230); match(T__34);
				}
				break;
			case T__8:
				{
				_localctx = new RpAttrNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231); match(T__8);
				setState(232); ((RpAttrNameContext)_localctx).attrName = match(ID);
				}
				break;
			case T__22:
				{
				_localctx = new RpParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233); match(T__22);
				setState(234); ((RpParenExprContext)_localctx).relpath = rp(0);
				setState(235); match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(253);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new RpSlashExprContext(new RpContext(_parentctx, _parentState));
						((RpSlashExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(239);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(240); match(T__36);
						setState(241); ((RpSlashExprContext)_localctx).right = rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpDblSlashExprContext(new RpContext(_parentctx, _parentState));
						((RpDblSlashExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(242);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(243); match(T__11);
						setState(244); ((RpDblSlashExprContext)_localctx).right = rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpConcatExprContext(new RpContext(_parentctx, _parentState));
						((RpConcatExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(245);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(246); match(T__19);
						setState(247); ((RpConcatExprContext)_localctx).right = rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpFilterExprContext(new RpContext(_parentctx, _parentState));
						((RpFilterExprContext)_localctx).relpath = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(248);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(249); match(T__14);
						setState(250); ((RpFilterExprContext)_localctx).filter = f(0);
						setState(251); match(T__10);
						}
						break;
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterAndExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterEqualValContext extends FContext {
		public RpContext left;
		public RpContext right;
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterEqualVal(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterOrExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterParenExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterEqualIdContext extends FContext {
		public RpContext left;
		public RpContext right;
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterEqualId(this);
			else return visitor.visitChildren(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_f, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new FilterNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(259); match(T__1);
				setState(260); ((FilterNotExprContext)_localctx).filter = f(1);
				}
				break;
			case 2:
				{
				_localctx = new FilterRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261); ((FilterRpContext)_localctx).relPath = rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FilterEqualValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); ((FilterEqualValContext)_localctx).left = rp(0);
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(264); ((FilterEqualValContext)_localctx).right = rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FilterEqualIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266); ((FilterEqualIdContext)_localctx).left = rp(0);
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(268); ((FilterEqualIdContext)_localctx).right = rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FilterParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270); match(T__22);
				setState(271); ((FilterParenExprContext)_localctx).filter = f(0);
				setState(272); match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new FilterAndExprContext(new FContext(_parentctx, _parentState));
						((FilterAndExprContext)_localctx).leftf = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(276);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(277); match(T__2);
						setState(278); ((FilterAndExprContext)_localctx).rightf = f(4);
						}
						break;
					case 2:
						{
						_localctx = new FilterOrExprContext(new FContext(_parentctx, _parentState));
						((FilterOrExprContext)_localctx).leftf = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(279);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(280); match(T__7);
						setState(281); ((FilterOrExprContext)_localctx).rightf = f(3);
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		case 1: return xq_sempred((XqContext)_localctx, predIndex);
		case 7: return cond_sempred((CondContext)_localctx, predIndex);
		case 10: return rp_sempred((RpContext)_localctx, predIndex);
		case 11: return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return precpred(_ctx, 3);
		case 10: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);
		case 1: return precpred(_ctx, 7);
		case 2: return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 3);
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 4);
		case 6: return precpred(_ctx, 3);
		case 7: return precpred(_ctx, 1);
		case 8: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\7\3\61\n\3\f\3\16\3\64\13\3"+
		"\3\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3E\n\3"+
		"\f\3\16\3H\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6w"+
		"\n\6\f\6\16\6z\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a6"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ae\n\t\f\t\16\t\u00b1\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c1\n\n\f\n\16"+
		"\n\u00c4\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d0\n\n\f"+
		"\n\16\n\u00d3\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00e2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00f0\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\f\u0100\n\f\f\f\16\f\u0103\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0115\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u011d\n\r\f\r\16\r\u0120\13\r\3\r\2\6\4\20\26\30\16\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\2\4\4\2\t\t\20\20\4\2\22\22\32\32\u0140\2\32\3\2\2\2\4"+
		"9\3\2\2\2\6I\3\2\2\2\ba\3\2\2\2\nn\3\2\2\2\f{\3\2\2\2\16~\3\2\2\2\20\u00a5"+
		"\3\2\2\2\22\u00b2\3\2\2\2\24\u00e1\3\2\2\2\26\u00ef\3\2\2\2\30\u0114\3"+
		"\2\2\2\32\33\5\4\3\2\33\3\3\2\2\2\34\35\b\3\1\2\35\36\5\n\6\2\36\37\5"+
		"\4\3\5\37:\3\2\2\2 :\7+\2\2!:\7*\2\2\":\5\24\13\2#$\7\21\2\2$%\5\4\3\2"+
		"%&\7$\2\2&:\3\2\2\2\':\3\2\2\2(,\5\b\5\2)+\5\n\6\2*)\3\2\2\2+.\3\2\2\2"+
		",*\3\2\2\2,-\3\2\2\2-\62\3\2\2\2.,\3\2\2\2/\61\5\f\7\2\60/\3\2\2\2\61"+
		"\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65"+
		"\66\5\16\b\2\66:\3\2\2\2\67:\5\22\n\28:\5\6\4\29\34\3\2\2\29 \3\2\2\2"+
		"9!\3\2\2\29\"\3\2\2\29#\3\2\2\29\'\3\2\2\29(\3\2\2\29\67\3\2\2\298\3\2"+
		"\2\2:F\3\2\2\2;<\f\n\2\2<=\7\24\2\2=E\5\4\3\13>?\f\t\2\2?@\7\3\2\2@E\5"+
		"\26\f\2AB\f\b\2\2BC\7\34\2\2CE\5\26\f\2D;\3\2\2\2D>\3\2\2\2DA\3\2\2\2"+
		"EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\5\3\2\2\2HF\3\2\2\2IJ\7\33\2\2JK\7(\2"+
		"\2KL\7\36\2\2LM\7\7\2\2MN\5\4\3\2NO\7\n\2\2OP\7\27\2\2PQ\7(\2\2Q^\7\36"+
		"\2\2RS\7\33\2\2ST\7(\2\2TU\7\36\2\2UV\7\7\2\2VW\5\4\3\2WX\7\n\2\2XY\7"+
		"\27\2\2YZ\7(\2\2Z[\7\36\2\2[]\3\2\2\2\\R\3\2\2\2]`\3\2\2\2^\\\3\2\2\2"+
		"^_\3\2\2\2_\7\3\2\2\2`^\3\2\2\2ab\7\13\2\2bc\7+\2\2cd\7#\2\2dk\5\4\3\2"+
		"ef\7\24\2\2fg\7+\2\2gh\7#\2\2hj\5\4\3\2ie\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2l\t\3\2\2\2mk\3\2\2\2no\7\"\2\2op\7+\2\2pq\7\f\2\2qx\5\4\3\2"+
		"rs\7\24\2\2st\7+\2\2tu\7\f\2\2uw\5\4\3\2vr\3\2\2\2wz\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2y\13\3\2\2\2zx\3\2\2\2{|\7!\2\2|}\5\20\t\2}\r\3\2\2\2~\177\7"+
		"\6\2\2\177\u0080\5\4\3\2\u0080\17\3\2\2\2\u0081\u0082\b\t\1\2\u0082\u0083"+
		"\7\4\2\2\u0083\u0084\7+\2\2\u0084\u0085\7#\2\2\u0085\u008c\5\4\3\2\u0086"+
		"\u0087\7\24\2\2\u0087\u0088\7+\2\2\u0088\u0089\7#\2\2\u0089\u008b\5\4"+
		"\3\2\u008a\u0086\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\17"+
		"\2\2\u0090\u0091\5\20\t\7\u0091\u00a6\3\2\2\2\u0092\u0093\7&\2\2\u0093"+
		"\u00a6\5\20\t\3\u0094\u0095\5\4\3\2\u0095\u0096\t\2\2\2\u0096\u0097\5"+
		"\4\3\2\u0097\u00a6\3\2\2\2\u0098\u0099\5\4\3\2\u0099\u009a\t\3\2\2\u009a"+
		"\u009b\5\4\3\2\u009b\u00a6\3\2\2\2\u009c\u009d\7\'\2\2\u009d\u009e\7\21"+
		"\2\2\u009e\u009f\5\4\3\2\u009f\u00a0\7$\2\2\u00a0\u00a6\3\2\2\2\u00a1"+
		"\u00a2\7\21\2\2\u00a2\u00a3\5\20\t\2\u00a3\u00a4\7$\2\2\u00a4\u00a6\3"+
		"\2\2\2\u00a5\u0081\3\2\2\2\u00a5\u0092\3\2\2\2\u00a5\u0094\3\2\2\2\u00a5"+
		"\u0098\3\2\2\2\u00a5\u009c\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\u00af\3\2"+
		"\2\2\u00a7\u00a8\f\5\2\2\u00a8\u00a9\7%\2\2\u00a9\u00ae\5\20\t\6\u00aa"+
		"\u00ab\f\4\2\2\u00ab\u00ac\7 \2\2\u00ac\u00ae\5\20\t\5\u00ad\u00a7\3\2"+
		"\2\2\u00ad\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\21\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\26\2"+
		"\2\u00b3\u00b4\7\21\2\2\u00b4\u00b5\5\4\3\2\u00b5\u00b6\7\24\2\2\u00b6"+
		"\u00b7\5\4\3\2\u00b7\u00b8\7\24\2\2\u00b8\u00b9\7\31\2\2\u00b9\u00ba\7"+
		"\r\2\2\u00ba\u00bb\7(\2\2\u00bb\u00c2\7\r\2\2\u00bc\u00bd\7\24\2\2\u00bd"+
		"\u00be\7\r\2\2\u00be\u00bf\7(\2\2\u00bf\u00c1\7\r\2\2\u00c0\u00bc\3\2"+
		"\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\35\2\2\u00c6\u00c7\7"+
		"\24\2\2\u00c7\u00c8\7\31\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\7(\2\2\u00ca"+
		"\u00d1\7\r\2\2\u00cb\u00cc\7\24\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\7"+
		"(\2\2\u00ce\u00d0\7\r\2\2\u00cf\u00cb\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d5\7\35\2\2\u00d5\u00d6\7$\2\2\u00d6\23\3\2\2\2\u00d7\u00d8"+
		"\7\30\2\2\u00d8\u00d9\7)\2\2\u00d9\u00da\7\16\2\2\u00da\u00db\7\3\2\2"+
		"\u00db\u00e2\5\26\f\2\u00dc\u00dd\7\30\2\2\u00dd\u00de\7)\2\2\u00de\u00df"+
		"\7\16\2\2\u00df\u00e0\7\34\2\2\u00e0\u00e2\5\26\f\2\u00e1\u00d7\3\2\2"+
		"\2\u00e1\u00dc\3\2\2\2\u00e2\25\3\2\2\2\u00e3\u00e4\b\f\1\2\u00e4\u00f0"+
		"\7(\2\2\u00e5\u00f0\7\23\2\2\u00e6\u00f0\7\25\2\2\u00e7\u00f0\7\b\2\2"+
		"\u00e8\u00f0\7\5\2\2\u00e9\u00ea\7\37\2\2\u00ea\u00f0\7(\2\2\u00eb\u00ec"+
		"\7\21\2\2\u00ec\u00ed\5\26\f\2\u00ed\u00ee\7$\2\2\u00ee\u00f0\3\2\2\2"+
		"\u00ef\u00e3\3\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00e7"+
		"\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00eb\3\2\2\2\u00f0"+
		"\u0101\3\2\2\2\u00f1\u00f2\f\6\2\2\u00f2\u00f3\7\3\2\2\u00f3\u0100\5\26"+
		"\f\7\u00f4\u00f5\f\5\2\2\u00f5\u00f6\7\34\2\2\u00f6\u0100\5\26\f\6\u00f7"+
		"\u00f8\f\3\2\2\u00f8\u00f9\7\24\2\2\u00f9\u0100\5\26\f\4\u00fa\u00fb\f"+
		"\4\2\2\u00fb\u00fc\7\31\2\2\u00fc\u00fd\5\30\r\2\u00fd\u00fe\7\35\2\2"+
		"\u00fe\u0100\3\2\2\2\u00ff\u00f1\3\2\2\2\u00ff\u00f4\3\2\2\2\u00ff\u00f7"+
		"\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\27\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\b\r\1"+
		"\2\u0105\u0106\7&\2\2\u0106\u0115\5\30\r\3\u0107\u0115\5\26\f\2\u0108"+
		"\u0109\5\26\f\2\u0109\u010a\t\2\2\2\u010a\u010b\5\26\f\2\u010b\u0115\3"+
		"\2\2\2\u010c\u010d\5\26\f\2\u010d\u010e\t\3\2\2\u010e\u010f\5\26\f\2\u010f"+
		"\u0115\3\2\2\2\u0110\u0111\7\21\2\2\u0111\u0112\5\30\r\2\u0112\u0113\7"+
		"$\2\2\u0113\u0115\3\2\2\2\u0114\u0104\3\2\2\2\u0114\u0107\3\2\2\2\u0114"+
		"\u0108\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u0110\3\2\2\2\u0115\u011e\3\2"+
		"\2\2\u0116\u0117\f\5\2\2\u0117\u0118\7%\2\2\u0118\u011d\5\30\r\6\u0119"+
		"\u011a\f\4\2\2\u011a\u011b\7 \2\2\u011b\u011d\5\30\r\5\u011c\u0116\3\2"+
		"\2\2\u011c\u0119\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\31\3\2\2\2\u0120\u011e\3\2\2\2\27,\629DF^kx\u008c"+
		"\u00a5\u00ad\u00af\u00c2\u00d1\u00e1\u00ef\u00ff\u0101\u0114\u011c\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}