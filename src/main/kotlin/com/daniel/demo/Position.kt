package com.daniel.demo

data class Position(var x: Int, var y: Int) {
    operator fun plus(other: Position) : Position {
        return Position(x + other.x, y + other.y)
    }

    operator fun minus(other: Position) : Position {
        return Position(x-other.x, y-other.y)
    }

}