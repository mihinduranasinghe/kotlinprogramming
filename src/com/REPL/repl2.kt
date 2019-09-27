package com.REPL

fun main(args: Array<String>): Unit{
    var rect= Rectangle();
    rect.len=5;
    rect.bred=3;
    var ar:Int = rect.bred*rect.len;
    println("The area of given rectangle is: ${ar}");
}
class Rectangle {
    var len: Int=0;
    var bred: Int=0;

}