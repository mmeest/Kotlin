

<img src="kotlin.jpg">

# Kotlin
Kotlin programming language

## Kotlin language support for VSCode
https://github.com/mathiasfrohlich/vscode-kotlin
**Kotlin language** by mathiasfrohlich

## Code Runner for running different code snippets on VSCode
**Code Runner** by Jun Han

**Features**
* Run code file of current active Text Editor
* Run code file through context menu of file explorer
* Run selected code snippet in Text Editor
* Run code per Shebang
* Run code per filename glob
* Run custom command
* Stop code running
* View output in Output Window
* Set default language to run
* Select language to run
* Support REPL by running code in Integrated Terminal

**Usages**
To run code: \
use shortcut Ctrl+Alt+N \
or press F1 and then select/type Run Code, \
or right click the Text Editor and then click Run Code in editor context menu \
or click Run Code button in editor title menu \
or click Run Code button in context menu of file explorer \
**To stop the running code:**
use shortcut Ctrl+Alt+M \
or press F1 and then select/type Stop Code Run \
or right click the Output Channel and then click Stop Code Run in context menu \

**Pre configured languages on Code Runner**
```
{
    "code-runner.executorMap": {
        "javascript": "node",
        "php": "C:\\php\\php.exe",
        "python": "python",
        "perl": "perl",
        "ruby": "C:\\Ruby23-x64\\bin\\ruby.exe",
        "go": "go run",
        "html": "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"",
        "java": "cd $dir && javac $fileName && java $fileNameWithoutExt",
        "c": "cd $dir && gcc $fileName -o $fileNameWithoutExt && $dir$fileNameWithoutExt"
    }
}
```

**To configure Kotlin in Code Runner**
https://kotlinlang.org/docs/tutorials/command-line.html
1. Download Kotlin compiler from: \
https://github.com/JetBrains/kotlin/releases/download/v1.2.21/kotlin-compiler-1.2.21.zip
2. Extract the contents of zip file into *c:/Program Files/kotlinc/*
3. Copy path: *c:/Program Files/kotlinc/bin* to System Environment Variables PATH: \
4. Before running Kotlin, VSCode needs restart

## Hello World
1. Create new file named 'helloworld.kt'
2. Copy next code to it:
```
fun main(args: Array<String>){
    println("Hello World")
}
```
3. Rightclick and select 'Run code'

## Variables
https://kotlinlang.org/docs/tutorials/kotlin-for-py/declaring-variables.html
**var** \
For declaring variables without type:
```
var number = 42
var message = "Hello"
```
Variable types: \
https://kotlinlang.org/docs/reference/basic-types.html \
* Numbers

| Type  |	Size (bits)   |	Min value                         |	Max value                           |
|-------|---------------|-----------------------------------|-------------------------------------|
| Byte  |	8             |	-128                              |	127                                 |
| Short |	16            | -32768                            |	32767                               |
| Int   |	32            | -2,147,483,648 (-231)             | 2,147,483,647 (231 - 1)             |
| Long  | 64            | -9,223,372,036,854,775,808 (-263) | 9,223,372,036,854,775,807 (263 - 1) |

* Floating point numbers

| Type   | Size (bits) | Significant bits | Exponent bits | Decimal digits |
|--------|-------------|------------------|---------------|----------------|
| Float  | 32          | 24               | 8             | 6-7            |
| Double | 64          | 53               | 11            | 15-16          |

* Booleans

**True** and **False**

* Strings

**String**


Declaring variables with type:
```
var number : Int = 42
var message : String = "Hello"
```

**val** - for declaring variables with type:
```
val firstName : String = "John"

val x: String
x = 3
```




