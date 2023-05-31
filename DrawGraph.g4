grammar DrawGraph;

PLUS : '+';
MINUS: '-';
DIV  : '/';
MUL  : '*';
POWER: '**';

SEMICO : ';';
L_BRACKET: '(';
R_BRACKET: ')';
COMMA :',';


ORIGIN:'ORIGIN';
SCALE :'SCALE';
ROT   :'ROT';
IS    :'IS';
TO    :'TO';
STEP  :'STEP';
DRAW  :'DRAW';
FOR   :'FOR';
FROM  :'FROM';
T1 : 'T' ;
COLOR: 'COLOR';
RED: 'RED';
GREEN: 'GREEN';
BLUE: 'BLUE';
BLACK: 'BLACK';
SIZE:'SIZE';
P: 'p'|'P';
I: 'i'|'I';
E: 'e'|'E';

fragment NamedConst:P I|E;
CONST_ID : Integer
  |  Real
  |  NamedConst
  ;

Integer: [0-9]+;
Real: Integer('.'Integer);

ID : [a-zA-Z_][a-zA-Z_0-9]*;

WS  :  [ \t\f\r\n]+  -> skip  ;

COMMENT:
	   ('//' ~[\r\n]*
	 |  '--' ~[\r\n]*
	 |  '/*' .*? '*/') -> skip;

program :  ( statement SEMICO )*  EOF  ;

statement :  originStatment | scaleStatment | rotStatment    | forStatment |statColor ;

originStatment : ORIGIN IS L_BRACKET expr COMMA expr R_BRACKET   #statOrigin
;
scaleStatment:SCALE IS L_BRACKET expr COMMA expr R_BRACKET #statScale
;

rotStatment:ROT IS expr   #statRot
;

forStatment: FOR T1 FROM expr TO expr STEP expr DRAW L_BRACKET expr COMMA expr R_BRACKET #statFor;

statColor: COLOR IS (RED | GREEN | BLUE | BLACK | 'Color(' expr ',' expr ',' expr ')' );


expr :
         <assoc=right>   expr POWER expr  #powerExpr
      |  (PLUS | MINUS)  expr       #unaryExpr
      |  expr (MUL  | DIV)   expr   #mulDivExpr
      |  expr (PLUS | MINUS) expr   #plusMinusExpr
      |  CONST_ID             #const
      |  T1              #varT
      |  ID   L_BRACKET  expr  R_BRACKET    #funcExpr
      |  L_BRACKET       expr  R_BRACKET    #nestedExpr
      ;
ErrText : . ;
