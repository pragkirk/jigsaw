#!/bin/sh

echo ----------- Building -----------
javac --module-source-path src -d mods $(find src -name '*.java')

echo ----------- Done Building -----------