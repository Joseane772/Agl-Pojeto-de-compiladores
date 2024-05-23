grammar AGL;

// Entry rule
program: (comment | statement)* EOF;

statement
        : viewDeclaration NEWLINE?
        | objectDeclaration NEWLINE?
        | objectAssignment NEWLINE?
        | varDeclaration NEWLINE?
        | varPropertyAssignment NEWLINE?
        | withBlock NEWLINE?
        | assignment NEWLINE?
        | print NEWLINE?
        | action NEWLINE?
        | forLoop NEWLINE?
        | comment NEWLINE?
        | NEWLINE
        ;


withBlock: 'with' (ID 'do')? '{' NEWLINE* statement* NEWLINE* '}';

// Variables
varDeclaration: ID ':' type (('=' expr)? | ('=' command))';';

varPropertyAssignment: ID '.' ID '=' expr ';';

command
    : 'wait' commandCondition;

commandCondition
    : 'mouse' 'click'
    | 'key' 'press' STRING
    | 'time' 'pass' NUMBER ('s' | 'ms')
    ;


// Models
objectAssignment: ID ':' objectDeclaration;

objectDeclaration: objectType 'at' expr withBlock;

objectProperty
            : 'fill' '=' expr ';'
            | 'length' '=' expr ';'
            | 'start' '=' expr ';'
            | 'extent' '=' expr ';'
            | 'outline' '=' expr ';'
            | 'text' '=' expr ';'
            ;

// Object types
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

// Views
viewDeclaration: ID ':' 'View' 'with' '{' NEWLINE* viewProperty* NEWLINE* '}';

viewProperty
            : 'Ox' '=' expr ';'
            | 'Oy' '=' expr ';'
            | 'width' '=' expr ';'
            | 'height' '=' expr ';'
            | 'title' '=' expr ';'
            | 'background' '=' expr ';'
            ;


// Print
print: 'print' expr ';';

// Assignment
assignment: ID '=' expr ';';

// Actions
action
    : 'refresh' ID ';'
    | 'close' ID ';'
    | 'move' ID 'by' point ';'
    | 'refresh' ID 'after' NUMBER ('s' | 'ms') ';'
    | 'wait' 'mouse' 'click'
    ;

// For loop
forLoop: 'for' ID 'in' range 'do' '{' NEWLINE* statement* NEWLINE* '}';

range: NUMBER '..' NUMBER ('..' NUMBER)?;

// Comments
comment
    : LINE_COMMENT
    | BLOCK_COMMENT;

// Types and expressions
type: 'Integer'
    | 'Number'
    | 'Point'
    | 'Vector'
    | 'String'
    | 'Time'
    ;

expr: STRING
    | NUMBER
    | ID
    | point
    | command
    ;

point: '(' (NUMBER | ID) ',' (NUMBER | ID) ')';

// Tokens
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+ ('.' [0-9]+)?;
STRING: '"' (~["\\\r\n] | '\\' .)* '"';
LINE_COMMENT: '#' ~[\r\n]* -> skip;
BLOCK_COMMENT: '#(' .*? ')#' -> skip;
NEWLINE: [\r\n]+ -> skip;
WS: [ \t]+ -> skip;
