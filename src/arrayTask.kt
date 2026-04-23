// manual approach approach to fin max in min in array

// short way num.maxOrNull()
// short way num.minOrNull()
fun main() {
    var num=arrayOf(2,5,7,9,10,35,6,2,98)
    var max=findMaxNumber(num)
    println("max number is  $max")
    var min=findMinNumber(num)
    println("mix number is  $min")
}

fun findMaxNumber(numbers: Array<Int>): Int{
    var max = numbers[0]
    for (i in numbers){
        if(i>max){
            max=i
        }
    }

    return max

}

fun findMinNumber(numbers: Array<Int>): Int {
    var min=numbers[0]
    for (i in numbers){
        if(i<min){
            min=i
        }
    }
    return min
}