package cetin.baris.kotlinbasics

fun main(){

    var myCar = car(1200,"Volkswagen","White")
}

class car constructor(engineCc : Int, brand : String, Color : String ){

    init{
        println("car object created! Engine size : $engineCc cc , Brand : $brand , Color : $Color")

    }

}

class Volkswagen (engineCc : String, brand : String) : car(engineCc,brand){

}