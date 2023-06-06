::call %~dp0\setenv.bat

::这个不正确，但运行时会自动调用正确的包
::java org.antlr.v4.runtime.misc.TestRig %*

java org.antlr.v4.gui.TestRig %*