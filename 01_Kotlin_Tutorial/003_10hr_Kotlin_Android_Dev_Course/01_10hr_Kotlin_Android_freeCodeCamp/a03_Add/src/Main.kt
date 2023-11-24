fun main(args: Array<String>) {
    val names = mutableSetOf<String>("Name 1", "Name 2", "Name 3", "Name 1")

    names.add("Name 4")

    names.forEach { println(it)}
}