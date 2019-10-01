package com.oopKotlin

//Any
//equals()
//hashcode()
//tostring


//when we use data classes in kotlin, it creates a copy() method too
fun main (args: Array<String>):Unit{
    var user1 = User("Mihindu",22)
    var user2 = User("Mihindu",22)

    println(user1)//data will be displayed, defaultly it is toString

    if (user1 == user2)
        println("Equal")
    else
        println("Not equal")
    //result is not equal. because they are two different objects but same value
    //so that we need to use data pre keyword to the User class then it will be result  EQUAL
    //the purpose of data class is just to deal with data

    var newUser = user1.copy(); //this will create a copy of user 1 and assign it into newUser
    println(newUser)

    var newUser2 = user1.copy(name="Kasun"); //this will create a copy of user 1 and assign it into newUser2 with changing only the name
    println(newUser2)

}

data class User(var name:String, var id:Int){

}