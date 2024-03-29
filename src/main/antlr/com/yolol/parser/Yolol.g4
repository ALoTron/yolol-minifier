grammar Yolol;

@header
{
    package com.yolol.parser;
}

BREAK       : '\n';
COMMENT     : '//' ~('\n')*;
STRING      : '"'(~'\n')*'"';
IF          : I F;
THEN        : T H E N;
ELSE        : E L S E;
END         : E N D;
GOTO        : G O T O;

NOT         : N O T;
AND         : A N D;
OR          : O R;

ABS         : A B S;
SQRT        : S Q R T;
SIN         : S I N;
COS         : C O S;
TAN         : T A N;
ARCSIN      : A R C S I N;
ARCCOS      : A R C C O S;
ARCTAN      : A R C T A N;

LBRACKET    : '(';
RBRACKET    : ')';

LESS        : '<';
GREATER     : '>';
LESSEQUAL   : '<=';
GREATEREQUAL: '>=';
NOTEQUAL    : '!=';
EQUAL       : '==';

ASSIGN      : '=';

POW         : '^';
PLUS        : '+';
MINUS       : '-';
MULTIPLY    : '*';
DIVIDE      : '/';
MODULO      : '%';
FACTORIAL   : '!';

DOT         : '.';
COLON       : ':';
SPACE       : (' ')+;
fragment ALPHABETICAL : [a-zA-Z]+;
fragment NUMERICAL   : [0-9]+;

INTERNALVARIABLE : ALPHABETICAL (ALPHABETICAL|NUMERICAL)*;
EXTERNALVARIABLE : COLON (ALPHABETICAL|NUMERICAL)+;
NUMBER      : NUMERICAL+ (DOT NUMERICAL+)?;

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

chip
    : (line BREAK)* line EOF?
    ;
line
    : optionalSpace? multipleStatements? optionalSpace? COMMENT?
    ;
multipleStatements
    : lbracket multipleStatements rbracket
    | (statement | lbracket statement rbracket) (SPACE statement | lbracket statement rbracket)*
    ;
statement
    : ifStatement
    | varAssignment
    | expression
    | gotoStat
    ;
ifStatement
    : IF (SPACE expression SPACE| lbracket expression rbracket)
        THEN (SPACE multipleStatements SPACE | lbracket multipleStatements rbracket)
        (ELSE (SPACE multipleStatements SPACE | lbracket multipleStatements rbracket))? END
    ;
expression
    : lbracket expression rbracket
    | value
    | mathExpr
    ;
value
    : primitive
    | var
    | increment
    | decrement
    ;
primitive
    : number
    | string
    ;
string
    : STRING
    ;
internalVariable
    : INTERNALVARIABLE
    ;
externalVariable
    : EXTERNALVARIABLE
    ;
number
    : MINUS? NUMBER
    ;
increment
    : PLUS PLUS optionalSpace? var
    | var optionalSpace? PLUS PLUS
    ;
decrement
    : MINUS MINUS optionalSpace? var
    | var optionalSpace? MINUS MINUS
    ;
mathExpr
    : lbracket mathExpr rbracket
    | logicalExpression
    ;
logicalExpression
    : lbracket logicalExpression rbracket
    | arithmeticalExpression (optionalSpace? logicalOp optionalSpace? arithmeticalExpression)*
    ;
arithmeticalExpression
    : lbracket arithmeticalExpression rbracket
    | primaryExpression ( optionalSpace? arithmeticalOp optionalSpace? primaryExpression)*
    ;
primaryExpression
    : lbracket primaryExpression rbracket
    | value
    | prefixOp (SPACE primaryExpression | lbracket mathExpr rbracket )
    | primaryExpression factorial
    | lbracket mathExpr rbracket factorial?
    ;
factorial
    : optionalSpace? FACTORIAL
    ;
prefixOp
    : NOT
    | ABS
    | SQRT
    | SIN
    | COS
    | TAN
    | ARCSIN
    | ARCCOS
    | ARCTAN
    ;
arithmeticalOp
    : POW
    | PLUS
    | MINUS
    | MULTIPLY
    | DIVIDE
    | MODULO
    ;
logicalOp
    : LESS
    | LESSEQUAL
    | GREATER
    | GREATEREQUAL
    | NOTEQUAL
    | EQUAL
    | SPACE AND SPACE
    | SPACE OR SPACE
    ;
varAssignment
    : var optionalSpace? arithmeticalOp? ASSIGN optionalSpace? expression
    ;
var
    : internalVariable
    | externalVariable
    ;
gotoStat
    : GOTO (SPACE expression | lbracket expression rbracket)
    ;
optionalSpace
    : SPACE
    ;
lbracket
    : optionalSpace? LBRACKET optionalSpace?
    ;
rbracket
    : optionalSpace? RBRACKET optionalSpace?
    ;