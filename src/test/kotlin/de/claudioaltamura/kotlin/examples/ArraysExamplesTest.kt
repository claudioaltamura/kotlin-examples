package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArraysExamplesTest {

  @Test
  fun testArrayWithLambdaExpression() {
    val elements = arrayWithLambdaExpression()
    assertArrayEquals(arrayOf(1,2,3), elements)
  }

  @Test
  fun testIntArrayForJava() {
    val elements = intArrayForJava().toTypedArray()
    assertArrayEquals(arrayOf(1,2,3), elements)
  }

  @Test
  fun testAllZeros() {
    val elements = allZeros()
    assertArrayEquals(arrayOf(0,0,0), elements)
  }

  @Test
  fun testEvenNumbers() {
    val elements = evenNumbersTo10Exclusive()
    assertArrayEquals(arrayOf(0,2,4,6,8), elements)
  }
}
