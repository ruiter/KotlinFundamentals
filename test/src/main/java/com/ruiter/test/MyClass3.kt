package com.ruiter.test

fun main() {
    calculate(10, 1000)
}

fun calculate(first: Int, last: Int) {
    for (i in first..last) {
        if (i%2 == 0) println("$i is multiple of 2")
    }
}