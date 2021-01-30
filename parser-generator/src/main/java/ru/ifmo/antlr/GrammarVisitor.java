// Generated from C:/Users/Asus/University/Term05/MT/lab04/src/main/java/ru/ifmo\Grammar.g4 by ANTLR 4.9
package ru.ifmo.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parseAllGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseAllGrammar(GrammarParser.ParseAllGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tokenize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenize(GrammarParser.TokenizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(GrammarParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#return_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_(GrammarParser.Return_Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrs(GrammarParser.AttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#attr_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_tail(GrammarParser.Attr_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(GrammarParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ruleout_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleout_tail(GrammarParser.Ruleout_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ruleout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleout(GrammarParser.RuleoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type_with_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_with_args(GrammarParser.Type_with_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(GrammarParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#args_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_tail(GrammarParser.Args_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(GrammarParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarParser.TypeContext ctx);
}