package com.ruiter.test

fun main() {

    println(sum(2,2))
    println(add(23, 34))
    println(returnMultipleOf(0, 1000, 4, " is multiple of "))
}

// val lambdaName : Type = { parameterList -> codeBody }
val add: (Int, Int) -> Int = { a, b -> a + b }

fun sum(a: Int, b: Int): Int {
    return a + b
}

val returnMultipleOf: (Int, Int, Int, String) -> MutableList<String> = { first, last, multipleOf, message ->
    val result = mutableListOf<String>()

    for (i in first..last) {
        if (i%multipleOf == 0) result.add(i,"$i $message $multipleOf") else result.add(i,"$i")
    }

    result
}

fun calculateMultipleOf(first: Int, last: Int, multipleOf: Int, message: String) {
    for (i in first..last) {
        if (i%multipleOf == 0) println("$i $message $multipleOf")
    }
}