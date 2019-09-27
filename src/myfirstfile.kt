import java.awt.geom.QuadCurve2D

//fun for function
//Unit stands for void
// you can give any other return type for that ex int double float...

/*
public static void main(String[] args){

}
*/


fun main(args: Array<String>): Unit{
    println("Hello World");
    println("Hellow Kotlin");
    println(10.0/4);
    println(true);

    //declaring variables
    val mystring="Mihindu";
    val num1=12;
    val mydec=10.2;
    println(mystring + " " +num1 + "\t" + mydec);

    //declaring variables
    val myystring: String ="Mihindu";
    val num2:Int=12;
    val myydec:Double =10.20;
    println(myystring + " " +num2 + "\t" + myydec);

    display(variablename = "Display Hellow function output" );

}

fun display(variablename: String){
    println(variablename);
}
