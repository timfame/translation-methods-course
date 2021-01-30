// Generated from C:/Users/Asus/University/Term05/MT/lab04/src/main/java/ru/ifmo\Grammar.g4 by ANTLR 4.9
package ru.ifmo.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, CONST=6, REGEX=7, SEP=8, RETURNS=9, 
		SKI=10, FROM=11, TO=12, OR=13, EPS=14, TERMINAL=15, NONTERMINAL=16, ACTION=17, 
		WS=18;
	public static final int
		RULE_parseAllGrammar = 0, RULE_tokenize = 1, RULE_rules = 2, RULE_return_ = 3, 
		RULE_attrs = 4, RULE_attr_tail = 5, RULE_attr = 6, RULE_ruleout_tail = 7, 
		RULE_ruleout = 8, RULE_type_with_args = 9, RULE_args = 10, RULE_args_tail = 11, 
		RULE_arg = 12, RULE_type = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"parseAllGrammar", "tokenize", "rules", "return_", "attrs", "attr_tail", 
			"attr", "ruleout_tail", "ruleout", "type_with_args", "args", "args_tail", 
			"arg", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Lexer:'", "'Parser:'", "'['", "']'", "','", null, null, "';'", 
			"'returns'", "'<<'", "'<-'", "'->'", "'|'", "'eps'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "CONST", "REGEX", "SEP", "RETURNS", 
			"SKI", "FROM", "TO", "OR", "EPS", "TERMINAL", "NONTERMINAL", "ACTION", 
			"WS"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseAllGrammarContext extends ParserRuleContext {
		public List<TokenizeContext> tokenize() {
			return getRuleContexts(TokenizeContext.class);
		}
		public TokenizeContext tokenize(int i) {
			return getRuleContext(TokenizeContext.class,i);
		}
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public ParseAllGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseAllGrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParseAllGrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParseAllGrammar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParseAllGrammar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseAllGrammarContext parseAllGrammar() throws RecognitionException {
		ParseAllGrammarContext _localctx = new ParseAllGrammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parseAllGrammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				tokenize();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERMINAL );
			setState(34);
			match(T__1);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				rules();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NONTERMINAL );
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

	public static class TokenizeContext extends ParserRuleContext {
		public Token val;
		public TerminalNode TERMINAL() { return getToken(GrammarParser.TERMINAL, 0); }
		public TerminalNode FROM() { return getToken(GrammarParser.FROM, 0); }
		public TerminalNode SEP() { return getToken(GrammarParser.SEP, 0); }
		public TerminalNode CONST() { return getToken(GrammarParser.CONST, 0); }
		public TerminalNode REGEX() { return getToken(GrammarParser.REGEX, 0); }
		public TerminalNode SKI() { return getToken(GrammarParser.SKI, 0); }
		public TokenizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTokenize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTokenize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTokenize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenizeContext tokenize() throws RecognitionException {
		TokenizeContext _localctx = new TokenizeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tokenize);
		int _la;
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(TERMINAL);
				setState(41);
				match(FROM);
				setState(42);
				((TokenizeContext)_localctx).val = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CONST || _la==REGEX) ) {
					((TokenizeContext)_localctx).val = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(43);
				match(SEP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(TERMINAL);
				setState(45);
				match(SKI);
				setState(46);
				((TokenizeContext)_localctx).val = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CONST || _la==REGEX) ) {
					((TokenizeContext)_localctx).val = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(47);
				match(SEP);
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

	public static class RulesContext extends ParserRuleContext {
		public TerminalNode NONTERMINAL() { return getToken(GrammarParser.NONTERMINAL, 0); }
		public TerminalNode TO() { return getToken(GrammarParser.TO, 0); }
		public RuleoutContext ruleout() {
			return getRuleContext(RuleoutContext.class,0);
		}
		public TerminalNode SEP() { return getToken(GrammarParser.SEP, 0); }
		public AttrsContext attrs() {
			return getRuleContext(AttrsContext.class,0);
		}
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public List<Ruleout_tailContext> ruleout_tail() {
			return getRuleContexts(Ruleout_tailContext.class);
		}
		public Ruleout_tailContext ruleout_tail(int i) {
			return getRuleContext(Ruleout_tailContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(NONTERMINAL);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(51);
				attrs();
				}
			}

			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNS) {
				{
				setState(54);
				return_();
				}
			}

			setState(57);
			match(TO);
			setState(58);
			ruleout();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(59);
				ruleout_tail();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(SEP);
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

	public static class Return_Context extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(GrammarParser.RETURNS, 0); }
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public Return_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReturn_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReturn_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitReturn_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_Context return_() throws RecognitionException {
		Return_Context _localctx = new Return_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(RETURNS);
			setState(68);
			match(T__2);
			setState(69);
			attr();
			setState(70);
			match(T__3);
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

	public static class AttrsContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public List<Attr_tailContext> attr_tail() {
			return getRuleContexts(Attr_tailContext.class);
		}
		public Attr_tailContext attr_tail(int i) {
			return getRuleContext(Attr_tailContext.class,i);
		}
		public AttrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAttrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAttrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAttrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrsContext attrs() throws RecognitionException {
		AttrsContext _localctx = new AttrsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__2);
			setState(73);
			attr();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(74);
				attr_tail();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(T__3);
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

	public static class Attr_tailContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public Attr_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAttr_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAttr_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAttr_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_tailContext attr_tail() throws RecognitionException {
		Attr_tailContext _localctx = new Attr_tailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attr_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__4);
			setState(83);
			attr();
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

	public static class AttrContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NONTERMINAL() { return getToken(GrammarParser.NONTERMINAL, 0); }
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			type();
			setState(86);
			match(NONTERMINAL);
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

	public static class Ruleout_tailContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(GrammarParser.OR, 0); }
		public RuleoutContext ruleout() {
			return getRuleContext(RuleoutContext.class,0);
		}
		public Ruleout_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleout_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRuleout_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRuleout_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRuleout_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ruleout_tailContext ruleout_tail() throws RecognitionException {
		Ruleout_tailContext _localctx = new Ruleout_tailContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ruleout_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(OR);
			setState(89);
			ruleout();
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

	public static class RuleoutContext extends ParserRuleContext {
		public List<Type_with_argsContext> type_with_args() {
			return getRuleContexts(Type_with_argsContext.class);
		}
		public Type_with_argsContext type_with_args(int i) {
			return getRuleContext(Type_with_argsContext.class,i);
		}
		public TerminalNode EPS() { return getToken(GrammarParser.EPS, 0); }
		public TerminalNode ACTION() { return getToken(GrammarParser.ACTION, 0); }
		public RuleoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRuleout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRuleout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRuleout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleoutContext ruleout() throws RecognitionException {
		RuleoutContext _localctx = new RuleoutContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleout);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERMINAL:
			case NONTERMINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					type_with_args();
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TERMINAL || _la==NONTERMINAL );
				}
				break;
			case EPS:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(EPS);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACTION) {
					{
					setState(97);
					match(ACTION);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Type_with_argsContext extends ParserRuleContext {
		public TerminalNode NONTERMINAL() { return getToken(GrammarParser.NONTERMINAL, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(GrammarParser.ACTION, 0); }
		public TerminalNode TERMINAL() { return getToken(GrammarParser.TERMINAL, 0); }
		public Type_with_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_with_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType_with_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType_with_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType_with_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_with_argsContext type_with_args() throws RecognitionException {
		Type_with_argsContext _localctx = new Type_with_argsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_with_args);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONTERMINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(NONTERMINAL);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(103);
					args();
					}
				}

				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACTION) {
					{
					setState(106);
					match(ACTION);
					}
				}

				}
				break;
			case TERMINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(TERMINAL);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACTION) {
					{
					setState(110);
					match(ACTION);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public List<Args_tailContext> args_tail() {
			return getRuleContexts(Args_tailContext.class);
		}
		public Args_tailContext args_tail(int i) {
			return getRuleContext(Args_tailContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__2);
			setState(116);
			arg();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(117);
				args_tail();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(T__3);
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

	public static class Args_tailContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public Args_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgs_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgs_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArgs_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_tailContext args_tail() throws RecognitionException {
		Args_tailContext _localctx = new Args_tailContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_args_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__4);
			setState(126);
			arg();
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

	public static class ArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(GrammarParser.ACTION, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arg);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERMINAL:
			case NONTERMINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				type();
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(ACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TERMINAL() { return getToken(GrammarParser.TERMINAL, 0); }
		public TerminalNode NONTERMINAL() { return getToken(GrammarParser.NONTERMINAL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==TERMINAL || _la==NONTERMINAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\""+
		"\3\2\3\2\6\2\'\n\2\r\2\16\2(\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n"+
		"\3\3\4\3\4\5\4\67\n\4\3\4\5\4:\n\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\6\n_\n\n\r\n\16\n`\3\n\3\n"+
		"\5\ne\n\n\5\ng\n\n\3\13\3\13\5\13k\n\13\3\13\5\13n\n\13\3\13\3\13\5\13"+
		"r\n\13\5\13t\n\13\3\f\3\f\3\f\7\fy\n\f\f\f\16\f|\13\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\5\16\u0085\n\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\4\3\2\b\t\3\2\21\22\2\u008a\2\36\3\2\2\2\4\62\3\2"+
		"\2\2\6\64\3\2\2\2\bE\3\2\2\2\nJ\3\2\2\2\fT\3\2\2\2\16W\3\2\2\2\20Z\3\2"+
		"\2\2\22f\3\2\2\2\24s\3\2\2\2\26u\3\2\2\2\30\177\3\2\2\2\32\u0084\3\2\2"+
		"\2\34\u0086\3\2\2\2\36 \7\3\2\2\37!\5\4\3\2 \37\3\2\2\2!\"\3\2\2\2\" "+
		"\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$&\7\4\2\2%\'\5\6\4\2&%\3\2\2\2\'(\3\2\2"+
		"\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*+\7\21\2\2+,\7\r\2\2,-\t\2\2\2-\63\7"+
		"\n\2\2./\7\21\2\2/\60\7\f\2\2\60\61\t\2\2\2\61\63\7\n\2\2\62*\3\2\2\2"+
		"\62.\3\2\2\2\63\5\3\2\2\2\64\66\7\22\2\2\65\67\5\n\6\2\66\65\3\2\2\2\66"+
		"\67\3\2\2\2\679\3\2\2\28:\5\b\5\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\16"+
		"\2\2<@\5\22\n\2=?\5\20\t\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3"+
		"\2\2\2B@\3\2\2\2CD\7\n\2\2D\7\3\2\2\2EF\7\13\2\2FG\7\5\2\2GH\5\16\b\2"+
		"HI\7\6\2\2I\t\3\2\2\2JK\7\5\2\2KO\5\16\b\2LN\5\f\7\2ML\3\2\2\2NQ\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\6\2\2S\13\3\2\2\2TU\7\7"+
		"\2\2UV\5\16\b\2V\r\3\2\2\2WX\5\34\17\2XY\7\22\2\2Y\17\3\2\2\2Z[\7\17\2"+
		"\2[\\\5\22\n\2\\\21\3\2\2\2]_\5\24\13\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2"+
		"`a\3\2\2\2ag\3\2\2\2bd\7\20\2\2ce\7\23\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2"+
		"\2f^\3\2\2\2fb\3\2\2\2g\23\3\2\2\2hj\7\22\2\2ik\5\26\f\2ji\3\2\2\2jk\3"+
		"\2\2\2km\3\2\2\2ln\7\23\2\2ml\3\2\2\2mn\3\2\2\2nt\3\2\2\2oq\7\21\2\2p"+
		"r\7\23\2\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2sh\3\2\2\2so\3\2\2\2t\25\3\2\2"+
		"\2uv\7\5\2\2vz\5\32\16\2wy\5\30\r\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\6\2\2~\27\3\2\2\2\177\u0080\7\7\2\2\u0080"+
		"\u0081\5\32\16\2\u0081\31\3\2\2\2\u0082\u0085\5\34\17\2\u0083\u0085\7"+
		"\23\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\33\3\2\2\2\u0086"+
		"\u0087\t\3\2\2\u0087\35\3\2\2\2\22\"(\62\669@O`dfjmqsz\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}