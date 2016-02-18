#!/bin/sh

if [ -d "mods" ]; then
  ./clean.sh
fi


javac -modulesourcepath src -d mods $(find src -name '*.java')