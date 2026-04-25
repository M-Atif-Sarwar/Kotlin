fun main() {
   var adminUser=AdminUser("ali","abc@gmail.com",65)
    println(adminUser.roles())
    println(adminUser.permissions())
}

abstract class UserAbstract (){
    abstract fun roles():String
    abstract fun permissions():List<String>
}

class AdminUser(var name:String,var email:String, var age: Int) :UserAbstract() {

    override
    fun roles(): String {
        return "AdminUser"
    }

    override fun permissions(): List<String> {
        return listOf("Read","Write","delete")
    }
}


class NormalUser(var name:String,var email:String, var age: Int) :UserAbstract() {

    override
    fun roles(): String {
        return "User"
    }

    override fun permissions(): List<String> {
        return listOf("Read")
    }
}