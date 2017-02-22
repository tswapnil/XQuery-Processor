grammar XQuery;


@header {
package edu.ucsd.cse.xprocessor.parser;
}



start : ap
	;
	
xq : var=ID																											#xqVar
	| '"' strConst=STRING '"'																						#xqConstDef
	| ap																											#xqAp
	| '(' query=xq ')'																								#xqParenExpr
	| leftQuery=xq ',' rightQuery=xq																				#xqCommaExpr
	| query=xq '/' relPath=rp																						#xqSlashExpr
	| query=xq '//' relPath=rp																						#xqDblSlashExpr
	| '<' openTagName=ID '>' '{' query=xq '}' '</' closeTagName=ID '>'												#xqContTagExpr
	| forClause letClause whereClause returnClause																	#xqForExpr
	| letClause query=xq																							#xqLetExpr
	| joinClause
	;
	
forClause : 'for' varList+=ID 'in' queryList+=xq (',' varList+=ID 'in' queryList+=xq)*								#forVarIter
	;
	
letClause : 'let' varList+=ID ':=' queryList+=xq (',' varList+=ID ':=' queryList+=xq)*								#letVarDef
	| /* epsilon */																									#letEps
	;
	
whereClause : 'where' condition=cond																				#whereCondExpr
	| /* epsilon */																									#whereEps
	;
	
returnClause : 'return' query=xq																					#returnQuery
	;
	
cond : leftQuery=xq ('='|'eq') rightQuery=xq																		#condEqualVal
	| leftQuery=xq ('=='|'is') rightQuery=xq																		#condEqualId
	| 'empty' '(' query=xq ')'																						#condEmpty
	| 'some' varList+=ID 'in' queryList+=xq (',' varList+=ID 'in' queryList+=xq)* 'satisfies' condition=cond		#condVarCheck
	| '(' condition=cond ')'																						#condParenExpr
	| leftCondition=cond 'and' rightCondition=cond																	#condAndExpr
	| leftCondition=cond 'or' rightCondition=cond																	#condOrExpr
	| 'not' condition=cond																							#condNotExpr
	;
	
joinClause : 'join' '(' query1=xq ',' query2=xq ',' attrList1=ATTRLIST ',' attrList2=ATTRLIST ')'					#joinExpr
	;

ap : 'doc("' docName=FILE '")' '/' relpath=rp     																	#apSlashFile
    | 'doc("' docName=FILE '")' '//' relpath=rp   																	#apDblSlashFile
    ;

rp : tagName=ID                 																					#rpTagName
    | '*'                       																					#rpWildcard
    | '.'                       																					#rpDot
    | '..'                      																					#rpDblDot
    | 'text()'                  																					#rpText
    | '@' attrName=ID           																					#rpAttrName
    | '(' relpath=rp ')'                																			#rpParenExpr
	| left=rp '/' right=rp    																						#rpSlashExpr
    | left=rp '//' right=rp         																				#rpDblSlashExpr
    | relpath=rp '[' filter=f ']'   																				#rpFilterExpr
    | left=rp ',' right=rp          																				#rpConcatExpr
    ;

f : relPath=rp                          																			#filterRp
    | left=rp ('='|'eq') right=rp  																					#filterEqualVal
    | left=rp ('=='|'is') right=rp 																					#filterEqualId
    | '(' filter=f ')'  	     																					#filterParenExpr
    | leftf=f 'and' rightf=f     																					#filterAndExpr
    | leftf=f 'or' rightf=f       																					#filterOrExpr
    | 'not' filter=f		       																					#filterNotExpr
    ;

ID : ALPHA ALNUM*               
    ;

FILE : CHARS+
    ;
    
STRING : CHARS*
	;
	
ATTRLIST : '[' '"' attrList+=ID '"' (',' '"' attrList+=ID '"')* ']'

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