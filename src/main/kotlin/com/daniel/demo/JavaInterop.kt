package com.daniel.demo

fun main () {
    val Frisky = Animal("Frisky", "cat", 10)
    println(Frisky.Show())

    println()

    val Fido = Animal("Fido", "dog", 30)
    println(Fido.Show())

    println()

    Frisky.weight = 15
    println(Frisky.Show())

    //not allowed to change val
//    Frisky.kind = "puma"
}