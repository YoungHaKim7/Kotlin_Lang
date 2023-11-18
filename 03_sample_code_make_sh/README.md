# make sample

- ```make``` or ```make run```

- ```Makefile``` 예시
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

init:
		mkdir src
		echo "fun main() {" >> src/Main.kt
		echo "	  println(\"Hello, World! Kotlin lang\" >> src/Main.kt
		echo "}" >> src/Main.kt

init2:
		mkdir src
		echo "fun main(args : Array<String>) {" >> src/Main.kt
		echo "	  println(\"Hello, World! Kotlin lang\" >> src/Main.kt
		echo "}" >> src/Main.kt
```

- ```make clean```
  - 삭제 되게 세팅 

# VSCode debugging

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