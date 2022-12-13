# Result:

```

PS D:\hello_kotlin> kotlinc .\hello.kt

NOTE: you are running "kotlinc" CLI tool from Kotlin/Native distribution,
it runs Kotlin/Native compiler that produces native binaries from Kotlin code.
If your intention was to compile Kotlin code to JVM bytecode instead, then you
need to use "kotlinc" from the main Kotlin distribution (e.g. it can be
downloaded as kotlin-compiler-X.Y.ZZ.zip archive from
https://github.com/JetBrains/kotlin/releases/latest, or installed using various
package managers).

WARNING: if your intention was to run Kotlin/Native compiler, then please use
"kotlinc-native" CLI tool instead of "kotlinc". "kotlinc" tool will be removed
from Kotlin/Native distribution, so it will stop clashing with "kotlinc" from
the main Kotlin distribution.

Downloading native dependencies (LLVM, sysroot etc). This is a one-time action performed only on the first run of the compiler.

(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-2-windows.zip (0/54796930).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-2-windows.zip (452074/54796930).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-2-windows.zip (6164182/54796930).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-2-windows.zip (17449462/54796930).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-2-windows.zip (28898319/54796930).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-2-windows.zip (40489329/54796930).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-2-windows.zip (51871564/54796930).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lldb-2-windows.zip (54796930/54796930). Done.
Extracting dependency: C:\Users\user\.konan\cache\lldb-2-windows.zip into C:\Users\user\.konan\dependencies

(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (0/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (50628/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (103876/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (190916/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (330180/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (626116/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (1078724/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (1740228/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (2941380/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (4438468/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (6864673/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (9701828/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (13286332/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (18638419/22630140).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/lld-12.0.1-windows-x64.zip (22630140/22630140). Done.
Extracting dependency: C:\Users\user\.konan\cache\lld-12.0.1-windows-x64.zip into C:\Users\user\.konan\dependencies

(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (0/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (460225/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (5936723/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (17225299/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (28393209/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (39678613/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (50618226/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (61710194/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (73139641/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (84411561/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (95700639/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (107046329/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (118220217/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (129574329/135111082).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/msys2-mingw-w64-x86_64-2.zip (135111082/135111082). Done.
Extracting dependency: C:\Users\user\.konan\cache\msys2-mingw-w64-x86_64-2.zip into C:\Users\user\.konan\dependencies

(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (0/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (452034/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (5758780/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (17753443/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (29615459/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (41346900/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (53176148/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (65149539/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (77482637/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (89325865/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (101187881/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (113168611/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (125160031/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (136983189/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (148991611/156381420).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/llvm-11.1.0-windows-x64-essentials.zip (156381420/156381420). Done.
Extracting dependency: C:\Users\user\.konan\cache\llvm-11.1.0-windows-x64-essentials.zip into C:\Users\user\.konan\dependencies

(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/libffi-3.3-windows-x64-1.zip (0/111136).
(KonanProperies) Downloading dependency: https://download.jetbrains.com/kotlin/native/libffi-3.3-windows-x64-1.zip (111136/111136). Done.
Extracting dependency: C:\Users\user\.konan\cache\libffi-3.3-windows-x64-1.zip into C:\Users\user\.konan\dependencies


PS D:\hello_kotlin> kotlinc .\hello.kt -include-runtime -d hello.jar

NOTE: you are running "kotlinc" CLI tool from Kotlin/Native distribution,
it runs Kotlin/Native compiler that produces native binaries from Kotlin code.
If your intention was to compile Kotlin code to JVM bytecode instead, then you
need to use "kotlinc" from the main Kotlin distribution (e.g. it can be
downloaded as kotlin-compiler-X.Y.ZZ.zip archive from
https://github.com/JetBrains/kotlin/releases/latest, or installed using various
package managers).

WARNING: if your intention was to run Kotlin/Native compiler, then please use
"kotlinc-native" CLI tool instead of "kotlinc". "kotlinc" tool will be removed
from Kotlin/Native distribution, so it will stop clashing with "kotlinc" from
the main Kotlin distribution.

error: invalid argument: -include-runtime
info: use -help for more information

PS D:\hello_kotlin> ls

    Directory: D:\hello_kotlin

Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
-a---        2022-12-13 오전 11:59              0 build.sh
-a---        2022-12-13 오전 11:59             58 hello.kt
-a---        2022-12-13 오후 12:02        1056256 program.exe

PS D:\hello_kotlin> .\program.exe
Hello, World! Ktlin lang


```