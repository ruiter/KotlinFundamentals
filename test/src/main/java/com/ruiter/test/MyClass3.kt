package com.ruiter.test

fun main() {
    calculate(first = 10, last = 1000, multipleOf = 12, message = "is multiple of")
}

fun calculate(first: Int, last: Int, multipleOf: Int, message: String) {
    for (i in first..last) {
        if (i%multipleOf == 0) println("$i $message $multipleOf")
    }
}