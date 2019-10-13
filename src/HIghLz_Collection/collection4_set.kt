package HIghLz_Collection

//Immutabale collections : they are read only
//Immutable list,map,set  ->  listOf,maoOf,SetOf

//Mutable collections : they are read and write both
//Immutable list,map,set   ->  ArrayListof..., hashmap..

/*
* Array
*  List
* Hash map
*  set
* */


/*
* SET contains unique elements
* "HashSet" is  also contains unique elements but sequence is not guaranteed in output
* */



fun main(args: Array<String>):Unit{

    var myset0 = setOf<Int>(2,4,5,7,8,6,45,35) // immutable. read only... can be converted into mutable

    var myset = mutableSetOf<Int>(2,4,5,7,8,6,45,54,35) //mutable set. can be read and write
    myset.remove(54)

    var myhashset = hashSetOf<Int>(2,4,5,7,8,6,45,54,35) //also contains unique elements but sequence is not guaranteed in output



    for(element in myhashset){ //Using individual element(objects)
        println(element)
    }

    println()

}