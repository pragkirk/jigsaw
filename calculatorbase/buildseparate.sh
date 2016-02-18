#!/bin/sh

echo ----------- Building -----------

javac -d mods/operation src/operation/*.java src/operation/com/extensiblejava/calculator/operation/*.java

javac -modulepath mods -d mods/calc src/calc/*.java src/calc/com/extensiblejava/calculator/*.java src/calc/com/extensiblejava/calculator/textui/*.java

javac -modulepath mods -d mods/math src/math/*.java src/math/com/extensiblejava/calculator/math/*.java

javac -modulepath mods -d mods/loan src/loan/*.java src/loan/com/extensiblejava/calculator/loan/*.java

echo ----------- Done Building -----------