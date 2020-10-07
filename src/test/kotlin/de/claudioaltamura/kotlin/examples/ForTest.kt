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

  @Test
  fun testRangeDownTo() {
    val range = 5.downTo(1);

    var result = ""
    for(i in range) {
      result += i
    }

    assertEquals("54321", result)
  }


  @Test
  fun testRangeStepped() {
    val range = 1..5

    var result = ""
    for(i in range.step(2)) {
      result += i
    }

    assertEquals("135", result)
  }

  @Test
  fun testRangeStepAlternative() {
    var result = ""
    for(num in 1..20 step 4) {
      result += num
    }
    assertEquals("1591317" ,result);
  }


  @Test
  fun testCharRangeReversed() {
    val charRange = 'a'..'c'

    var result = ""
    for(i in charRange.reversed()) {
      result += i
    }

    assertEquals("cba", result)
  }

}
