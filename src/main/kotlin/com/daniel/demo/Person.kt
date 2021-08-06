package com.daniel.demo

@Deprecated("Use the Animal class in Java instead", ReplaceWith("Animal"))
class Person internal constructor(var firstName: String, var lastName:String){
    init {
        println("Creating a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String) :
            this(firstName, lastName) {
                println("second constructor")
            }

}

//class Person (firstName: String, lastName:String){
//    init {
//        println("Creating a person named $firstName $lastName")
//    }
//
//}

//class Person constructor(firstName: String, lastName:String){
//
//}

fun main() {
    val me = Person("Daniel", "Young");
    val you = Person("Daniel", "Young", "Yang")

}