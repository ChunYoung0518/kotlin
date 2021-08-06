package com.daniel.demo


fun main() {
    println("10 + 20 = ${myFunction2(10, 20)}")

    myDefaults(10, 20, )

    myDefaults(10, 20, "Hello")

    myDefaults(message = "Greetings")
}

fun myFunction(param1: Int, param2: Int) : Int {
    return param1 + param2
}

// expression function:
fun myFunction1 (param1: Int, param2: Int) : Int = param1 + param2


// do not have to assign return type
fun myFunction2 (param1: Int, param2: Int) = param1 + param2

// default parameters

fun myDefaults (param1: Int = 1, param2: Int =5, message : String = "Hi") : Int {
    val results = param1 + param2
    println(message)
    return results
}
