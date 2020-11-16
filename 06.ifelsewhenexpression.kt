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