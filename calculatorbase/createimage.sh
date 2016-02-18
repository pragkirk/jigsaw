#!/bin/sh

echo ----------- Creating Runtime Image -----------

jlink --modulepath $JAVA_HOME/jmods:mlib --addmods calc --output customimage  --strip-debug --compress 2

cp Resource.properties ./customimage/bin/Resource.properties

echo ----------- Done Creating Runtime Image -----------