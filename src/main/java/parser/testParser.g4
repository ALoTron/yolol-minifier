grammar testParser;

r : 'hello' ID EOF;
ID: [a-z]+;
WS: [ \t\r\n]+ -> skip;