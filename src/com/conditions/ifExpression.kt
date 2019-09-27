package com.conditions


//if expression

fun main(args: Array<String>):Unit{
    var a:Int=5;
    var b:Int=3;

    var maxVal:Int = if (a>b)
                        //if there are multiple lines, the last value will be returned
                        a;
                    else
                        b;
    print(maxVal)
}