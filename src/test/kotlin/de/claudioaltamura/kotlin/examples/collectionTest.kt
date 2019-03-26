package de.claudioaltamura.kotlin.examples

import kotlin.test.assertEquals
import org.junit.Test

class CollectionTest {

  @Test fun testToJson() {
    val options = listOf("a", "b", "c")
    assertEquals("[a, b, c]", toJson(options))
  }

}
