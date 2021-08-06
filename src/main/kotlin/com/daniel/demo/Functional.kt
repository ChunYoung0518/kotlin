package com.daniel.demo

import org.funktionale.collections.destructured

fun functional() {
    val (head, tail) = listOf(1, 2, 3).destructured()
    println("Head = $head and tail = $tail")
}

fun main() {
    functional()
}