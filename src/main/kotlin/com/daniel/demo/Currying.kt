package com.daniel.demo

import org.funktionale.currying.*


fun curryingFun() {
    val sum3inits = {x: Int, y: Int, z: Int -> x+y+z}
    val curried: (Int) -> (Int) -> (Int) -> Int = sum3inits.curried()
    val cur = curried(2)(4)(6)

    println("Currying(2)(4)(6) = $cur")
}

fun main() {
    curryingFun()
}