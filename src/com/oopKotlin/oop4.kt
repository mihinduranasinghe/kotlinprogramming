package com.oopKotlin

fun main(args: Array<String>):Unit{
    var dog = Dog("Black","Rottweiler")
}

/*
open class Animal(color: String){//super class
    init {
      println("From Animal init: $color ")
    }
}

class Dog(var color:String , var breed:String) : Animal(color){//derived class
    init {
        println("From dog init: $color and $breed")
    }
}

 */

open class Animal{//super class
    var color: String=""
    constructor(color: String){
        this.color=color
        println("From Animal init: $color")
    }

}

class Dog: Animal{//derived class
    var breed : String=""
    constructor(color:String , breed:String):super(color){//calling super constructor in secondary constructor
        this.breed=breed
        println("From dog init: $color and $breed")
    }
}