package de.claudioaltamura.kotlin.examples.collections

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LambdasTest {

  @Test
  fun contains() {
    assertTrue(anyEven(listOf(1, 2, 3)))
  }

  @Test
  fun notContains() {
    assertFalse(anyEven(listOf(1, 3, 5)))
  }

  @Test
  fun squareExample() {
    val square = { number: Int -> number * number }
    assertEquals(4,square(2))
  }

  @Test
  fun magnitude() {
    val magnitude100String = { input: Int ->
      val magnitude = input * 100
      magnitude.toString()
    }
    assertEquals("200",magnitude100String(2))
  }

}
