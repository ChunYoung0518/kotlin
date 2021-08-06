package com.daniel.demo

fun main(){
    for (index in 1..105) {
        print("$index ")
        when {
            index % 15 == 0 -> print("fizz buzz")
            index % 3 == 0 -> print("fizz")
            index % 5 == 0 -> print("buzz")
        }
        println()
    }
}
