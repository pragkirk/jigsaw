#!/bin/sh

echo ----------- Creating Runtime Image -----------

jlink --module-path $JAVA_HOME/jmods:mlib --add-modules calc,math,loan --output customimage  --strip-debug --compress 2

echo ----------- Done Creating Runtime Image -----------