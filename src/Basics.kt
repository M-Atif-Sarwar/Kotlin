fun main () {
    var name="Atl"
    println("my name is $name")

    // allow null optional
    var email:String?=null
    println(email)
    email="abc"
    println(email)

    // check if variable is null then assifgn value
    var myname:String?=null
    var newname:String= myname?:"abc"
    println(newname)

    var sum=sumNumber(2,3,4,7,9,200,67,93,83)
    println("Total is $sum")
    numPrint()
    numPrint2()
}

// function with unknow arguments
fun sumNumber(vararg numbers: Int): Int{
    var result =0
    for (num in numbers){
        result+=num
    }

    return result
}

//number in 1..10 display 10 numbers 1 to 10
//number in 1..10  Step 3 display  numbers 1 to 10 skip 2
//number in 1 untiil 10  display  numbers 1 to 9
//number in 10 downto 1  display  numbers 10 to 1

fun numPrint(){
    for (num in 1 until 10 step 2){
        println(num)
    }
}

fun numPrint2(){
    for (num in 10 downTo 1 step 2){
        println(num)
    }
}