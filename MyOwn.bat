set CLASSPATH=C:\Users\Swapnil\eclipse\workspace\xquery-processor\lib\antlr-4.6-complete.jar;.
java -jar C:\Users\Swapnil\eclipse\workspace\xquery-processor\lib\antlr-4.6-complete.jar XQuery.g4 -no-listener -visitor
javac *.java
java org.antlr.v4.gui.TestRig XQuery start -gui
