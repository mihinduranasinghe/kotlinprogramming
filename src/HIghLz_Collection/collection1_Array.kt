package HIghLz_Collection

//Immutabale collections : they are read only
        //Immutable list,map,set  ->  listOf,maoOf,SetOf

//Mutable collections : they are read and write both
       //Immutable list,map,set   ->  ArrayListof..., hashmap..

/*
* Array
* Array List
* Hash map
* map set
* */

fun main(args: Array<String>):Unit{

    var myArray = Array<Int>(5){0} //Mutable. fixed size
    myArray[0]=5
    myArray[3]=10
    myArray[4]=8


    for(element in myArray){ //Using individual element(objects)
        println(element)
    }

    println()
    // Or you can use the other below method also to print all the elements in the array

    for(index in 0..myArray.size-1){
        println(myArray[index])
    }



}