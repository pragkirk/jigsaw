#!/bin/sh

# java -mp mods -m module1/com.kirkk.client.Client

java -p mlib -cp ./mlib/client.jar --add-modules service com.kirkk.client.Client 