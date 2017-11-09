#!/bin/sh

#./clean.sh


javac -p mlib -d mods/client $(find src/client -name '*.java')