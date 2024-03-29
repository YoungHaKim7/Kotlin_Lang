package com.example.debug_coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    val a = async {
        println("I'm computing part of the answer")
        6
    }
    val b = async {
        println("I'm computing another part of the anser")
        7
    }
    println("The answer is ${a.await() * b.await()}")
}