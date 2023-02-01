# Gradle Docs

https://docs.gradle.org/current/samples/sample_building_kotlin_applications.html

<br>

<hr>

# Tutorial

```
$ gradle init

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 4

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2] 1

Project name (default: demo):
Source package (default: demo):


BUILD SUCCESSFUL
2 actionable tasks: 2 executed
The init task generates the new project with the following structure:

GroovyKotlin
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── app
    ├── build.gradle
    └── src
        ├── main
        │   └── kotlin
        │       └── demo
        │           └── App.kt
        └── test
            └── kotlin
                └── demo
                    └── AppTest.kt
```

# Run the application

```
$ ./gradlew run

> Task :app:run
Hello World!

BUILD SUCCESSFUL in 7s
2 actionable tasks: 2 executed
```
