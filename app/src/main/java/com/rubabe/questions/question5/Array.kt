package com.rubabe.questions.question5

fun main() {
// IntArray() constructor:
    val countOfStudent = IntArray(7) { index -> index + 1 }

//arrayOf()
    val name = arrayOf("Rubabe", "Gulsum", "Nermin")


// listOf() and toIntArray()
    val numbersList = listOf(1, 2, 3, 4, 5)
    val numbers = numbersList.toIntArray()

//IntArray() and set()
    val number = IntArray(5)
    number[0] = 1
    number[1] = 2
    number[2] = 3
    number[3] = 4
    number[4] = 5

//intArrayOf()
    val age = intArrayOf(1, 2, 3, 4, 5)

//
    val num = intArrayOf(1, 2, 3, 4, 5)
    val floats = floatArrayOf(1.0f, 2.0f, 3.0f)
    val booleans = booleanArrayOf(true, false, true)

}




