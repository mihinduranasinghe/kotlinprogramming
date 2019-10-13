package HIghlevelFunctionsAndLambdas
/*
//high level funcion
        CAN ACCEPT FUNCTIONS AS PARAMETERS
        CAN RETURN A FUNCTION
        OR CAN DO BOTH
 labdas
            IT IS JUST A FUNCTIONS WITH NO NAME
            LAMBDA IS REALLY IMPORTANT IF YOU ARE PLANNING TO BE AN ANDROID DEVELOPER WITH KOTLIN LANGUAGE
 */

fun main(args:Array<String>):Unit{
    var program = Programme()
    program.addTwoNums(50,60)//simple way

    program.addTwoNums(50,60,object : MyInterface{
        override fun execute(sum: Int) {
            println("Sum of given two numbers is : $sum")
        }
    })



    val test:String ="Hello"


    val myLambda : (Int) -> Unit  = {s : Int -> println("Sum of given two numbers is : $s") } //Lambda Expressions (function with no name)/ s is acting as a parameter
    program.addTwoNums(2,7,myLambda)


}

class Programme{



    fun addTwoNums(num1:Int,num2:Int , action: (Int) -> Unit){ //Highlevel function lamba as parameter
        var sum:Int = num1+num2;
        action(sum)
        //println(sum)//this is inside the lamba expressiojn so we can remove it
        //println("Sum of given two numbers is : $sum")
    }

    fun addTwoNums(num1:Int,num2:Int , action: MyInterface){ //using interface /object oriented way
        var sum:Int = num1+num2;
        action.execute(sum)
        //println("Sum of given two numbers is : $sum")
    }


    fun addTwoNums(num1:Int,num2:Int){  //High level funcion with lambda as parameter
        var sum:Int = num1+num2;
        println("Sum of given two numbers is : $sum")
    }

    fun addTwoNumbers(i: Int, i1: Int, myLambda2: (Int, Int) -> Int) {

    }
}
//do the same thing using interface
interface MyInterface{
    fun execute(sum:Int){

    }
}