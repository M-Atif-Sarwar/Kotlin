// findingg even number in range of number
// display on screen and number of count

fun main() {
    var count=0
    for (num in 1..200){
        if(num%2==0) {
            println(num)
            count++
        }
    }
    println("Total numbers of even numbers are $count")
}