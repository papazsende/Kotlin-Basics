package cetin.baris.kotlinbasics
var passagePrice = 10

fun main(){
    var user1 = user("Barış","Çetin","34RFR83",true)
    var user2 = user("Inan","Aktan","34RGR96",false)

    user1.addToBalance(20)
    user2.addToBalance(0)

    user1.usingBridge()
    user1.usingBridge()
    user1.usingBridge()

    user2.usingBridge()
}


class user constructor(userName : String,userLastName : String,licencePlate : String,member : Boolean){

    private var balance : Int = 0
    var totalFine : Int = 0
    var userName = userName
    var userLastName = userLastName
    var member = member
    private var fine = passagePrice
        get(){
            if(member){
                return field
            }else{
                return field*2
            }
        }
    init{
        println("user created with name $userName ")

    }


    // user adds money to his/her/them/they/their account balance

    fun addToBalance(amount : Int){
        this.balance += amount
        println("User balance of $userName $userLastName is $balance usd")

    }

    // using the bridge

    fun usingBridge(){

        if(balance >= passagePrice){
            this.balance -= passagePrice
            println("bridge used, price is $passagePrice , new user balance is $balance")
            if(balance < 10){
                println("Your account balance appears to be low, consider adding more!")
            }
        }else{
            violation()
        }
    }

    fun violation(){
        println("violation !! Fine is $fine")
    }

}