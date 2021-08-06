package com.daniel.demo

object MySingleton {
    var temperatures = arrayOf(80, 76, 90)
    fun getLastTemperature() = temperatures.last()
}

fun main() {
    val location = object {
        var xPosition = 200
        var yPosition = 400

        fun printIt() {
            println("Position = (${xPosition}, ${yPosition})")
        }

    }

    println("Position = (${location.xPosition}, ${location.yPosition})")
    location.printIt()

    location.xPosition = 2000
    location.yPosition = 4000
    location.printIt()

    val temperature = MySingleton.getLastTemperature()
    println("Last reading = $temperature degrees")

}