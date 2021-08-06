package com.daniel.demo

import org.funktionale.partials.partially1
import org.funktionale.partials.partially3

fun partialFunction() {
    val prefixAndPostfix: (String, String, String) -> String =
        {prefix: String, x: String, postfix: String -> "${prefix}${x}${postfix}"}
    val prefixAndBang: (String, String) -> String = prefixAndPostfix.partially3("!")
    val hello: (String) -> String = prefixAndBang.partially1("Hello,")

    println(hello("Funktionale"))
}

fun main() {
    partialFunction()
}
