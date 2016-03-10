#!/bin/sh

echo ----------- Creating Runtime Image -----------

jlink --modulepath $JAVA_HOME/jmods:mlib --addmods calc,math --output mathimage  --strip-debug --compress 2

echo ----------- Done Creating Runtime Image -----------