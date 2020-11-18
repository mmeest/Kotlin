

<p align="center"><img src="kotlin.jpg"></p>

<h1 align="center">
    Kotlin
</h1>

<h3 align="center">  
    <a target="_blank" href="https://developer.android.com/kotlin">Kotlin</a>
	<span> · </span>
	<a target="_blank" href="https://play.kotlinlang.org/">Kotlin Playground - write code online</a>
	<span> · </span>
	<a target="_blank" href="https://www.w3adda.com/kotlin-tutorial">w3adda - Kotlin tutorial</a>
</h3>


# Kotlin
Kotlin programming language

## Contents

- [Kotlin Playground](#kotlin-playground)
- [Kotlin language support for VSCode](#kotlin-language-support-for-vscode)
- [Code Runner for running different code snippets on VSCode](#code-runner-for-running-different-code-snippets-on-vscode)
- [Comments](#comments)
- [Hello World](#hello-world)
- [Variables](#variables)
- [NULL safety](#null-safety)
- [If/Else](#if-else)
- [When](#when)
- [Conditional value assigning to variable](#conditional-value-assigning-to-variable)
- [If Else When as Expression](#if-else-when-as-expression)
- [Arrays](#arrays)
- [Lists](#lists)
- [Loops](#loops)
- [Functions](#functions)
- [Classes](#classes)
- [Lambda](#lambda)

## Kotlin Playground
**For writing and testing Kotlin code online:** \
https://play.kotlinlang.org/

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

## Comments
// this is one line comment

/* this
is 
multiline
comment */

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
**var** - changeable variable
```
var number = 42
var message = "Hello"
var name: String = null
```

**val** - not changeable variable
```
val firstName : String = "John"
val x: String = "Hello"

x = 3
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

**+** - for concatenating strings
**$** - for inserting variables into string

* Sample code:
```
val firstName : String = "John"     // val cannot be reasigned 
var lastName : String = "Doe"       // var can be reasigned

fun main(args: Array<String>){
    lastName = "Scott"              // assigning new value to 'lastName' -

    println(firstName)
    println(lastName)

    println(firstName + " " + lastName)   // '+' for concatenating strings

    println("Hello " + firstName)           // concatenating string and variable 
                                            // are not reccomanded in Kotlin
    println("Hello $firstName $lastName")   // right way to concatenate string and variable
}
```

## NULL safety
https://kotlinlang.org/docs/reference/null-safety.html

By default all variables in Kotlin are Not NULL \
**?** - operator to make variable nullable. For example:
```
val firstName : String? = null
```

**!!** - not-null assertion operator converts any value to a non-null type and throws an exception if the value is null.

## If Else
https://kotlinlang.org/docs/tutorials/kotlin-for-py/conditionals.html

In Kotlin there are 3 if/else conditions:
* **if**
* **else if**
* **else**

Code example:
```
var firstName : String? = null
val age = 19

fun main(args: Array<String>){
    if(firstName != null)
        println("Hello $firstName")     // nothing will be printed because firstName equals null

    firstName = "John"

    if(firstName != null)
        println("Hello $firstName")     // output: Hello John


    if(age >= 18){                      // condition if age is equal or greater than 18
        print("Welcome $firstName")
    }else{
        print("You are not allowed to enter.")
    }
}
```

## When
https://kotlinlang.org/docs/reference/control-flow.html

**when** - is used if there are more than one condition to check \
It is alternative version for Java switch statements.

In Kotlin, if is an expression, i.e. it returns a value. Therefore there is no ternary operator (condition ? then : else), because ordinary if works fine in this role.
```
// Traditional usage 
var max = a 
if (a < b) max = b

// With else 
var max: Int
if (a > b) {
    max = a
} else {
    max = b
}
 
// As expression 
val max = if (a > b) a else b
```

Example code:
```
fun main(args: Array<String>){
    val userType = "admin"

    when(userType){
        "admin" -> {
            println("Hello Admin")
        }
        "editor" -> {
            println("Hello Editor")
        }
        "author" -> {
            println("Hello Author")
        }
        else -> {
            println("Hello Subscriber")
        }
    }
}
```

## Conditional value assigning to variable
With **if** condition:
```
    var greeting: String? = null
    val greetingToPrint = if(greeting != null) greeting else "Hi"
```

Wit **When** condition:
```
    var greeting: String? = null
    val greetingToPrint = when(greeting){
        null -> "Hi"
        else -> greeting
    }
```

## If Else When as Expression
https://kotlinlang.org/docs/reference/control-flow.html

Example code:
```
fun main(args: Array<String>){
    val a = 10
    val b = 20

    val c = if(a > b) a else b      // condition will set max value to c

    val userType = "admin"
    val result = when(userType){
        "admin" -> "User is Admin"
        "editor" -> "User is Editor"
        "author" -> "User is Author"
        else -> "User is Subscriber"
    }

    println(c)                      // printout: 20
    println(result)                 // printout: User is Admin
}
```

## Arrays
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/

Defining an Array in Kotlin: \
**val interestingThings = arrayOf("Kotlin", "Programming", "Books")** \
interestingThings.size          \\ Size of Array \
interestingThings[0]            \\ accessing element in an Array \
interestingThings.get(0)        \\ accessing element in an Array

iterating thru Array: \
for(interestingThing in interestingThings){ \
        println(interestingThing) \
}

**forEach** - Kotlin function for iterating thru Arrays \
**it** - default name for elements in ana Array in Kotlin \
iterating thur Array with **forEach** \
interestingThings.forEach{ \
        println(it) \
}

Using custom element name 'interestingThing' for forEach in Kotlin \
interestingThings.forEach{ interestingThing -> \
        println(interestingThing) \
}

Iterating thru Array with item and index: \
interestingThings.forEachIndexed{index, interestingThing -> \
        println("$interestingThing is at index $index") \
}

Code example:
```
fun main(args: Array<String>){
    val a : Array<Int> = arrayOf(2, 3, 4, 5)    // creating array
    a[2]                                        // accessing third element of array
    println(a[2])                               // printout: 4
    
    val x = Array(5){ 0 }   // 5 - num. of elements in array; 0 - initializer, all elements will be 0
    for (element in x) {
        println(element)    // print all elements in x array
    }
}
```

## Lists

**Defyin a List:** \
val interestingThings = listOf("Kotlin", "Programming", "Books")

**Accessing element in a list**
* interestingThings[0] \
or \
* interestingThings.get(0)

## Loops
https://kotlinlang.org/docs/tutorials/kotlin-for-py/loops.html

* **For loop**
```
val names = listOf("Anne", "Peter", "Jeff")
for (name in names) {
    println(name)
}
```

* **While loop**
```
var x = 0
while (x < 10) {
    println(x)
    x++ // Same as x += 1
}
```

Code example:
```
fun main(args: Array<String>){
    val a : Array<Int> = arrayOf(2, 3, 4, 5)    // creating array

    for(x in 1..10){        // for loop
        print("$x ")        // printout: 1 2 3 4 5 6 7 8 9 10
    }
    
    var i = 1

    while(i <= 10){         // while loop
        print("$i ")
        i += 2              // printout odd numbers: 1 3 5 7 9
    }

    do {                    // do whilw loop will get executed atleast once
        print("$i ")
        i += 2
    } while (i <= 10)       // printout odd numbers: 1 3 5 7 9

    for(y in a.indices){
        print(a[y])       // printout: 2 3 4 5
    }
}
```

## Functions
https://kotlinlang.org/docs/tutorials/kotlin-for-py/functions.html

**fun** - keyword to declare function \
**Unit** - no return type for function

Functions are declared with the fun keyword. For the parameters, you must declare not only their names, but also their types, and you must declare the type of the value the function is intending to return. The body of the function is usually a block, which is enclosed in curly braces:

```
fun happyBirthday(name: String, age: Int): String {
    return "Happy ${age}th birthday, $name!"
}
```

Code example:
```
fun rollDice(){
    val result = (1..6).random()    // get random value from range of 1-6
    println(result)
}

fun rollDiceTwo(times: Int, range: IntRange){
    for(i in 0 until times){
        val result = range.random()
        println(result)
    }
}

fun main(args: Array<String>){
    rollDice()                      // calling rollDice function
    rollDice()

    rollDiceTwo(4, (1..10))         // calling rollDiceTwo function with values
}
```

Code example:
```
// function with returntype 'String'
fun getGreeting(): String{
    return "Hello Kotlin"
}

// Single Expression Function
// string literal with only one return elemnt
// same function as above
fun getGreetingTwo(): String = "Hello Kotlin2"

// Yet more simple way for single expression function
// without any returntype
// same function as above
fun getGreetingThree() = "Hello Kotlin3"

// 'Unit' returns nothing useful
fun sayHello(): Unit{
    println(getGreetingTwo())
}

// Function without 'Unit' and returntype
// Same as previous function
fun sayHelloTwo() {
    println(getGreetingThree())
}

// Main function without returntype
fun main(args: Array<String>){
    println("Hello World")
    println(getGreeting())
    sayHello()
    sayHelloTwo()
}
```
**Output:** 
```
Hello World
Hello Kotlin
Hello Kotlin2
Hello Kotlin3
```

**Function Parameters**

Code example:
```
// function parameters
fun sayHello(itemToGreet:String){
    val msg = "Hello " + itemToGreet
    println(msg)
}

// $ - using variable in string
// same function as above
fun sayHelloTwo(itemToGreet:String){
    val msg = "Hello Two $itemToGreet"
    println(msg)
}

// Single expression function
// same function as above
fun sayHelloThree(itemToGreet:String) = println("Hello $itemToGreet")

// function with two parameters
fun sayHelloFour(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main(args: Array<String>){
    var greeting = "Kotlin"
    sayHello(greeting)
    sayHello("Kotlin")
    sayHelloTwo("World")
    sayHelloThree("Universe")
    sayHelloFour("Hey", "Kotlin")
}
```
Output:
```
Hello Kotlin
Hello Kotlin
Hello Two World
Hello Universe
Hey Kotlin
```

## Classes
https://kotlinlang.org/docs/tutorials/kotlin-for-py/classes.html \
https://kotlinlang.org/docs/reference/classes.html \
**class** - keyword for creating class \
**init** - keyword for initilizing properties in a class

* 1. Creating a class:
```
class Person
```
* 2. Creating instanceo of a class:
```
val person = Person()
```
* 3. Adding constructor to a class:
```
class Person constructor()
```
* 4. Constructor can be added with only parenthesis '()', without 'constructor' keyword:
```
class Person()
```
* 5. Defining parameters in a constructor:
```
class Person(_firstName: String, _lastName: String)
```
* 6. Initializing parameters in a class:
```
class Person(_firstName: String, _lastName: String){
    val firstName: String
    val lastName: String
    
    init{
        firstName = _firstName
        lastName = _lastName
    }
}

OR

class Person(_firstName: String, _lastName: String){
    val firstName: String = _firstName
    val lastName: String = _lastName
}
```

## Lambda
https://kotlinlang.org/docs/reference/lambdas.html

Code example:
```
// Unit meaning that current function does not have return type
fun rollDice(range: IntRange, time: Int, callback: () -> Unit){
    for(i in 0 until time){
        val result = range.random()
        callback(result)
    }
}

fun main(args: Array<String>){
    rollDice(1..6, 4, { result ->
        println(result)
    })   
}
```
