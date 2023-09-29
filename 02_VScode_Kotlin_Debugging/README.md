# VScode Debugging

```
gradle build

// and

// VScode Debugging

```

# create a kotlin sample app(gradle)

- ```gradle init --type=kotlin-application```

```
$ mkdir kt-sample-app

$ cd kt-sample-app

$ gradle init --type=kotlin-application

# Select all default choices is OK
 
# Have a try is everything is ok
% ./gradlew buildBUILD SUCCESSFUL in 3s
8 actionable tasks: 8 executed
```

# kt-vscode-debugging_sample

https://github.com/thunderz99/kt-sample-app

https://medium.com/@thunderz99/debugging-kotlin-program-using-vscode-318ed43fe2f0

# Test env.

```
gradle -V                                                                                                                    ─╯

------------------------------------------------------------
Gradle 8.4-rc-2
------------------------------------------------------------

Build time:   2023-09-26 11:47:21 UTC
Revision:     21dd48a6b94a5dfff7fa19c4e3c65b5522c75cb3

Kotlin:       1.9.10
Groovy:       3.0.17
Ant:          Apache Ant(TM) version 1.10.13 compiled on January 4 2023
JVM:          17.0.7 (JetBrains s.r.o. 17.0.7+10-b829.16)
OS:           Linux 5.15.0-83-generic amd64


> Task :help

Welcome to Gradle 8.4-rc-2.

Directory '/home/gy/my_project/Kotlin_Lang' does not contain a Gradle build.

To create a new build in this directory, run gradle init

For more detail on the 'init' task, see https://docs.gradle.org/8.4-rc-2/userguide/build_init_plugin.html

For more detail on creating a Gradle build, see https://docs.gradle.org/8.4-rc-2/userguide/tutorial_using_tasks.html

To see a list of command-line options, run gradle --help

For more detail on using Gradle, see https://docs.gradle.org/8.4-rc-2/userguide/command_line_interface.html

For troubleshooting, visit https://help.gradle.org

BUILD SUCCESSFUL in 304ms
1 actionable task: 1 executed
```