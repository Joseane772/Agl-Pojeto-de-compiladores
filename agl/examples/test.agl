grammar AGL;

// Regras principais
program: (comment| statement)*;

statement: viewDeclaration NEWLINE?
            | objectDeclaration NEWLINE?
            | varDeclaration NEWLINE?
            | assignment NEWLINE?
            | print NEWLINE?
            | viewAction NEWLINE?
            | action NEWLINE?
            | NEWLINE
            ;

varDeclaration: ID ':' type ('=' expr)? ';';



// models
objectDeclaration: objectType 'at' point 'with' '{' NEWLINE* (objectProperty)* NEWLINE*'}';

objectProperty
    : 'fill' '=' expr ';'
    | 'lenft' '=' expr ';'
    | 'start' '=' expr ';'
    | 'extent' '=' expr ';'
    | 'outline' '=' expr ';'
    ;

objectType
    : 'Line'
    | 'Rectangle'
    | 'Ellipse'
    | 'Arc'
    | 'ArcChord'
    | 'PieSlice'
    | 'Text'
    | 'Dot'
    ;
// views
viewDeclaration: ID ':' 'View' 'with' '{' NEWLINE* (viewProperty)* NEWLINE*'}';

viewProperty: 'Ox' '=' expr ';'
            | 'Oy' '=' expr ';'
            | 'width' '=' expr ';'
            | 'height' '=' expr ';'
            | 'title' '=' expr ';'
            | 'background' '=' expr ';';

// views actions
viewAction
    : 'refresh' ID ';'
    | 'close' ID ';'
    ;


// print
print: 'print'  expr ;

assignment: ID '=' expr;



action: 'move' '(' point ')'
        | 'refresh'
        | 'close';

comment: BLOCK_COMMENT ;

// Tipos de dados e expressões
type: 'Integer'
    | 'Number'
    | 'Point'
    | 'Vector'
    | 'String'
    | 'Time';

expr
    : STRING
    | NUMBER
    | ID
    | point;

point: '('(NUMBER|ID) ',' (NUMBER|ID) ')';

// Tokens
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+ ('.' [0-9]+)?;
STRING: '"'.*?'"';
LINE_COMMENT: '#' ~( '\r' | '\n' )* -> skip;
BLOCK_COMMENT: '#('.*? '#)' -> skip;
NEWLINE: [\r\n]+ -> skip;
WS: [ \t\r\n]+ -> skip;




