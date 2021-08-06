package com.daniel.demo

class Point(val x: Int, val y: Int, val z:Int) {
    operator fun component1(): Int = x
    operator fun component2(): Int = y
    operator fun component3(): Int = z
}

fun showComponents() {
    val myPoint = Point(5000, 500, 60000)
    val(myX, myY, myZ) = myPoint
    println("myX = ${myX}, myY = ${myY} , myZ = ${myZ}")
}

fun main() {

    val p1 = Position( 200, 100)

    val(xPosition, yPosition) = p1
    println("xPosition = $xPosition, yPosition = $yPosition")

    println("c1 = ${p1.component1()}")

    showComponents()
}