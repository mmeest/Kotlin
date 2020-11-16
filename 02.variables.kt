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