KC = kotlinc
JAVA = java

SOURCE_KT = ./src/demo_inheritance/Main.kt
TEST_SOURCE_KT = /junit-platform-console-standalone-1.9.3.jar
LINK_OBJ = ./src/demo_inheritance/Animal.kt ./src/demo_inheritance/Dog.kt

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
