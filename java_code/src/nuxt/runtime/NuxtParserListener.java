// Generated from NuxtParser.g4 by ANTLR 4.9.3

package nuxt.runtime;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NuxtParser}.
 */
public interface NuxtParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NuxtParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(NuxtParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(NuxtParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(NuxtParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(NuxtParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_tag}
	 * labeled alternative in {@link NuxtParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_tag(NuxtParser.Atom_tagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_tag}
	 * labeled alternative in {@link NuxtParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_tag(NuxtParser.Atom_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_output}
	 * labeled alternative in {@link NuxtParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_output(NuxtParser.Atom_outputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_output}
	 * labeled alternative in {@link NuxtParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_output(NuxtParser.Atom_outputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_assignment}
	 * labeled alternative in {@link NuxtParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_assignment(NuxtParser.Atom_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_assignment}
	 * labeled alternative in {@link NuxtParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_assignment(NuxtParser.Atom_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_others}
	 * labeled alternative in {@link NuxtParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_others(NuxtParser.Atom_othersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_others}
	 * labeled alternative in {@link NuxtParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_others(NuxtParser.Atom_othersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(NuxtParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(NuxtParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#use_tag}.
	 * @param ctx the parse tree
	 */
	void enterUse_tag(NuxtParser.Use_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#use_tag}.
	 * @param ctx the parse tree
	 */
	void exitUse_tag(NuxtParser.Use_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#code_tag}.
	 * @param ctx the parse tree
	 */
	void enterCode_tag(NuxtParser.Code_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#code_tag}.
	 * @param ctx the parse tree
	 */
	void exitCode_tag(NuxtParser.Code_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#other_tag}.
	 * @param ctx the parse tree
	 */
	void enterOther_tag(NuxtParser.Other_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#other_tag}.
	 * @param ctx the parse tree
	 */
	void exitOther_tag(NuxtParser.Other_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#continue_tag}.
	 * @param ctx the parse tree
	 */
	void enterContinue_tag(NuxtParser.Continue_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#continue_tag}.
	 * @param ctx the parse tree
	 */
	void exitContinue_tag(NuxtParser.Continue_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#other_tag_block}.
	 * @param ctx the parse tree
	 */
	void enterOther_tag_block(NuxtParser.Other_tag_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#other_tag_block}.
	 * @param ctx the parse tree
	 */
	void exitOther_tag_block(NuxtParser.Other_tag_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#raw_tag}.
	 * @param ctx the parse tree
	 */
	void enterRaw_tag(NuxtParser.Raw_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#raw_tag}.
	 * @param ctx the parse tree
	 */
	void exitRaw_tag(NuxtParser.Raw_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#raw_body}.
	 * @param ctx the parse tree
	 */
	void enterRaw_body(NuxtParser.Raw_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#raw_body}.
	 * @param ctx the parse tree
	 */
	void exitRaw_body(NuxtParser.Raw_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#comment_tag}.
	 * @param ctx the parse tree
	 */
	void enterComment_tag(NuxtParser.Comment_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#comment_tag}.
	 * @param ctx the parse tree
	 */
	void exitComment_tag(NuxtParser.Comment_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#other_than_tag_start}.
	 * @param ctx the parse tree
	 */
	void enterOther_than_tag_start(NuxtParser.Other_than_tag_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#other_than_tag_start}.
	 * @param ctx the parse tree
	 */
	void exitOther_than_tag_start(NuxtParser.Other_than_tag_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#if_tag}.
	 * @param ctx the parse tree
	 */
	void enterIf_tag(NuxtParser.If_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#if_tag}.
	 * @param ctx the parse tree
	 */
	void exitIf_tag(NuxtParser.If_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#elsif_tag}.
	 * @param ctx the parse tree
	 */
	void enterElsif_tag(NuxtParser.Elsif_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#elsif_tag}.
	 * @param ctx the parse tree
	 */
	void exitElsif_tag(NuxtParser.Elsif_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#else_tag}.
	 * @param ctx the parse tree
	 */
	void enterElse_tag(NuxtParser.Else_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#else_tag}.
	 * @param ctx the parse tree
	 */
	void exitElse_tag(NuxtParser.Else_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#unless_tag}.
	 * @param ctx the parse tree
	 */
	void enterUnless_tag(NuxtParser.Unless_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#unless_tag}.
	 * @param ctx the parse tree
	 */
	void exitUnless_tag(NuxtParser.Unless_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#case_tag}.
	 * @param ctx the parse tree
	 */
	void enterCase_tag(NuxtParser.Case_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#case_tag}.
	 * @param ctx the parse tree
	 */
	void exitCase_tag(NuxtParser.Case_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#when_tag}.
	 * @param ctx the parse tree
	 */
	void enterWhen_tag(NuxtParser.When_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#when_tag}.
	 * @param ctx the parse tree
	 */
	void exitWhen_tag(NuxtParser.When_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#cycle_tag}.
	 * @param ctx the parse tree
	 */
	void enterCycle_tag(NuxtParser.Cycle_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#cycle_tag}.
	 * @param ctx the parse tree
	 */
	void exitCycle_tag(NuxtParser.Cycle_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#cycle_group}.
	 * @param ctx the parse tree
	 */
	void enterCycle_group(NuxtParser.Cycle_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#cycle_group}.
	 * @param ctx the parse tree
	 */
	void exitCycle_group(NuxtParser.Cycle_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#for_tag}.
	 * @param ctx the parse tree
	 */
	void enterFor_tag(NuxtParser.For_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#for_tag}.
	 * @param ctx the parse tree
	 */
	void exitFor_tag(NuxtParser.For_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#for_array}.
	 * @param ctx the parse tree
	 */
	void enterFor_array(NuxtParser.For_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#for_array}.
	 * @param ctx the parse tree
	 */
	void exitFor_array(NuxtParser.For_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#for_range}.
	 * @param ctx the parse tree
	 */
	void enterFor_range(NuxtParser.For_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#for_range}.
	 * @param ctx the parse tree
	 */
	void exitFor_range(NuxtParser.For_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#for_block}.
	 * @param ctx the parse tree
	 */
	void enterFor_block(NuxtParser.For_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#for_block}.
	 * @param ctx the parse tree
	 */
	void exitFor_block(NuxtParser.For_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#for_attribute}.
	 * @param ctx the parse tree
	 */
	void enterFor_attribute(NuxtParser.For_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#for_attribute}.
	 * @param ctx the parse tree
	 */
	void exitFor_attribute(NuxtParser.For_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(NuxtParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(NuxtParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#table_tag}.
	 * @param ctx the parse tree
	 */
	void enterTable_tag(NuxtParser.Table_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#table_tag}.
	 * @param ctx the parse tree
	 */
	void exitTable_tag(NuxtParser.Table_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code capture_tag_Id}
	 * labeled alternative in {@link NuxtParser#capture_tag}.
	 * @param ctx the parse tree
	 */
	void enterCapture_tag_Id(NuxtParser.Capture_tag_IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code capture_tag_Id}
	 * labeled alternative in {@link NuxtParser#capture_tag}.
	 * @param ctx the parse tree
	 */
	void exitCapture_tag_Id(NuxtParser.Capture_tag_IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code capture_tag_Str}
	 * labeled alternative in {@link NuxtParser#capture_tag}.
	 * @param ctx the parse tree
	 */
	void enterCapture_tag_Str(NuxtParser.Capture_tag_StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code capture_tag_Str}
	 * labeled alternative in {@link NuxtParser#capture_tag}.
	 * @param ctx the parse tree
	 */
	void exitCapture_tag_Str(NuxtParser.Capture_tag_StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#include_tag}.
	 * @param ctx the parse tree
	 */
	void enterInclude_tag(NuxtParser.Include_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#include_tag}.
	 * @param ctx the parse tree
	 */
	void exitInclude_tag(NuxtParser.Include_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jekyll_include_output}
	 * labeled alternative in {@link NuxtParser#file_name_or_output}.
	 * @param ctx the parse tree
	 */
	void enterJekyll_include_output(NuxtParser.Jekyll_include_outputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jekyll_include_output}
	 * labeled alternative in {@link NuxtParser#file_name_or_output}.
	 * @param ctx the parse tree
	 */
	void exitJekyll_include_output(NuxtParser.Jekyll_include_outputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jekyll_include_filename}
	 * labeled alternative in {@link NuxtParser#file_name_or_output}.
	 * @param ctx the parse tree
	 */
	void enterJekyll_include_filename(NuxtParser.Jekyll_include_filenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jekyll_include_filename}
	 * labeled alternative in {@link NuxtParser#file_name_or_output}.
	 * @param ctx the parse tree
	 */
	void exitJekyll_include_filename(NuxtParser.Jekyll_include_filenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#jekyll_include_params}.
	 * @param ctx the parse tree
	 */
	void enterJekyll_include_params(NuxtParser.Jekyll_include_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#jekyll_include_params}.
	 * @param ctx the parse tree
	 */
	void exitJekyll_include_params(NuxtParser.Jekyll_include_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(NuxtParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(NuxtParser.OutputContext ctx);
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
	 * Enter a parse tree produced by {@link NuxtParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(NuxtParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(NuxtParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(NuxtParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(NuxtParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param_expr_key_value}
	 * labeled alternative in {@link NuxtParser#param_expr}.
	 * @param ctx the parse tree
	 */
	void enterParam_expr_key_value(NuxtParser.Param_expr_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param_expr_key_value}
	 * labeled alternative in {@link NuxtParser#param_expr}.
	 * @param ctx the parse tree
	 */
	void exitParam_expr_key_value(NuxtParser.Param_expr_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param_expr_expr}
	 * labeled alternative in {@link NuxtParser#param_expr}.
	 * @param ctx the parse tree
	 */
	void enterParam_expr_expr(NuxtParser.Param_expr_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param_expr_expr}
	 * labeled alternative in {@link NuxtParser#param_expr}.
	 * @param ctx the parse tree
	 */
	void exitParam_expr_expr(NuxtParser.Param_expr_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(NuxtParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(NuxtParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_contains}
	 * labeled alternative in {@link NuxtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_contains(NuxtParser.Expr_containsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_contains}
	 * labeled alternative in {@link NuxtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_contains(NuxtParser.Expr_containsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_term}
	 * labeled alternative in {@link NuxtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_term(NuxtParser.Expr_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_term}
	 * labeled alternative in {@link NuxtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_term(NuxtParser.Expr_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_rel}
	 * labeled alternative in {@link NuxtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_rel(NuxtParser.Expr_relContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_rel}
	 * labeled alternative in {@link NuxtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_rel(NuxtParser.Expr_relContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_eq}
	 * labeled alternative in {@link NuxtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(NuxtParser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_eq}
	 * labeled alternative in {@link NuxtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(NuxtParser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_logic}
	 * labeled alternative in {@link NuxtParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_logic(NuxtParser.Expr_logicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_logic}
	 * labeled alternative in {@link NuxtParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_logic(NuxtParser.Expr_logicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_DoubleNum}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_DoubleNum(NuxtParser.Term_DoubleNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_DoubleNum}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_DoubleNum(NuxtParser.Term_DoubleNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_LongNum}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_LongNum(NuxtParser.Term_LongNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_LongNum}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_LongNum(NuxtParser.Term_LongNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_Str}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_Str(NuxtParser.Term_StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_Str}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_Str(NuxtParser.Term_StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_True}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_True(NuxtParser.Term_TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_True}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_True(NuxtParser.Term_TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_False}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_False(NuxtParser.Term_FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_False}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_False(NuxtParser.Term_FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_Nil}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_Nil(NuxtParser.Term_NilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_Nil}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_Nil(NuxtParser.Term_NilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_lookup}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_lookup(NuxtParser.Term_lookupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_lookup}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_lookup(NuxtParser.Term_lookupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_Empty}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_Empty(NuxtParser.Term_EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_Empty}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_Empty(NuxtParser.Term_EmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_Blank}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_Blank(NuxtParser.Term_BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_Blank}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_Blank(NuxtParser.Term_BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_expr}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_expr(NuxtParser.Term_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_expr}
	 * labeled alternative in {@link NuxtParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_expr(NuxtParser.Term_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookup_empty}
	 * labeled alternative in {@link NuxtParser#lookup}.
	 * @param ctx the parse tree
	 */
	void enterLookup_empty(NuxtParser.Lookup_emptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookup_empty}
	 * labeled alternative in {@link NuxtParser#lookup}.
	 * @param ctx the parse tree
	 */
	void exitLookup_empty(NuxtParser.Lookup_emptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookup_id_indexes}
	 * labeled alternative in {@link NuxtParser#lookup}.
	 * @param ctx the parse tree
	 */
	void enterLookup_id_indexes(NuxtParser.Lookup_id_indexesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookup_id_indexes}
	 * labeled alternative in {@link NuxtParser#lookup}.
	 * @param ctx the parse tree
	 */
	void exitLookup_id_indexes(NuxtParser.Lookup_id_indexesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookup_Str}
	 * labeled alternative in {@link NuxtParser#lookup}.
	 * @param ctx the parse tree
	 */
	void enterLookup_Str(NuxtParser.Lookup_StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookup_Str}
	 * labeled alternative in {@link NuxtParser#lookup}.
	 * @param ctx the parse tree
	 */
	void exitLookup_Str(NuxtParser.Lookup_StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookup_Id}
	 * labeled alternative in {@link NuxtParser#lookup}.
	 * @param ctx the parse tree
	 */
	void enterLookup_Id(NuxtParser.Lookup_IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookup_Id}
	 * labeled alternative in {@link NuxtParser#lookup}.
	 * @param ctx the parse tree
	 */
	void exitLookup_Id(NuxtParser.Lookup_IdContext ctx);
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
	 * Enter a parse tree produced by {@link NuxtParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(NuxtParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(NuxtParser.IdContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link NuxtParser#id2}.
	 * @param ctx the parse tree
	 */
	void enterId2(NuxtParser.Id2Context ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#id2}.
	 * @param ctx the parse tree
	 */
	void exitId2(NuxtParser.Id2Context ctx);
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
	 * Enter a parse tree produced by {@link NuxtParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(NuxtParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(NuxtParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#other_tag_parameters}.
	 * @param ctx the parse tree
	 */
	void enterOther_tag_parameters(NuxtParser.Other_tag_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#other_tag_parameters}.
	 * @param ctx the parse tree
	 */
	void exitOther_tag_parameters(NuxtParser.Other_tag_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#other_than_tag_end}.
	 * @param ctx the parse tree
	 */
	void enterOther_than_tag_end(NuxtParser.Other_than_tag_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#other_than_tag_end}.
	 * @param ctx the parse tree
	 */
	void exitOther_than_tag_end(NuxtParser.Other_than_tag_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(NuxtParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(NuxtParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#tagStart}.
	 * @param ctx the parse tree
	 */
	void enterTagStart(NuxtParser.TagStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#tagStart}.
	 * @param ctx the parse tree
	 */
	void exitTagStart(NuxtParser.TagStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#outStart}.
	 * @param ctx the parse tree
	 */
	void enterOutStart(NuxtParser.OutStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#outStart}.
	 * @param ctx the parse tree
	 */
	void exitOutStart(NuxtParser.OutStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NuxtParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(NuxtParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link NuxtParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(NuxtParser.OtherContext ctx);
}