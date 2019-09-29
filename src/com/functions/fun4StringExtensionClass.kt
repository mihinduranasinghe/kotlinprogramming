package com.functions

fun main(args: Array<String>):Unit{
    var str1:String="Mihindu "
    var str2:String =  "Pramantha "
    var str3:String =  "Ranasinghe "

    var fullname= str3.add(str1,str2)
    println(fullname)
}

fun String.add(s1:String,s2:String):String{
    return this + s1+s2

}