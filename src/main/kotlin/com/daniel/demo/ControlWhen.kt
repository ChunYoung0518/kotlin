package com.daniel.demo

fun main(){
    //similar to JAVA case

    val burgersOrdered = 9

    when(burgersOrdered) {
        0 -> println("Not hungry")
        1,2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> {
            println("Are you sure")
        }
    }

    when (burgersOrdered) {
        Math.abs(burgersOrdered) -> println("orderded 0 or more burgers")
        else -> {
            println("Ordered less than 0")
        }
    }

    when (burgersOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Get some orders")
        in 5..9 -> println("Business is up")
        else -> {
            println("Not sure")
        }
    }

    when {
        burgersOrdered <= 0 -> println("None ordered")
        burgersOrdered % 2 == 1 -> println("Odd number ordered")
        burgersOrdered % 2 == 0 -> println("Even number orderded")
    }

}