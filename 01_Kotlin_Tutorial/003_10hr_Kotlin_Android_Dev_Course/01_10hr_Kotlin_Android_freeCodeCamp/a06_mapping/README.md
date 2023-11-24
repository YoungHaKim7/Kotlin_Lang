# Result

- mapKeys + mapValues

```
$ kotlinc src/Main.kt -include-runtime -d out/Main.jar && java -jar out/Main.jar

[10, 20, 300, 40, 50]
{KEY 1=1, KEY 2=2, KEY 3=3, KEY 4=4}
{key 1=6, key 2=7, key 3=8, key 4=9}  

```

- mapping01 ```println(numbers.map { it * 10})```

```
$ kotlinc src/Main.kt -include-runtime -d out/Main.jar && java -jar out/Main.jar

[10, 20, 30, 40, 50]
  
```

- ```println(numbers.map { if (it ==3) it * 100 else it * 10})```

```
$ kotlinc src/Main.kt -include-runtime -d out/Main.jar && java -jar out/Main.jar
[10, 20, 300, 40, 50]  
```
