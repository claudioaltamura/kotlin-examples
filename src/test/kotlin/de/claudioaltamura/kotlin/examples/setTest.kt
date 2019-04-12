package de.claudioaltamura.kotlin.examples

import org.junit.Test
import kotlin.test.assertTrue

class SetTest {

  @Test
  fun contains() {
    val lang = languages()
    lang.forEach { e -> println(e)}
    assertTrue(lang.contains("italian"))
  }

}
