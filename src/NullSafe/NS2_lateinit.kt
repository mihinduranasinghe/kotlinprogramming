package NullSafe
/*
lateinit used when only with mutable data types
lateinit used when only with non nunnable data types
lateinit must be initialized before u use it
    var is allowed
    val is not allowed
    String? is not allowed (not nullable)
 */

fun main(args:Array<String>){
    var country=Country()
//    country.name="india"
//    println(country.name)

    country.setup()
}
class Country{
    lateinit var name: String


    fun setup (){
        name="USA"
        println("The country name is $name")
    }
}