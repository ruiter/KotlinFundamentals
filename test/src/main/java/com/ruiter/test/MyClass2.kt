package com.ruiter.test

fun main() {

    // always division by double types thats return precision results
    val a = 23.0
    val b = 12.0
    println(a/b)

    // remainder
    val c = 10
    val d = 3
    println(c%d)

    // for loops
    for (i in 1..3) {
        println(i)
    }

    for (i in 1..1000) {
        if (i%3 == 0) println("$i is multiple of 3") else println("----")
    }
}
