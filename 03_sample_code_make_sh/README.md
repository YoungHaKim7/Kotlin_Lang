# make sample

- ```make``` or ```make run```

```Makefile
run:
		kotlinc src/Main.kt -include-runtime -d out/Main.jar
		java -jar out/Main.jar
clean:
		rm -rf out  
```

- ```make clean```
  - 삭제 되게 세팅 
