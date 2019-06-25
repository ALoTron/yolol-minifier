grammar yololParser;

BREAK       : '\n';
COMMENT     : '//' ~('\n')*;
STRING      : '"'(~'\n')*'"';
IF          : I F;
THEN        : T H E N;
ELSE        : E L S E;
END         : E N D;
GOTO        : G O T O;

fragment ABS         : A B S;
fragment SQRT        : S Q R T;
fragment SIN         : S I N;
fragment COS         : C O S;
fragment TAN         : T A N;
fragment ARCSIN      : A R C S I N;
fragment ARCCOS      : A R C C O S;
fragment ARCTAN      : A R C T A N;
ARITHMETICKEYWORD    : ABS | SQRT | SIN | COS | TAN | ARCSIN | ARCCOS | ARCTAN;

LBRACKET    : '(';
RBRACKET    : ')';

fragment LESS        : '<';
fragment GREATER     : '>';
fragment LESSEQUAL   : '<=';
fragment GREATEREQUAL: '>=';
fragment NOTEQUAL    : '!=';
fragment EQUAL       : '==';
LOGICALOPERATOR     : LESS | GREATER | LESSEQUAL | GREATEREQUAL | NOTEQUAL | EQUAL;

ASSIGN      : '=';

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

fragment INTERNALVARIABLE : ALPHABETICAL (ALPHABETICAL|NUMERICAL)*;
fragment EXTERNALVARIABLE : COLON (ALPHABETICAL|NUMERICAL)+;
VARIABLE    : INTERNALVARIABLE | EXTERNALVARIABLE;
NUMBER      : NUMERICAL+ ('.' NUMERICAL+)?;


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
    : SPACE? multipleStatements? SPACE? COMMENT?
    ;
multipleStatements
    : singleStatement (SPACE singleStatement)*
    ;
singleStatement
    : ifStatement
    | varAssignment
    | expression
    | gotoExpr
    ;
ifStatement
    : IF SPACE expression SPACE THEN SPACE multipleStatements (SPACE ELSE SPACE multipleStatements)? SPACE END
    ;
expression
    : (LBRACKET expression RBRACKET | VARIABLE | literal | ARITHMETICKEYWORD (SPACE expression | LBRACKET expression RBRACKET)) expression_recursive
    ;
expression_recursive
    : arithmeticOperation | logicalOperation | factorialOperation | /*empty*/
    ;
arithmeticOperation
    : arithmeticOperator expression
    ;
arithmeticOperator
    : PLUS
    | MINUS
    | MULTIPLY
    | DIVIDE
    | MODULO
    ;
logicalOperation
    : logicalOperator expression
    ;
logicalOperator
    : LOGICALOPERATOR
    ;
factorialOperation
    : FACTORIAL
    ;
literal
    : string
    | number
    ;
string
    : STRING
    ;
number
    : MINUS? NUMBER
    ;
varAssignment
    : VARIABLE arithmeticOperator? ASSIGN expression
    ;
gotoExpr
    : GOTO SPACE expression
    ;
