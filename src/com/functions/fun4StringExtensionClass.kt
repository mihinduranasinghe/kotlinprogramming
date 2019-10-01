package com.functions

fun main(args: Array<String>):Unit{
    var str1:String="Mihindu "
    var str2:String =  "Pramantha "
    var str3:String =  "Ranasinghe "

    var fullname= str3.add(str1,str2)
    println(fullname)



    var num1:Int=5;
    var num2:Int=25;

    val greaterValue= num1.greaterVal(num2)
    println("Max value is ${greaterValue}")



}

fun String.add(s1:String,s2:String):String{
    return this + s1+s2

}

//num1 allocate to "this"
fun Int.greaterVal(other:Int):Int{
    if (this>other)
        return this

    else
        return other

}