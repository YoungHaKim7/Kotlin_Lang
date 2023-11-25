KC = kotlinc
JAVA = java

SOURCE_KT = ./src/demo_inheritance/Main.kt
TEST_SOURCE_KT = /junit-platform-console-standalone-1.9.3.jar
LINK_OBJ = ./src/demo_inheritance/Animal/Animal.kt \
./src/demo_inheritance/Animal/Cat.kt \
./src/demo_inheritance/Animal/Dog.kt

TARGET = ./out/Main.jar
LDFLAGS_COMMON = -include-runtime

r:
		rm -rf out
		$(KC) $(SOURCE_KT) $(LINK_OBJ) $(LDFLAGS_COMMON) -d $(TARGET)
		$(JAVA) -jar $(TARGET)
t:
		rm -rf out
		$(KC) $(SOURCE_KT) $(LINK_OBJ) $(LDFLAGS_COMMON) -d $(TARGET)
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
