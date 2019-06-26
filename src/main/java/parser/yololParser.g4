grammar yololParser;

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

LBRACKET    : '(' SPACE?;
RBRACKET    : SPACE? ')';

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
    : (line BREAK)* line EOF
    ;
line
    : SPACE? multipleStatements? SPACE? COMMENT?
    ;
multipleStatements
    : LBRACKET multipleStatements RBRACKET
    | (statement | LBRACKET statement RBRACKET) (SPACE statement | LBRACKET statement RBRACKET)*
    ;
statement
    : ifStatement
    | varAssignment
    | expression
    | gotoStat
    ;
ifStatement
    : IF (SPACE expression SPACE| LBRACKET expression RBRACKET) thenPart elsePart? END
    ;
thenPart
    : THEN (SPACE multipleStatements SPACE | LBRACKET multipleStatements RBRACKET)
    ;
elsePart
    : ELSE (SPACE multipleStatements SPACE | LBRACKET multipleStatements RBRACKET)
    ;
expression
    : LBRACKET SPACE expression SPACE RBRACKET
    | value
    | mathExpr
    ;
value
    : string
    | internalVariable
    | externalVariable
    | number
    | increment
    | decrement
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
    : PLUS PLUS SPACE? (INTERNALVARIABLE | EXTERNALVARIABLE)
    | (INTERNALVARIABLE | EXTERNALVARIABLE) SPACE? PLUS PLUS
    ;
decrement
    : MINUS MINUS SPACE? (INTERNALVARIABLE | EXTERNALVARIABLE)
    | (INTERNALVARIABLE | EXTERNALVARIABLE) SPACE? MINUS MINUS
    ;
mathExpr
    : LBRACKET mathExpr RBRACKET
    | logicalExpression
    ;
logicalExpression
    : LBRACKET logicalExpression RBRACKET
    | arithmeticalExpression (SPACE? logicalOp SPACE? arithmeticalExpression)*
    ;
arithmeticalExpression
    : LBRACKET arithmeticalExpression RBRACKET
    | primaryExpression ( SPACE? arithmeticalOp SPACE? primaryExpression)*
    ;
primaryExpression
    : LBRACKET primaryExpression RBRACKET
    | value
    | prefixOp (SPACE primaryExpression | LBRACKET mathExpr RBRACKET )
    | primaryExpression SPACE? FACTORIAL
    | LBRACKET mathExpr RBRACKET FACTORIAL?
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
    ;
varAssignment
    : var SPACE? arithmeticalOp? ASSIGN SPACE? expression
    ;
var
    : internalVariable
    | externalVariable
    ;
gotoStat
    : GOTO (SPACE expression | LBRACKET expression RBRACKET)
    ;