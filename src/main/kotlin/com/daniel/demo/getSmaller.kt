package com.daniel.demo

fun <T:Comparable<T>> getSmaller(param1: T, param2: T) : T {
    val result = param1.compareTo(param2)
    return if(result < 0) param1 else param2
}

fun main () {
    val minInt : Int = getSmaller(42, 99)
    val minLong : Long = getSmaller( 123456L, 999999999999999L)
    val minByte : Byte = getSmaller((-128).toByte(), (127).toByte())
    val minString : String = getSmaller("Kitten", "Kittens")

    println("The min Int = ${minInt}")
    println("The min Long = ${minLong}")
    println("The min Byte = ${minByte}")
    println("The min String = ${minString}")
}