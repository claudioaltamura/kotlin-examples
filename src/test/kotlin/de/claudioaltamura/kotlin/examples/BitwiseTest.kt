package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test

class BitwiseTest {

  @Test
  fun testOr() {
    val number1 = 12
    val number2 = 25
    val result: Int
    result = number1 or number2   // result = number1.or(number2)
    val resultAsBinaryString = result.toString(2);
    println("result $result an as binary string $resultAsBinaryString")
    assertEquals(29, result)
  }

  @Test
  fun testAnd() {
    val number1 = 12
    val number2 = 25
    val result: Int
    result = number1 and number2   // result = number1.or(number2)
    println(result)
    assertEquals(8, result)
  }

  @Test
  fun testXOR() {
    val number1 = 12
    val number2 = 25
    val result: Int
    result = number1 xor number2   // result = number1.or(number2)
    println(result)
    assertEquals(21, result)
  }

  @Test
  fun testSHL() {
    val number1 = 212
    val result: Int
    result = number1 shl 1;
    assertEquals(424, result)
  }
}
