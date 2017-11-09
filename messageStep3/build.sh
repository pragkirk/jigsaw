#!/bin/sh

./clean.sh


javac --module-source-path src -d mods $(find src -name '*.java')