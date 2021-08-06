package com.daniel.demo

fun main() {
    // while
    var x = 0
    while(x < 10) {
        println(x)
        x += 3
    }

    //do while
    do{
        println("x = $x")
        x -= 3
    } while (x > 0)

    //for
    for(item in 1..10) {
//        item ++
        print("$item, ")
    }

    println()
    for(ch in "biscuit") {
        println(ch)
    }

    var index = 0;
    for(item in 10.rangeTo(20).step(2)){
        print("${++index} $item, ")
    }
    println()

    for((index, item) in 10.rangeTo(20).step(2).withIndex()) {
        print("${index + 1} $item, ")
    }
    println()

    val myArray = arrayOf(10, 20, 30, 40, 50)
    for(item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
    println()

}