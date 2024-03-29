package com.oopKotlin
/*
//INHERITANCE OOP
// for reusability and method overriding
//properties of a class in java PUBLIC, PRIVATE

//open keyword in KOTLIN
//INHERIT MEANS GETTING THE MOTHER/SUPER CLASS PROPERTIES TO CHILD CLASSES/DERIVED CLASSES
//SINGLE INHERITANCE/MULTILEVEL INHERITANCE/HIERACHIEAL INHERITANCE
//"Any" at the top in kotlin inheritance hierarchy
//"Any" contains equale(), hashcode(), toString() methods

fun main(args:Array<String>):Unit{
    var dog = Dog()
    dog.breed="Rottweiler"
    dog.color="Black"
    dog.bark()
    dog.eat()

    var cat =  Cat()
    cat.color="white"
    cat.age=3
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.eat()
    animal.color;



}

//public final class Animal{ //this is the default behavior in kotlin, so cannot inherit in default so make it as OPEN
open class Animal{
    var color:String=""

    fun eat(){
        println("eat")
    }
}

class Dog:Animal(){

    var breed:String=""
    fun bark() {
        println("Bark")
    }
}

open class Cat:Animal(){

    var age:Int=-1
    fun meow(){
        println("Meow")
    }

}

*/