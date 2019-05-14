package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OkAndGreetingTest {
  @Test fun testGreeting() {
    assertEquals("Hello, world!", getGreeting())
  }

  @Test fun testStart() {
    assertEquals("OK", start())
  }
}
