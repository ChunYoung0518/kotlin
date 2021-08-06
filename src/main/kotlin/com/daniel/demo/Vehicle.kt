package com.daniel.demo

interface Vehicle {
    val MakeName: String

    fun go() {
        println("Vroom Vroom")
    }

    fun stop() {
        println("Screehing")
    }

    fun getMpg(): Int {
        return 50
    }

    fun getDoors() : Int
}