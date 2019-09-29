package com.looping

fun main(args: Array<String>):Unit{
    for (i in 1..10){
        println(i);
        if (i==5)
            break;
    }


    for(i in 1..10){
        if (i==5)
            continue

        println(i)
    }

    for(i in 1..10){
        if (i%2==0)
            continue

        println(i)
    }
}