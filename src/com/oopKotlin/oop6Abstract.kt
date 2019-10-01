package com.oopKotlin

import com.mihindu1.person
//THE ROLE OF ABSTRACT CLASS IS JUST TO PROVIDE SET OF METHODS AND PROPERTIES WITHOUT ANY VALUE OR BODY
//aABSTRACT CLASSES ARE PARTIALLY DEFINED CLASSES
//ABSTRACT METHODS NO BODY AND NO OBJECTS A=CAN BE CREATED
//ABSTRACT PROPERTIES CAN NOT BE PRE DEFINED
//YOU NEED TO OVERRIDE ALL THE ABSTRACT CLASSES OF THE SUPER CLASS INSIDE THE SUB CLASS

fun main (args:Array<String>):Unit{
    //var person = Person()
    // Cant create objects using abstract classes **IMPORTANT***

}

/*
open class Person{
    fun goToSchool(){}// A normal function: Public and Final by default

    open fun getHeight(){}//Open for override

    //all the abstract ethods are OPEN in nature so that you need to define it explicitely
    abstract fun eat()
        //Abstract methods usualyy dont contain a body
        //NO BODY


}*/

abstract class Person {//abstract class are always open

    //open var name:String= "dummy"
    abstract var name:String //no dummy data




    fun goToSchool() {}// A normal function: Public and Final by default

    open fun getHeight() {}//Open for override

    //all the abstract ethods are OPEN in nature so that you need to define it explicitely
    abstract fun eat()
    //Abstract methods usualyy dont contain a body
    //NO BODY
    // NO {} also



}



class inidan: Person(){

    //subclass
    override fun getHeight(){}
    //IF YOU DEFINE ANY ABSTRACT methods/classes IN SUPER CLASS, ALL THE ABSTRACT CASSES MUST BE OVERRIDEN IN SUB CLASS
    override fun eat() {}


    override var name: String = "Dummy Indian name" //IF YOU DEFINE ANY ABSTRACT  property IN SUPER CLASS, ALL THE ABSTRACT CASSES MUST BE OVERRIDEN IN SUB CLASS


}
