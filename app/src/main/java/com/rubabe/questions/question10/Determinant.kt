package com.rubabe.questions.question10

import kotlin.math.sqrt

fun main() {
    val a = 1.0
    val b = 5.0
    val c = 6.0

    // Calculate the determinant
    val determinant = b * b - 4 * a * c

    if (determinant > 0) {
        // Real and different roots
        val root1 = (-b + sqrt(determinant)) / (2 * a)
        val root2 = (-b - sqrt(determinant)) / (2 * a)
        println("Root 1: $root1")
        println("Root 2: $root2")
    } else if (determinant == 0.0) {
        // Real and equal roots
        val root = -b / (2 * a)
        println("Roots are real and equal. Root: $root")
    } else {
        // Complex and different roots
        val realPart = -b / (2 * a)
        val imaginaryPart = sqrt(-determinant) / (2 * a)
        println("Root 1: $realPart + ${imaginaryPart}i")
        println("Root 2: $realPart - ${imaginaryPart}i")
    }
}
