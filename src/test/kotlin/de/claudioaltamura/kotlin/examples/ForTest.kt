package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*;

class ForTest {

  @Test
  fun testRange() {
    val range = 1..5
    assertTrue(3 in range)
  }

  @Test
  fun testCharRange() {
    val charRange = 'a'..'z'

    assertTrue('q' in charRange)
  }

}
