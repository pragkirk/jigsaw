#!/bin/sh

./clean.sh
./build.sh
./package.sh
./createimage.sh
./dependencies.sh

cd ./customimage/bin

./calc