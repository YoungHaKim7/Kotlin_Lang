# Result

- Map

```
kotlinc src/Main.kt -include-runtime -d out/Main.jar && java -jar out/Main.jar
src\Main.kt:1:10: warning: parameter 'args' is never used
fun main(args: Array<String>) {
         ^
Maria  
```

