package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RawStringTest {

  @Test
  fun testRaw() {
    val expected = """
    |Kotlin is interesting.
    |Kotlin is sponsored and developed by JetBrains.
"""

    assertEquals(expected, raw())
  }

}
