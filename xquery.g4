grammar xquery;

@header {
	package edu.ucsd.cse.xprocessor.parser;
}
ap : 'doc("' ID '")' '/' rp     #apSlashFile
    | 'doc("' ID '")' '//' rp   #apSlashFile
    ;

rp : ID                         #rpTagName
    | '*'                       #rpWildcard
    | '.'                       #rpDot
    | '..'                      #rpDblDot
    | 'text()'                  #rpText
    | '@' ID                    #rpAttrName
    | '(' rp ')'                #rpParenExpr
    | rp '/' rp                 #rpSlashExpr
    | rp '//' rp                #rpDblSlashExpr
    | rp '[' f ']'              #rpFilterExpr
    | rp ',' rp                 #rpConcatExpr
    |                           #rpEmpty
    ;

f : rp                          #filterRp
    | rp ('='|'eq') rp          #filterEqualVal
    | rp ('=='|'is') rp         #filterEqualId
    | '(' f ')'                 #filterParenExpr
    | f 'and' f                 #filterAndExpr
    | f 'or' f                  #filterOrExpr
    | 'not' f                   #filterNotExpr
    ;

ID : ALPHA ALNUM*          
    ;

/*
FILE : '"' STRING '"'         #file
    ;
*/

fragment
ALPHA : [_a-zA-Z]
    ;

fragment
ALNUM : [_a-zA-Z0-9]
    ;

fragment
STRING : ALNUM+
    ;

WS : [ \t\n\r]+ -> skip ;
