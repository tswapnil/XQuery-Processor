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
	public static class XqContTagExprContext extends XqContext {
		public XqContTagExprContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqContTagExpr(this);
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new XqVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(27);
				((XqVarContext)_localctx).var = match(VAR);
				}
				break;
			case 2:
				{
				_localctx = new XqStrConstDefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				((XqStrConstDefContext)_localctx).strConst = match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new XqApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				ap();
				}
				break;
			case 4:
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
			case 5:
				{
				_localctx = new XqContTagExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				}
				break;
			case 6:
				{
				_localctx = new XqForExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				((XqForExprContext)_localctx).loop = forClause();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(36);
					((XqForExprContext)_localctx).declaration = letClause();
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(42);
					((XqForExprContext)_localctx).condition = whereClause();
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(48);
				((XqForExprContext)_localctx).output = returnClause();
				}
				break;
			case 7:
				{
				_localctx = new XqLetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				((XqLetExprContext)_localctx).declaration = letClause();
				setState(51);
				((XqLetExprContext)_localctx).query = xq(3);
				}
				break;
			case 8:
				{
				_localctx = new XqJoinExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				((XqJoinExprContext)_localctx).join = joinClause();
				}
				break;
			case 9:
				{
				_localctx = new XqTagClauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				((XqTagClauseContext)_localctx).tClause = tagClause();
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
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new XqConcatExprContext(new XqContext(_parentctx, _parentState));
						((XqConcatExprContext)_localctx).leftQuery = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(57);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(58);
						match(T__2);
						setState(59);
						((XqConcatExprContext)_localctx).rightQuery = xq(9);
						}
						break;
					case 2:
						{
						_localctx = new XqSlashExprContext(new XqContext(_parentctx, _parentState));
						((XqSlashExprContext)_localctx).query = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(60);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(61);
						match(T__3);
						setState(62);
						((XqSlashExprContext)_localctx).relPath = rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XqDblSlashExprContext(new XqContext(_parentctx, _parentState));
						((XqDblSlashExprContext)_localctx).query = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(63);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(64);
						match(T__4);
						setState(65);
						((XqDblSlashExprContext)_localctx).relPath = rp(0);
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
			setState(71);
			match(T__5);
			setState(72);
			((TagClauseImplContext)_localctx).ID = match(ID);
			((TagClauseImplContext)_localctx).openTagNameList.add(((TagClauseImplContext)_localctx).ID);
			setState(73);
			match(T__6);
			setState(74);
			match(T__7);
			setState(75);
			((TagClauseImplContext)_localctx).xq = xq(0);
			((TagClauseImplContext)_localctx).queryList.add(((TagClauseImplContext)_localctx).xq);
			setState(76);
			match(T__8);
			setState(77);
			match(T__9);
			setState(78);
			((TagClauseImplContext)_localctx).ID = match(ID);
			((TagClauseImplContext)_localctx).closeTagNameList.add(((TagClauseImplContext)_localctx).ID);
			setState(79);
			match(T__6);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(T__5);
					setState(81);
					((TagClauseImplContext)_localctx).ID = match(ID);
					((TagClauseImplContext)_localctx).openTagNameList.add(((TagClauseImplContext)_localctx).ID);
					setState(82);
					match(T__6);
					setState(83);
					match(T__7);
					setState(84);
					((TagClauseImplContext)_localctx).xq = xq(0);
					((TagClauseImplContext)_localctx).queryList.add(((TagClauseImplContext)_localctx).xq);
					setState(85);
					match(T__8);
					setState(86);
					match(T__9);
					setState(87);
					((TagClauseImplContext)_localctx).ID = match(ID);
					((TagClauseImplContext)_localctx).closeTagNameList.add(((TagClauseImplContext)_localctx).ID);
					setState(88);
					match(T__6);
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
			setState(95);
			match(T__10);
			setState(96);
			((ForVarIterContext)_localctx).VAR = match(VAR);
			((ForVarIterContext)_localctx).varList.add(((ForVarIterContext)_localctx).VAR);
			setState(97);
			match(T__11);
			setState(98);
			((ForVarIterContext)_localctx).xq = xq(0);
			((ForVarIterContext)_localctx).queryList.add(((ForVarIterContext)_localctx).xq);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(99);
				match(T__2);
				setState(100);
				((ForVarIterContext)_localctx).VAR = match(VAR);
				((ForVarIterContext)_localctx).varList.add(((ForVarIterContext)_localctx).VAR);
				setState(101);
				match(T__11);
				setState(102);
				((ForVarIterContext)_localctx).xq = xq(0);
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
		try {
			int _alt;
			_localctx = new LetVarDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__12);
			setState(109);
			((LetVarDefContext)_localctx).VAR = match(VAR);
			((LetVarDefContext)_localctx).varList.add(((LetVarDefContext)_localctx).VAR);
			setState(110);
			match(T__13);
			setState(111);
			((LetVarDefContext)_localctx).xq = xq(0);
			((LetVarDefContext)_localctx).queryList.add(((LetVarDefContext)_localctx).xq);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					match(T__2);
					setState(113);
					((LetVarDefContext)_localctx).VAR = match(VAR);
					((LetVarDefContext)_localctx).varList.add(((LetVarDefContext)_localctx).VAR);
					setState(114);
					match(T__13);
					setState(115);
					((LetVarDefContext)_localctx).xq = xq(0);
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
			setState(121);
			match(T__14);
			setState(122);
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
			setState(124);
			match(T__15);
			setState(125);
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
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new CondEqualValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(128);
				((CondEqualValContext)_localctx).leftQuery = xq(0);
				setState(129);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(130);
				((CondEqualValContext)_localctx).rightQuery = xq(0);
				}
				break;
			case 2:
				{
				_localctx = new CondEqualIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				((CondEqualIdContext)_localctx).leftQuery = xq(0);
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				((CondEqualIdContext)_localctx).rightQuery = xq(0);
				}
				break;
			case 3:
				{
				_localctx = new CondEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(T__20);
				setState(137);
				match(T__0);
				setState(138);
				((CondEmptyContext)_localctx).query = xq(0);
				setState(139);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new CondVarCheckContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(T__21);
				setState(142);
				((CondVarCheckContext)_localctx).VAR = match(VAR);
				((CondVarCheckContext)_localctx).varList.add(((CondVarCheckContext)_localctx).VAR);
				setState(143);
				match(T__11);
				setState(144);
				((CondVarCheckContext)_localctx).xq = xq(0);
				((CondVarCheckContext)_localctx).queryList.add(((CondVarCheckContext)_localctx).xq);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(145);
					match(T__2);
					setState(146);
					((CondVarCheckContext)_localctx).VAR = match(VAR);
					((CondVarCheckContext)_localctx).varList.add(((CondVarCheckContext)_localctx).VAR);
					setState(147);
					match(T__11);
					setState(148);
					((CondVarCheckContext)_localctx).xq = xq(0);
					((CondVarCheckContext)_localctx).queryList.add(((CondVarCheckContext)_localctx).xq);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(T__22);
				setState(155);
				((CondVarCheckContext)_localctx).condition = cond(5);
				}
				break;
			case 5:
				{
				_localctx = new CondParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(T__0);
				setState(158);
				((CondParenExprContext)_localctx).condition = cond(0);
				setState(159);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new CondNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(T__25);
				setState(162);
				((CondNotExprContext)_localctx).condition = cond(1);
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
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndExprContext(new CondContext(_parentctx, _parentState));
						((CondAndExprContext)_localctx).leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						match(T__23);
						setState(167);
						((CondAndExprContext)_localctx).rightCondition = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrExprContext(new CondContext(_parentctx, _parentState));
						((CondOrExprContext)_localctx).leftCondition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(168);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(169);
						match(T__24);
						setState(170);
						((CondOrExprContext)_localctx).rightCondition = cond(3);
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
			setState(176);
			match(T__26);
			setState(177);
			match(T__0);
			setState(178);
			((JoinDefContext)_localctx).query1 = xq(0);
			setState(179);
			match(T__2);
			setState(180);
			((JoinDefContext)_localctx).query2 = xq(0);
			setState(181);
			match(T__2);
			setState(182);
			match(T__27);
			setState(183);
			((JoinDefContext)_localctx).ID = match(ID);
			((JoinDefContext)_localctx).attrList1.add(((JoinDefContext)_localctx).ID);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(184);
				match(T__2);
				setState(185);
				((JoinDefContext)_localctx).ID = match(ID);
				((JoinDefContext)_localctx).attrList1.add(((JoinDefContext)_localctx).ID);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(T__28);
			setState(192);
			match(T__2);
			setState(193);
			match(T__27);
			setState(194);
			((JoinDefContext)_localctx).ID = match(ID);
			((JoinDefContext)_localctx).attrList2.add(((JoinDefContext)_localctx).ID);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(195);
				match(T__2);
				setState(196);
				((JoinDefContext)_localctx).ID = match(ID);
				((JoinDefContext)_localctx).attrList2.add(((JoinDefContext)_localctx).ID);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__28);
			setState(203);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ApSlashFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__29);
				setState(206);
				((ApSlashFileContext)_localctx).docName = match(FILE);
				setState(207);
				match(T__30);
				setState(208);
				match(T__3);
				setState(209);
				((ApSlashFileContext)_localctx).relpath = rp(0);
				}
				break;
			case 2:
				_localctx = new ApDblSlashFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__29);
				setState(211);
				((ApDblSlashFileContext)_localctx).docName = match(FILE);
				setState(212);
				match(T__30);
				setState(213);
				match(T__4);
				setState(214);
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
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new RpTagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(218);
				((RpTagNameContext)_localctx).tagName = match(ID);
				}
				break;
			case T__31:
				{
				_localctx = new RpWildcardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(T__31);
				}
				break;
			case T__32:
				{
				_localctx = new RpDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(T__32);
				}
				break;
			case T__33:
				{
				_localctx = new RpDblDotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(T__33);
				}
				break;
			case T__34:
				{
				_localctx = new RpTextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(T__34);
				}
				break;
			case T__35:
				{
				_localctx = new RpAttrNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(T__35);
				setState(224);
				((RpAttrNameContext)_localctx).attrName = match(ID);
				}
				break;
			case T__0:
				{
				_localctx = new RpParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(T__0);
				setState(226);
				((RpParenExprContext)_localctx).relpath = rp(0);
				setState(227);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new RpSlashExprContext(new RpContext(_parentctx, _parentState));
						((RpSlashExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(231);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(232);
						match(T__3);
						setState(233);
						((RpSlashExprContext)_localctx).right = rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpDblSlashExprContext(new RpContext(_parentctx, _parentState));
						((RpDblSlashExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(234);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(235);
						match(T__4);
						setState(236);
						((RpDblSlashExprContext)_localctx).right = rp(4);
						}
						break;
					case 3:
						{
						_localctx = new RpConcatExprContext(new RpContext(_parentctx, _parentState));
						((RpConcatExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(237);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(238);
						match(T__2);
						setState(239);
						((RpConcatExprContext)_localctx).right = rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpFilterExprContext(new RpContext(_parentctx, _parentState));
						((RpFilterExprContext)_localctx).relpath = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						match(T__27);
						setState(242);
						((RpFilterExprContext)_localctx).filter = f(0);
						setState(243);
						match(T__28);
						}
						break;
					}
					} 
				}
				setState(249);
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new FilterRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(251);
				((FilterRpContext)_localctx).relPath = rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FilterEqualValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				((FilterEqualValContext)_localctx).left = rp(0);
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(254);
				((FilterEqualValContext)_localctx).right = rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FilterEqualIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				((FilterEqualIdContext)_localctx).left = rp(0);
				setState(257);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
				((FilterEqualIdContext)_localctx).right = rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FilterParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				match(T__0);
				setState(261);
				((FilterParenExprContext)_localctx).filter = f(0);
				setState(262);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FilterNotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(T__25);
				setState(265);
				((FilterNotExprContext)_localctx).filter = f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(274);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new FilterAndExprContext(new FContext(_parentctx, _parentState));
						((FilterAndExprContext)_localctx).leftf = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(268);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(269);
						match(T__23);
						setState(270);
						((FilterAndExprContext)_localctx).rightf = f(4);
						}
						break;
					case 2:
						{
						_localctx = new FilterOrExprContext(new FContext(_parentctx, _parentState));
						((FilterOrExprContext)_localctx).leftf = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(271);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(272);
						match(T__24);
						setState(273);
						((FilterOrExprContext)_localctx).rightf = f(3);
						}
						break;
					}
					} 
				}
				setState(278);
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u011a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3(\n\3\f\3\16\3+\13\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3E\n\3\f"+
		"\3\16\3H\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6w\n"+
		"\6\f\6\16\6z\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0098"+
		"\n\t\f\t\16\t\u009b\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a6"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ae\n\t\f\t\16\t\u00b1\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bd\n\n\f\n\16\n\u00c0\13\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u00c8\n\n\f\n\16\n\u00cb\13\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00da\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e8\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f8\n\f\f\f\16\f\u00fb"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u010d\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0115\n\r\f\r\16\r\u0118\13"+
		"\r\3\r\2\6\4\20\26\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\23\24\3"+
		"\2\25\26\u0138\2\32\3\2\2\2\49\3\2\2\2\6I\3\2\2\2\ba\3\2\2\2\nn\3\2\2"+
		"\2\f{\3\2\2\2\16~\3\2\2\2\20\u00a5\3\2\2\2\22\u00b2\3\2\2\2\24\u00d9\3"+
		"\2\2\2\26\u00e7\3\2\2\2\30\u010c\3\2\2\2\32\33\5\4\3\2\33\3\3\2\2\2\34"+
		"\35\b\3\1\2\35:\7*\2\2\36:\7)\2\2\37:\5\24\13\2 !\7\3\2\2!\"\5\4\3\2\""+
		"#\7\4\2\2#:\3\2\2\2$:\3\2\2\2%)\5\b\5\2&(\5\n\6\2\'&\3\2\2\2(+\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*/\3\2\2\2+)\3\2\2\2,.\5\f\7\2-,\3\2\2\2.\61\3\2"+
		"\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\5\16\b\2\63"+
		":\3\2\2\2\64\65\5\n\6\2\65\66\5\4\3\5\66:\3\2\2\2\67:\5\22\n\28:\5\6\4"+
		"\29\34\3\2\2\29\36\3\2\2\29\37\3\2\2\29 \3\2\2\29$\3\2\2\29%\3\2\2\29"+
		"\64\3\2\2\29\67\3\2\2\298\3\2\2\2:F\3\2\2\2;<\f\n\2\2<=\7\5\2\2=E\5\4"+
		"\3\13>?\f\t\2\2?@\7\6\2\2@E\5\26\f\2AB\f\b\2\2BC\7\7\2\2CE\5\26\f\2D;"+
		"\3\2\2\2D>\3\2\2\2DA\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\5\3\2\2\2"+
		"HF\3\2\2\2IJ\7\b\2\2JK\7\'\2\2KL\7\t\2\2LM\7\n\2\2MN\5\4\3\2NO\7\13\2"+
		"\2OP\7\f\2\2PQ\7\'\2\2Q^\7\t\2\2RS\7\b\2\2ST\7\'\2\2TU\7\t\2\2UV\7\n\2"+
		"\2VW\5\4\3\2WX\7\13\2\2XY\7\f\2\2YZ\7\'\2\2Z[\7\t\2\2[]\3\2\2\2\\R\3\2"+
		"\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\7\3\2\2\2`^\3\2\2\2ab\7\r\2\2bc\7"+
		"*\2\2cd\7\16\2\2dk\5\4\3\2ef\7\5\2\2fg\7*\2\2gh\7\16\2\2hj\5\4\3\2ie\3"+
		"\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\t\3\2\2\2mk\3\2\2\2no\7\17\2\2o"+
		"p\7*\2\2pq\7\20\2\2qx\5\4\3\2rs\7\5\2\2st\7*\2\2tu\7\20\2\2uw\5\4\3\2"+
		"vr\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\13\3\2\2\2zx\3\2\2\2{|\7\21"+
		"\2\2|}\5\20\t\2}\r\3\2\2\2~\177\7\22\2\2\177\u0080\5\4\3\2\u0080\17\3"+
		"\2\2\2\u0081\u0082\b\t\1\2\u0082\u0083\5\4\3\2\u0083\u0084\t\2\2\2\u0084"+
		"\u0085\5\4\3\2\u0085\u00a6\3\2\2\2\u0086\u0087\5\4\3\2\u0087\u0088\t\3"+
		"\2\2\u0088\u0089\5\4\3\2\u0089\u00a6\3\2\2\2\u008a\u008b\7\27\2\2\u008b"+
		"\u008c\7\3\2\2\u008c\u008d\5\4\3\2\u008d\u008e\7\4\2\2\u008e\u00a6\3\2"+
		"\2\2\u008f\u0090\7\30\2\2\u0090\u0091\7*\2\2\u0091\u0092\7\16\2\2\u0092"+
		"\u0099\5\4\3\2\u0093\u0094\7\5\2\2\u0094\u0095\7*\2\2\u0095\u0096\7\16"+
		"\2\2\u0096\u0098\5\4\3\2\u0097\u0093\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009d\7\31\2\2\u009d\u009e\5\20\t\7\u009e\u00a6\3\2\2\2\u009f"+
		"\u00a0\7\3\2\2\u00a0\u00a1\5\20\t\2\u00a1\u00a2\7\4\2\2\u00a2\u00a6\3"+
		"\2\2\2\u00a3\u00a4\7\34\2\2\u00a4\u00a6\5\20\t\3\u00a5\u0081\3\2\2\2\u00a5"+
		"\u0086\3\2\2\2\u00a5\u008a\3\2\2\2\u00a5\u008f\3\2\2\2\u00a5\u009f\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00af\3\2\2\2\u00a7\u00a8\f\5\2\2\u00a8"+
		"\u00a9\7\32\2\2\u00a9\u00ae\5\20\t\6\u00aa\u00ab\f\4\2\2\u00ab\u00ac\7"+
		"\33\2\2\u00ac\u00ae\5\20\t\5\u00ad\u00a7\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\21\3\2\2"+
		"\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\35\2\2\u00b3\u00b4\7\3\2\2\u00b4"+
		"\u00b5\5\4\3\2\u00b5\u00b6\7\5\2\2\u00b6\u00b7\5\4\3\2\u00b7\u00b8\7\5"+
		"\2\2\u00b8\u00b9\7\36\2\2\u00b9\u00be\7\'\2\2\u00ba\u00bb\7\5\2\2\u00bb"+
		"\u00bd\7\'\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\7\37\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\7\36\2\2\u00c4\u00c9\7"+
		"\'\2\2\u00c5\u00c6\7\5\2\2\u00c6\u00c8\7\'\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\37\2\2\u00cd\u00ce\7\4\2\2\u00ce"+
		"\23\3\2\2\2\u00cf\u00d0\7 \2\2\u00d0\u00d1\7(\2\2\u00d1\u00d2\7!\2\2\u00d2"+
		"\u00d3\7\6\2\2\u00d3\u00da\5\26\f\2\u00d4\u00d5\7 \2\2\u00d5\u00d6\7("+
		"\2\2\u00d6\u00d7\7!\2\2\u00d7\u00d8\7\7\2\2\u00d8\u00da\5\26\f\2\u00d9"+
		"\u00cf\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da\25\3\2\2\2\u00db\u00dc\b\f\1"+
		"\2\u00dc\u00e8\7\'\2\2\u00dd\u00e8\7\"\2\2\u00de\u00e8\7#\2\2\u00df\u00e8"+
		"\7$\2\2\u00e0\u00e8\7%\2\2\u00e1\u00e2\7&\2\2\u00e2\u00e8\7\'\2\2\u00e3"+
		"\u00e4\7\3\2\2\u00e4\u00e5\5\26\f\2\u00e5\u00e6\7\4\2\2\u00e6\u00e8\3"+
		"\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7"+
		"\u00df\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e1\3\2\2\2\u00e7\u00e3\3\2"+
		"\2\2\u00e8\u00f9\3\2\2\2\u00e9\u00ea\f\6\2\2\u00ea\u00eb\7\6\2\2\u00eb"+
		"\u00f8\5\26\f\7\u00ec\u00ed\f\5\2\2\u00ed\u00ee\7\7\2\2\u00ee\u00f8\5"+
		"\26\f\6\u00ef\u00f0\f\3\2\2\u00f0\u00f1\7\5\2\2\u00f1\u00f8\5\26\f\4\u00f2"+
		"\u00f3\f\4\2\2\u00f3\u00f4\7\36\2\2\u00f4\u00f5\5\30\r\2\u00f5\u00f6\7"+
		"\37\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00e9\3\2\2\2\u00f7\u00ec\3\2\2\2\u00f7"+
		"\u00ef\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\27\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd"+
		"\b\r\1\2\u00fd\u010d\5\26\f\2\u00fe\u00ff\5\26\f\2\u00ff\u0100\t\2\2\2"+
		"\u0100\u0101\5\26\f\2\u0101\u010d\3\2\2\2\u0102\u0103\5\26\f\2\u0103\u0104"+
		"\t\3\2\2\u0104\u0105\5\26\f\2\u0105\u010d\3\2\2\2\u0106\u0107\7\3\2\2"+
		"\u0107\u0108\5\30\r\2\u0108\u0109\7\4\2\2\u0109\u010d\3\2\2\2\u010a\u010b"+
		"\7\34\2\2\u010b\u010d\5\30\r\3\u010c\u00fc\3\2\2\2\u010c\u00fe\3\2\2\2"+
		"\u010c\u0102\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0116"+
		"\3\2\2\2\u010e\u010f\f\5\2\2\u010f\u0110\7\32\2\2\u0110\u0115\5\30\r\6"+
		"\u0111\u0112\f\4\2\2\u0112\u0113\7\33\2\2\u0113\u0115\5\30\r\5\u0114\u010e"+
		"\3\2\2\2\u0114\u0111\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\31\3\2\2\2\u0118\u0116\3\2\2\2\27)/9DF^kx\u0099\u00a5"+
		"\u00ad\u00af\u00be\u00c9\u00d9\u00e7\u00f7\u00f9\u010c\u0114\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}