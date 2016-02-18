#!/bin/sh

echo ----------- Generating Dependencies -----------

jdeps -dotoutput=result/ ./mlib/*.jar

echo ----------- Done Generating Dependencies -----------