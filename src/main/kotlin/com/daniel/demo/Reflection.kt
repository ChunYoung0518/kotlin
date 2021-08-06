package com.daniel.demo

fun main() {
    val Joe = Person("Joe", "Smith")
    val kClass = Joe.javaClass.kotlin
    println("Simple name = ${kClass.simpleName}")

    for(name in kClass.members){
        println("Property name = $name")
    }

    println()

    for(name in kClass.members){
        println("Property name = ${name.name}")
    }
}