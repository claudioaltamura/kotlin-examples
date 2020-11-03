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

}
