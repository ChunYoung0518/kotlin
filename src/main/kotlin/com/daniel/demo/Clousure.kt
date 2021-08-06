package com.daniel.demo

fun closureMaker(): () -> Unit{
    var num = 0
    return {
        println(num++)
    }
}

fun main() {
    val myCounter1 = closureMaker()
    val myCounter2 = closureMaker()

    println()

    myCounter1()
    myCounter1()
    myCounter1()
    myCounter1()

    println()

    myCounter2()
    myCounter2()

    println()

    myCounter1()
}