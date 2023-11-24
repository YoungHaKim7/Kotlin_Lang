fun main() {
    val numbers = setOf(1,2,3,4,5)
    // println(numbers.map { it * 10})
    println(numbers.map { if (it ==3) it * 100 else it * 10})
}

