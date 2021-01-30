// Generated from C:/Users/Asus/University/Term05/MT/lab03/src/main/java/ru/ifmo\CPP.g4 by ANTLR 4.9
package ru.ifmo.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CPPParser}.
 */
public interface CPPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CPPParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(CPPParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(CPPParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#global_action}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_action(CPPParser.Global_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#global_action}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_action(CPPParser.Global_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CPPParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CPPParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#actions}.
	 * @param ctx the parse tree
	 */
	void enterActions(CPPParser.ActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#actions}.
	 * @param ctx the parse tree
	 */
	void exitActions(CPPParser.ActionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(CPPParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(CPPParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#swi}.
	 * @param ctx the parse tree
	 */
	void enterSwi(CPPParser.SwiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#swi}.
	 * @param ctx the parse tree
	 */
	void exitSwi(CPPParser.SwiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#cas}.
	 * @param ctx the parse tree
	 */
	void enterCas(CPPParser.CasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#cas}.
	 * @param ctx the parse tree
	 */
	void exitCas(CPPParser.CasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(CPPParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(CPPParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#modify}.
	 * @param ctx the parse tree
	 */
	void enterModify(CPPParser.ModifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#modify}.
	 * @param ctx the parse tree
	 */
	void exitModify(CPPParser.ModifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CPPParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CPPParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(CPPParser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(CPPParser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(CPPParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(CPPParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(CPPParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(CPPParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(CPPParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(CPPParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CPPParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CPPParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#funcInvoke}.
	 * @param ctx the parse tree
	 */
	void enterFuncInvoke(CPPParser.FuncInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#funcInvoke}.
	 * @param ctx the parse tree
	 */
	void exitFuncInvoke(CPPParser.FuncInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#passedArgs}.
	 * @param ctx the parse tree
	 */
	void enterPassedArgs(CPPParser.PassedArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#passedArgs}.
	 * @param ctx the parse tree
	 */
	void exitPassedArgs(CPPParser.PassedArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(CPPParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(CPPParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CPPParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CPPParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CPPParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CPPParser.TypeContext ctx);
}