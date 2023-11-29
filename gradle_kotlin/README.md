# ```.gitignore```

```

.idea/
.gradle/
out/
build/
tmp/
*.iml  
```


# Setup Eclipse For Kotlin Development

https://in-kotlin.com/ide/eclipse/

# Gradle userguide

https://docs.gradle.org/current/userguide/userguide.html

<br>

# gradle init

- init 

```
gradle init --type=kotlin-application  
```

```bash

$ gradle init --type=kotlin-application

Select build script DSL:
  1: Kotlin
  2: Groovy
Enter selection (default: Kotlin) [1..2] 1

Project name (default: Gradle_Kotlin):
Source package (default: gradle_kotlin):
Enter target version of Java (min. 7) (default: 21): 17
Generate build using new APIs and behavior (some features may change in the nex
t minor release)? (default: no) [yes, no]


> Task :init
To learn more about Gradle by exploring our Samples at https://docs.gradle.org/
8.3/samples/sample_building_kotlin_applications.html

BUILD SUCCESSFUL in 6m 14s
2 actionable tasks: 2 executed  
```

# brew install gradle

```
$ brew install gradle

==> No broken dependents found!
==> Caveats
==> openjdk
For the system Java wrappers to find this JDK, symlink it with
  sudo ln -sfn /opt/homebrew/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk

openjdk is keg-only, which means it was not symlinked into /opt/homebrew,
because macOS provides similar software and installing this software in
parallel can cause all kinds of trouble.

If you need to have openjdk first in your PATH, run:
  echo 'export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"' >> ~/.zshrc

For compilers to find openjdk you may need to set:
  export CPPFLAGS="-I/opt/homebrew/opt/openjdk/include"

==> gtk+
To avoid a conflict with `gtk+3` formula, `gtk-update-icon-cache` is installed at
  /opt/homebrew/opt/gtk+/libexec/gtk-update-icon-cache
A versioned symlink `gtk2-update-icon-cache` is linked for convenience.

$ sudo ln -sfn /opt/homebrew/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk

Password:

$ echo 'export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"' >> ~/.zshrc


$ export CPPFLAGS="-I/opt/homebrew/opt/openjdk/include"


$ gradle

Welcome to Gradle 7.6!

Here are the highlights of this release:
 - Added support for Java 19.
 - Introduced `--rerun` flag for individual task rerun.
 - Improved dependency block for test suites to be strongly typed.
 - Added a pluggable system for Java toolchains provisioning.

For more details see https://docs.gradle.org/7.6/release-notes.html

Starting a Gradle Daemon (subsequent builds will be faster)

> Task :help

Welcome to Gradle 7.6.

Directory '/Users/globalyoung/Documents/test/test/rust/rust_atomics_locks_mara_bos/fastcampus/back_end/mvc_practice/a01_mvc_java' does not contain a Gradle build.

To create a new build in this directory, run gradle init

For more detail on the 'init' task, see https://docs.gradle.org/7.6/userguide/build_init_plugin.html

For more detail on creating a Gradle build, see https://docs.gradle.org/7.6/userguide/tutorial_using_tasks.html

To see a list of command-line options, run gradle --help

For more detail on using Gradle, see https://docs.gradle.org/7.6/userguide/command_line_interface.html

For troubleshooting, visit https://help.gradle.org

ls
run dradle
zsh: command not found: run
run gradle
zsh: command not found: run
gradle run

FAILURE: Build failed with an exception.

* What went wrong:
Directory '/Users/globalyoung/Documents/test/test/rust/rust_atomics_locks_mara_bos/fastcampus/back_end/mvc_practice/a01_mvc_java' does not contain a Gradle build.

A Gradle build should contain a 'settings.gradle' or 'settings.gradle.kts' file in its root directory. It may also contain a 'build.gradle' or 'build.gradle.kts' file.

To create a new Gradle build in this directory run 'gradle init'

For more detail on the 'init' task see https://docs.gradle.org/7.6/userguide/build_init_plugin.html

For more detail on creating a Gradle build see https://docs.gradle.org/7.6/userguide/tutorial_using_tasks.html

* Try:
> Run gradle init to create a new Gradle build in this directory.
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.

* Get more help at https://help.gradle.org

BUILD FAILED in 273ms
gradle init

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 4

Select implementation language:
  1: Groovy
  2: Java
  3: Kotlin
Enter selection (default: Java) [1..3] 2

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2] 1

Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no]

Project name (default: a01_mvc_java): mvc-pratice

Source package (default: mvc.pratice):


> Task :init
Get more help with your project: https://docs.gradle.org/7.6/userguide/custom_plugins.html


$ ls
gradle          gradlew.bat     settings.gradle
gradlew         plugin


$ gradle build

BUILD SUCCESSFUL in 21s
10 actionable tasks: 10 executed

$ ls
gradle          gradlew.bat     settings.gradle
gradlew         plugin

$ ./gradlew build

Downloading https://services.gradle.org/distributions/gradle-7.6-bin.zip
...........10%............20%...........30%............40%............50%...........60%............70%............80%...........90%............100%
Starting a Gradle Daemon, 1 incompatible Daemon could not be reused, use --status for details

BUILD SUCCESSFUL in 10s
10 actionable tasks: 8 executed, 2 up-to-date

```

https://github.com/spring-guides/gs-gradle

<br>
