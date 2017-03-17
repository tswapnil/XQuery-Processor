// Generated from XQuery.g4 by ANTLR 4.6

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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, ID=37, FILE=38, STRING=39, 
		VAR=40, WS=41;
	public static final int
		RULE_start = 0, RULE_xq = 1, RULE_tagClause = 2, RULE_forClause = 3, RULE_letClause = 4, 
		RULE_whereClause = 5, RULE_returnClause = 6, RULE_cond = 7, RULE_joinClause = 8, 
		RULE_ap = 9, RULE_rp = 10, RULE_f = 11;
	public static final String[] ruleNames = {
		"start", "xq", "tagClause", "forClause", "letClause", "whereClause", "returnClause", 
		"cond", "joinClause", "ap", "rp", "f"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'/'", "'//'", "'<'", "'>'", "'{'", "'}'", 
		"'</'", "'for'", "'in'", "'let'", "':='", "'where'", "'return'", "'='", 
		"'eq'", "'=='", "'is'", "'empty'", "'some'", "'satisfies'", "'and'", "'or'", 
		"'not'", "'join'", "'['", "']'", "'doc(\"'", "'\")'", "'*'", "'.'", "'..'", 
		"'text()'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ID", "FILE", "STRING", "VAR", "WS"
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
			setState(24);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqVar(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqStrConstDef(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqLetExpr(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqTagClause(this);
			else return visitor.visitChildren(this);
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
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new XqVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(27);
				((XqVarContext)_localctx).var = match(VAR);
				}
				break;
			case STRING:
				{
				_localctx = new XqStrConstDefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				((XqStrConstDefContext)_localctx).strConst = match(STRING);
				}
				break;
			case T__29:
				{
				_localctx = new XqApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				ap();
				}
				break;
			case T__0:
				{
				_localctx = new XqParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				match(T__0);
				setState(31);
				((XqParenExprContext)_localctx).query = xq(0);
				setState(32);
				match(T__1);
				}
				break;
			case T__10:
				{
				_localctx = new XqForExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				((XqForExprContext)_localctx).loop = forClause();
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(35);
					((XqForExprContext)_localctx).declaration = letClause();
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(41);
					((XqForExprContext)_localctx).condition = whereClause();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(47);
				((XqForExprContext)_localctx).output = returnClause();
				}
				break;
			case T__12:
				{
				_localctx = new XqLetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				((XqLetExprContext)_localctx).declaration = letClause();
				setState(50);
				((XqLetExprContext)_localctx).query = xq(3);
				}
				break;
			case T__26:
				{
				_localctx = new XqJoinExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				((XqJoinExprContext)_localctx).join = joinClause();
				}
				break;
			case T__5:
				{
				_localctx = new XqTagClauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				((XqTagClauseContext)_localctx).tClause = tagClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new XqConcatExprContext(new XqContext(_parentctx, _parentState));
						((XqConcatExprContext)_localctx).leftQuery = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(56);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(57);
						match(T__2);
						setState(58);
						((XqConcatExprContext)_localctx).rightQuery = xq(8);
						}
						break;
					case 2:
						{
						_localctx = new XqSlashExprContext(new XqContext(_parentctx, _parentState));
						((XqSlashExprContext)_localctx).query = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(59);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(60);
						match(T__3);
						setState(61);
						((XqSlashExprContext)_localctx).relPath = rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XqDblSlashExprContext(new XqContext(_parentctx, _parentState));
						((XqDblSlashExprContext)_localctx).query = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(62);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(63);
						match(T__4);
						setState(64);
						((XqDblSlashExprContext)_localctx).relPath = rp(0);
						}
						break;
					}
					} 
				}
				setState(69);
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
		public TerminalNode ID(int i) {
			return getToken(XQueryParser.ID, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TagClauseImplContext(TagClauseContext ctx) { copyFrom(ctx); }
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
			setState(70);
			match(T__5);
			setState(71);
			((TagClauseImplContext)_localctx).ID = match(ID);
			((TagClauseImplContext)_localctx).openTagNameList.add(((TagClauseImplContext)_localctx).ID);
			setState(72);
			match(T__6);
			setState(73);
			match(T__7);
			setState(74);
			((TagClauseImplContext)_localctx).xq = xq(0);
			((TagClauseImplContext)_localctx).queryList.add(((TagClauseImplContext)_localctx).xq);
			setState(75);
			match(T__8);
			setState(76);
			match(T__9);
			setState(77);
			((TagClauseImplContext)_localctx).ID = match(ID);
			((TagClauseImplContext)_localctx).closeTagNameList.add(((TagClauseImplContext)_localctx).ID);
			setState(78);
			match(T__6);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					match(T__5);
					setState(80);
					((TagClauseImplContext)_localctx).ID = match(ID);
					((TagClauseImplContext)_localctx).openTagNameList.add(((TagClauseImplContext)_localctx).ID);
					setState(81);
					match(T__6);
					setState(82);
					match(T__7);
					setState(83);
					((TagClauseImplContext)_localctx).xq = xq(0);
					((TagClauseImplContext)_localctx).queryList.add(((TagClauseImplContext)_localctx).xq);
					setState(84);
					match(T__8);
					setState(85);
					match(T__9);
					setState(86);
					((TagClauseImplContext)_localctx).ID = match(ID);
					((TagClauseImplContext)_localctx).closeTagNameList.add(((TagClauseImplContext)_localctx).ID);
					setState(87);
					match(T__6);
					}
					} 
				}
				setState(93);
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
			setState(94);
			match(T__10);
			setState(95);
			((ForVarIterContext)_localctx).VAR = match(VAR);
			((ForVarIterContext)_localctx).varList.add(((ForVarIterContext)_localctx).VAR);
			setState(96);
			match(T__11);
			setState(97);
			((ForVarIterContext)_localctx).xq = xq(0);
			((ForVarIterContext)_localctx).queryList.add(((ForVarIterContext)_localctx).xq);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(98);
				match(T__2);
				setState(99);
				((ForVarIterContext)_localctx).VAR = match(VAR);
				((ForVarIterContext)_localctx).varList.add(((ForVarIterContext)_localctx).VAR);
				setState(100);
				match(T__11);
				setState(101);
				((ForVarIterContext)_localctx).xq = xq(0);
				((ForVarIterContext)_localctx).queryList.add(((ForVarIterContext)_localctx).xq);
				}
				}
				setState(106);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_letClause);
		int _la;
		try {
			_localctx = new LetVarDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__12);
			setState(108);
			((LetVarDefContext)_localctx).VAR = match(VAR);
			((LetVarDefContext)_localctx).varList.add(((LetVarDefContext)_localctx).VAR);
			setState(109);
			match(T__13);
			setState(110);
			((LetVarDefContext)_localctx).xq = xq(0);
			((LetVarDefContext)_localctx).queryList.add(((LetVarDefContext)_localctx).xq);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(111);
				match(T__2);
				setState(112);
				((LetVarDefContext)_localctx).VAR = match(VAR);
				((LetVarDefContext)_localctx).varList.add(((LetVarDefContext)_localctx).VAR);
				setState(113);
				match(T__13);
				setState(114);
				((LetVarDefContext)_localctx).xq = xq(0);
				((LetVarDefContext)_localctx).queryList.add(((LetVarDefContext)_localctx).xq);
				}
				}
				setState(119);
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
			setState(120);
			match(T__14);
			setState(121);
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
			setState(123);
			match(T__15);
			setState(124);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondVarCheck(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondParenExpr(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondEqualVal(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCondAndExpr(this);
			else return visitor.visitChildren(this);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new CondEqualValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(127);
				((CondEqualValContext)_localctx).leftQuery = xq(0);
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				((CondEqualValContext)_localctx).rightQuery = xq(0);
				}
				break;
			case 2:
				{
				_localctx = new CondEqualIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				((CondEqualIdContext)_localctx).leftQuery = xq(0);
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				((CondEqualIdContext)_localctx).rightQuery = xq(0);
				}
				break;
			case 3:
				{
				_localctx = new CondEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(T__20);
				setState(136);
				match(T__0);
				setState(137);
				((CondEmptyContext)_localctx).query = xq(0);
				setState(138);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new CondVarCheckContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(T__21);
				setState(141);
				((CondVarCheckContext)_localctx).VAR = match(VAR);
				((CondVarCheckContext)_localctx).varList.add(((CondVarCheckContext)_localctx).VAR);
				setState(142);
				match(T__11);
				setState(143);
				((CondVarCheckContext)_localctx).xq = xq(0);
				((CondVarCheckContext)_localctx).queryList.add(((CondVarCheckContext)_localctx).xq);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(144);
					match(T__2);
					setState(145);
					((CondVarCheckContext)_localctx).VAR = match(VAR);
					((CondVarCheckContext)_localctx).varList.add(((CondVarCheckContext)_localctx).VAR);
					setState(146);
					match(T__11);
					setState(147);
					((CondVarCheckContext)_localctx).xq = xq(0);
					((CondVarCheckContext)_localctx).queryList.add(((CondVarCheckContext)_localctx).xq);
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(T__22);
				setState(154);
				((CondVarCheckContext)_localctx).condition = cond(5);
				}
				break;
			case 5:
				{
				_localctx = new CondParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(T__0);
				setState(157);
				((CondParenExprContext)_localctx).condition = cond(0);
				setState(158);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new CondNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(T__25);
				setState(161);
				((CondNotExprContext)_localctx).condition = cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndExprContext(new CondContext(_parentctx, _parentState));
						((CondAndExprContext)_localctx).leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(164);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(165);
						match(T__23);
						setState(166);
						((CondAndExprContext)_localctx).rightCondition = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrExprContext(new CondContext(_parentctx, _parentState));
						((CondOrExprContext)_localctx).leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(167);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(168);
						match(T__24);
						setState(169);
						((CondOrExprContext)_localctx).rightCondition = cond(3);
						}
						break;
					}
					} 
				}
				setState(174);
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
			setState(175);
			match(T__26);
			setState(176);
			match(T__0);
			setState(177);
			((JoinDefContext)_localctx).query1 = xq(0);
			setState(178);
			match(T__2);
			setState(179);
			((JoinDefContext)_localctx).query2 = xq(0);
			setState(180);
			match(T__2);
			setState(181);
			match(T__27);
			setState(182);
			((JoinDefContext)_localctx).ID = match(ID);
			((JoinDefContext)_localctx).attrList1.add(((JoinDefContext)_localctx).ID);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(183);
				match(T__2);
				setState(184);
				((JoinDefContext)_localctx).ID = match(ID);
				((JoinDefContext)_localctx).attrList1.add(((JoinDefContext)_localctx).ID);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(T__28);
			setState(191);
			match(T__2);
			setState(192);
			match(T__27);
			setState(193);
			((JoinDefContext)_localctx).ID = match(ID);
			((JoinDefContext)_localctx).attrList2.add(((JoinDefContext)_localctx).ID);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(194);
				match(T__2);
				setState(195);
				((JoinDefContext)_localctx).ID = match(ID);
				((JoinDefContext)_localctx).attrList2.add(((JoinDefContext)_localctx).ID);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(T__28);
			setState(202);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitApDblSlashFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ap);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ApSlashFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__29);
				setState(205);
				((ApSlashFileContext)_localctx).docName = match(FILE);
				setState(206);
				match(T__30);
				setState(207);
				match(T__3);
				setState(208);
				((ApSlashFileContext)_localctx).relpath = rp(0);
				}
				break;
			case 2:
				_localctx = new ApDblSlashFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__29);
				setState(210);
				((ApDblSlashFileContext)_localctx).docName = match(FILE);
				setState(211);
				match(T__30);
				setState(212);
				match(T__4);
				setState(213);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpDblSlashExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpDotContext extends RpContext {
		public RpDotContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpDot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpTextContext extends RpContext {
		public RpTextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpText(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpConcatExpr(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpSlashExpr(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpTagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpDblDotContext extends RpContext {
		public RpDblDotContext(RpContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpAttrName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpWildcardContext extends RpContext {
		public RpWildcardContext(RpContext ctx) { copyFrom(ctx); }
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
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new RpTagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(217);
				((RpTagNameContext)_localctx).tagName = match(ID);
				}
				break;
			case T__31:
				{
				_localctx = new RpWildcardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(T__31);
				}
				break;
			case T__32:
				{
				_localctx = new RpDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(T__32);
				}
				break;
			case T__33:
				{
				_localctx = new RpDblDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(T__33);
				}
				break;
			case T__34:
				{
				_localctx = new RpTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(T__34);
				}
				break;
			case T__35:
				{
				_localctx = new RpAttrNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(T__35);
				setState(223);
				((RpAttrNameContext)_localctx).attrName = match(ID);
				}
				break;
			case T__0:
				{
				_localctx = new RpParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(T__0);
				setState(225);
				((RpParenExprContext)_localctx).relpath = rp(0);
				setState(226);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new RpSlashExprContext(new RpContext(_parentctx, _parentState));
						((RpSlashExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(230);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(231);
						match(T__3);
						setState(232);
						((RpSlashExprContext)_localctx).right = rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpDblSlashExprContext(new RpContext(_parentctx, _parentState));
						((RpDblSlashExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(233);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(234);
						match(T__4);
						setState(235);
						((RpDblSlashExprContext)_localctx).right = rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpConcatExprContext(new RpContext(_parentctx, _parentState));
						((RpConcatExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(236);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(237);
						match(T__2);
						setState(238);
						((RpConcatExprContext)_localctx).right = rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpFilterExprContext(new RpContext(_parentctx, _parentState));
						((RpFilterExprContext)_localctx).relpath = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(239);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(240);
						match(T__27);
						setState(241);
						((RpFilterExprContext)_localctx).filter = f(0);
						setState(242);
						match(T__28);
						}
						break;
					}
					} 
				}
				setState(248);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterRp(this);
			else return visitor.visitChildren(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilterNotExpr(this);
			else return visitor.visitChildren(this);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new FilterRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(250);
				((FilterRpContext)_localctx).relPath = rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FilterEqualValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				((FilterEqualValContext)_localctx).left = rp(0);
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				((FilterEqualValContext)_localctx).right = rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FilterEqualIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				((FilterEqualIdContext)_localctx).left = rp(0);
				setState(256);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				((FilterEqualIdContext)_localctx).right = rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FilterParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259);
				match(T__0);
				setState(260);
				((FilterParenExprContext)_localctx).filter = f(0);
				setState(261);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FilterNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				match(T__25);
				setState(264);
				((FilterNotExprContext)_localctx).filter = f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new FilterAndExprContext(new FContext(_parentctx, _parentState));
						((FilterAndExprContext)_localctx).leftf = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(267);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(268);
						match(T__23);
						setState(269);
						((FilterAndExprContext)_localctx).rightf = f(4);
						}
						break;
					case 2:
						{
						_localctx = new FilterOrExprContext(new FContext(_parentctx, _parentState));
						((FilterOrExprContext)_localctx).leftf = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(270);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(271);
						match(T__24);
						setState(272);
						((FilterOrExprContext)_localctx).rightf = f(3);
						}
						break;
					}
					} 
				}
				setState(277);
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
		case 1:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 7:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 10:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 11:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0119\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3\'\n\3\f\3\16\3*\13\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\39\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3D\n\3\f\3"+
		"\16\3G\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6v\n"+
		"\6\f\6\16\6y\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0097"+
		"\n\t\f\t\16\t\u009a\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a5"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bc\n\n\f\n\16\n\u00bf\13\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u00c7\n\n\f\n\16\n\u00ca\13\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d9\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e7\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f7\n\f\f\f\16\f\u00fa"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u010c\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0114\n\r\f\r\16\r\u0117\13"+
		"\r\3\r\2\6\4\20\26\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\23\24\3"+
		"\2\25\26\u0136\2\32\3\2\2\2\48\3\2\2\2\6H\3\2\2\2\b`\3\2\2\2\nm\3\2\2"+
		"\2\fz\3\2\2\2\16}\3\2\2\2\20\u00a4\3\2\2\2\22\u00b1\3\2\2\2\24\u00d8\3"+
		"\2\2\2\26\u00e6\3\2\2\2\30\u010b\3\2\2\2\32\33\5\4\3\2\33\3\3\2\2\2\34"+
		"\35\b\3\1\2\359\7*\2\2\369\7)\2\2\379\5\24\13\2 !\7\3\2\2!\"\5\4\3\2\""+
		"#\7\4\2\2#9\3\2\2\2$(\5\b\5\2%\'\5\n\6\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2"+
		"\2()\3\2\2\2).\3\2\2\2*(\3\2\2\2+-\5\f\7\2,+\3\2\2\2-\60\3\2\2\2.,\3\2"+
		"\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\5\16\b\2\629\3\2\2\2\63\64"+
		"\5\n\6\2\64\65\5\4\3\5\659\3\2\2\2\669\5\22\n\2\679\5\6\4\28\34\3\2\2"+
		"\28\36\3\2\2\28\37\3\2\2\28 \3\2\2\28$\3\2\2\28\63\3\2\2\28\66\3\2\2\2"+
		"8\67\3\2\2\29E\3\2\2\2:;\f\t\2\2;<\7\5\2\2<D\5\4\3\n=>\f\b\2\2>?\7\6\2"+
		"\2?D\5\26\f\2@A\f\7\2\2AB\7\7\2\2BD\5\26\f\2C:\3\2\2\2C=\3\2\2\2C@\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GE\3\2\2\2HI\7\b\2\2IJ\7"+
		"\'\2\2JK\7\t\2\2KL\7\n\2\2LM\5\4\3\2MN\7\13\2\2NO\7\f\2\2OP\7\'\2\2P]"+
		"\7\t\2\2QR\7\b\2\2RS\7\'\2\2ST\7\t\2\2TU\7\n\2\2UV\5\4\3\2VW\7\13\2\2"+
		"WX\7\f\2\2XY\7\'\2\2YZ\7\t\2\2Z\\\3\2\2\2[Q\3\2\2\2\\_\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^\7\3\2\2\2_]\3\2\2\2`a\7\r\2\2ab\7*\2\2bc\7\16\2\2cj\5\4"+
		"\3\2de\7\5\2\2ef\7*\2\2fg\7\16\2\2gi\5\4\3\2hd\3\2\2\2il\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2k\t\3\2\2\2lj\3\2\2\2mn\7\17\2\2no\7*\2\2op\7\20\2\2pw\5"+
		"\4\3\2qr\7\5\2\2rs\7*\2\2st\7\20\2\2tv\5\4\3\2uq\3\2\2\2vy\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2x\13\3\2\2\2yw\3\2\2\2z{\7\21\2\2{|\5\20\t\2|\r\3\2\2"+
		"\2}~\7\22\2\2~\177\5\4\3\2\177\17\3\2\2\2\u0080\u0081\b\t\1\2\u0081\u0082"+
		"\5\4\3\2\u0082\u0083\t\2\2\2\u0083\u0084\5\4\3\2\u0084\u00a5\3\2\2\2\u0085"+
		"\u0086\5\4\3\2\u0086\u0087\t\3\2\2\u0087\u0088\5\4\3\2\u0088\u00a5\3\2"+
		"\2\2\u0089\u008a\7\27\2\2\u008a\u008b\7\3\2\2\u008b\u008c\5\4\3\2\u008c"+
		"\u008d\7\4\2\2\u008d\u00a5\3\2\2\2\u008e\u008f\7\30\2\2\u008f\u0090\7"+
		"*\2\2\u0090\u0091\7\16\2\2\u0091\u0098\5\4\3\2\u0092\u0093\7\5\2\2\u0093"+
		"\u0094\7*\2\2\u0094\u0095\7\16\2\2\u0095\u0097\5\4\3\2\u0096\u0092\3\2"+
		"\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\31\2\2\u009c\u009d\5"+
		"\20\t\7\u009d\u00a5\3\2\2\2\u009e\u009f\7\3\2\2\u009f\u00a0\5\20\t\2\u00a0"+
		"\u00a1\7\4\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a3\7\34\2\2\u00a3\u00a5\5"+
		"\20\t\3\u00a4\u0080\3\2\2\2\u00a4\u0085\3\2\2\2\u00a4\u0089\3\2\2\2\u00a4"+
		"\u008e\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00ae\3\2"+
		"\2\2\u00a6\u00a7\f\5\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00ad\5\20\t\6\u00a9"+
		"\u00aa\f\4\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00ad\5\20\t\5\u00ac\u00a6\3"+
		"\2\2\2\u00ac\u00a9\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\21\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\35\2"+
		"\2\u00b2\u00b3\7\3\2\2\u00b3\u00b4\5\4\3\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6"+
		"\5\4\3\2\u00b6\u00b7\7\5\2\2\u00b7\u00b8\7\36\2\2\u00b8\u00bd\7\'\2\2"+
		"\u00b9\u00ba\7\5\2\2\u00ba\u00bc\7\'\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\7\37\2\2\u00c1\u00c2\7\5\2\2\u00c2\u00c3\7"+
		"\36\2\2\u00c3\u00c8\7\'\2\2\u00c4\u00c5\7\5\2\2\u00c5\u00c7\7\'\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7\37\2\2\u00cc"+
		"\u00cd\7\4\2\2\u00cd\23\3\2\2\2\u00ce\u00cf\7 \2\2\u00cf\u00d0\7(\2\2"+
		"\u00d0\u00d1\7!\2\2\u00d1\u00d2\7\6\2\2\u00d2\u00d9\5\26\f\2\u00d3\u00d4"+
		"\7 \2\2\u00d4\u00d5\7(\2\2\u00d5\u00d6\7!\2\2\u00d6\u00d7\7\7\2\2\u00d7"+
		"\u00d9\5\26\f\2\u00d8\u00ce\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d9\25\3\2\2"+
		"\2\u00da\u00db\b\f\1\2\u00db\u00e7\7\'\2\2\u00dc\u00e7\7\"\2\2\u00dd\u00e7"+
		"\7#\2\2\u00de\u00e7\7$\2\2\u00df\u00e7\7%\2\2\u00e0\u00e1\7&\2\2\u00e1"+
		"\u00e7\7\'\2\2\u00e2\u00e3\7\3\2\2\u00e3\u00e4\5\26\f\2\u00e4\u00e5\7"+
		"\4\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6"+
		"\u00dd\3\2\2\2\u00e6\u00de\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6\u00e0\3\2"+
		"\2\2\u00e6\u00e2\3\2\2\2\u00e7\u00f8\3\2\2\2\u00e8\u00e9\f\6\2\2\u00e9"+
		"\u00ea\7\6\2\2\u00ea\u00f7\5\26\f\7\u00eb\u00ec\f\5\2\2\u00ec\u00ed\7"+
		"\7\2\2\u00ed\u00f7\5\26\f\6\u00ee\u00ef\f\3\2\2\u00ef\u00f0\7\5\2\2\u00f0"+
		"\u00f7\5\26\f\4\u00f1\u00f2\f\4\2\2\u00f2\u00f3\7\36\2\2\u00f3\u00f4\5"+
		"\30\r\2\u00f4\u00f5\7\37\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00e8\3\2\2\2\u00f6"+
		"\u00eb\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\27\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fb\u00fc\b\r\1\2\u00fc\u010c\5\26\f\2\u00fd\u00fe\5\26\f\2"+
		"\u00fe\u00ff\t\2\2\2\u00ff\u0100\5\26\f\2\u0100\u010c\3\2\2\2\u0101\u0102"+
		"\5\26\f\2\u0102\u0103\t\3\2\2\u0103\u0104\5\26\f\2\u0104\u010c\3\2\2\2"+
		"\u0105\u0106\7\3\2\2\u0106\u0107\5\30\r\2\u0107\u0108\7\4\2\2\u0108\u010c"+
		"\3\2\2\2\u0109\u010a\7\34\2\2\u010a\u010c\5\30\r\3\u010b\u00fb\3\2\2\2"+
		"\u010b\u00fd\3\2\2\2\u010b\u0101\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010c\u0115\3\2\2\2\u010d\u010e\f\5\2\2\u010e\u010f\7\32\2\2"+
		"\u010f\u0114\5\30\r\6\u0110\u0111\f\4\2\2\u0111\u0112\7\33\2\2\u0112\u0114"+
		"\5\30\r\5\u0113\u010d\3\2\2\2\u0113\u0110\3\2\2\2\u0114\u0117\3\2\2\2"+
		"\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\31\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\27(.8CE]jw\u0098\u00a4\u00ac\u00ae\u00bd\u00c8\u00d8\u00e6\u00f6"+
		"\u00f8\u010b\u0113\u0115";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}