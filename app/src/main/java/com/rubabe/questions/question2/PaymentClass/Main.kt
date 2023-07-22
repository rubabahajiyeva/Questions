package com.rubabe.questions.question2.PaymentClass

fun main() {
    // Create instances of payment types
    val creditCardPayment = CreditCardPayment()
    val payPalPayment = PayPalPayment()

    // Create PaymentProcessor instance
    val paymentProcessor = PaymentProcessor()

    // Process payments
    paymentProcessor.processPayment(creditCardPayment) // Process credit card payment
    paymentProcessor.processPayment(payPalPayment) // Process PayPal payment
}
