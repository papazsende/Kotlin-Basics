package cetin.baris.kotlinbasics

//main function is the main application function that initially runs
fun main(){

    loops()
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

fun seasons(){

    // using when statement to determine the season
    var season = 5

    when(season){
        1 -> println("it's sprint")
        2 -> println("it's summer")
        3 -> {
            println("its fall")
            println("or you autumn if you are british")
        }
        4 -> println("it's winter")
        else -> println("invalid season")

    }
    //in this example we will look at a range of months to determine which season we're in

    val month = 8

    when(month){

        in 3..5 -> println("its spring")
        in 6..8 -> println("its summer")
        in 9..11 -> println("its autumn")
        12,1,2 -> println("its winter") // when using commas you can use multiple conditions for comparison
    }
}
/* --------------------------------------------------------------------------------------------------------
Loops are created to run a specific code section for desired duration or until preferred condition is met

in this section we will take a look at while and for loops ->

While loop executes a block of code repeatedly as long as given condition is met
 */
fun loops(){

    // for example let's take x as an integer variable with value of 1, in this case our condition will be x<=10
    // as long as we keep the value below 10, code will repeatedly execute itself

    /*
    var x = 1
    while(x<=10){
        print("code is running")
    }


    ---> this code will continue to run unless we stop it
     */

    // if we increase the value of x each time the code runs, then value of x will eventually be higher than 10, and condition will be unmet.
    var x = 1
    while(x<=10){
        //println("code is running and the value of x is $x")
        x++
    }
    // in this case, code will stop running after x gets higher than 10
    println("loop is complete")

    //when using print command using "\n" indicates a line break;

    /* ---------------- QUIZ --------------------
    create a while loop that prints out every number descending from 100

    ---------------ANSWER ------------------------
    */
    var a = 100

    while(a>=0){
        print(a)
        a--
    }
    print("\nSecond loops is done!")


    // DO WHILE LOOP ---------------->

    var y = 1
    do{
        println("Value of y is $y")
        y++
    }while(y<=10)
    /* !!! do while loops runs code at least one and then checks if the condition is met. So if you give x 15 for example, code will print value of x
    which is 15 and then check the condition criteria.
    */

    // --------------- FOR LOOP ---------------->
    /*
    for loops are similar to while loops but instead of increasing the value of counter manually, loop itself increases the value automatically
    and we don't have to create a counter variable
     */

     for(num in 1..10){
         println("value of num variable is $num")
     }
    println("for loop ended")

    // another iteration of for loops is using until ->

    for(i in 1 until 10){
        println("value of i variable is $i")
    }
    println("second loop ended")

    for(num in 0..10000){
        if(num == 9000){
            println("Wow it's over 9000!")
        }
    }
    println("loop ended")

    var t = 0
    for (y in 0..9) {
        t += y
    }

    println("$t")

}