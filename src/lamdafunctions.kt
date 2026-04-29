fun main() {
    // finding string starting with a
    val names=listOf<String>("Ali","ahmed","usman","Rehman")
    val namesWith=names.filter {
        name -> name.startsWith("a", ignoreCase = true) }
    print(namesWith)

    //getting square of each element of list
    var numbers=listOf<Int>(4,6,7,8,9,10)
    val squaredNumbers=numbers.map {
        it -> it*it
    }
    print("squared Numbers   are $squaredNumbers")

    //average of numbers
    val sum=numbers.reduce {
            start,next -> start+next
    }
    val average=(sum/numbers.size).toDouble()
    println("average is $average")

   // object expression
    val account=object:BankAccount {
        var balance=0
        override fun deposit(amount:Int): Int {
            balance+=amount
            return balance
        }

        override fun withdrawl(amount:Int) : Int{
            return if (amount > balance) {
                println("not enough amount")
                balance
            } else {
                balance -= amount
                balance
            }

        }
    }

    // Add a ayment
    var currentBalance:Int=account.balance
     currentBalance=account.deposit((500))
    println("Balance is $currentBalance")

    currentBalance=account.withdrawl((200))
    println("Balance is $currentBalance")

    currentBalance=account.withdrawl((5000))
    println("Balance is $currentBalance")



}


interface BankAccount {
    fun deposit(amount: Int):Int
    fun withdrawl(amount:Int):Int
}

