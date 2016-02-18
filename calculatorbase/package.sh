#!/bin/sh

echo ----------- Packaging Modules -----------

mkdir mlib

jar --create --file=mlib/operation.jar -C mods/operation .
jar --create --file=mlib/math.jar -C mods/math .
jar --create --file=mlib/loan.jar -C mods/loan .
jar --create --file=mlib/calc.jar --main-class=com.extensiblejava.calculator.textui.CalculatorTextUI -C mods/calc .

echo ----------- Done Packaging Modules -----------