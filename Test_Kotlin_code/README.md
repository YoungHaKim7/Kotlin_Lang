# Source 

https://kotlinlang.org/docs/jvm-test-using-junit.html#what-s-next

# Result Test


- https://stackoverflow.com/questions/52373469/how-to-launch-junit-5-platform-from-the-command-line-without-maven-gradle/52373592#52373592

- 테스트 설명서 https://junit.org/junit5/docs/current/user-guide/#running-tests-console-launcher

- junit-platform-console-standalone-1.9.3설치 파일 https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/

- Test Kotlin(macOS)

```
kotlinc src/Main.kt -include-runtime -d out/Main.jar

java -jar ./junit-platform-console-standalone-1.9.3.jar --scan-class-path


Thanks for using JUnit! Support its development at https://junit.org/sponsoring

╷
├─ JUnit Jupiter ✔
├─ JUnit Vintage ✔
└─ JUnit Platform Suite ✔

Test run finished after 18 ms
[         3 containers found      ]
[         0 containers skipped    ]
[         3 containers started    ]
[         0 containers aborted    ]
[         3 containers successful ]
[         0 containers failed     ]
[         0 tests found           ]
[         0 tests skipped         ]
[         0 tests started         ]
[         0 tests aborted         ]
[         0 tests successful      ]
[         0 tests failed          ]
  
```


- Test Kotlin(WindowsOS)

```
PS D:\Test_Kotlin_code> kotlinc .\src\Main.kt -include-runtime -d dist/Main.jar
PS D:\Test_Kotlin_code> java -jar .\junit-platform-console-standalone-1.9.3.jar --scan-class-path

Thanks for using JUnit! Support its development at https://junit.org/sponsoring

.
+-- JUnit Jupiter [OK]
+-- JUnit Vintage [OK]
'-- JUnit Platform Suite [OK]

Test run finished after 72 ms
[         3 containers found      ]
[         0 containers skipped    ]
[         3 containers started    ]
[         0 containers aborted    ]
[         3 containers successful ]
[         0 containers failed     ]
[         0 tests found           ]
[         0 tests skipped         ]
[         0 tests started         ]
[         0 tests aborted         ]
[         0 tests successful      ]
[         0 tests failed          ] 
  
```