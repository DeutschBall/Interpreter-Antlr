#dustball's Interpreter Makefile
src=DrawGraphLexer.java DrawGraphParser.java DrawGraphBaseVisitor.java DrawGraphVisitor.java

#��DrawGraph.g4�����ļ�����
generate:
#$(src) : DrawGraph.g4
	antlr4 DrawGraph.g4 -no-listener -visitor

#��������javaԴ��
compile:
	javac *.java

#��ӡʶ���������token,���ʷ������Ƿ�����
tokens:
	grun DrawGraph program -tokens < in.dat


#��ӡ�﷨��,����﷨�����Ƿ�����
tree:
	grun DrawGraph program -gui < in.dat

#��ͼ
run:
	java Main

#һ��������
all:
	antlr4 DrawGraph.g4 -no-listener -visitor
	javac *.java
	grun DrawGraph program -tokens < in.dat
	grun DrawGraph program -gui < in.dat
	java Main

#����
clean:
	rm *.class *.interp *.tokens ./gui/*.class ./common/*.class DrawGraphBaseVisitor.java DrawGraphLexer.java DrawGraphParser.java DrawGraphVisitor.java

