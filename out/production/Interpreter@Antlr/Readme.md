# 基于Antlr4.7.2的函数绘图语言解释器实现



## 实现功能

| 功能                 | 例子                                                         |      |
| -------------------- | ------------------------------------------------------------ | ---- |
| 基本功能             | 不解释                                                       |      |
| 注释                 | `--this is comment` <br />`//this is comment` <br />`/*comment block*/` |      |
| 设置颜色,包括gay色   | `COLOR IS COLORFUL;`                                         |      |
| 设置粗细             | `SIZE IS 5;`                                                 |      |
| 定义变量             | `a=10;`<br />`B=a;`                                          |      |
| 检查除零异常         | `A=10/0;`                                                    |      |
| FOR是否死循环检查    | `FOR T FROM 300 TO -300 STEP 10 DRAW (T,100*SIN(0.01*T));`   |      |
| Color(r,g,b)范围检查 | `COLOR IS Color(200,2000,-100);`                             |      |
| 绘图是否超过边界检查 | `FOR T FROM 0 TO 30000 STEP 100 DRAW (T,100*SIN(0.01*T));`   |      |







## 项目结构



```
DrawGraph
│  BackEnd.java		#解释器后端,接收一个语法树,进行语义分析,画图,自定义
│  DrawGraph.g4		#词法语法规则定义文件,自定义
│  DrawGraph.interp	#生成文件
│  DrawGraph.tokens	#生成文件
│  DrawGraphBaseVisitor.java	#访问器抽象基类,生成文件
│  DrawGraphLexer.interp		#生成文件
│  DrawGraphLexer.java			#词法分析器,生成文件
│  DrawGraphLexer.tokens		#生成文件
│  DrawGraphParser.java			#语法分析器,生成文件
│  DrawGraphVisitor.java		#访问器接口类,生成文件
│  EvalVisitor.java				#访问器,自定义
│  FrontEnd.java				#解释器前端,接受一个文件输入,进行词法分析,语法分析,建立语法树,自定义
│  in.dat						#文件输入,自定义
│  Main.java					#程序入口,设置前后端,启动/关闭画板,自定义
│  Makefile						#构建工具
│
├─common
│      uiPixelAttrib.java		#像素点设置类
│
└─gui
│       BaseUI.java				#UI基类
│       MyWindow.java			#UI实现类
└─tools
        antlr-4.7.2-complete.jar	#依赖jar包
        antlr4.bat					#懒人工具1
        grun.bat					#懒人工具2

```



## 环境搭建



### windows+idea

antlr4,grun等命令行工具:将tools目录添加到环境变量path,此举方便使用命令行生成

将antlr-4.7.2-complete.jar包添加到环境变量CLASSPATH,此举保证antlr4命令可以找到依赖的jar包

make工具(有更方便,没有问题不大)

> antlr4实际上是java org.antlr.v4.Tool,需要将antlr4相关jar包添加到CLASSPATH,才可以被自动找到

用idea打开根目录,在项目结构中设置好SDK,在库中放上jar包

![image-20230531173050302](https://raw.githubusercontent.com/DeutschBall/VideoBed/main/image-20230531173050302.png)

此后就可以在项目视图的外部库中看到antlr-4.7.2-complete这个jar包了

![image-20230531173124302](https://raw.githubusercontent.com/DeutschBall/VideoBed/main/image-20230531173124302.png)

此举保证#import有包可依

> 如果使用maven
>
> ```xml
> <!-- https://mvnrepository.com/artifact/org.antlr/antlr4-runtime -->
> <dependency>
>     <groupId>org.antlr</groupId>
>     <artifactId>antlr4-runtime</artifactId>
>     <version>4.7.2</version>
> </dependency>
> 
> ```



### windows+vscode

antlr4,grun等命令行工具:将tools目录添加到环境变量path,此举方便使用命令行生成

将antlr-4.7.2-complete.jar包添加到环境变量CLASSPATH,此举保证antlr4命令可以找到依赖的jar包

用vscode打开根目录

ctrl+shift+p打开命令面板,输入`java:Configure Classpath`

然后在Referenced Libraries中添加jar包

![image-20230531173509704](https://raw.githubusercontent.com/DeutschBall/VideoBed/main/image-20230531173509704.png)

此举保证#import有包可依



## 词法语法规则定义

DrawGraph.g4

```antlr
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
//这里Integer和CONST_ID的先后定义顺序有讲究,
//如果先定义Integer,则词法分析器会将整数识别为Interger token,而不是CONST_ID,
//然而后来的语法分析使用的是CONST_ID,因此会报告符号不匹配错误

Integer: [0-9]+;
Real: Integer('.'Integer);

ID : [a-zA-Z_][a-zA-Z_0-9]*;

WS  :  [ \t\f\r\n]+  -> skip ;

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

//#powerExpr等标记是语义规则的标签,在EvalVisitor.java中将会重写响应标签的函数
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
      
      //剩下的所有不被匹配的符号都会被ErrText一笔带过
ErrText : . ;

```

## 生成&编译&运行

```
make all
```





