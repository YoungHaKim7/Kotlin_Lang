#!/bin/bash

kotlinc var_val.kt -include-runtime -d var_val.jar
java -jar var_jal.jar
