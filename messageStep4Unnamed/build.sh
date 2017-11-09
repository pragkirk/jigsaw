#!/bin/sh

./clean.sh


javac --module-source-path src/modules -d mods $(find src/modules -name '*.java')