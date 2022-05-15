// Generated from DonatelloParser.g4 by ANTLR 4.9.3

package dk.simpleconcept.donatello;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DonatelloParser}.
 */
public interface DonatelloParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DonatelloParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DonatelloParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DonatelloParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DonatelloParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_tag}
	 * labeled alternative in {@link DonatelloParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_tag(DonatelloParser.Atom_tagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_tag}
	 * labeled alternative in {@link DonatelloParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_tag(DonatelloParser.Atom_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_output}
	 * labeled alternative in {@link DonatelloParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_output(DonatelloParser.Atom_outputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_output}
	 * labeled alternative in {@link DonatelloParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_output(DonatelloParser.Atom_outputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_assignment}
	 * labeled alternative in {@link DonatelloParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_assignment(DonatelloParser.Atom_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_assignment}
	 * labeled alternative in {@link DonatelloParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_assignment(DonatelloParser.Atom_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_others}
	 * labeled alternative in {@link DonatelloParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom_others(DonatelloParser.Atom_othersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_others}
	 * labeled alternative in {@link DonatelloParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom_others(DonatelloParser.Atom_othersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(DonatelloParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(DonatelloParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#use_tag}.
	 * @param ctx the parse tree
	 */
	void enterUse_tag(DonatelloParser.Use_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#use_tag}.
	 * @param ctx the parse tree
	 */
	void exitUse_tag(DonatelloParser.Use_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#param_tag}.
	 * @param ctx the parse tree
	 */
	void enterParam_tag(DonatelloParser.Param_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#param_tag}.
	 * @param ctx the parse tree
	 */
	void exitParam_tag(DonatelloParser.Param_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#param_body}.
	 * @param ctx the parse tree
	 */
	void enterParam_body(DonatelloParser.Param_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#param_body}.
	 * @param ctx the parse tree
	 */
	void exitParam_body(DonatelloParser.Param_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#code_tag}.
	 * @param ctx the parse tree
	 */
	void enterCode_tag(DonatelloParser.Code_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#code_tag}.
	 * @param ctx the parse tree
	 */
	void exitCode_tag(DonatelloParser.Code_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#other_tag}.
	 * @param ctx the parse tree
	 */
	void enterOther_tag(DonatelloParser.Other_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#other_tag}.
	 * @param ctx the parse tree
	 */
	void exitOther_tag(DonatelloParser.Other_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#continue_tag}.
	 * @param ctx the parse tree
	 */
	void enterContinue_tag(DonatelloParser.Continue_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#continue_tag}.
	 * @param ctx the parse tree
	 */
	void exitContinue_tag(DonatelloParser.Continue_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#other_tag_block}.
	 * @param ctx the parse tree
	 */
	void enterOther_tag_block(DonatelloParser.Other_tag_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#other_tag_block}.
	 * @param ctx the parse tree
	 */
	void exitOther_tag_block(DonatelloParser.Other_tag_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#raw_tag}.
	 * @param ctx the parse tree
	 */
	void enterRaw_tag(DonatelloParser.Raw_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#raw_tag}.
	 * @param ctx the parse tree
	 */
	void exitRaw_tag(DonatelloParser.Raw_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#raw_body}.
	 * @param ctx the parse tree
	 */
	void enterRaw_body(DonatelloParser.Raw_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#raw_body}.
	 * @param ctx the parse tree
	 */
	void exitRaw_body(DonatelloParser.Raw_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#other_than_tag_start}.
	 * @param ctx the parse tree
	 */
	void enterOther_than_tag_start(DonatelloParser.Other_than_tag_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#other_than_tag_start}.
	 * @param ctx the parse tree
	 */
	void exitOther_than_tag_start(DonatelloParser.Other_than_tag_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#other_than_tag_start_and_ifs}.
	 * @param ctx the parse tree
	 */
	void enterOther_than_tag_start_and_ifs(DonatelloParser.Other_than_tag_start_and_ifsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#other_than_tag_start_and_ifs}.
	 * @param ctx the parse tree
	 */
	void exitOther_than_tag_start_and_ifs(DonatelloParser.Other_than_tag_start_and_ifsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#if_tag}.
	 * @param ctx the parse tree
	 */
	void enterIf_tag(DonatelloParser.If_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#if_tag}.
	 * @param ctx the parse tree
	 */
	void exitIf_tag(DonatelloParser.If_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#elseif_tag}.
	 * @param ctx the parse tree
	 */
	void enterElseif_tag(DonatelloParser.Elseif_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#elseif_tag}.
	 * @param ctx the parse tree
	 */
	void exitElseif_tag(DonatelloParser.Elseif_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#else_tag}.
	 * @param ctx the parse tree
	 */
	void enterElse_tag(DonatelloParser.Else_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#else_tag}.
	 * @param ctx the parse tree
	 */
	void exitElse_tag(DonatelloParser.Else_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#unless_tag}.
	 * @param ctx the parse tree
	 */
	void enterUnless_tag(DonatelloParser.Unless_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#unless_tag}.
	 * @param ctx the parse tree
	 */
	void exitUnless_tag(DonatelloParser.Unless_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#case_tag}.
	 * @param ctx the parse tree
	 */
	void enterCase_tag(DonatelloParser.Case_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#case_tag}.
	 * @param ctx the parse tree
	 */
	void exitCase_tag(DonatelloParser.Case_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#when_tag}.
	 * @param ctx the parse tree
	 */
	void enterWhen_tag(DonatelloParser.When_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#when_tag}.
	 * @param ctx the parse tree
	 */
	void exitWhen_tag(DonatelloParser.When_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#cycle_tag}.
	 * @param ctx the parse tree
	 */
	void enterCycle_tag(DonatelloParser.Cycle_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#cycle_tag}.
	 * @param ctx the parse tree
	 */
	void exitCycle_tag(DonatelloParser.Cycle_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#cycle_group}.
	 * @param ctx the parse tree
	 */
	void enterCycle_group(DonatelloParser.Cycle_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#cycle_group}.
	 * @param ctx the parse tree
	 */
	void exitCycle_group(DonatelloParser.Cycle_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#for_tag}.
	 * @param ctx the parse tree
	 */
	void enterFor_tag(DonatelloParser.For_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#for_tag}.
	 * @param ctx the parse tree
	 */
	void exitFor_tag(DonatelloParser.For_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#for_array}.
	 * @param ctx the parse tree
	 */
	void enterFor_array(DonatelloParser.For_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#for_array}.
	 * @param ctx the parse tree
	 */
	void exitFor_array(DonatelloParser.For_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#for_range}.
	 * @param ctx the parse tree
	 */
	void enterFor_range(DonatelloParser.For_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#for_range}.
	 * @param ctx the parse tree
	 */
	void exitFor_range(DonatelloParser.For_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#for_block}.
	 * @param ctx the parse tree
	 */
	void enterFor_block(DonatelloParser.For_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#for_block}.
	 * @param ctx the parse tree
	 */
	void exitFor_block(DonatelloParser.For_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#for_attribute}.
	 * @param ctx the parse tree
	 */
	void enterFor_attribute(DonatelloParser.For_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#for_attribute}.
	 * @param ctx the parse tree
	 */
	void exitFor_attribute(DonatelloParser.For_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(DonatelloParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(DonatelloParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#table_tag}.
	 * @param ctx the parse tree
	 */
	void enterTable_tag(DonatelloParser.Table_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#table_tag}.
	 * @param ctx the parse tree
	 */
	void exitTable_tag(DonatelloParser.Table_tagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code capture_tag_Id}
	 * labeled alternative in {@link DonatelloParser#capture_tag}.
	 * @param ctx the parse tree
	 */
	void enterCapture_tag_Id(DonatelloParser.Capture_tag_IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code capture_tag_Id}
	 * labeled alternative in {@link DonatelloParser#capture_tag}.
	 * @param ctx the parse tree
	 */
	void exitCapture_tag_Id(DonatelloParser.Capture_tag_IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code capture_tag_Str}
	 * labeled alternative in {@link DonatelloParser#capture_tag}.
	 * @param ctx the parse tree
	 */
	void enterCapture_tag_Str(DonatelloParser.Capture_tag_StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code capture_tag_Str}
	 * labeled alternative in {@link DonatelloParser#capture_tag}.
	 * @param ctx the parse tree
	 */
	void exitCapture_tag_Str(DonatelloParser.Capture_tag_StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#include_tag}.
	 * @param ctx the parse tree
	 */
	void enterInclude_tag(DonatelloParser.Include_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#include_tag}.
	 * @param ctx the parse tree
	 */
	void exitInclude_tag(DonatelloParser.Include_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#include_params}.
	 * @param ctx the parse tree
	 */
	void enterInclude_params(DonatelloParser.Include_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#include_params}.
	 * @param ctx the parse tree
	 */
	void exitInclude_params(DonatelloParser.Include_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(DonatelloParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(DonatelloParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DonatelloParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DonatelloParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(DonatelloParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(DonatelloParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(DonatelloParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(DonatelloParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param_expr_key_value}
	 * labeled alternative in {@link DonatelloParser#param_expr}.
	 * @param ctx the parse tree
	 */
	void enterParam_expr_key_value(DonatelloParser.Param_expr_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param_expr_key_value}
	 * labeled alternative in {@link DonatelloParser#param_expr}.
	 * @param ctx the parse tree
	 */
	void exitParam_expr_key_value(DonatelloParser.Param_expr_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param_expr_expr}
	 * labeled alternative in {@link DonatelloParser#param_expr}.
	 * @param ctx the parse tree
	 */
	void enterParam_expr_expr(DonatelloParser.Param_expr_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param_expr_expr}
	 * labeled alternative in {@link DonatelloParser#param_expr}.
	 * @param ctx the parse tree
	 */
	void exitParam_expr_expr(DonatelloParser.Param_expr_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DonatelloParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DonatelloParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_contains}
	 * labeled alternative in {@link DonatelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_contains(DonatelloParser.Expr_containsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_contains}
	 * labeled alternative in {@link DonatelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_contains(DonatelloParser.Expr_containsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_term}
	 * labeled alternative in {@link DonatelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_term(DonatelloParser.Expr_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_term}
	 * labeled alternative in {@link DonatelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_term(DonatelloParser.Expr_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_rel}
	 * labeled alternative in {@link DonatelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_rel(DonatelloParser.Expr_relContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_rel}
	 * labeled alternative in {@link DonatelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_rel(DonatelloParser.Expr_relContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_eq}
	 * labeled alternative in {@link DonatelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(DonatelloParser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_eq}
	 * labeled alternative in {@link DonatelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(DonatelloParser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_logic}
	 * labeled alternative in {@link DonatelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_logic(DonatelloParser.Expr_logicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_logic}
	 * labeled alternative in {@link DonatelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_logic(DonatelloParser.Expr_logicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_DoubleNum}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_DoubleNum(DonatelloParser.Term_DoubleNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_DoubleNum}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_DoubleNum(DonatelloParser.Term_DoubleNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_LongNum}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_LongNum(DonatelloParser.Term_LongNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_LongNum}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_LongNum(DonatelloParser.Term_LongNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_Str}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_Str(DonatelloParser.Term_StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_Str}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_Str(DonatelloParser.Term_StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_True}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_True(DonatelloParser.Term_TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_True}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_True(DonatelloParser.Term_TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_False}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_False(DonatelloParser.Term_FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_False}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_False(DonatelloParser.Term_FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_Nil}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_Nil(DonatelloParser.Term_NilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_Nil}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_Nil(DonatelloParser.Term_NilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_lookup}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_lookup(DonatelloParser.Term_lookupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_lookup}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_lookup(DonatelloParser.Term_lookupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_Empty}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_Empty(DonatelloParser.Term_EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_Empty}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_Empty(DonatelloParser.Term_EmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_Blank}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_Blank(DonatelloParser.Term_BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_Blank}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_Blank(DonatelloParser.Term_BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_expr}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_expr(DonatelloParser.Term_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_expr}
	 * labeled alternative in {@link DonatelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_expr(DonatelloParser.Term_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookup_empty}
	 * labeled alternative in {@link DonatelloParser#lookup}.
	 * @param ctx the parse tree
	 */
	void enterLookup_empty(DonatelloParser.Lookup_emptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookup_empty}
	 * labeled alternative in {@link DonatelloParser#lookup}.
	 * @param ctx the parse tree
	 */
	void exitLookup_empty(DonatelloParser.Lookup_emptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookup_id_indexes}
	 * labeled alternative in {@link DonatelloParser#lookup}.
	 * @param ctx the parse tree
	 */
	void enterLookup_id_indexes(DonatelloParser.Lookup_id_indexesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookup_id_indexes}
	 * labeled alternative in {@link DonatelloParser#lookup}.
	 * @param ctx the parse tree
	 */
	void exitLookup_id_indexes(DonatelloParser.Lookup_id_indexesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookup_Str}
	 * labeled alternative in {@link DonatelloParser#lookup}.
	 * @param ctx the parse tree
	 */
	void enterLookup_Str(DonatelloParser.Lookup_StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookup_Str}
	 * labeled alternative in {@link DonatelloParser#lookup}.
	 * @param ctx the parse tree
	 */
	void exitLookup_Str(DonatelloParser.Lookup_StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lookup_Id}
	 * labeled alternative in {@link DonatelloParser#lookup}.
	 * @param ctx the parse tree
	 */
	void enterLookup_Id(DonatelloParser.Lookup_IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lookup_Id}
	 * labeled alternative in {@link DonatelloParser#lookup}.
	 * @param ctx the parse tree
	 */
	void exitLookup_Id(DonatelloParser.Lookup_IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DonatelloParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DonatelloParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(DonatelloParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(DonatelloParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#as}.
	 * @param ctx the parse tree
	 */
	void enterAs(DonatelloParser.AsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#as}.
	 * @param ctx the parse tree
	 */
	void exitAs(DonatelloParser.AsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#id2}.
	 * @param ctx the parse tree
	 */
	void enterId2(DonatelloParser.Id2Context ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#id2}.
	 * @param ctx the parse tree
	 */
	void exitId2(DonatelloParser.Id2Context ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(DonatelloParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(DonatelloParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#param_type}.
	 * @param ctx the parse tree
	 */
	void enterParam_type(DonatelloParser.Param_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#param_type}.
	 * @param ctx the parse tree
	 */
	void exitParam_type(DonatelloParser.Param_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(DonatelloParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(DonatelloParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#other_tag_parameters}.
	 * @param ctx the parse tree
	 */
	void enterOther_tag_parameters(DonatelloParser.Other_tag_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#other_tag_parameters}.
	 * @param ctx the parse tree
	 */
	void exitOther_tag_parameters(DonatelloParser.Other_tag_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#other_than_tag_end}.
	 * @param ctx the parse tree
	 */
	void enterOther_than_tag_end(DonatelloParser.Other_than_tag_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#other_than_tag_end}.
	 * @param ctx the parse tree
	 */
	void exitOther_than_tag_end(DonatelloParser.Other_than_tag_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(DonatelloParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(DonatelloParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#tagStart}.
	 * @param ctx the parse tree
	 */
	void enterTagStart(DonatelloParser.TagStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#tagStart}.
	 * @param ctx the parse tree
	 */
	void exitTagStart(DonatelloParser.TagStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#outStart}.
	 * @param ctx the parse tree
	 */
	void enterOutStart(DonatelloParser.OutStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#outStart}.
	 * @param ctx the parse tree
	 */
	void exitOutStart(DonatelloParser.OutStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DonatelloParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(DonatelloParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link DonatelloParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(DonatelloParser.OtherContext ctx);
}