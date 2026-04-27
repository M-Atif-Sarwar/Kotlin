fun main() {

    val users = listOf(
        Result.Data("Alice", "alice@email.com", "NYC"),
        Result.Data("Bob", "bob@email.com", "LA"),
        Result.Data("Charlie", "charlie@email.com", "Chicago")
    )
    for (user in users) {
        println("useranme :${user.username} ")
        println("email :${user.email} ")
        println("city :${user.city} ")
    }


}

//sealed possibel set of types or valuses
sealed class Result(){
    data class Data(var username:String,var email:String,var city:String):Result()
    data class Success(var success: Boolean):Result()
    data class Error(var Error: String):Result()
}