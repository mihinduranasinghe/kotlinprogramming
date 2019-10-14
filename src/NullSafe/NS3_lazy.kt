package NullSafe

//lazy initialization
/*
unless you use it, it will not allocate memory for it
because we alloate it lazily

this is to prevent unnecessary initialization to save memory
when u use it in the first time, it will be loaded into memory, in second time it will be loaded from cash memory

 */

val pi: Float by lazy{3.14f}

fun main(args:Array<String>){
    println("some initial code")

}