grammar Nuxt;

USE: 'use';
SERVICE: 'service';
JSON: 'json';
XML: 'xml';
ANY: ~(' ');
PRINT: '@print';

prog
    :   ('${' (statement|print|code) '}'|html)*
    |   EOF
    ;

print
    :   PRINT (ANY|VARIABLE|CODE|'/')+
    ;

code
    :   CODE
    ;

statement
    :   USE type resource ('as' as)?
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


CODE
    :   ([0-9A-Za-z]|'@'|'('|')'|'.')+ WS? '=' WS? ~[{}]+
    |   ([0-9A-Za-z]|'@'|'('|')'|'.')+
    ;

NEWLINE
    :   [\r\n]+ -> skip
    ;

WS
    :   [ \t\n\r]+ -> skip
    ;

ANYTHING
    :   ~[${}@]+ NEWLINE
    ;