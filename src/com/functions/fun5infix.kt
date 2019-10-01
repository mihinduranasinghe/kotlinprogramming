package com.functions

//All infix functions are extension functions
//But Not all extension functions are infix functions
//imfix functions just have one parameter


fun main(args: Array<String>):Unit{




    var num1:Int=5;
    var num2:Int=25;

    //val greaterValue= num1.greaterVall(num2)
    val greaterValue= num1 greaterVall num2 //num1.greaterVall(num2) EASIER TO READ WHEN USING INFIX FUNCTION
    println("Max value is ${greaterValue}")



}



//num1 allocate to "this"
infix fun Int.greaterVall(other:Int):Int{
    if (this>other)
        return this

    else
        return other

}