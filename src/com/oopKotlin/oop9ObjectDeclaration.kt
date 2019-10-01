package com.oopKotlin

//SINGLETON - WHEN WE HAVE JUST ONE INSTANCE OF A CLASS IN THE WHOLE APPLICATION
//THERE EXIST ONLY ONE OBJECT FOR THIS CLASS BY DEFAULT
//IN JAVA, WE DEFINE SINGLETON BY USING KEYWORD " STATIC " IN METHODS AND VARIABLES
//IN KOTLIN WE USE OBJECT KEYWORD
//WHEN WE USE OBJECT KEYWORD, THEN IT WILL CREATE   A CLASS/OBJECT AND INSTANCE . BUT ONLY ONE AS STATIC IN JAVA
//can have propertice  methods and  initialized BUT CANNOT HAVE CONSRUCTED AS WE CANNOT CREATE INSTANCES
//CAN HAVE SUPER CLASS


fun main(args : Array<String>){
   //ar customersData = customersData()
    customersData.count=5
    var output= customersData.typeOfCustomers()
    println(output)

    customersData.myMethod("Hellow")

}
/*
class customersData{
    var count: Int = -1
    fun typeOfCustomers(): String{
        return "Srilankan"
    }
}
*/

open class MySuperClass{
    open fun myMethod(str:String){
        println("My super class")

    }
}



object customersData: MySuperClass(){//behave like static class
    var count: Int = -1 //behave like static variable
    fun typeOfCustomers(): String{//behave like static method
        return "Srilankan"
    }
    override fun myMethod(str:String){//currently behving like static method
        super.myMethod(str)
        println("object customer data $str")

    }

    init {
        //we can initialize anything also
    }


}