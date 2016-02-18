#!/bin/sh

ant init

javac -d mods/com.kirkk.hello src/com.kirkk.hello/module-info.java src/com.kirkk.hello/com/kirkk/hello/HelloWorld.java

jar --create --file=mlib/com.kirkk.hello.jar --main-class=com.kirkk.hello.HelloWorld -C mods/com.kirkk.hello .