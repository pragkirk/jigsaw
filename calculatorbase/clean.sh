#!/bin/sh


echo ----------- Cleaning Up -----------
if [ -d "mods" ]; then
  rm -r mods
fi

if [ -d "mlib" ]; then
  rm -r mlib
fi

if [ -d "result" ]; then
  rm -r result
fi

if [ -d "customimage" ]; then
  rm -r customimage
fi

if [ -d "stats" ]; then
  rm -r stats
fi

echo ----------- Done Cleaning Up -----------