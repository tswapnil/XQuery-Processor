#!/bin/bash

#antlr4 -no-listener -visitor xquery.g4

antlr4 -no-listener -visitor -lib . -package edu.ucsd.cse.xprocessor.parser -o src/main/java/edu/ucsd/cse/xprocessor/parser xquery.g4

mvn clean build

#javac xquery*.java

#echo "Press <Ctrl/Command + D> after entering the query to view parse tree"

#grun xquery ap -gui
