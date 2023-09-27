#!/bin/bash
kotlinc src/Main.kt -include-runtime -d out/Main.jar
java -jar out/Main.jar
