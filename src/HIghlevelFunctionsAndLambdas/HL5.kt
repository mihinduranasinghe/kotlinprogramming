package HIghlevelFunctionsAndLambdas

// this is kotlin not java
//we can use lambdas to reduce the repeatance of the person1 keyword as object
//using "with" keyword or"apply"

fun main(args: Array<String>){

   /*
    var person1=person()

    person1.name="Mihindu Ranasinghe"
    person1.age=22

    println(person1.name)
    println(person1.age)

    normal way
    */

    var person1=person()
    with(person1){
        name="Mihindu Ranasinghe"
        age=22
    }

//------------------------------------------

    person1.apply {
        name="Mihindu Ranasinghe"
        age=22  }.startRun()

    //you can call the method also  with a dot with apply keyword


    println(person1.name)
    println(person1.age)




}

class person{
    var name:String=""
    var age:Int=-1

    fun startRun(){
        println("Now i am ready to run")
    }
}