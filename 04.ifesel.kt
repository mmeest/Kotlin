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