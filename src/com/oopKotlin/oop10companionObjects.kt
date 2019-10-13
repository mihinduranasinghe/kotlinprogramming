package com.oopKotlin

//COMPANION OBJECTS ARE SAME AS OBJECTS  BUT DECLARED WITHIN A CLASS
//BEHAVE LIKE STATIC
//previous one , inside a class.(Thats the only thing in companion object with the eyword of companion before object keyword)

fun main(args : Array<String>){
    //ar customersData = customersData()
    myclass.count=5 //use classname. instead of obj name in previous
    var output= customersData.typeOfCustomers()
    println(output)

    customersData.myMethod("Hellow")

}

class myclass{

    companion object customersData{//behave like static class
    var count: Int = -1 //behave like static variable
        fun typeOfCustomers(): String{//behave like static method
            return "Srilankan"
        }

        // @JvmStatic/ /to use this in a java file as static

         fun myMethod(str:String){//currently behving like static method
            //super.myMethod(str)
            println("object customer data $str")

        }

        init {
            //we can initialize anything also
        }


    }


}



