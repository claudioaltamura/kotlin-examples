package de.claudioaltamura.kotlin.examples

import java.math.BigDecimal

fun arrayWithLambdaExpression(): Array<Int> = Array(3) {i -> i + 1}

//or toIntArray() and reverse toTypedArray()
fun intArrayForJava()= intArrayOf(1,2,3)

fun mixedArray() = arrayOf(1, "hello", BigDecimal(2.0))
