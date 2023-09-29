test:
		kotlinc src/Main.kt -include-runtime -d out/Main.jar
		java -jar ./junit-platform-console-standalone-1.9.3.jar --scan-class-path

clean:
		rm -rf out