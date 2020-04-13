package de.claudioaltamura.kotlin.examples

fun main(args: Array<String>) {
    println(label(1,2))
}

fun label(operand1: Int, operand2: Int): String = "label $operand1 * $operand2"