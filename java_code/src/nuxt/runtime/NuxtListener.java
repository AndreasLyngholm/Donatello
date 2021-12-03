// Generated from Nuxt.g4 by ANTLR 4.9.3
package nuxt.runtime;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NuxtParser}.
 */
public interface NuxtListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NuxtParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(NuxtParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(NuxtParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(NuxtParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(NuxtParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(NuxtParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(NuxtParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NuxtParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NuxtParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(NuxtParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(NuxtParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(NuxtParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(NuxtParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#as}.
	 * @param ctx the parse tree
	 */
	void enterAs(NuxtParser.AsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#as}.
	 * @param ctx the parse tree
	 */
	void exitAs(NuxtParser.AsContext ctx);
}