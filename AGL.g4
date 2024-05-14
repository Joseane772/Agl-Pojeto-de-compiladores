grammar AGL; 

program : 
    statement+ EOF ;

statement : 
    (assignment 
    | ifStatement 
    | whileStatement 
    | printStatement
    | comment) NEWLINE ;


comment : 
    '#' ~[\r\n]*
    | '#('   ')#' ;

assignment :
    ID '=' expression ;




Number : [0-9]+('.'[0-9]+)? ; // Fixed point real number
NEWLINE : '\r'? '\n' ; // Windows or Unix line terminator
WS : [ \t]+ -> skip ; // Skip spaces, tabs, newlines, etc.