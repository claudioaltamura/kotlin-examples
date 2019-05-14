package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CollectionTest {

  @Test fun testToJson() {
    val options = listOf("a", "b", "c")
    assertEquals("[a, b, c]", toJson(options))
  }

}
