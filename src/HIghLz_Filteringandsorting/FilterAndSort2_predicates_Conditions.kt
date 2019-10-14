package HIghLz_Filteringandsorting

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
fun main(args:Array<String>){
    var myNumberss = listOf(2,3,4,6,8,33)
    var mypredicateCondition= {num:Int -> num > 10}//insteed of using it everywhere you can use mypredicateCondition

    var check1=myNumberss.all({it<10})//{num -> num > 10}
    println(check1)

    var check2=myNumberss.any( {it<10} )
    println(check2)

    var check3=myNumberss.count(mypredicateCondition ) //using my predicate condition... SAME RESULT
    println(check3)

    var check4=myNumberss.find( mypredicateCondition)
    println(check4)//this returns the first number that mathes the predicate condition
}