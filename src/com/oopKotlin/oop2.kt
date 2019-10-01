package com.oopKotlin

//secondary constructors are also there in kotlin
fun main(args:Array<String>):Unit{
    var studnt =  Studnt("Mihindu",5)

    print("Your ID is : ${studnt.id}")
}
class Studnt(var name:String){
    init {
        println("My name is : ${name}")

    }

    //defining secondary constructor
    //this(fname) - calling primary constructor, it is expected
    //var,val types are not allowed in seconadary constructor
    // but you can declare it seperately with default value
    var id:Int=-1;
    constructor(fname: String, id:Int): this(fname){
        //the body of the secondary constructor is called after the init block
        this.id = id
    }

}