package src
import Animal

fun main() {
	val dog = Animal("Dog")
	println("$dog")
}

fun Int.isOdd(): Boolean {
	return this % 2 == 1
}

fun isEven(number: Int = 10): Boolean {
	return number % 2 == 0
}

fun print10Number() {
	for (i in 1..10) {
		println(i)
	}
}
