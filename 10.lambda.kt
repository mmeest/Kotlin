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