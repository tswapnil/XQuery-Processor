grammar XQuery;

start : ap
	;

ap : 'doc("' docName=FILE '")' '/' rp     #apSlashFile
    | 'doc("' docName=FILE '")' '//' rp   #apDblSlashFile
    ;

rp : tagName=ID                 	#rpTagName
    | '*'                       	#rpWildcard
    | '.'                       	#rpDot
    | '..'                      	#rpDblDot
    | 'text()'                  	#rpText
    | '@' attrName=ID           	#rpAttrName
    | '(' rp ')'                	#rpParenExpr
	| left=rp '/' right=rp    		#rpSlashExpr
    | left=rp '//' right=rp         #rpDblSlashExpr
    | relpath=rp '[' filter=f ']'   #rpFilterExpr
    | left=rp ',' right=rp          #rpConcatExpr
    ;

f : rp                          	#filterRp
    | left=rp ('='|'eq') right=rp  	#filterEqualVal
    | left=rp ('=='|'is') right=rp 	#filterEqualId
    | '(' filter=f ')'  	     	#filterParenExpr
    | leftf=f 'and' rightf=f     	#filterAndExpr
    | leftf=f 'or' rightf=f       	#filterOrExpr
    | 'not' filter=f		       	#filterNotExpr
    ;

ID : ALPHA ALNUM*               
    ;

FILE : CHARS+
    ;

fragment
CHARS : [_a-zA-Z\-.]
	;

fragment
ALPHA : [_a-zA-Z]
    ;

fragment
ALNUM : [_a-zA-Z0-9]
    ;

WS : [ \t\n\r]+ -> skip ;