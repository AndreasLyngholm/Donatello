grammar Nuxt;

@header {
    package nuxt.runtime;
}

USE: 'use';
SERVICE: 'service';
JSON: 'json';
XML: 'xml';
ANY: ~(' ');
PRINT: '@print';

prog
    :   ('${' WS? (statement|code|print) WS? '}'|unknowns|WS|NEWLINE)+
    ;

unknowns
	:	Unknown+ ;
	
Unknown
	:	.
	;

print
    :   PRINT WS? (ANY|WS|VARIABLE|'/')+
    ;

code
    :   CODE
    ;

statement
    :   USE WS type WS resource WS? ('as' WS as)? WS?
    ;

type
    :   SERVICE
    |   JSON
    |   XML
    ;

resource
    :   VARIABLE ('/' VARIABLE)*
    ;

as
    :   VARIABLE
    ;

VARIABLE
    :   ALPHA ( ALPHA | DIGIT )*
    ;

ALPHA
    :   [a-zA-Z_]
    ;

DIGIT
    :   [0-9]
    ;

NEWLINE
    :   '\r'? '\n'
    ;

WS
    :   (' '|'\t'|'\n'|'\r')+
    ;

CODE
    :   [a-zA-Z]([0-9A-Za-z]|'@'|'('|')'|'.')+
    ;

