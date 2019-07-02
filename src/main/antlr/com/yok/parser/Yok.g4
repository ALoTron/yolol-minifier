grammar Yok;

@header
{
    package com.yok.parser;
}

/*
    Changes:
    Statements seperated by ';'
    Added parentheses / curvy brackets to ifStatement
    Arguments for functions now need parentheses ('cos(42)')
    Factorial is now a prefixOperator and functoin ('fac(3)')
        -> spaces are irellevant now
    added '\\' to enforce a new line in the later generated yolol-script
        -> line breaks are irellevant now
*/

COMMENT     : '//' ~('\n')*? ('\n' | BREAK);
STRING      : '"'(~'\n')*?'"';
BREAK       : '\\\\';
WHITESPACE  : [ \n\t] -> skip;
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
FAC         : F A C;

LBRACKET    : '(';
RBRACKET    : ')';
LCURLY      : '{';
RCURLY      : '}';

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

ADDASSIGN   : PLUS ASSIGN;
SUBASSIGN   : MINUS ASSIGN;
MULTITPLYASSIGN : MULTIPLY ASSIGN;
DIVIDEASSIGN : DIVIDE ASSIGN;
MODULOASSIGN : MODULO ASSIGN;

DOT         : '.';
COLON       : ':';
SEMICOLON   : ';';
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
    : (line BREAK)* line? EOF
    ;
line
    : multipleStatements? COMMENT?
    ;
multipleStatements
    : statement*
    ;
statement
    : ifStatement SEMICOLON?
    |   ( varAssignment
        | expression
        | gotoStatement
        ) SEMICOLON
    ;
ifStatement
    : IF LBRACKET expression RBRACKET THEN LCURLY multipleStatements? RCURLY (ELSE LCURLY multipleStatements? RCURLY)?
    ;
expression
    : value
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
number
    : MINUS? NUMBER
    ;
string
    : STRING
    ;
var
    : internalVar
    | externalVar
    ;
internalVar
    : INTERNALVARIABLE
    ;
externalVar
    : EXTERNALVARIABLE
    ;
increment
    : PLUS PLUS var
    | var PLUS PLUS
    ;
decrement
    : MINUS MINUS var
    | var MINUS MINUS
    ;
mathExpr
    : logicalExpression
    ;
logicalExpression
    : arithmeticalExpression (logicalOp arithmeticalExpression)*
    ;
arithmeticalExpression
    : primaryExpression (arithmeticalOp primaryExpression)*
    ;
primaryExpression
    : LBRACKET mathExpr RBRACKET
    | value
    | prefixOp LBRACKET mathExpr RBRACKET
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
    | FAC
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
    | AND
    | OR
    ;
varAssignment
    : var assignOp expression
    ;
assignOp
    : ADDASSIGN
    | SUBASSIGN
    | MULTITPLYASSIGN
    | DIVIDEASSIGN
    | MODULOASSIGN
    | ASSIGN
    ;
gotoStatement
    : GOTO LBRACKET expression RBRACKET
    ;