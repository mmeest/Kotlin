var firstName : String? = null

fun main(args: Array<String>){

    println("Hello $firstName")             // output: Hello null
    println("Hello ${firstName.length}")
    println("Hello ${firstName?.length}")   // output: Hello null

    firstName = "John"
    println("Hello $firstName")             // output: Hello John
}