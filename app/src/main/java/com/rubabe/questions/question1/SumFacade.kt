package com.rubabe.questions.question1

class SumFacade(
    private var printStudentInformation1: PrintStudentInformation,
    private var calculateGrades1: GradeCalculator

) {

    fun calculateGrades(student: Student) {
        calculateGrades1.calculateGrades(student)

    }

    fun printStudentInformation(student: Student) {
        printStudentInformation1.printStudentInformation(student)

    }
}