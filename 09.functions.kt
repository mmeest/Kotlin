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