grammar yololParser;

chip                : line+;
line                : multipleStatements
    | comment;
multipleStatements  : singleStatement (' ' singleStatement)*;
singleStatement     : ifStatement
    | varAssignment
    | expression
    | goto;
ifStatement         : 'if ' expression ' then ' multipleStatements (' else ' multipleStatements)? ' end';
expression          : ('(' expression ')' | var | const | ArithmeticKeyword expression) expression_recursive;
expression_recursive: arithmeticOperation | logicalOperation | factorialOperation |;
arithmeticOperation : ArithmeticOperator expression;
logicalOperation    : LogicalOperator expression;
factorialOperation  : '!';
var                 : (':')? varname;
varname             : AlphabeticalChar+;// AlphanumericalChar*;
AlphabeticalChar    : [a-z, A-Z];
alphanumericalChar  : AlphabeticalChar | NumericalChar;
NumericalChar       : [0-9];
const               : string
    | number;
string              : '"' everyChar* '"';
everyChar           : alphanumericalChar | SpecialSymbols; /* TODO improve this */
SpecialSymbols      : [.!?, ];
number              : ('-')? NumericalChar+ ('.' NumericalChar+)?;
ArithmeticOperator  : '+' | '-' | '*' | '/' | '%';
ArithmeticKeyword   : 'ABS' | 'SQRT' | 'SIN' | 'COS' | 'TAN' | 'ARCSIN' | 'ARCCOS' | 'ARCTAN';
LogicalOperator     : '<' | '>' | '<=' | '>=' | '!=' | '==';
varAssignment       : var ArithmeticOperator? '=' expression;
goto                : 'goto ' expression;
comment             : '//' everyChar*;