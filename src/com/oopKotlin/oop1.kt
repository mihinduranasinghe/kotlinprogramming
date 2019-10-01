package com.oopKotlin

fun main(args:Array<String>):Unit{
    var student = Student("Mihindu")

}


/*
fun main(args:Array<String>):Unit{
    var student = Student()
    student.name="Mihindu"
    //println("My name is ${student.name}")
    //init is executed right after this

}

class Student{
    var name:String=""

    init {
        println("My name is ${name}")

    }
*/


//defining primary constructor


/*
class Student constructor(name:String){//name parameter(primary)
    var name:String=""  //this.name

    init {
        this.name=name
        println("My name is ${name}")

    }

}
*/

class Student constructor(var name:String){//name parameter(primary)


    //  var name:String=""  //this.name

    init {
        //this.name=name
        println("My name is ${name}")

    }

}