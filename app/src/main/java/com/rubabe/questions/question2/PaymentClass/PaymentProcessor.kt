package com.rubabe.questions.question2.PaymentClass

import com.rubabe.questions.question2.PaymentInterface.Payment

class PaymentProcessor {
    fun processPayment(payment: Payment) {
        payment.processPayment()
    }
}