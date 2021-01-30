// Generated from C:/Users/Asus/University/Term05/MT/lab03/src/main/java/ru/ifmo\CPP.g4 by ANTLR 4.9
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
public class CPPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ANY_TYPE=5, PRIMITIVE_TYPE=6, RETURN=7, 
		FOR=8, WHILE=9, IF=10, PRIMITIVE_VALUES=11, STRING=12, NUMBER=13, BOOL=14, 
		IDENTIFIER=15, OPERATORS=16, SEMICOLON=17, ASSIGN=18, MODIFY=19, COMMA=20, 
		LP=21, RP=22, BEGIN=23, END=24, WS=25;
	public static final int
		RULE_global = 0, RULE_global_action = 1, RULE_func = 2, RULE_actions = 3, 
		RULE_action = 4, RULE_swi = 5, RULE_cas = 6, RULE_var_declaration = 7, 
		RULE_modify = 8, RULE_assignment = 9, RULE_return_ = 10, RULE_for_ = 11, 
		RULE_while_ = 12, RULE_if_ = 13, RULE_expr = 14, RULE_funcInvoke = 15, 
		RULE_passedArgs = 16, RULE_signature = 17, RULE_type = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"global", "global_action", "func", "actions", "action", "swi", "cas", 
			"var_declaration", "modify", "assignment", "return_", "for_", "while_", 
			"if_", "expr", "funcInvoke", "passedArgs", "signature", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'switch'", "'case'", "':'", "'break'", null, null, "'return'", 
			"'for'", "'while'", "'if'", null, null, null, null, null, null, "';'", 
			"'='", null, "','", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "ANY_TYPE", "PRIMITIVE_TYPE", "RETURN", 
			"FOR", "WHILE", "IF", "PRIMITIVE_VALUES", "STRING", "NUMBER", "BOOL", 
			"IDENTIFIER", "OPERATORS", "SEMICOLON", "ASSIGN", "MODIFY", "COMMA", 
			"LP", "RP", "BEGIN", "END", "WS"
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
	public String getGrammarFileName() { return "CPP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GlobalContext extends ParserRuleContext {
		public StringBuilder val;
		public Global_actionContext global_action;
		public List<Global_actionContext> global_action() {
			return getRuleContexts(Global_actionContext.class);
		}
		public Global_actionContext global_action(int i) {
			return getRuleContext(Global_actionContext.class,i);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((GlobalContext)_localctx).val =  new StringBuilder();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANY_TYPE) {
				{
				{
				setState(39);
				((GlobalContext)_localctx).global_action = global_action();
				_localctx.val.append(((GlobalContext)_localctx).global_action.val);
				}
				}
				setState(46);
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

	public static class Global_actionContext extends ParserRuleContext {
		public StringBuilder val;
		public FuncContext func;
		public Var_declarationContext var_declaration;
		public Token SEMICOLON;
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CPPParser.SEMICOLON, 0); }
		public Global_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterGlobal_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitGlobal_action(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitGlobal_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_actionContext global_action() throws RecognitionException {
		Global_actionContext _localctx = new Global_actionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global_action);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				((Global_actionContext)_localctx).func = func();
				((Global_actionContext)_localctx).val =  new StringBuilder(((Global_actionContext)_localctx).func.val);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((Global_actionContext)_localctx).var_declaration = var_declaration();
				setState(51);
				((Global_actionContext)_localctx).SEMICOLON = match(SEMICOLON);
				((Global_actionContext)_localctx).val =  new StringBuilder(((Global_actionContext)_localctx).var_declaration.val)
				                                        .append(((Global_actionContext)_localctx).SEMICOLON.getText()).append('\n');
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

	public static class FuncContext extends ParserRuleContext {
		public StringBuilder val;
		public TypeContext type;
		public Token IDENTIFIER;
		public Token LP;
		public SignatureContext signature;
		public Token RP;
		public Token BEGIN;
		public ActionsContext actions;
		public Token END;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CPPParser.IDENTIFIER, 0); }
		public TerminalNode LP() { return getToken(CPPParser.LP, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode RP() { return getToken(CPPParser.RP, 0); }
		public TerminalNode BEGIN() { return getToken(CPPParser.BEGIN, 0); }
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public TerminalNode END() { return getToken(CPPParser.END, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((FuncContext)_localctx).type = type();
			setState(57);
			((FuncContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(58);
			((FuncContext)_localctx).LP = match(LP);
			setState(59);
			((FuncContext)_localctx).signature = signature();
			setState(60);
			((FuncContext)_localctx).RP = match(RP);
			setState(61);
			((FuncContext)_localctx).BEGIN = match(BEGIN);
			setState(62);
			((FuncContext)_localctx).actions = actions(1);
			setState(63);
			((FuncContext)_localctx).END = match(END);
			   ((FuncContext)_localctx).val =  new StringBuilder();
			            _localctx.val.append(((FuncContext)_localctx).type.val)
			                .append(' ')
			                .append(((FuncContext)_localctx).IDENTIFIER.getText())
			                .append(((FuncContext)_localctx).LP.getText())
			                .append(((FuncContext)_localctx).signature.val)
			                .append(((FuncContext)_localctx).RP.getText())
			                .append(' ')
			                .append(((FuncContext)_localctx).BEGIN.getText())
			                .append('\n')
			                .append(((FuncContext)_localctx).actions.val)
			                .append(((FuncContext)_localctx).END.getText())
			                .append('\n');
			        
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

	public static class ActionsContext extends ParserRuleContext {
		public int tabs;
		public StringBuilder val;
		public ActionContext action;
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ActionsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ActionsContext(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsContext actions(int tabs) throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState(), tabs);
		enterRule(_localctx, 6, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ActionsContext)_localctx).val =  new StringBuilder();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ANY_TYPE) | (1L << RETURN) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(67);
				((ActionsContext)_localctx).action = action(tabs);

				            for (int i = 0; i < tabs; i++) _localctx.val.append('\t');
				            _localctx.val.append(((ActionsContext)_localctx).action.val);
				        
				}
				}
				setState(74);
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

	public static class ActionContext extends ParserRuleContext {
		public int tabs;
		public StringBuilder val;
		public For_Context for_;
		public SwiContext swi;
		public If_Context if_;
		public While_Context while_;
		public Return_Context return_;
		public Var_declarationContext var_declaration;
		public Token SEMICOLON;
		public ModifyContext modify;
		public FuncInvokeContext funcInvoke;
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public SwiContext swi() {
			return getRuleContext(SwiContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CPPParser.SEMICOLON, 0); }
		public ModifyContext modify() {
			return getRuleContext(ModifyContext.class,0);
		}
		public FuncInvokeContext funcInvoke() {
			return getRuleContext(FuncInvokeContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ActionContext(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action(int tabs) throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState(), tabs);
		enterRule(_localctx, 8, RULE_action);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				((ActionContext)_localctx).for_ = for_(tabs);
				((ActionContext)_localctx).val =  new StringBuilder(((ActionContext)_localctx).for_.val);                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				((ActionContext)_localctx).swi = swi(tabs);
				((ActionContext)_localctx).val =  new StringBuilder(((ActionContext)_localctx).swi.val);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				((ActionContext)_localctx).if_ = if_(tabs);
				((ActionContext)_localctx).val =  new StringBuilder(((ActionContext)_localctx).if_.val);                     
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				((ActionContext)_localctx).while_ = while_(tabs);
				((ActionContext)_localctx).val =  new StringBuilder(((ActionContext)_localctx).while_.val);                  
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				((ActionContext)_localctx).return_ = return_();
				((ActionContext)_localctx).val =  new StringBuilder(((ActionContext)_localctx).return_.val);                 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				((ActionContext)_localctx).var_declaration = var_declaration();
				setState(91);
				((ActionContext)_localctx).SEMICOLON = match(SEMICOLON);
				((ActionContext)_localctx).val =  new StringBuilder(((ActionContext)_localctx).var_declaration.val)
				                                    .append(((ActionContext)_localctx).SEMICOLON.getText()).append('\n');          
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				((ActionContext)_localctx).modify = modify();
				setState(95);
				((ActionContext)_localctx).SEMICOLON = match(SEMICOLON);
				((ActionContext)_localctx).val =  new StringBuilder().append(((ActionContext)_localctx).modify.val)
				                                    .append(((ActionContext)_localctx).SEMICOLON.getText()).append('\n');          
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				((ActionContext)_localctx).funcInvoke = funcInvoke();
				setState(99);
				match(SEMICOLON);
				((ActionContext)_localctx).val =  new StringBuilder(((ActionContext)_localctx).funcInvoke.val).append(";\n");
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

	public static class SwiContext extends ParserRuleContext {
		public int tabs;
		public StringBuilder val;
		public ExprContext expr;
		public CasContext cas;
		public TerminalNode LP() { return getToken(CPPParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CPPParser.RP, 0); }
		public TerminalNode BEGIN() { return getToken(CPPParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CPPParser.END, 0); }
		public List<CasContext> cas() {
			return getRuleContexts(CasContext.class);
		}
		public CasContext cas(int i) {
			return getRuleContext(CasContext.class,i);
		}
		public SwiContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SwiContext(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_swi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterSwi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitSwi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitSwi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwiContext swi(int tabs) throws RecognitionException {
		SwiContext _localctx = new SwiContext(_ctx, getState(), tabs);
		enterRule(_localctx, 10, RULE_swi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__0);
			setState(105);
			match(LP);
			setState(106);
			((SwiContext)_localctx).expr = expr(0);
			setState(107);
			match(RP);
			setState(108);
			match(BEGIN);

			        ((SwiContext)_localctx).val =  new StringBuilder();
			        _localctx.val.append("switch (").append(((SwiContext)_localctx).expr.val).append(") {\n").append(' ');
			        
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				((SwiContext)_localctx).cas = cas(tabs + 1);

				                _localctx.val.append(((SwiContext)_localctx).cas.val);
				            
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(117);
			match(END);

			        for (int i = 0; i < tabs; i++) _localctx.val.append('\t');
			        _localctx.val.append("}\n");
			        
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

	public static class CasContext extends ParserRuleContext {
		public int tabs;
		public StringBuilder val;
		public ExprContext expr;
		public ActionsContext actions;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CPPParser.SEMICOLON, 0); }
		public CasContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CasContext(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_cas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterCas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitCas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitCas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasContext cas(int tabs) throws RecognitionException {
		CasContext _localctx = new CasContext(_ctx, getState(), tabs);
		enterRule(_localctx, 12, RULE_cas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__1);
			setState(121);
			((CasContext)_localctx).expr = expr(0);
			setState(122);
			match(T__2);
			setState(123);
			((CasContext)_localctx).actions = actions(tabs + 1);
			setState(124);
			match(T__3);
			setState(125);
			match(SEMICOLON);

			        ((CasContext)_localctx).val =  new StringBuilder();
			        for (int i = 0; i < tabs; i++) _localctx.val.append('\t');
			        _localctx.val.append("case ")
			            .append(((CasContext)_localctx).expr.val)
			            .append(":\n")
			            .append(((CasContext)_localctx).actions.val);

			        for (int i = 0; i < tabs; i++) _localctx.val.append('\t');
			        _localctx.val.append("break")
			            .append(";\n");
			    
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

	public static class Var_declarationContext extends ParserRuleContext {
		public StringBuilder val;
		public TypeContext type;
		public Token IDENTIFIER;
		public AssignmentContext assignment;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CPPParser.IDENTIFIER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitVar_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitVar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((Var_declarationContext)_localctx).type = type();
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(129);
				((Var_declarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(130);
				((Var_declarationContext)_localctx).assignment = assignment();
				}
				break;
			}
			   ((Var_declarationContext)_localctx).val =  new StringBuilder().append(((Var_declarationContext)_localctx).type.val).append(' ');
			            if (((Var_declarationContext)_localctx).IDENTIFIER != null) _localctx.val.append(((Var_declarationContext)_localctx).IDENTIFIER.getText()); else _localctx.val.append(((Var_declarationContext)_localctx).assignment.val);
			        
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

	public static class ModifyContext extends ParserRuleContext {
		public StringBuilder val;
		public Token IDENTIFIER;
		public Token mod;
		public ExprContext expr;
		public TerminalNode IDENTIFIER() { return getToken(CPPParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MODIFY() { return getToken(CPPParser.MODIFY, 0); }
		public TerminalNode ASSIGN() { return getToken(CPPParser.ASSIGN, 0); }
		public ModifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modify; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitModify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyContext modify() throws RecognitionException {
		ModifyContext _localctx = new ModifyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_modify);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((ModifyContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(136);
			((ModifyContext)_localctx).mod = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ASSIGN || _la==MODIFY) ) {
				((ModifyContext)_localctx).mod = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(137);
			((ModifyContext)_localctx).expr = expr(0);
			   ((ModifyContext)_localctx).val =  new StringBuilder()
			                .append(((ModifyContext)_localctx).IDENTIFIER.getText())
			                .append(' ')
			                .append(((ModifyContext)_localctx).mod.getText())
			                .append(' ')
			                .append(((ModifyContext)_localctx).expr.val);
			        
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

	public static class AssignmentContext extends ParserRuleContext {
		public StringBuilder val;
		public Token IDENTIFIER;
		public Token ASSIGN;
		public ExprContext expr;
		public TerminalNode IDENTIFIER() { return getToken(CPPParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(CPPParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((AssignmentContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(141);
			((AssignmentContext)_localctx).ASSIGN = match(ASSIGN);
			setState(142);
			((AssignmentContext)_localctx).expr = expr(0);
			   ((AssignmentContext)_localctx).val =  new StringBuilder()
			                .append(((AssignmentContext)_localctx).IDENTIFIER.getText())
			                .append(' ')
			                .append(((AssignmentContext)_localctx).ASSIGN.getText())
			                .append(' ')
			                .append(((AssignmentContext)_localctx).expr.val);
			        
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
		public StringBuilder val;
		public Token RETURN;
		public ExprContext expr;
		public Token SEMICOLON;
		public TerminalNode RETURN() { return getToken(CPPParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CPPParser.SEMICOLON, 0); }
		public Return_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterReturn_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitReturn_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitReturn_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_Context return_() throws RecognitionException {
		Return_Context _localctx = new Return_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((Return_Context)_localctx).RETURN = match(RETURN);
			setState(146);
			((Return_Context)_localctx).expr = expr(0);
			setState(147);
			((Return_Context)_localctx).SEMICOLON = match(SEMICOLON);
			   ((Return_Context)_localctx).val =  new StringBuilder()
			                .append(((Return_Context)_localctx).RETURN.getText())
			                .append(' ')
			                .append(((Return_Context)_localctx).expr.val)
			                .append(((Return_Context)_localctx).SEMICOLON.getText())
			                .append('\n');
			        
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

	public static class For_Context extends ParserRuleContext {
		public int tabs;
		public StringBuilder val;
		public Token FOR;
		public Token LP;
		public AssignmentContext assignment;
		public Token SEMICOLON;
		public ExprContext expr;
		public ModifyContext modify;
		public Token RP;
		public Token BEGIN;
		public ActionsContext actions;
		public Token END;
		public TerminalNode FOR() { return getToken(CPPParser.FOR, 0); }
		public TerminalNode LP() { return getToken(CPPParser.LP, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CPPParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CPPParser.SEMICOLON, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ModifyContext modify() {
			return getRuleContext(ModifyContext.class,0);
		}
		public TerminalNode RP() { return getToken(CPPParser.RP, 0); }
		public TerminalNode BEGIN() { return getToken(CPPParser.BEGIN, 0); }
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public TerminalNode END() { return getToken(CPPParser.END, 0); }
		public For_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public For_Context(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_for_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterFor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitFor_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFor_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_Context for_(int tabs) throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState(), tabs);
		enterRule(_localctx, 22, RULE_for_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((For_Context)_localctx).FOR = match(FOR);
			setState(151);
			((For_Context)_localctx).LP = match(LP);
			setState(152);
			((For_Context)_localctx).assignment = assignment();
			setState(153);
			((For_Context)_localctx).SEMICOLON = match(SEMICOLON);
			setState(154);
			((For_Context)_localctx).expr = expr(0);
			setState(155);
			((For_Context)_localctx).SEMICOLON = match(SEMICOLON);
			setState(156);
			((For_Context)_localctx).modify = modify();
			setState(157);
			((For_Context)_localctx).RP = match(RP);
			setState(158);
			((For_Context)_localctx).BEGIN = match(BEGIN);
			setState(159);
			((For_Context)_localctx).actions = actions(tabs + 1);
			setState(160);
			((For_Context)_localctx).END = match(END);
			   ((For_Context)_localctx).val =  new StringBuilder()
			                .append(((For_Context)_localctx).FOR.getText())
			                .append(' ')
			                .append(((For_Context)_localctx).LP.getText())
			                .append(((For_Context)_localctx).assignment.val)
			                .append(((For_Context)_localctx).SEMICOLON.getText())
			                .append(' ')
			                .append(((For_Context)_localctx).expr.val)
			                .append(((For_Context)_localctx).SEMICOLON.getText())
			                .append(' ')
			                .append(((For_Context)_localctx).modify.val)
			                .append(((For_Context)_localctx).RP.getText())
			                .append(' ')
			                .append(((For_Context)_localctx).BEGIN.getText())
			                .append('\n')
			                .append(((For_Context)_localctx).actions.val);
			            for (int i = 0; i < tabs; i++) _localctx.val.append('\t');
			            _localctx.val.append(((For_Context)_localctx).END.getText()).append('\n');
			        
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

	public static class While_Context extends ParserRuleContext {
		public int tabs;
		public StringBuilder val;
		public Token WHILE;
		public Token LP;
		public ExprContext expr;
		public Token RP;
		public Token BEGIN;
		public ActionsContext actions;
		public Token END;
		public TerminalNode WHILE() { return getToken(CPPParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(CPPParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CPPParser.RP, 0); }
		public TerminalNode BEGIN() { return getToken(CPPParser.BEGIN, 0); }
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public TerminalNode END() { return getToken(CPPParser.END, 0); }
		public While_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public While_Context(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitWhile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitWhile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_Context while_(int tabs) throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState(), tabs);
		enterRule(_localctx, 24, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((While_Context)_localctx).WHILE = match(WHILE);
			setState(164);
			((While_Context)_localctx).LP = match(LP);
			setState(165);
			((While_Context)_localctx).expr = expr(0);
			setState(166);
			((While_Context)_localctx).RP = match(RP);
			setState(167);
			((While_Context)_localctx).BEGIN = match(BEGIN);
			setState(168);
			((While_Context)_localctx).actions = actions(tabs + 1);
			setState(169);
			((While_Context)_localctx).END = match(END);
			   ((While_Context)_localctx).val =  new StringBuilder();
			            _localctx.val.append(((While_Context)_localctx).WHILE.getText())
			                .append(' ')
			                .append(((While_Context)_localctx).LP.getText())
			                .append(((While_Context)_localctx).expr.val)
			                .append(((While_Context)_localctx).RP.getText())
			                .append(' ')
			                .append(((While_Context)_localctx).BEGIN.getText())
			                .append('\n')
			                .append(((While_Context)_localctx).actions.val);
			            for (int i = 0; i < tabs; i++) _localctx.val.append('\t');
			            _localctx.val.append(((While_Context)_localctx).END.getText()).append('\n');
			        
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

	public static class If_Context extends ParserRuleContext {
		public int tabs;
		public StringBuilder val;
		public Token IF;
		public Token LP;
		public ExprContext expr;
		public Token RP;
		public Token BEGIN;
		public ActionsContext actions;
		public Token END;
		public TerminalNode IF() { return getToken(CPPParser.IF, 0); }
		public TerminalNode LP() { return getToken(CPPParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(CPPParser.RP, 0); }
		public TerminalNode BEGIN() { return getToken(CPPParser.BEGIN, 0); }
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
		}
		public TerminalNode END() { return getToken(CPPParser.END, 0); }
		public If_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_Context(ParserRuleContext parent, int invokingState, int tabs) {
			super(parent, invokingState);
			this.tabs = tabs;
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitIf_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_(int tabs) throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState(), tabs);
		enterRule(_localctx, 26, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((If_Context)_localctx).IF = match(IF);
			setState(173);
			((If_Context)_localctx).LP = match(LP);
			setState(174);
			((If_Context)_localctx).expr = expr(0);
			setState(175);
			((If_Context)_localctx).RP = match(RP);
			setState(176);
			((If_Context)_localctx).BEGIN = match(BEGIN);
			setState(177);
			((If_Context)_localctx).actions = actions(tabs + 1);
			setState(178);
			((If_Context)_localctx).END = match(END);
			   ((If_Context)_localctx).val =  new StringBuilder();
			            _localctx.val.append(((If_Context)_localctx).IF.getText())
			                .append(' ')
			                .append(((If_Context)_localctx).LP.getText())
			                .append(((If_Context)_localctx).expr.val)
			                .append(((If_Context)_localctx).RP.getText())
			                .append(((If_Context)_localctx).BEGIN.getText())
			                .append('\n')
			                .append(((If_Context)_localctx).actions.val);
			            for (int i = 0; i < tabs; i++) _localctx.val.append('\t');
			            _localctx.val.append(((If_Context)_localctx).END.getText()).append('\n');
			        
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

	public static class ExprContext extends ParserRuleContext {
		public StringBuilder val;
		public ExprContext l;
		public Token IDENTIFIER;
		public Token PRIMITIVE_VALUES;
		public FuncInvokeContext funcInvoke;
		public Token LP;
		public ExprContext expr;
		public Token RP;
		public Token OPERATORS;
		public ExprContext r;
		public TerminalNode IDENTIFIER() { return getToken(CPPParser.IDENTIFIER, 0); }
		public TerminalNode PRIMITIVE_VALUES() { return getToken(CPPParser.PRIMITIVE_VALUES, 0); }
		public FuncInvokeContext funcInvoke() {
			return getRuleContext(FuncInvokeContext.class,0);
		}
		public TerminalNode LP() { return getToken(CPPParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(CPPParser.RP, 0); }
		public TerminalNode OPERATORS() { return getToken(CPPParser.OPERATORS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(182);
				((ExprContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((ExprContext)_localctx).val =  new StringBuilder(((ExprContext)_localctx).IDENTIFIER.getText());      
				}
				break;
			case 2:
				{
				setState(184);
				((ExprContext)_localctx).PRIMITIVE_VALUES = match(PRIMITIVE_VALUES);
				((ExprContext)_localctx).val =  new StringBuilder(((ExprContext)_localctx).PRIMITIVE_VALUES.getText());
				}
				break;
			case 3:
				{
				setState(186);
				((ExprContext)_localctx).funcInvoke = funcInvoke();
				((ExprContext)_localctx).val =  new StringBuilder(((ExprContext)_localctx).funcInvoke.val);            
				}
				break;
			case 4:
				{
				setState(189);
				((ExprContext)_localctx).LP = match(LP);
				setState(190);
				((ExprContext)_localctx).expr = expr(0);
				setState(191);
				((ExprContext)_localctx).RP = match(RP);
				((ExprContext)_localctx).val =  new StringBuilder(((ExprContext)_localctx).LP.getText()).append(((ExprContext)_localctx).expr.val).append(((ExprContext)_localctx).RP.getText());
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(196);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(197);
					((ExprContext)_localctx).OPERATORS = match(OPERATORS);
					setState(198);
					((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(3);
					 ((ExprContext)_localctx).val =  new StringBuilder()
					                      .append(((ExprContext)_localctx).l.val)
					                      .append(' ')
					                      .append(((ExprContext)_localctx).OPERATORS.getText())
					                      .append(' ')
					                      .append(((ExprContext)_localctx).r.val);
					                  
					}
					} 
				}
				setState(205);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FuncInvokeContext extends ParserRuleContext {
		public StringBuilder val;
		public Token IDENTIFIER;
		public Token LP;
		public PassedArgsContext passedArgs;
		public Token RP;
		public TerminalNode IDENTIFIER() { return getToken(CPPParser.IDENTIFIER, 0); }
		public TerminalNode LP() { return getToken(CPPParser.LP, 0); }
		public PassedArgsContext passedArgs() {
			return getRuleContext(PassedArgsContext.class,0);
		}
		public TerminalNode RP() { return getToken(CPPParser.RP, 0); }
		public FuncInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterFuncInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitFuncInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitFuncInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncInvokeContext funcInvoke() throws RecognitionException {
		FuncInvokeContext _localctx = new FuncInvokeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcInvoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((FuncInvokeContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			setState(207);
			((FuncInvokeContext)_localctx).LP = match(LP);
			((FuncInvokeContext)_localctx).val =  new StringBuilder(((FuncInvokeContext)_localctx).IDENTIFIER.getText() + ((FuncInvokeContext)_localctx).LP.getText());
			setState(209);
			((FuncInvokeContext)_localctx).passedArgs = passedArgs();
			_localctx.val.append(((FuncInvokeContext)_localctx).passedArgs.val);                         
			setState(211);
			((FuncInvokeContext)_localctx).RP = match(RP);
			_localctx.val.append(((FuncInvokeContext)_localctx).RP.getText());                                     
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

	public static class PassedArgsContext extends ParserRuleContext {
		public StringBuilder val;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CPPParser.COMMA, i);
		}
		public PassedArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passedArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterPassedArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitPassedArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitPassedArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassedArgsContext passedArgs() throws RecognitionException {
		PassedArgsContext _localctx = new PassedArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_passedArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((PassedArgsContext)_localctx).val =  new StringBuilder();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIMITIVE_VALUES) | (1L << IDENTIFIER) | (1L << LP))) != 0)) {
				{
				setState(215);
				((PassedArgsContext)_localctx).expr = expr(0);
				_localctx.val.append(((PassedArgsContext)_localctx).expr.val);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(217);
					match(COMMA);
					setState(218);
					((PassedArgsContext)_localctx).expr = expr(0);

					                    _localctx.val.append(", ").append(((PassedArgsContext)_localctx).expr.val);
					                
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class SignatureContext extends ParserRuleContext {
		public StringBuilder val;
		public TypeContext type;
		public Token IDENTIFIER;
		public Token COMMA;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CPPParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CPPParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CPPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CPPParser.COMMA, i);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SignatureContext)_localctx).val =  new StringBuilder();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANY_TYPE) {
				{
				setState(229);
				((SignatureContext)_localctx).type = type();
				setState(230);
				((SignatureContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				_localctx.val.append(((SignatureContext)_localctx).type.val).append(' ').append(((SignatureContext)_localctx).IDENTIFIER.getText());
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(232);
					((SignatureContext)_localctx).COMMA = match(COMMA);
					setState(233);
					((SignatureContext)_localctx).type = type();
					setState(234);
					((SignatureContext)_localctx).IDENTIFIER = match(IDENTIFIER);

					                     _localctx.val.append(((SignatureContext)_localctx).COMMA.getText()).append(' ').append(((SignatureContext)_localctx).type.val).append(' ').append(((SignatureContext)_localctx).IDENTIFIER.getText());
					                 
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class TypeContext extends ParserRuleContext {
		public String val;
		public Token ANY_TYPE;
		public TerminalNode ANY_TYPE() { return getToken(CPPParser.ANY_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPPListener ) ((CPPListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CPPVisitor ) return ((CPPVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			((TypeContext)_localctx).ANY_TYPE = match(ANY_TYPE);
			((TypeContext)_localctx).val =  ((TypeContext)_localctx).ANY_TYPE.getText().replaceAll("( )", "").trim();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00fa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7t\n\7\r\7\16"+
		"\7u\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u0086"+
		"\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00c5\n\20\3\20\3\20\3\20\3\20\3\20\7\20\u00cc\n\20\f\20\16"+
		"\20\u00cf\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00e0\n\22\f\22\16\22\u00e3\13\22\5\22\u00e5"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f0\n\23\f\23"+
		"\16\23\u00f3\13\23\5\23\u00f5\n\23\3\24\3\24\3\24\3\24\2\3\36\25\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\3\3\2\24\25\2\u00fa\2(\3\2\2"+
		"\2\48\3\2\2\2\6:\3\2\2\2\bD\3\2\2\2\nh\3\2\2\2\fj\3\2\2\2\16z\3\2\2\2"+
		"\20\u0082\3\2\2\2\22\u0089\3\2\2\2\24\u008e\3\2\2\2\26\u0093\3\2\2\2\30"+
		"\u0098\3\2\2\2\32\u00a5\3\2\2\2\34\u00ae\3\2\2\2\36\u00c4\3\2\2\2 \u00d0"+
		"\3\2\2\2\"\u00d8\3\2\2\2$\u00e6\3\2\2\2&\u00f6\3\2\2\2(.\b\2\1\2)*\5\4"+
		"\3\2*+\b\2\1\2+-\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\3"+
		"\3\2\2\2\60.\3\2\2\2\61\62\5\6\4\2\62\63\b\3\1\2\639\3\2\2\2\64\65\5\20"+
		"\t\2\65\66\7\23\2\2\66\67\b\3\1\2\679\3\2\2\28\61\3\2\2\28\64\3\2\2\2"+
		"9\5\3\2\2\2:;\5&\24\2;<\7\21\2\2<=\7\27\2\2=>\5$\23\2>?\7\30\2\2?@\7\31"+
		"\2\2@A\5\b\5\2AB\7\32\2\2BC\b\4\1\2C\7\3\2\2\2DJ\b\5\1\2EF\5\n\6\2FG\b"+
		"\5\1\2GI\3\2\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LJ"+
		"\3\2\2\2MN\5\30\r\2NO\b\6\1\2Oi\3\2\2\2PQ\5\f\7\2QR\b\6\1\2Ri\3\2\2\2"+
		"ST\5\34\17\2TU\b\6\1\2Ui\3\2\2\2VW\5\32\16\2WX\b\6\1\2Xi\3\2\2\2YZ\5\26"+
		"\f\2Z[\b\6\1\2[i\3\2\2\2\\]\5\20\t\2]^\7\23\2\2^_\b\6\1\2_i\3\2\2\2`a"+
		"\5\22\n\2ab\7\23\2\2bc\b\6\1\2ci\3\2\2\2de\5 \21\2ef\7\23\2\2fg\b\6\1"+
		"\2gi\3\2\2\2hM\3\2\2\2hP\3\2\2\2hS\3\2\2\2hV\3\2\2\2hY\3\2\2\2h\\\3\2"+
		"\2\2h`\3\2\2\2hd\3\2\2\2i\13\3\2\2\2jk\7\3\2\2kl\7\27\2\2lm\5\36\20\2"+
		"mn\7\30\2\2no\7\31\2\2os\b\7\1\2pq\5\16\b\2qr\b\7\1\2rt\3\2\2\2sp\3\2"+
		"\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\32\2\2xy\b\7\1\2y\r\3"+
		"\2\2\2z{\7\4\2\2{|\5\36\20\2|}\7\5\2\2}~\5\b\5\2~\177\7\6\2\2\177\u0080"+
		"\7\23\2\2\u0080\u0081\b\b\1\2\u0081\17\3\2\2\2\u0082\u0085\5&\24\2\u0083"+
		"\u0086\7\21\2\2\u0084\u0086\5\24\13\2\u0085\u0083\3\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\t\1\2\u0088\21\3\2\2\2\u0089"+
		"\u008a\7\21\2\2\u008a\u008b\t\2\2\2\u008b\u008c\5\36\20\2\u008c\u008d"+
		"\b\n\1\2\u008d\23\3\2\2\2\u008e\u008f\7\21\2\2\u008f\u0090\7\24\2\2\u0090"+
		"\u0091\5\36\20\2\u0091\u0092\b\13\1\2\u0092\25\3\2\2\2\u0093\u0094\7\t"+
		"\2\2\u0094\u0095\5\36\20\2\u0095\u0096\7\23\2\2\u0096\u0097\b\f\1\2\u0097"+
		"\27\3\2\2\2\u0098\u0099\7\n\2\2\u0099\u009a\7\27\2\2\u009a\u009b\5\24"+
		"\13\2\u009b\u009c\7\23\2\2\u009c\u009d\5\36\20\2\u009d\u009e\7\23\2\2"+
		"\u009e\u009f\5\22\n\2\u009f\u00a0\7\30\2\2\u00a0\u00a1\7\31\2\2\u00a1"+
		"\u00a2\5\b\5\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\b\r\1\2\u00a4\31\3\2\2"+
		"\2\u00a5\u00a6\7\13\2\2\u00a6\u00a7\7\27\2\2\u00a7\u00a8\5\36\20\2\u00a8"+
		"\u00a9\7\30\2\2\u00a9\u00aa\7\31\2\2\u00aa\u00ab\5\b\5\2\u00ab\u00ac\7"+
		"\32\2\2\u00ac\u00ad\b\16\1\2\u00ad\33\3\2\2\2\u00ae\u00af\7\f\2\2\u00af"+
		"\u00b0\7\27\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3"+
		"\7\31\2\2\u00b3\u00b4\5\b\5\2\u00b4\u00b5\7\32\2\2\u00b5\u00b6\b\17\1"+
		"\2\u00b6\35\3\2\2\2\u00b7\u00b8\b\20\1\2\u00b8\u00b9\7\21\2\2\u00b9\u00c5"+
		"\b\20\1\2\u00ba\u00bb\7\r\2\2\u00bb\u00c5\b\20\1\2\u00bc\u00bd\5 \21\2"+
		"\u00bd\u00be\b\20\1\2\u00be\u00c5\3\2\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1"+
		"\5\36\20\2\u00c1\u00c2\7\30\2\2\u00c2\u00c3\b\20\1\2\u00c3\u00c5\3\2\2"+
		"\2\u00c4\u00b7\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00bf"+
		"\3\2\2\2\u00c5\u00cd\3\2\2\2\u00c6\u00c7\f\4\2\2\u00c7\u00c8\7\22\2\2"+
		"\u00c8\u00c9\5\36\20\5\u00c9\u00ca\b\20\1\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c6\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\37\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\21\2\2\u00d1\u00d2"+
		"\7\27\2\2\u00d2\u00d3\b\21\1\2\u00d3\u00d4\5\"\22\2\u00d4\u00d5\b\21\1"+
		"\2\u00d5\u00d6\7\30\2\2\u00d6\u00d7\b\21\1\2\u00d7!\3\2\2\2\u00d8\u00e4"+
		"\b\22\1\2\u00d9\u00da\5\36\20\2\u00da\u00e1\b\22\1\2\u00db\u00dc\7\26"+
		"\2\2\u00dc\u00dd\5\36\20\2\u00dd\u00de\b\22\1\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00db\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00d9\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5#\3\2\2\2\u00e6\u00f4\b\23\1\2\u00e7\u00e8\5&\24\2"+
		"\u00e8\u00e9\7\21\2\2\u00e9\u00f1\b\23\1\2\u00ea\u00eb\7\26\2\2\u00eb"+
		"\u00ec\5&\24\2\u00ec\u00ed\7\21\2\2\u00ed\u00ee\b\23\1\2\u00ee\u00f0\3"+
		"\2\2\2\u00ef\u00ea\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00e7\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5%\3\2\2\2\u00f6\u00f7\7\7\2\2\u00f7\u00f8"+
		"\b\24\1\2\u00f8\'\3\2\2\2\16.8Jhu\u0085\u00c4\u00cd\u00e1\u00e4\u00f1"+
		"\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}