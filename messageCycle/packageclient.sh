#!/bin/sh

mkdir mlib

jar --create --file=mlib/client.jar --main-class=com.kirkk.client.Client -C mods/module1 .