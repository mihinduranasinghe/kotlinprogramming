package HIghlevelFunctionsAndLambdas

// when we are having ONLY one parameter we can replace that s with IT(pre defined keyword)

fun main(args: Array<String>):Unit{
    val progrm = Program()
        //progrm.reverseAndDisplay("hello",{s->s.reversed()})
    progrm.reverseAndDisplay("hello",{it.reversed()})

}

class Program{
    fun reverseAndDisplay(str:String, myFunc: (String)->String){//High level function with lambda as parameter
            var result =  myFunc(str)//str.reversed ====>"hello".reversed() = "olleh"
        println(result)
    }
}