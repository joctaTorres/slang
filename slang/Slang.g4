grammar Slang;

parse
 : block EOF
 ;

block
 : ( statement | functionDecl )* ( Return expression ';' )?
 ;

statement
 : assignment ';'
 | functionCall ';'
 | ifStatement
 | forStatement
 | whileStatement
 ;

assignment
 : Identifier indexes? '=' expression
 ;

functionCall
 : Identifier '(' exprList? ')' #identifierFunctionCall
 | Println '(' expression? ')'  #printlnFunctionCall
 | Print '(' expression ')'     #printFunctionCall
 | Assert '(' expression ')'    #assertFunctionCall
 | Size '(' expression ')'      #sizeFunctionCall
 ;

ifStatement
 : ifStat elseIfStat* elseStat? End
 ;

ifStat
 : If expression Do block
 ;

elseIfStat
 : Else If expression Do block
 ;

elseStat
 : Else Do block
 ;

functionDecl
 : Def Identifier '(' idList? ')' block End
 ;

forStatement
 : For Identifier '=' expression To expression Do block End
 ;

whileStatement
 : While expression Do block End
 ;

idList
 : Identifier ( ',' Identifier )*
 ;

exprList
 : expression ( ',' expression )*
 ;

expression
 : '-' expression
 | '!' expression
 | <assoc=right> expression '^' expression
 | expression op=( '*' | '/' | '%' ) expression
 | expression op=( '+' | '-' ) expression
 | expression op=( '>=' | '<=' | '>' | '<' ) expression
 | expression op=( '==' | '!=' ) expression
 | expression '&&' expression
 | expression '||' expression
 | expression '?' expression ':' expression
 | expression In expression
 | Number
 | Bool
 | Null
 | functionCall indexes?
 | list indexes?
 | Identifier indexes?
 | String indexes?
 | '(' expression ')' indexes?
 | Input '(' String? ')'                                
 ;

list
 : '[' exprList? ']'
 ;

indexes
 : ( '[' expression ']' )+
 ;

Println  : 'println';
Print    : 'print';
Input    : 'input';
Assert   : 'assert';
Size     : 'size';
Def      : 'def';
If       : 'if';
Else     : 'else';
Return   : 'return';
For      : 'for';
While    : 'while';
To       : 'to';
Do       : 'do';
End      : 'end';
In       : 'in';
Null     : 'null';

Or       : '||';
And      : '&&';
Equals   : '==';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';
Pow      : '^';
Excl     : '!';
GT       : '>';
LT       : '<';
Add      : '+';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';
OBrace   : '{';
CBrace   : '}';
OBracket : '[';
CBracket : ']';
OParen   : '(';
CParen   : ')';
SColon   : ';';
Assign   : '=';
Comma    : ',';
QMark    : '?';
Colon    : ':';

Bool
 : 'true' 
 | 'false'
 ;

Number
 : Int ( '.' Digit* )?
 ;

Identifier
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

String
 : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
 | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* [']
 ;

Comment
 : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip
 ;

Space
 : [ \t\r\n\u000C] -> skip
 ;

fragment Int
 : [1-9] Digit*
 | '0'
 ;
  
fragment Digit 
 : [0-9]
 ;