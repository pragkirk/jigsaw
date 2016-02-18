#!/bin/sh

./clean.sh
./build.sh
./package.sh
./createimage.sh
./dependencies.sh

ant

cd ./customimage/bin

./calc