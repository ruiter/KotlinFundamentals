package com.ruiter.test

fun main() {
    val listStr = listOf("Pedro", "Maria", "João", "Marcos")
    val finder = Finder(listStr)

    finder.findItem("Pedro") {
        println(it)
    }
}

/** First version
class Finder(val list: List<String>) {
    fun findItem(element: String, foundItem: (element: String?) -> Unit) {

        val itemFoundList = list.filter {
            it == element
        }

        if (itemFoundList.isNullOrEmpty()) foundItem(null) else foundItem(itemFoundList.first())
    }
}
**/

// Generic version
class Finder<T>(val list: List<T>) {
    fun findItem(element: T, foundItem: (element: T?) -> Unit) {

        val itemFoundList = list.filter {
            it == element
        }

        if (itemFoundList.isNullOrEmpty()) foundItem(null) else foundItem(itemFoundList.first())
    }
}