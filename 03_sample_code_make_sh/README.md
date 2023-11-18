# make sample

- ```make``` or ```make run```

```Makefile
r:
		kotlinc src/Main.kt -include-runtime -d out/Main.jar
		java -jar out/Main.jar
t:
		kotlinc src/Main.kt -include-runtime -d out/Main.jar
		java -jar ./junit-platform-console-standalone-1.9.3.jar --scan-class-path

d:
		wget https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.3/junit-platform-console-standalone-1.9.3.jar

clean:
		rm -rf out *.jar
```

- ```make clean```
  - 삭제 되게 세팅 
