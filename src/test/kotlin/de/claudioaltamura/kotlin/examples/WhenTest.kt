package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WhenTest {

  @Test
  fun testWhen() {
    val num = 100;
    val secondNum = when {
      num > 50 -> 1
      num < 20 -> -1
      else -> 1
    }

    assertEquals(secondNum, 1)
  }

  @Test
  fun testWhenIs() {
    val something: Any = "12"

    val result = when(something) {
      is String -> "String"
      is Int -> "Integer"
      else -> "Unknown"
    }

    assertEquals("String", result)
  }

  @Test
  fun testWhenWithRanges() {
    val num = 50;

    val result = when(num) {
      in 0..99 -> Ranges.ZERO_99
      in 100..199 -> Ranges.HUNDRED_199
      else -> Ranges.ABOVE
    }

    assertEquals(Ranges.ZERO_99, result)
  }

  enum class Ranges {
    ZERO_99,
    HUNDRED_199,
    ABOVE
  }

}
