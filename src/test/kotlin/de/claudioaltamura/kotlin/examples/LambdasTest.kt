package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LambdasTest {

  @Test
  fun contains() {
    assertTrue(anyEven(listOf(1, 2, 3)))
  }

  @Test
  fun notContains() {
    assertFalse(anyEven(listOf(1, 3, 5)))
  }
}
