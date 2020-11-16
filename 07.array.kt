fun main(args: Array<String>){
    val a : Array<Int> = arrayOf(2, 3, 4, 5)    // creating array
    a[2]                                        // accessing third element of array
    println(a[2])                               // printout: 4
    
    val x = Array(5){ 0 }   // 5 - num. of elements in array; 0 - initializer, all elements will be 0
    for (element in x) {
        println(element)    // print all elements in x array
    }
}