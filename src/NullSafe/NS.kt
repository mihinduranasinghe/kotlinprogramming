package NullSafe

//Null safety Operators

/*

?. -> safe call operator
!! -> not null Asserts
?: -> elvis
?.let{..} -> safe call with let

 */

fun main(args:Array<String>){
    //WAP to find out length of name
    //val name:String?="Mihindu"
    val name:String?=null
    println("the length of the name is: ${name?.length}") //safe call

    name?.let{
        println("the length of the name is: ${name.length}") //safe call with let...._> provide nothing, cannot be null
    }

    //elvis-operator
    val len = if(name!=null)
        name.length
    else
        -1

    val length = name?.length ?:-1
    println("the length of the name is: ${length}")



    //not null Asserts
    //use it when only you are sure that it is NOT NULL
    //otherwise it will give an error, exception... Null poinyer exception. it will crash your application
    println("the length of the name is: ${name!!.length}")

}