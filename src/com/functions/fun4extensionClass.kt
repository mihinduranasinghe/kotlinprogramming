package com.functions

fun main(args:Array<String>):Unit{
    var student =  Student()
    println("Is pass?: ${student.isPass(55)}")
    println("Is Scholer?: ${student.isScholar(55)}")
}

class Student{
    fun isPass(marks:Int):Boolean{
        return marks>40
    }
    /*
    fun isScholar(marks: Int):Boolean{
        return marks>90
    }
    */

}

fun Student.isScholar(marks: Int):Boolean{
    return marks>90
}