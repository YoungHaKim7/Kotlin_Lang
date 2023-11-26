# Result


```

$ kotlinc ./src/Main.kt  -include-runtime -d ./out/Main.jar

src/Main.kt:6:11: warning: variable 'l' initializer is redundant
  var l = 20L
          ^
src/Main.kt:12:7: warning: variable 'name' is never used
  var name : String = i.toString()
      ^
$ java -jar ./out/Main.jar


10
HELLO
hello
```
