# Result


```
$ kotlinc src/Main.kt -include-runtime -d out/Main.jar && java -jar out/Main.jar

src\Main.kt:1:10: warning: parameter 'args' is never used
fun main(args: Array<String>) {
         ^
Name 1
Name 2
Name 3
Name 4
  
```


- removeAt

```
$ kotlinc src/Main.kt -include-runtime -d out/Main.jar && java -jar out/Main.jar
src\Main.kt:1:10: warning: parameter 'args' is never used
fun main(args: Array<String>) {
         ^
Name 2
Name 3
Name 4  
  
```