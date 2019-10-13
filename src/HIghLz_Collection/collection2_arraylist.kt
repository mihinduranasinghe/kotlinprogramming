package HIghLz_Collection


//Immutabale collections : they are read only
//Immutable list,map,set  ->  listOf,maoOf,SetOf

//Mutable collections : they are read and write both
//Immutable list,map,set   ->  ArrayListof..., hashmap..

/*
* Array
* Array List(only readable)
* Hash map
* map set
* */

fun main(args: Array<String>):Unit{

    var list =  listOf<String>("Mihindu", "Ravindu", "Kavindu") //immutable,fixed size(only readabable)
    //you can convert in=t into mutable by the way

    var listm =  mutableListOf<String>() //mutable,no fixed size( readabable and writable) add or remove
    //mutableListOf<String>(),arrayListOf<String>(),arrayList<String>()    three of them are same. YOU CAN USE ONE OF THEM TO HAVE MUTABLE ONE

    listm.add("Tharuka")
    listm.add("Tharuka")
    listm.add("Tharuka")
    listm.add("Mihindu")
    listm.remove("Mihindu")
    listm.add(3,"rasora")


    for(element in list){ //Using individual element(objects)
        println(element)
    }

    println()
    // Or you can use the other below method also to print all the elements in the array

    for(index in 0..listm.size-1){
        println(listm[index]) //you can use , list.get(index)
    }



}