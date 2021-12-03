grammar Nuxt;

USE: 'use';
SERVICE: 'service';
JSON: 'json';
XML: 'xml';
ANY: ~(' ');
PRINT: '@print';

prog
    :   '${' WS? (statement|code|print) WS? '}'
    ;

print
    :   PRINT WS? (ANY|WS|VARIABLE|'/')+
    ;

code
    :   CODE
    ;

statement
    :   USE WS type WS resource WS? as? WS?
    ;

type
    :   SERVICE
    |   JSON
    |   XML
    ;

resource
    :   resource ('/') resource
    |   VARIABLE
    ;

as
    :   'as' WS VARIABLE
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