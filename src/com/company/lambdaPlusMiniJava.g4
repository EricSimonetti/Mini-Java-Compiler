/** Mini-Java ANTLR4 grammar with lambda expression add on **/

grammar lambdaPlusMiniJava;

@header {
    package com.company;
}

/*
 * Parser Rules
 */
goal  : mainClass (classDeclaration)* EOF
//Errors
| LEFT_PARENTHESIS classDeclaration RIGHT_PARENTHESIS* EOF {notifyErrorListeners("missing Main class");};


mainClass : CLASS ID LBRACKET PUBLIC STATIC VOID MAIN LEFT_PARENTHESIS STRING LSQUARE_BRACKET RSQUARE_BRACKET ID RIGHT_PARENTHESIS LBRACKET statement RBRACKET RBRACKET
//Errors
| CLASS LBRACKET PUBLIC STATIC VOID MAIN LEFT_PARENTHESIS STRING LSQUARE_BRACKET RSQUARE_BRACKET ID RIGHT_PARENTHESIS LBRACKET statement RBRACKET RBRACKET
{notifyErrorListeners("missing main class name");}
| CLASS ID LBRACKET STATIC VOID MAIN LEFT_PARENTHESIS STRING LSQUARE_BRACKET RSQUARE_BRACKET ID RIGHT_PARENTHESIS LBRACKET statement RBRACKET RBRACKET
{notifyErrorListeners("missing key word 'public' in main class declaration");}
| CLASS ID LBRACKET PUBLIC VOID MAIN LEFT_PARENTHESIS STRING LSQUARE_BRACKET RSQUARE_BRACKET ID RIGHT_PARENTHESIS LBRACKET statement RBRACKET RBRACKET
{notifyErrorListeners("missing key word 'static' in main class declaration");}
| CLASS ID LBRACKET PUBLIC STATIC MAIN LEFT_PARENTHESIS STRING LSQUARE_BRACKET RSQUARE_BRACKET ID RIGHT_PARENTHESIS LBRACKET statement RBRACKET RBRACKET
{notifyErrorListeners("missing key word 'void' in main class declaration");}
| CLASS ID LBRACKET PUBLIC STATIC VOID LEFT_PARENTHESIS STRING LSQUARE_BRACKET RSQUARE_BRACKET ID RIGHT_PARENTHESIS LBRACKET statement RBRACKET RBRACKET
{notifyErrorListeners("missing key word 'main' in main class declaration");}
| CLASS ID LBRACKET PUBLIC STATIC VOID MAIN LEFT_PARENTHESIS STRING LSQUARE_BRACKET RSQUARE_BRACKET ID RIGHT_PARENTHESIS LBRACKET statement RBRACKET
{notifyErrorListeners("Main class declaration missing right bracket");}
| CLASS ID PUBLIC STATIC VOID MAIN LEFT_PARENTHESIS STRING LSQUARE_BRACKET RSQUARE_BRACKET ID RIGHT_PARENTHESIS LBRACKET statement RBRACKET RBRACKET
{notifyErrorListeners("Main class declaration missing left bracket");}
| CLASS ID LBRACKET PUBLIC STATIC VOID MAIN LEFT_PARENTHESIS STRING LSQUARE_BRACKET RSQUARE_BRACKET ID RIGHT_PARENTHESIS LBRACKET RBRACKET RBRACKET
{notifyErrorListeners("Empty main class body");};


classDeclaration : CLASS ID (EXTENDS ID)? LBRACKET (varDeclaration)* (methodDeclaration)* RBRACKET
//Errors
| CLASS ID (EXTENDS ID)? LBRACKET RBRACKET                                     {notifyErrorListeners("Empty class body");}
| CLASS ID (EXTENDS ID)? (varDeclaration)* (methodDeclaration)* RBRACKET       {notifyErrorListeners("Class declaration missing right bracket");}
| CLASS ID (EXTENDS ID)? LBRACKET (varDeclaration)* (methodDeclaration)*       {notifyErrorListeners("Class declaration missing left bracket");};


varDeclaration : type ID SEMICOLON
// Errors
| type ID       {notifyErrorListeners("Missing semi-colon");}
| ID SEMICOLON  {notifyErrorListeners("Missing type in variable declaration");};


methodDeclaration : PUBLIC type ID parameters methodBody
// Errors
| type ID parameters       {notifyErrorListeners("Method declaration missing public");}
| PUBLIC ID parameters     {notifyErrorListeners("Method declaration missing return type");}
| PUBLIC type parameters   {notifyErrorListeners("Method declaration missing method name");}
| PUBLIC type ID           {notifyErrorListeners("Method declaration missing argument list");};


parameters : LEFT_PARENTHESIS (type ID( COMMA type ID)* )? RIGHT_PARENTHESIS
|LEFT_PARENTHESIS (type ID( COMMA type ID)* )?                {notifyErrorListeners("Argument list declaration missing right parenthesis");}
| (type ID( COMMA type ID)* )? RIGHT_PARENTHESIS              {notifyErrorListeners("Argument list missing left parenthesis");}
|LEFT_PARENTHESIS ( ID( COMMA type ID)* )? RIGHT_PARENTHESIS  {notifyErrorListeners("Variable in argument list missing type");}
|LEFT_PARENTHESIS ( type ID( COMMA ID)* )? RIGHT_PARENTHESIS  {notifyErrorListeners("Variable in argument list missing type");}
|LEFT_PARENTHESIS ( ID( COMMA ID)* )? RIGHT_PARENTHESIS       {notifyErrorListeners("Variables in argument list missing type");};

methodBody : LBRACKET (varDeclaration)* (statement)* RETURN expression SEMICOLON RBRACKET
| LBRACKET RBRACKET                                {notifyErrorListeners("Empty method body");}
| LBRACKET (varDeclaration)* (statement)* RBRACKET {notifyErrorListeners("Missing return statement");};


type : INT LSQUARE_BRACKET RSQUARE_BRACKET | BOOLEAN | INT | ID;


statement : LBRACKET (statement)* RBRACKET
| IF LEFT_PARENTHESIS expression RIGHT_PARENTHESIS statement ELSE statement
| WHILE LEFT_PARENTHESIS expression RIGHT_PARENTHESIS statement
| PRINT LEFT_PARENTHESIS expression RIGHT_PARENTHESIS SEMICOLON
| ID EQUALS expression SEMICOLON
| ID LSQUARE_BRACKET expression RSQUARE_BRACKET EQUALS expression SEMICOLON
//Errors
| IF LEFT_PARENTHESIS expression RIGHT_PARENTHESIS statement           {notifyErrorListeners("Missing else");}
| LBRACKET RBRACKET                                                    {notifyErrorListeners("Empty loop body");}
| statement RBRACKET                                                   {notifyErrorListeners("Missing left bracket");}
| LBRACKET (statement)* RBRACKET                                       {notifyErrorListeners("Missing right bracket");}
| ID expression SEMICOLON                                              {notifyErrorListeners("Missing equals sign bracket");}
| ID LSQUARE_BRACKET expression RSQUARE_BRACKET expression SEMICOLON   {notifyErrorListeners("Missing equals sign bracket");}
| PRINT LEFT_PARENTHESIS expression RIGHT_PARENTHESIS                  {notifyErrorListeners("Missing semi-colon");}
| ID EQUALS expression                                                 {notifyErrorListeners("Missing semi-colon");}
| ID LSQUARE_BRACKET expression RSQUARE_BRACKET EQUALS expression      {notifyErrorListeners("Missing semi-colon");};


expression : expression (OPERATOR|SIGN) expression
| expression LSQUARE_BRACKET expression RSQUARE_BRACKET
| expression DOT LENGTH
| expression DOT ID LEFT_PARENTHESIS (expression (COMMA expression)*)? RIGHT_PARENTHESIS
| SIGN? INT_LITERAL
| BOOLEAN_LITERAL
| ID
| THIS
| NEW INT LSQUARE_BRACKET expression RSQUARE_BRACKET
| NEW ID LEFT_PARENTHESIS RIGHT_PARENTHESIS
| NOT expression
| LEFT_PARENTHESIS expression RIGHT_PARENTHESIS
//add on
| expression QMARK expression COLON expression
//Errors
| NEW INT LSQUARE_BRACKET RSQUARE_BRACKET      {notifyErrorListeners("Array size not specified");}
| expression LSQUARE_BRACKET RSQUARE_BRACKET   {notifyErrorListeners("Array index not specified");}
| expression QMARK expression expression       {notifyErrorListeners("Missing colon in ternary expression");};

/*
 * Lexer Rules
 */

//reserved words
CLASS : 'class';
PUBLIC : 'public';
STATIC : 'static';
VOID : 'void';
MAIN : 'main';
EXTENDS : 'extends';
FOR : 'for';
WHILE : 'while';
IF : 'if';
ELSE : 'else';
RETURN : 'return';
THIS : 'this';
NEW : 'new';
PRINT : 'System.out.println';
LENGTH: 'length';
INT: 'int';
BOOLEAN: 'boolean';
STRING: 'String';
BOOLEAN_LITERAL : 'true' | 'false';

//symbols
LEFT_PARENTHESIS: '(';
RIGHT_PARENTHESIS: ')';
LBRACKET: '{';
RBRACKET: '}';
LSQUARE_BRACKET: '[';
RSQUARE_BRACKET: ']';
COMMA: ',';
DOT: '.';
NOT: '!';
EQUALS: '=';
QMARK: '?';
COLON: ':';
SEMICOLON: ';';
OPERATOR : '&&'|'<'|'*';
SIGN : '-' | '+';

INT_LITERAL : '0' | [1-9][0-9]*;
ID : [a-zA-Z_]([a-zA-Z_0-9])*;

WHITESPACE : [ \r\t\n]+ -> skip;
MULTI_LINE_COMMENT : '/*' .*? '*/' -> skip;
COMMENT: '//' .*? '\n' -> skip;
