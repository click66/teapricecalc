#!/bin/bash

# On mac or linux execute:
# ./build-and-run.sh

# or to run using input from file input.txt
# ./build-and-run.sh input.txt

javac -cp libs/tea-calculator.jar src/main/java/com/example/teabags/*
java -cp src/main/java:libs/tea-calculator.jar com.example.teabags.App $1
