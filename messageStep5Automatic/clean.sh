#!/bin/sh

if [ -d "mods" ]; then
	rm -r mods
fi

if [ -d "build" ]; then
	rm -r build
fi

if [ -d "mlib" ]; then
	rm -r mlib
fi

if [ -d "stats" ]; then
	rm -r stats
fi