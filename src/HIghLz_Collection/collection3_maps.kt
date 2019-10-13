package HIghLz_Collection

//Map is a data structure. It has a key value pair



fun main(args: Array<String>):Unit{

    var myMap = mapOf<Int,String>(2 to "mihindu", 44 to "dewmini") //immutable , fixed size read only  (here key is int value is string)

    for(key in myMap.keys){ //Using individual element(objects)
        println("Element at key $key is : ${myMap.get(key)}") //myMap[key]
    }
    println("\n \n ")
    //if you want to modify, you can use -> HashMap, hashMapOf,mutablemapOf

    var myhashMap = HashMap<Int,String>() //mutable , mot fixed size. read and writable  (here key is int value is string)
    //HashMap, hashMapOf,mutablemapOf  any keyword of them can do this
    myhashMap.put(4,"kasun")
    myhashMap.put(5,"dasun")
    myhashMap.put(6,"supun")
    myhashMap.put(7,"pasan")
    myhashMap.replace(6,"modi")//replace supun by modi, put also work as a replace if you use a previously used key

    for(key in myhashMap.keys){ //Using individual element(objects)
        println("Element at key $key is : ${myhashMap.get(key)}") //myMap[key]
    }
}