// Generated from C:/Users/Asus/University/Term05/MT/lab03/src/main/java/ru/ifmo\CPP.g4 by ANTLR 4.9
package ru.ifmo.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CPPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CPPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CPPParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(CPPParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#global_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_action(CPPParser.Global_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(CPPParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#actions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActions(CPPParser.ActionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(CPPParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#swi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwi(CPPParser.SwiContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#cas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCas(CPPParser.CasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(CPPParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#modify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify(CPPParser.ModifyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CPPParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#return_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_(CPPParser.Return_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#for_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_(CPPParser.For_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(CPPParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(CPPParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CPPParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#funcInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncInvoke(CPPParser.FuncInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#passedArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassedArgs(CPPParser.PassedArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(CPPParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CPPParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CPPParser.TypeContext ctx);
}