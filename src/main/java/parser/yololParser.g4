grammar yololParser;

chip                : line*;
line                : multipleStatements
    | comment;
multipleStatements  : singleStatement (' ' singleStatement)*;
singleStatement     : ifStatement
    | varAssignment
    | expression
    | gotoExpr;
ifStatement         : IF ' ' expression ' ' THEN ' ' multipleStatements (' ' ELSE ' ' multipleStatements)? ' ' END;
expression          : ('(' expression ')' | var | literal | ArithmeticKeyword (' ' expression | '('expression')')) expression_recursive;
expression_recursive: arithmeticOperation | logicalOperation | factorialOperation |;
arithmeticOperation : arithmeticOperator expression;
logicalOperation    : LogicalOperator expression;
factorialOperation  : '!';
var                 : (':')? varname;
varname             : AlphabeticalChar alphanumericalChar*;
AlphabeticalChar    : [a-zA-Z];
alphanumericalChar  : AlphabeticalChar | NumericalChar;
NumericalChar       : [0-9];
literal               : string
    | number;
string              : '"' (everyChar | ' ')* '"';
everyChar           : alphanumericalChar | SpecialSymbols; /* TODO improve this */
SpecialSymbols      : [.!?,];
number              : '-'? NumericalChar+ ('.' NumericalChar+)?;
arithmeticOperator  : '+' | '-' | '*' | '/' | '%';
ArithmeticKeyword   : ABS | SQRT | SIN | COS | TAN | ARCSIN | ARCCOS | ARCTAN;
LogicalOperator     : '<' | '>' | '<=' | '>=' | '!=' | '==';
varAssignment       : var arithmeticOperator? '=' expression;
gotoExpr                : GOTO expression;
comment             : '//' everyChar*;

IF      : I F;
THEN    : T H E N;
ELSE    : E L S E;
END     : E N D;
GOTO    : G O T O;
ABS     : A B S;
SQRT    : S Q R T;
SIN     : S I N;
COS     : C O S;
TAN     : T A N;
ARCSIN  : A R C S I N;
ARCCOS  : A R C C O S;
ARCTAN  : A R C T A N;

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