package cetin.baris.kotlinbasics

//main function is the main application function that initially runs
fun main(){

    ifStatements()
}
// by using fun we are creating functions

fun basics(){

    //data types
    var myDouble : Double = 3.141582
    var myAge : Short = 25
    var myDateOfBirth : Int = 1993
    var myLong : Long = 54654654654
    var myBool : Boolean = true
    var myChar : Char = 'B'
    var myFloat = 3.14F
    /*
    The difference between val and var is val is an immutable variable type that
    you cannot change the value later on. Var however can be reassigned
     */

    // you can use dollar sign $ for using variables in a string print statement
    // println("i am $myAge years old")

    myFloat
    //--------------------------------------------------------------------------

    //Arithmetic operators (+,-,/,*,%)

    var result : Double
    //result /= 2
    //result -= 2
    //result += 2
    //result = 15 % 3 // % gives remainder from division

    val a : Double = 5.0
    val b : Double = 3.0

    result = a/b

    //--------------------------------------------------------------------------
    //Comparison operators ( ==, !=, < ,> ,<= ,>=)
    /*
    val isEqual = 5 == 3 //creates a boolean and returns true or false value
    println("is equal is $isEqual")// string interpolation
    println(" is -5 grater 3 ${-5>3}") // string interpolation
    println(" is 5 grater 3 ${5>3}")// string interpolation
    println(" is 5 loverequal  3 ${5<=3}")// string interpolation
    */


    //--------------------------------------------------------------------------

    //assignment operators (+=,-=,*=,/=,%=)

    var myNum = 5
    myNum += 3
    println("My number is $myNum")
    myNum *= 4
    println("My number is $myNum")


    //--------------------------------------------------------------------------

    //increment & Decrement operators (++,--)

    myNum ++
    println("My number is $myNum")
    myNum --
    println("My number is $myNum")

    //or you can use string interpolation

    println("My number is ${++myNum}")
    println("My number is ${--myNum}")

}

fun ifStatements(){

// comparing heights of two individuals and returning difference between them
    var personOne = 170
    var personTwo = 172

    if(personOne > personTwo){
        println("Person one is taller ${personOne - personTwo} centimeters than person two")
    }else if(personOne == personTwo){
        println("they are same height")
    }else{
        println("Person two is taller ${personTwo - personOne} centimeters than person one")
    }

}