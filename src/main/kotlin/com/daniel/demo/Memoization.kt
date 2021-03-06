package com.daniel.demo

import org.funktionale.memoization.memoize

fun memo() {
    var fibonacci: (Long) -> Long = {it }
    fibonacci = { n: Long ->
        if (n < 2) n else fibonacci(n-1) + fibonacci(n-2)
    }

    var m: (Long) -> Long ={it}
    m = {
        n: Long ->
        if(n< 2) n else m(n-1) + m(n-2)
    }.memoize()

    println("Calling fib: " + timeElapsed{fibonacci(40)} + " ms")


    println("Calling memoized version fib: " + timeElapsed{m(40)} + " ms")
}

fun timeElapsed(body: () -> Unit) : Long {
    val start = System.currentTimeMillis()
    body()
    val end = System.currentTimeMillis()
    return end - start
}

fun main() {
    memo()
}