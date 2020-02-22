package de.claudioaltamura.kotlin.examples.ddd

import de.claudioaltamura.kotlin.examples.arrayWithLambdaExpression
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DDDExamplesTest {

  @Test
  fun testValueObjects() {
    val instance = Foo(FunctionalId(1), "hello")
    assertEquals("Foo(id='1', value=hello)", instance.toString())
  }
}
