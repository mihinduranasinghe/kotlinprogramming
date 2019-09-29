@file:JvmName("mycusomkotlinfile")
//saving this to use in future
package com.functions
//Functions as exressions


fun main(args: Array<String>):Unit{
    println("Max Value is: ${maxVal(50,60)}");

    println("Sum of java code function is: ${com.functions.fun2java.sumVall(56,20)}")
}
/*
fun maxVal(a:Int,b:Int):Int{
    if (a>b)
        return a
    else
        return b
}
 */
//fun maxVal(a:Int,b:Int):Int = if (a>b) a else b;
fun maxVal(a:Int,b:Int):Int = if (a>b) {//whatever you write at the end of the block will be returned
                                         a} else {b};