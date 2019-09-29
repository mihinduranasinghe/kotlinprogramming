package com.looping

fun main(args: Array<String>):Unit{
    for(i in 1..10){
        println(i)
    }

    var m:Int = 1;
    while (m<=10){
        println(m);
        m++;
    }

    var n:Int = 1;
    do {
        println(n);
        n++;
    }while (n<=10);

}