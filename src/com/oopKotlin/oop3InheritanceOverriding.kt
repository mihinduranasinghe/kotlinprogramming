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
    dog.eat()
    println(dog.color)


    var cat =  Cat()
    cat.eat()
    println(cat.color)






}

//public final class Animal{ //this is the default behavior in kotlin, so cannot inherit in default so make it as OPEN
open class Animal{
    open var color:String="Default Red"//open it for method overrifding, otherwise it is PUBLIC/FINAL

    open fun eat(){//open it for method overrifding, otherwise it is PUBLIC/FINAL
        println("Animal eating")
    }

}

class Dog:Animal(){
   // class Dog:Animal(),TestInterface {

    override var color:String="Black" //properti=y oerriding

    var breed:String=""
    fun bark() {
        println("Bark")
    }


    override fun eat(){//method overriding
        super.eat()
        println("Dog is eating")
    }
}

open class Cat:Animal(){

    override var color:String="White"
    var age:Int=-1
    fun meow(){
        println("Meow")
    }

    override fun eat(){
        println("Cat is eating")
    }

}

        */