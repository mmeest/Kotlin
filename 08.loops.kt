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