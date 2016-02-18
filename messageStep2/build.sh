#!/bin/sh

./clean.sh


javac -modulesourcepath src -d mods $(find src -name '*.java')