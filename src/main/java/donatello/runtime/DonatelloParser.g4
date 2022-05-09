parser grammar DonatelloParser;

@header {
package donatello.runtime;
}

options {
  tokenVocab=DonatelloLexer;
}

parse
 : block EOF
 ;

block
 : atom*
 ;

atom
 : tag        #atom_tag
 | output     #atom_output
 | assignment #atom_assignment
 | other      #atom_others
 ;

tag
 : use_tag
 | raw_tag
 | if_tag
 | unless_tag
 | case_tag
 | cycle_tag
 | for_tag
 | table_tag
 | capture_tag
 | include_tag
 | continue_tag
 | param_tag
 | code_tag
 | other_tag
 ;

 use_tag
 : tagStart Use type resource (As as)? TagEnd
 ;

param_tag
 : tagStart Param param_type TagEnd
 | tagStart ParamStart param_body ParamEnd TagEnd
 ;

param_body
 : OtherParam*
 ;

code_tag
 : tagStart other_than_tag_start_and_ifs TagEnd
 ;

other_tag
 : tagStart Id other_tag_parameters? TagEnd other_tag_block?
 ;

continue_tag
 : tagStart Continue TagEnd
 ;

other_tag_block
 : atom*? tagStart EndId TagEnd
 ;

raw_tag
 : tagStart RawStart raw_body RawEnd TagEnd
 ;

raw_body
 : OtherRaw*
 ;

other_than_tag_start
 : ~( TagStart | TagStart2 )*
 ;

other_than_tag_start_and_ifs
 : ~( TagStart | TagStart2 | IfStart | Elseif | Else )*
 ;

if_tag
 : tagStart IfStart expr TagEnd block elseif_tag* else_tag? tagStart IfEnd TagEnd
 ;

elseif_tag
 : tagStart Elseif expr TagEnd block
 ;

else_tag
 : tagStart Else TagEnd block
 ;

unless_tag
 : tagStart UnlessStart expr TagEnd block else_tag? tagStart UnlessEnd TagEnd
 ;

case_tag
 : tagStart CaseStart expr TagEnd other? when_tag+ else_tag? tagStart CaseEnd TagEnd
 ;

when_tag
 : tagStart When term ((Or | Comma) term)* TagEnd block
 ;

cycle_tag
 : tagStart Cycle cycle_group expr (Comma expr)* TagEnd
 ;

cycle_group
 : (expr Col)?
 ;

for_tag
 : for_array
 | for_range
 ;

for_array
 : tagStart ForStart Id In lookup Reversed? for_attribute* TagEnd
   for_block
   tagStart ForEnd TagEnd
 ;

for_range
 : tagStart ForStart Id In OPar from=expr DotDot to=expr CPar Reversed? for_attribute* TagEnd
   block
   tagStart ForEnd TagEnd
 ;

for_block
 : a=block (tagStart Else TagEnd b=block)?
 ;

for_attribute
 : Offset Col Continue
 | Offset Col expr
 | Id Col expr
 ;

attribute
 : Offset Col expr
 | Id Col expr
 ;

table_tag
 : tagStart TableStart Id In lookup attribute* TagEnd block tagStart TableEnd TagEnd
 ;

capture_tag
 : tagStart CaptureStart Id TagEnd block tagStart CaptureEnd TagEnd  #capture_tag_Id
 | tagStart CaptureStart Str TagEnd block tagStart CaptureEnd TagEnd #capture_tag_Str
 ;

include_tag
 : tagStart Include expr (include_params)* TagEnd
 ;

include_params
 : id '=' expr
 ;

output
 : outStart print filter* OutEnd
 ;

print
 : ~( TagStart | TagStart2 | OutEnd | Pipe )*
 ;

filter
 : Pipe Filter params?
 ;

params
 : Col param_expr ( Comma param_expr )*
 ;

param_expr
 : id2 Col expr #param_expr_key_value
 | expr         #param_expr_expr
 ;

assignment
 : tagStart Assign Id EqSign expr filter* TagEnd
 ;

expr
 : lhs=expr op=(LtEq | Lt | GtEq | Gt) rhs=expr  #expr_rel
 | lhs=expr op=(Eq | NEq) rhs=expr               #expr_eq
 | lhs=expr Contains rhs=expr                    #expr_contains
 | <assoc=right> lhs=expr op=(And | Or) rhs=expr #expr_logic
 | term                                          #expr_term
 ;

term
 : DoubleNum      #term_DoubleNum
 | LongNum        #term_LongNum
 | Str            #term_Str
 | True           #term_True
 | False          #term_False
 | Nil            #term_Nil
 | lookup         #term_lookup
 | Empty          #term_Empty
 | Blank          #term_Blank
 | OPar expr CPar #term_expr
 ;

lookup
 : Empty              #lookup_empty
 | id index* QMark?   #lookup_id_indexes
 | OBr Str CBr QMark? #lookup_Str
 | OBr Id CBr QMark?  #lookup_Id
 ;

type
 : Service
 | Json
 | Xml
 ;

id
 : Id
 | CaptureStart
 | CaptureEnd
 | ParamStart
 | ParamEnd
 | RawStart
 | RawEnd
 | IfStart
 | Elseif
 | IfEnd
 | UnlessStart
 | UnlessEnd
 | Else
 | Contains
 | CaseStart
 | CaseEnd
 | When
 | Cycle
 | ForStart
 | ForEnd
 | In
 | And
 | Or
 | TableStart
 | TableEnd
 | Assign
 | Include
 | With
 | Offset
 | Continue
 | Reversed
 | Type
 | ParamVar
 | EndId
 | ServiceId
 ;

as
 : Id
 ;

id2
 : id
 | Empty
 | Nil
 | True
 | False
 ;

resource
 : ServiceId
 | Id
 ;

param_type
 : ParamVar
 ;

index
 : Dot id2
 | OBr expr CBr
 ;

other_tag_parameters
 : other_than_tag_end
 ;

other_than_tag_end
 : ~TagEnd+
 ;

filename
 : ( . )+?
 ;

tagStart
 : TagStart
 | TagStart2
 ;

outStart
 : OutStart
 | OutStart2
 ;

other
 : Other+
 ;