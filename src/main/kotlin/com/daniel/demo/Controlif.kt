package com.daniel.demo

fun main() {
    //control flow, also an expression not only statement

    // int lowest = (a < b) ? a : b


    var myInt = 999
    val anInt: Int = 1


    val lowest = if(myInt < anInt) myInt else anInt
    println("lowest value is $lowest")

    val temp = 80
    val isAirCOnditionOn = if(temp >= 80){
        println("It is warm")
        true
    } else {
        println("It is not so warm")
        false
    }
    println("Is the air conditioner on: $isAirCOnditionOn")


}
