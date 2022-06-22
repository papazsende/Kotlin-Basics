package cetin.baris.kotlinbasics

fun main(){

    var myPhone1 = mobilePhone("Android","Samsung","A50",null)
    myPhone1.charge(30)
    myPhone1.showState()
    myPhone1.brakePhone()
    myPhone1.showState()
    myPhone1.fixPhone()
    myPhone1.showState()
}

open class mobilePhone constructor(osName : String, brand : String, model : String, state:String?){
    var osName : String? = null
    var battery : Int = 50
    init{
        println("a new mobile phone created os name : $osName brand : $brand  model : $model")
        this.osName = osName

    }
    private var state : String? = state ?: "good condition"
    var model : String = model

    fun charge(amount : Int){
        battery += amount
        println("Phone is charged from ${battery-amount} to $battery")
    }

    fun showState(){
        println(" $osName phone $model is $state")
    }

    fun fixPhone(){
        this.state = "fixed"
    }
    fun brakePhone(){
        this.state = "shattered"
    }
    //or instead of using a method to fix phone we can reach out the member variable state and modify it; see line 14


}
