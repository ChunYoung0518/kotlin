package com.daniel.demo

fun <T: Comparable<T>> max(param1: T, param2:T) : T {
    val results = param1.compareTo(param2)
    return if (results > 0) param1 else param2
}

//fun <T> max(param1: T, param2:T) : T {
//    val results = param1.compareTo(Param2)
//    return if (results > 0) param1 else param2
//}