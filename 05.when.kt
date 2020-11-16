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