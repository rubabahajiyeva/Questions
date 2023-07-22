package com.rubabe.questions.question9

fun isLeapYear(year: Int): Boolean {
    return if (year % 100 == 0) {
        year % 400 == 0
    } else {
        year % 4 == 0
    }
}


fun main() {
    val year = 2024
    if (isLeapYear(year)) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }
}