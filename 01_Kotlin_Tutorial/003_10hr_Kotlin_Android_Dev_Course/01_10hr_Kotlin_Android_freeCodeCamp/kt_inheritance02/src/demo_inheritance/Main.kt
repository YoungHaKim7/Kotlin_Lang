package demo_inheritance

import Animal
import Cat
import Dog


fun main() {
	println("Hello, World! Kotlin lang")
	val dog = Dog()
	dog.bark()
	val cat = Cat()
	cat.meow()
}