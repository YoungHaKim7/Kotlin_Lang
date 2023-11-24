fun main(args: Array<String>) {
    val users = mutableMapOf<Int, String>(1 to "Maria", 2 to "Alex", 3 to "John")

    users[5] = "Vlad"

    //remove
    users.remove(2)
    
    users.forEach { t, u ->
        println("$t and $u")}
}

