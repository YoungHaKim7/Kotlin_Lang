fun main(args: Array<String>) {
    val names = mutableListOf("Name 1", "Name 2", "Name 3")

    names.add("Name 4")
    // removeAt
    names.removeAt(0)
    // remove "name 2"
    names.remove("Name 2")

    names.forEach { println(it)}
}