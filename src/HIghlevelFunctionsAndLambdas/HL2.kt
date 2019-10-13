
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

    var program2 = Programme()

    program2.addTwoNums(50,60)//simple way

    val myLambda2 : (Int,Int) -> Int  = {x:Int , y:Int  -> x+y } //Lambda Expressions (function with no name)/ s is acting as a parameter


    //program2.addTwoNumbers(2,7,myLambda2)
            //OR
    program2.addTwoNumbers(2,7,{x:Int , y:Int  -> x+y })
            //OR
    // program2.addTwoNumbers(2,7,){x:Int , y:Int  -> x+y }

    //one of these three methods can be used. Same result with lambda expressions


}

class Programe{



    fun addTwoNumbers(num1:Int, num2:Int , action: (Int,Int) -> Int ){ //Highlevel function lamba as parameter
        var sum:Int = num1+num2;
        action(num1,num2)

    }


}
