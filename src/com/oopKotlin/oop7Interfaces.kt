package com.oopKotlin

//INTERFACE IS NOT A CLASS
//IT IS SOMETHING LIKE A LISTENER, IF YOU NEED A SERVICE, SUCH AS A SHORT TERM SERVICE SUCH AS AN ON CLICK METHOD
//INTERFACES ARE DEFAULT BY NATURE
//INTERFACE CAN CONTAIN BOTH NORMAL METHODS AND ABSTRACT METHODS
//BUT THE CONTAIN ONLY ABSTRACT PROPERTICE
//YOU CANNOT CREATE OBJECTS BY USING INTERFACES


fun main(args:Array<String>):Unit{
    var myBtn = MyButton()
    myBtn.onTouch()
    myBtn.onClick()
}



interface MyInterfaceListener{
    //CANNOT CREATE OBJECTS/INSTANCES OF INTERFACES
    //INTERFACES ARE DEFAULT BY NATURE
    //NO NEED TO INITIATE VARIABLES
    //DEFINED PROPERTICE ARE ABSTRACT AND OPEN BY DEFAULT, empty declaration

    var name: String

    abstract fun onTouch()

    fun onClick(){//public but open by default , not final
        println("Button was touched from normal function. not an abstract")
    }

}

interface MySecondInterfaceListener{

     fun onTouch(){
         println("BOn touch was called from my second interface")
     }

    fun onClick(){
        println("BOn touch was called from my second interface")
    }

}


class MyButton : MyInterfaceListener, MySecondInterfaceListener{

    override var name: String = ""

    override fun onTouch() {
        super.onTouch() //There are no 2 normal onTouch listeners , one is abstract(No Body) So that no issues to call the rest onouch will be caled automatically
        super<MyInterfaceListener>.onClick()//Tere are 2 normal onClick methods in 2 interfaces so that this is the way to call them in multi nterface inherit classes
        super<MySecondInterfaceListener>.onClick()
        println("Button was Clicked")
    }

    override fun onClick(){//public but open by default , not final
        println("Button was touched ")

    }




}
