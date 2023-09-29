<img width=150px src="https://github.com/YoungHaKim7/Cpp_Training/assets/67513038/70b5096e-e16f-48fa-b7c8-0aa776deacee"/>

<hr>

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
sdk use                                                                                                                      ─╯

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
