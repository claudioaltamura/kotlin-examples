package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class SmartCastTest {

  @Test
  fun testNoString() {
    val x = 12
    assertFalse(demo(x))
  }

  @Test
  fun testString() {
    val x = "Hello"
    assertTrue(demo(x))
  }

  @Test
  fun testCastNoString() {
    val x = 12
    assertThrows(ClassCastException::class.java) { safeCast(x) }
  }

  @Test
  fun testCastString() {
    val x = "world"
    assertEquals("world", safeCast(x))
  }

}
