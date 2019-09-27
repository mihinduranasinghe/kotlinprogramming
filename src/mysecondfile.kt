fun main(args: Array<String>):Unit{
    //display(variablename = "Printing hellow from function display inside person class");

    //creating objects
    //display object1=new display();
    var object1 = Person();
    object1.fname="Mihindu Ranasinghe";
    object1.display();
   //object1.display(fname = "Mihindu Ranasinghe");

    println("The Name of the person is: "+ object1.fname);
    //we can do this with kotlin like this
    println("The Name of the person is: ${object1.fname}");

}

class Person{


    /*
    fun display(fname: String){
        println(fname);
    }*/

    var fname:String="";
    //if we use val insteat of var , it will be a constant . you cant chage it in the future
    fun display(){
        println(fname);
    }

}