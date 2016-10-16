#!/usr/bin/env bash
DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
java -classpath "$DIR/main.jar:$DIR/hello.jar" Main

