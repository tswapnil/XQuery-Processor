grammar XQuery;


@header {
package edu.ucsd.cse.xprocessor.parser;
}

start : xq
	;
	
xq : var=VAR																											#xqVar
	| strConst=STRING																						#xqStrConstDef
	| ap																											#xqAp
	| '(' query=xq ')'																								#xqParenExpr
	| leftQuery=xq ',' rightQuery=xq																				#xqConcatExpr
	| query=xq '/' relPath=rp																						#xqSlashExpr
	| query=xq '//' relPath=rp																						#xqDblSlashExpr
	| '<' openTagName=ID '>' '{' query=xq '}' '</' closeTagName=ID '>'												#xqContTagExpr
	| loop=forClause (declaration=letClause)* (condition=whereClause)* output=returnClause								#xqForExpr
	| declaration=letClause query=xq																				#xqLetExpr
	| join=joinClause																								#xqJoinExpr
	;
	
forClause : 'for' varList+=VAR 'in' queryList+=xq (',' varList+=VAR 'in' queryList+=xq)*								#forVarIter
	;
	
letClause : 'let' varList+=VAR ':=' queryList+=xq (',' varList+=VAR ':=' queryList+=xq)*								#letVarDef
	;
	
whereClause : 'where' condition=cond																				#whereCondExpr
	;
	
returnClause : 'return' query=xq																					#returnQuery
	;
	
cond : leftQuery=xq ('='|'eq') rightQuery=xq																		#condEqualVal
	| leftQuery=xq ('=='|'is') rightQuery=xq																		#condEqualId
	| 'empty' '(' query=xq ')'																						#condEmpty
	| 'some' varList+=VAR 'in' queryList+=xq (',' varList+=VAR 'in' queryList+=xq)* 'satisfies' condition=cond		#condVarCheck
	| '(' condition=cond ')'																						#condParenExpr
	| leftCondition=cond 'and' rightCondition=cond																	#condAndExpr
	| leftCondition=cond 'or' rightCondition=cond																	#condOrExpr
	| 'not' condition=cond																							#condNotExpr
	;
	
joinClause : 'join' '(' query1=xq ',' query2=xq ','
	'[' '"' attrList1+=ID '"' (',' '"' attrList1+=ID '"')* ']' ','
	'[' '"' attrList2+=ID '"' (',' '"' attrList2+=ID '"')* ']'
	')'																												#joinDef
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

STRING : '"' ( '\\"' | ~('\n'|'\r') )*? '"'
	;


VAR : '$' ALPHA ALNUM*
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