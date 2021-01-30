// Generated from C:/Users/Asus/University/Term05/MT/lab04/src/main/java/ru/ifmo\Grammar.g4 by ANTLR 4.9
package ru.ifmo.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parseAllGrammar}.
	 * @param ctx the parse tree
	 */
	void enterParseAllGrammar(GrammarParser.ParseAllGrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parseAllGrammar}.
	 * @param ctx the parse tree
	 */
	void exitParseAllGrammar(GrammarParser.ParseAllGrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tokenize}.
	 * @param ctx the parse tree
	 */
	void enterTokenize(GrammarParser.TokenizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tokenize}.
	 * @param ctx the parse tree
	 */
	void exitTokenize(GrammarParser.TokenizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(GrammarParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(GrammarParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(GrammarParser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(GrammarParser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attrs}.
	 * @param ctx the parse tree
	 */
	void enterAttrs(GrammarParser.AttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attrs}.
	 * @param ctx the parse tree
	 */
	void exitAttrs(GrammarParser.AttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attr_tail}.
	 * @param ctx the parse tree
	 */
	void enterAttr_tail(GrammarParser.Attr_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attr_tail}.
	 * @param ctx the parse tree
	 */
	void exitAttr_tail(GrammarParser.Attr_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(GrammarParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(GrammarParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ruleout_tail}.
	 * @param ctx the parse tree
	 */
	void enterRuleout_tail(GrammarParser.Ruleout_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ruleout_tail}.
	 * @param ctx the parse tree
	 */
	void exitRuleout_tail(GrammarParser.Ruleout_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ruleout}.
	 * @param ctx the parse tree
	 */
	void enterRuleout(GrammarParser.RuleoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ruleout}.
	 * @param ctx the parse tree
	 */
	void exitRuleout(GrammarParser.RuleoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type_with_args}.
	 * @param ctx the parse tree
	 */
	void enterType_with_args(GrammarParser.Type_with_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type_with_args}.
	 * @param ctx the parse tree
	 */
	void exitType_with_args(GrammarParser.Type_with_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#args_tail}.
	 * @param ctx the parse tree
	 */
	void enterArgs_tail(GrammarParser.Args_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#args_tail}.
	 * @param ctx the parse tree
	 */
	void exitArgs_tail(GrammarParser.Args_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(GrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(GrammarParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
}