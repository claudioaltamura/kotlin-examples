package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SetTest {

  @Test
  fun contains() {
    val lang = languages()
    lang.forEach { e -> println(e)}
    assertTrue(lang.contains("italian"))
  }

}
