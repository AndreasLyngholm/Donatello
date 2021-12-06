grammar Nuxt;

USE: 'use';
SERVICE: 'service';
JSON: 'json';
XML: 'xml';
ANY: ~(' ');
PRINT: '@print';

prog
    :   ('${' (statement|code|print) '}' NEWLINE?|html)*
    |   EOF
    ;

print
    :   PRINT (ANY|WS|VARIABLE|CODE|'/')+
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

html
    :   ANYTHING
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
    :   [\r\n]+
    ;

WS
    :   (' '|'\t'|'\n'|'\r')+
    ;

CODE
    :   [a-zA-Z]([0-9A-Za-z]|'@'|'('|')'|'.')+
    ;

ANYTHING
    :   ~[${}@]+ NEWLINE
    ;