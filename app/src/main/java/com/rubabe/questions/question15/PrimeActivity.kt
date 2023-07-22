package com.rubabe.questions.question15

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    if (num == 2) return true
    if (num % 2 == 0) return false

    var divisor = 3
    while (divisor * divisor <= num) {
        if (num % divisor == 0) return false
        divisor += 2
    }
    return true
}

fun findPrimePairs(number: Int) {
    for (i in 2 until number) {
        if (isPrime(i) && isPrime(number - i)) {
            println("$number = $i + ${number - i}")
        }
    }
}

fun main() {
    val givenNumber = 34
    findPrimePairs(givenNumber)
}