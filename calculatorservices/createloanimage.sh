#!/bin/sh

echo ----------- Creating Runtime Image -----------

jlink --modulepath $JAVA_HOME/jmods:mlib --addmods calc,loan --output loanimage  --strip-debug --compress 2

echo ----------- Done Creating Runtime Image -----------