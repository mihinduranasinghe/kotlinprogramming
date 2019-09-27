package com.conditions
// when as expression.
//this is like switch statement in java
fun main(args: Array<String>):Unit{
    var x:Int = 5;

    when(x){
        2-> println("X is : $x");
        3-> println("X is : $x");
        4-> println("X is : $x");
        5-> println("X is : 5");
        6-> println("X is : $x");
        7->{
            //multiple lines
        }

        8,9->{
            //if x is 8 or 9 this part will be executed
        }
        9..20->{
            //if x between 9 and 20
        }
        !in 20..30->{
            //not in between 20-30
        }
        else-> print("This is the default part");
        /*
        else->{
            //multiple lines

        }
        */
    }
}