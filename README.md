<p align="center">
    <img width=150px src="https://github.com/YoungHaKim7/Cpp_Training/assets/67513038/70b5096e-e16f-48fa-b7c8-0aa776deacee"/>   
</p>

<hr>

# Link

- <a href="https://github.com/YoungHaKim7/Kotlin_Lang#java--kotlin-echo-gitignore">echo로 .gitignore 넣기</a>

- <a href="https://github.com/YoungHaKim7/Kotlin_Lang#makefile-%EA%B0%84%EB%8B%A8%ED%95%9C-kotlin%EC%8B%A4%ED%96%89">Makefile간단히 만들기</a>

- <a href="https://github.com/YoungHaKim7/Kotlin_Lang#makefile-%EC%97%AC%EB%9F%AC%EA%B0%9C-%ED%8C%8C%EC%9D%BC-%EC%97%B0%EA%B2%B0-kotlin%EC%8B%A4%ED%96%89
">Makefile 링크로 여러개 파일 연결 만들기</a>


# 코틀린 소개 100초 짜리  Kotlin in 100 Seconds | Fireship

https://youtu.be/xT8oP0wy-A0?si=qAlcQTdmTyFTfAOl

<hr>

# sdk로 자바랑 gradle 버젼 매니져

https://sdkman.io/

```
sdk install gradle 8.4-rc-2
sdk install java 17.0.8.1-tem
```

<hr>


```
// search
sdk list java


// install
sdk install java17.0.7-jbr


// use
sdk use java17.0.7-jbr

```

```
sdk use

No candidate version provided.

Usage: sdk <command> [candidate] [version]
       sdk offline <enable|disable>

   commands:
       install   or i    <candidate> [version] [local-path]
       uninstall or rm   <candidate> <version>
       list      or ls   [candidate]
       use       or u    <candidate> <version>
       config
       default   or d    <candidate> [version]
       home      or h    <candidate> <version>
       env       or e    [init|install|clear]
       current   or c    [candidate]
       upgrade   or ug   [candidate]
       version   or v
       help
       offline           [enable|disable]
       selfupdate        [force]
       update
       flush             [tmp|metadata|version]

   candidate  :  the SDK to install: groovy, scala, grails, gradle, kotlin, etc.
                 use list command for comprehensive list of candidates
                 eg: $ sdk list
   version    :  where optional, defaults to latest stable if not provided
                 eg: $ sdk install groovy
   local-path :  optional path to an existing local installation
                 eg: $ sdk install groovy 2.4.13-local /opt/groovy-2.4.13
```


- kotlin gradle로 프로젝트 만들기 

```
gradle init --type=kotlin-application 
```


<hr>

# Java & Kotlin ```.gitignore```

- https://github.com/github/gitignore

```
.gradle
**/build/
!src/**/build/

# Ignore Gradle GUI config
gradle-app.setting

# Avoid ignoring Gradle wrapper jar file (.jar files are usually ignored)
!gradle-wrapper.jar

# Avoid ignore Gradle wrappper properties
!gradle-wrapper.properties

# Cache of project
.gradletasknamecache

# Eclipse Gradle plugin generated files
# Eclipse Core
.project
# JDT-specific (Eclipse Java Development Tools)
.classpath
```

# Java & Kotlin echo ```.gitignore```<a href="https://github.com/YoungHaKim7/Kotlin_Lang#link">[🔝]</a>

- <a href="https://github.com/YoungHaKim7/Kotlin_Lang#makefile-%EA%B0%84%EB%8B%A8%ED%95%9C-kotlin%EC%8B%A4%ED%96%89">Makefile간단히 만들기</a>
- <a href="https://github.com/YoungHaKim7/Kotlin_Lang#makefile-%EC%97%AC%EB%9F%AC%EA%B0%9C-%ED%8C%8C%EC%9D%BC-%EC%97%B0%EA%B2%B0-kotlin%EC%8B%A4%ED%96%89
">Makefile 링크로 여러개 파일 연결 만들기</a>


```
echo "# Result\xa\xa\x60\x60\x60\xa\xa\x60\x60\x60" >> README.md &&


echo "out/" >> .gitignore &&
echo ".gradle" >> .gitignore &&
echo "**/build/" >> .gitignore &&
echo "\x21src/**/build/\xa" >> .gitignore &&

echo "# Ignore Gradle GUI config" >> .gitignore &&
echo "gradle-app.setting\xa" >> .gitignore &&

echo "# Avoid ignoring Gradle wrapper jar file (.jar files are usually ignored)" >> .gitignore &&
echo "\x21gradle-wrapper.jar\xa" >> .gitignore &&

echo "# Avoid ignore Gradle wrappper properties" >> .gitignore &&
echo "\x21gradle-wrapper.properties\xa" >> .gitignore &&

echo "# Cache of project" >> .gitignore &&
echo ".gradletasknamecache\xa" >> .gitignore &&

echo "# Eclipse Gradle plugin generated files" >> .gitignore &&
echo "# Eclipse Core" >> .gitignore &&
echo ".project" >> .gitignore &&
echo "# JDT-specific (Eclipse Java Development Tools)" >> .gitignore &&
echo ".classpath" >> .gitignore
```

# Makefile (간단한 kotlin실행)<a href="https://github.com/YoungHaKim7/Kotlin_Lang#link">[🔝]</a>

- <a href="https://github.com/YoungHaKim7/Kotlin_Lang#java--kotlin-echo-gitignore">echo로 .gitignore 넣기</a>


```Makefile
KC = kotlinc
JAVA = java

SOURCE_KT = ./src/Main.kt
TEST_SOURCE_KT = /junit-platform-console-standalone-1.9.3.jar
LINK_OBJ =

TARGET = ./out/Main.jar
LDFLAGS_COMMON = -include-runtime

r:
		$(KC) $(SOURCE_KT) $(LINK_OBJ) $(LDFLAGS_COMMON) -d $(TARGET)
		$(JAVA) -jar $(TARGET)
t:
		$(KC) $(SOURCE_KT) $(LDFLAGS_COMMON) -d $(TARGET)
		$(JAVA) -jar .$(TEST_SOURCE_KT) --scan-class-path

d:
		wget https://repo1.maven.org/maven2/org/junit/platform/$(TEST_SOURCE_KT)

clean:
		rm -rf out *.jar

init:
		mkdir src
		echo "fun main() {" >> src/Main.kt
		echo "	println(\"Hello, World! Kotlin lang\")" >> src/Main.kt
		echo "}" >> src/Main.kt

init2:
		mkdir src
		echo "fun main(args : Array<String>) {" >> src/Main.kt
		echo "	println(\"Hello, World! Kotlin lang\" >> src/Main.kt
		echo "}" >> src/Main.kt
```


# Makefile (여러개 파일 연결 kotlin실행)<a href="https://github.com/YoungHaKim7/Kotlin_Lang#link">[🔝]</a>

- <a href="https://github.com/YoungHaKim7/Kotlin_Lang#makefile-%EA%B0%84%EB%8B%A8%ED%95%9C-kotlin%EC%8B%A4%ED%96%89">Makefile간단히 만들기</a>

- Link 하는 Makefile

```Makefile
KC = kotlinc
JAVA = java

SOURCE_KT = ./src/Main.kt
TEST_SOURCE_KT = /junit-platform-console-standalone-1.9.3.jar
LINK_OBJ = ./src/Animal.kt

TARGET = ./out/Main.jar
LDFLAGS_COMMON = -include-runtime

r:
		$(KC) $(SOURCE_KT) $(LINK_OBJ) $(LDFLAGS_COMMON) -d $(TARGET)
		$(JAVA) -jar $(TARGET)
t:
		$(KC) $(SOURCE_KT) $(LDFLAGS_COMMON) -d $(TARGET)
		$(JAVA) -jar .$(TEST_SOURCE_KT) --scan-class-path

d:
		wget https://repo1.maven.org/maven2/org/junit/platform/$(TEST_SOURCE_KT)

clean:
		rm -rf out *.jar

init:
		mkdir src
		echo "package src" >> src/Main.kt
		echo "import Animal" >> src/Main.kt
		echo "" >> src/Main.kt
		echo "fun main() {" >> src/Main.kt
		echo "	println(\"Hello, World! Kotlin lang\")" >> src/Main.kt
		echo "	val dog = Animal(\"Dog\")" >> src/Main.kt
		echo "	println(\"\x24dog\")" >> src/Main.kt
		echo "}" >> src/Main.kt
		echo "class Animal(" >> src/Animal.kt
		echo "	val name: String" >> src/Animal.kt
		echo ") {" >> src/Animal.kt
		echo "" >> src/Animal.kt
		echo "	init {" >> src/Animal.kt
		echo "		println(\"Hello, my name is \x24name\")" >> src/Animal.kt
		echo "	}" >> src/Animal.kt
		echo "}" >> src/Animal.kt

init2:
		mkdir src
		echo "fun main(args : Array<String>) {" >> src/Main.kt
		echo "	println(\"Hello, World! Kotlin lang\" >> src/Main.kt
		echo "}" >> src/Main.kt
```

# VSCode Debugging .vscode 자동 만들기

```Makefile
vscode:
		rm -rf .vscode
		mkdir .vscode
		echo "{" >> .vscode/launch.json
		echo "	\"version\": \"0.2.0\"," >> .vscode/launch.json
		echo "	\"configurations\": [" >> .vscode/launch.json
		echo "		{" >> .vscode/launch.json
		echo "			\"type\": \"kotlin\"," >> .vscode/launch.json
		echo "			\"request\": \"launch\"," >> .vscode/launch.json
		echo "			\"name\": \"Kotlin Launch\"," >> .vscode/launch.json
		echo "			\"projectRoot\": \"\x24{workspaceFolder}/app\"," >> .vscode/launch.json
		echo "			// \"mainClass\": \"check /app/build.gradle.kts___application -> mainClass.set" >> .vscode/launch.json
		echo "			\"mainClass\": \"gradle.test01.AppKt\"," >> .vscode/launch.json
		echo "		}" >> .vscode/launch.json
		echo "	]" >> .vscode/launch.json
		echo "}" >> .vscode/launch.json
		echo "{" >> .vscode/tasks.json
		echo "	\"version\": \"2.0.0\"," >> .vscode/tasks.json
		echo "	\"tasks\": [" >> .vscode/tasks.json
		echo "		{" >> .vscode/tasks.json
		echo "			\"label\": \"build\"," >> .vscode/tasks.json
		echo "			\"type\": \"shell\"," >> .vscode/tasks.json
		echo "			\"command\": \"./gradlew build -x test\"," >> .vscode/tasks.json
		echo "			\"problemMatcher\": []," >> .vscode/tasks.json
		echo "			\"group\": {" >> .vscode/tasks.json
		echo "				\"kind\": \"build\"," >> .vscode/tasks.json
		echo "				\"isDefault\": true" >> .vscode/tasks.json
		echo "			}," >> .vscode/tasks.json
		echo "		}," >> .vscode/tasks.json
		echo "		{" >> .vscode/tasks.json
		echo "			\"label\": \"run\"," >> .vscode/tasks.json
		echo "			\"type\": \"shell\"," >> .vscode/tasks.json
		echo "			\"command\": \"./gradlew run\"," >> .vscode/tasks.json
		echo "			\"problemMatcher\": []," >> .vscode/tasks.json
		echo "		}," >> .vscode/tasks.json
		echo "		{" >> .vscode/tasks.json
		echo "			\"label\": \"test\"," >> .vscode/tasks.json
		echo "			\"type\": \"shell\"," >> .vscode/tasks.json
		echo "			\"command\": \"./gradlew test\"," >> .vscode/tasks.json
		echo "			\"problemMatcher\": []," >> .vscode/tasks.json
		echo "		}," >> .vscode/tasks.json
		echo "		{" >> .vscode/tasks.json
		echo "			\"label\": \"clean\"," >> .vscode/tasks.json
		echo "			\"type\": \"shell\"," >> .vscode/tasks.json
		echo "			\"command\": \"./gradlew clean\"," >> .vscode/tasks.json
		echo "			\"problemMatcher\": []," >> .vscode/tasks.json
		echo "		}," >> .vscode/tasks.json
		echo "		{" >> .vscode/tasks.json
		echo "			\"label\": \"check\"," >> .vscode/tasks.json
		echo "			\"type\": \"shell\"," >> .vscode/tasks.json
		echo "			\"command\": \"./gradlew check\"," >> .vscode/tasks.json
		echo "			\"problemMatcher\": []," >> .vscode/tasks.json
		echo "		}" >> .vscode/tasks.json
		echo "	]," >> .vscode/tasks.json
		echo "}" >> .vscode/tasks.json
		echo "{" >> .vscode/settings.json
		echo "	\"java.compile.nullAnalysis.mode\": \"automatic\"," >> .vscode/settings.json
		echo "	\"java.configuration.updateBuildConfiguration\": \"interactive\"" >> .vscode/settings.json
		echo "}" >> .vscode/settings.json

```

<hr>



# Doom Emacs 에서 추가로 설치해야하는 패키지 Recommended packages

```
Recommended packages

- kotlin-mode
- company-mode
- yasnippet
- lsp-mode
- lsp-ui
- lsp-treemacs
- dap-mode


-- Other useful packages
- undo-tree
- magit
- helm
- projectile
- company-box


-- Where the magic happens
- kotlin-language-server
- kotlin-debug-adapter
```

# kotlin-language-server(LSP)

https://github.com/fwcd/kotlin-language-server

- 이게 젤 유명한거 같은데 Jetbrain에서 상업화때문에 거의 방치 모드 되었음. ㅠㅠ 역시 돈......

<hr>

# Kotlin-eclipse 

- Kotlin Plugin for Eclipse

  - https://github.com/Kotlin/kotlin-eclipse

https://kotlinlang.org/

<hr>

# Eclipse(이클립스에서 코틀린 실행하기)

https://wickedmagica.tistory.com/224

<hr>

#  Kotlin Course - Tutorial for Beginners(2hr 30min) | freeCodeCamp.org

https://youtu.be/F9UC9DY-vIU?si=2xxJPtOlGJWfBetN


# Learn Kotlin Programming – Full Course for Beginners(13hr)

https://youtu.be/EExSSotojVI

<br>

# The Kotlin Programming Language Course for Beginners

https://youtube.com/playlist?list=PLVUm4IewkTXqwzuRXZisWg7shMTiQhUtz

# Kotlin For Java Developers Complete Course | Nerd's lesson

https://youtu.be/dMyRywABp_c?si=1oKN6QCXB0voWiKa

<br>

# Kotlin Course for Beginners and Java Devs

https://youtube.com/playlist?list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2


# Kotlin Crash Course for Java Developers

https://youtu.be/pXdY1B-KVJg?si=kFAChRvqETjXnpgo

<hr>

# Kotlin_Lang

- Create and run an application﻿
  Create a simple application in Kotlin that displays "Hello, World!". In your favorite editor, create a new file called hello.kt with the following lines:

```
fun main() {
    println("Hello, World!")
}
```

- 2. Compile the application using the Kotlin compiler:

```
kotlinc hello.kt -include-runtime -d hello.jar

```

The -d option indicates the output path for generated class files, which may be either a directory or a .jar file. The -include-runtime option makes the resulting .jar file self-contained and runnable by including the Kotlin runtime library in it.

- To see all available options, run

```
kotlinc -help
```

- Run the application.

```
java -jar hello.jar
```

https://kotlinlang.org/docs/command-line.html#create-and-run-an-application

<br>

<hr>

# Kotlinlang.org/Docs

https://kotlinlang.org/docs/home.html

<hr>

<br>

# Kotlin Playground

https://play.kotlinlang.org/#eyJ2ZXJzaW9uIjoiMS43LjIxIiwicGxhdGZvcm0iOiJqYXZhIiwiYXJncyI6IiIsIm5vbmVNYXJrZXJzIjp0cnVlLCJ0aGVtZSI6ImlkZWEiLCJjb2RlIjoiLyoqXG4gKiBZb3UgY2FuIGVkaXQsIHJ1biwgYW5kIHNoYXJlIHRoaXMgY29kZS5cbiAqIHBsYXkua290bGlubGFuZy5vcmdcbiAqL1xuZnVuIG1haW4oKSB7XG4gICAgcHJpbnRsbihcIkhlbGxvLCB3b3JsZCEhIVwiKVxufSJ9

<br>

<hr>

# Kotlin command-line

https://kotlinlang.org/docs/command-line.html

<br>

<hr>

# Java SE Development Kit 19.0.1 downloads.

https://www.oracle.com/java/technologies/downloads/#jdk19-windows

<br>

<hr>

<a href="https://youtu.be/Wtr_DD-1w8Q"><img align="left" alt="cabon2" width="226px" src="https://user-images.githubusercontent.com/67513038/207222059-7b8acdae-a68a-4c4f-ab32-7491d278d7f9.jpeg"></a>

# Carbon Language(C++ 다음 버젼)

https://youtu.be/Wtr_DD-1w8Q

<br>

<hr>

# 모든 언어를 무료로 공부할 수 있다.

출처 : stackoverflow.com 알게 된 링크

역시 갓 스택 오버플로우

https://stackoverflow.com/questions/38683512/why-git-shallow-clone-can-have-more-commits-than-depth/38683775#38683775

Github 주소
https://github.com/EbookFoundation/free-programming-books

EbookFoundation
https://ebookfoundation.github.io/free-programming-books/

<br>

<hr>
