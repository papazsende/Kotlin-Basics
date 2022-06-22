package cetin.baris.kotlinbasics

fun main(){

    var myCar = car("Auidi","R8")
    var teslaS = electricCar("Tesla","Model S",20.0)

    teslaS.drive(10.0)
    println("battery is now at ${teslaS.battery}%")
}

open class car(brand : String,model : String){

    var model = model
    val mpg = 13
    var fuel : Double = 0.0
    open var range : Double = mpg * fuel

    open fun takeFuel(amount : Double){
        fuel += amount
        range = mpg * fuel
        println("${fuel} gallons of Fuel loaded new range is $range miles")
    }

    fun drive(miles : Double){
        range -= miles
        println("$model is driven $miles miles ,new range is : $range ")

    }

    init {
        println("a car object created! Brand $brand $model")
    }

}

class electricCar(brand: String,model: String,battery : Double) : car(brand,model){

    override var range = battery * 6
    var battery : Double = battery

    override fun takeFuel(amount: Double){
        battery += amount
        println("battery is charged $battery")
        range = battery * 6

    }


}
