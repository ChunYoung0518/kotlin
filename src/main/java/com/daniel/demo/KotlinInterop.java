package com.daniel.demo;

public class KotlinInterop {

    public static void main(String[] args) {
        System.out.println("Hello Java");

        Person Bob = new Person("Robert", "Smith");

        System.out.println("The new employee name is " + Bob.getFirstName() + " " + Bob.getLastName());

        Bob.setLastName("Young");

        System.out.println("The new employee name is " + Bob.getFirstName() + " " + Bob.getLastName());


    }
}
