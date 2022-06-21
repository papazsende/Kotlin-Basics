package cetin.baris.kotlinbasics

fun main(){

    var myPhone1 = MobilePhone("Android","Samsung","A50","Broken")
    var myPhone2 = MobilePhone("Android","Samsung","A70",null)
    var myPhone3 = MobilePhone("iOS","Apple","iphone X",null)

    myPhone2.showState()
    myPhone3.showState()
    myPhone1.showState()

    myPhone1.fixPhone()
    //myPhone1.state = "rusty" since state variable is private, we cannot reach it from main class
    myPhone1.showState()



}

class MobilePhone constructor(osName : String, brand : String, model : String, state:String?){
    var osName : String? = null
    init{
        println("a new mobile phone created os name : $osName brand : $brand  model : $model")
        this.osName = osName
    }
    private var state : String? = state ?: "good condition"
    var model : String = model
    fun showState(){
        println(" $osName phone $model is $state")
    }

    fun fixPhone(){
        this.state = "fixed"
    }
    //or instead of using a method to fix phone we can reach out the member variable state and modify it; see line 14


}