fun main(args: Array<String>) {
    val names = mutableListOf("Name 1", "Name 2", "Name 3")

    names.add("Name 4")

    names.forEach { println(it)}
}