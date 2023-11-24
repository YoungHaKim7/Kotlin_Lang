# Result

- mutableMapof

```
$ kotlinc src/Main.kt -include-runtime -d out/Main.jar && java -jar out/Main.jar
src\Main.kt:1:10: warning: parameter 'args' is never used
fun main(args: Array<String>) {
         ^
1 and Maria
2 and Alex
3 and John
  
```

- 오류 날줄 알았는데 만들어준다. ㅎㅎ 깡패네 ㅋㅋ

```
$ kotlinc src/Main.kt -include-runtime -d out/Main.jar && java -jar out/Main.jar
src\Main.kt:1:10: warning: parameter 'args' is never used
fun main(args: Array<String>) {
         ^
1 and Maria
2 and Alex
3 and John
5 and Vlad
  
```

- remove

```
$ kotlinc src/Main.kt -include-runtime -d out/Main.jar && java -jar out/Main.jar
src\Main.kt:1:10: warning: parameter 'args' is never used
fun main(args: Array<String>) {
         ^
1 and Maria
3 and John
5 and Vlad
PS D:\young_linu
  
```