#!/bin/sh

echo ----------- Building -----------
javac -modulesourcepath src -d mods $(find src -name '*.java')

echo ----------- Done Building -----------