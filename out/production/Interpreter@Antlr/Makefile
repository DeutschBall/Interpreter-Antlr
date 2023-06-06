#dustball's Interpreter Makefile
src=DrawGraphLexer.java DrawGraphParser.java DrawGraphBaseVisitor.java DrawGraphVisitor.java

#从DrawGraph.g4规则文件生成
generate:
#$(src) : DrawGraph.g4
	antlr4 DrawGraph.g4 -no-listener -visitor

#编译所有java源码
compile:
	javac *.java

#打印识别出的所有token,检查词法分析是否有误
tokens:
	grun DrawGraph program -tokens < in.dat


#打印语法树,检查语法分析是否有误
tree:
	grun DrawGraph program -gui < in.dat

#画图
run:
	java Main

#一条龙服务
all:
	antlr4 DrawGraph.g4 -no-listener -visitor
	javac *.java
	grun DrawGraph program -tokens < in.dat
	grun DrawGraph program -gui < in.dat
	java Main

#擦腚
clean:
	rm *.class *.interp *.tokens ./gui/*.class ./common/*.class DrawGraphBaseVisitor.java DrawGraphLexer.java DrawGraphParser.java DrawGraphVisitor.java

