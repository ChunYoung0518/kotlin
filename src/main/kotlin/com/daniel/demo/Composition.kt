package com.daniel.demo

import org.funktionale.composition.compose
import org.funktionale.composition.forwardCompose

fun composedFunctional() {

    val add5 = {i: Int -> i + 5}
    val multiplyBy2 = {i : Int -> i*2}

    val multiplyBy2andAdd5 = add5 compose multiplyBy2
    val composeResult = multiplyBy2andAdd5(10)

    println("multiply by 2 and add 5 (10) = $composeResult")

    val add5AndMultiplyBy2 = add5 forwardCompose multiplyBy2
    val forwardComposeResults = add5AndMultiplyBy2(10)

    println("add 5 and multiply by 2 (10) = $forwardComposeResults")
}

fun main() {
    composedFunctional()
}
