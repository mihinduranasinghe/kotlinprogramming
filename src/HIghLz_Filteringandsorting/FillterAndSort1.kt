package HIghLz_Filteringandsorting

import HIghlevelFunctionsAndLambdas.person

/*

"filter": filter our desired elements from a collection
"map": perform operations , modify elements

predicates- true or false returning things
    "all"-do all elements satisfy the predicate
    "any"-do any element in list satisfy the predicate
    "count"-total elements that satisfy the predicate
    "find"-return the FIRST element that satisfy the predicate

more functions
    flatmap - filter elements from a collection of collections
    distinct - returns unique results

 */


//filter and map
fun main(args: Array<String>):Unit{
    val myNum: List<Int> = listOf(2,4,6,7)
    val mySmallNum: List<Int> =  myNum.filter{it<10} //{v -> v<10}

    for(num in mySmallNum){
        println(num)
    }

    val mySquaredNum = myNum.map {it * it} //{ num -> num*num } // square of each element in list
    println("squares of each element of list \n\n")
    for(num in mySquaredNum){
        println(num)
    }

    // same thuing can be done like this
    val mySamallSquaredNum = myNum.filter{it<10}.map {it * it} //{ num -> num*num } // square of each element in list
    println("squares of each element of list \n\n")
    for(num in mySquaredNum){
        println(num)
    }

        var people= listOf<Person>(Person(10," mihindu"),Person(2,"kasun"),Person(40,"sam"))
        var names = people.filter{Person -> Person.name.startsWith("s")}.map{it.name}

    println("\n\nfiltering the names startwith s")
        for(name in names){
         println(name)
        }

}

class Person(var age:Int,var name:String){

}