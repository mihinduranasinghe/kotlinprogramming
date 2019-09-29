

@file:JvmName("mycusomkotlinfile2")
//saving this to use in future
package com.functions
//Functions as exressions


fun main(args: Array<String>):Unit{
    println("Max Value is: ${sumval(50,60)}");

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

//setting default values and use it by java file
@JvmOverloads
fun sumval(a:Int,b:Int,c:Int=10):Int {
    return a+b+c;
}