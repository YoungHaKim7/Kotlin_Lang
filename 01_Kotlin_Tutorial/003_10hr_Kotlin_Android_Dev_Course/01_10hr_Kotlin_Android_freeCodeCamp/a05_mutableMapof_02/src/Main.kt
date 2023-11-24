fun main(args: Array<String>) {
    val users = mutableMapOf<Int, String>(1 to "Maria", 2 to "Alex", 3 to "John")

    users.forEach { t, u ->
        println("$t and $u")}
}

