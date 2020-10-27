package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*;

class IfTest {

  @Test
  fun ifTestLong() {
    val num: Int
    var condition = true

    if (condition) {
      num =  42
    } else {
      num = 1
    }

    assertEquals(42, num);
  }

  @Test
  fun ifTestShort() {
    val num: Int
    var condition = true

    num = if (condition) {
      42
    } else {
      1
    }

    assertEquals(42, num);
  }

  @Test
  fun ifTestEvenShort() {
    val someCondition = true
    val anotherCondition = if(someCondition) 42 else 10

    assertEquals(42, anotherCondition)
  }

  @Test
  fun inlineIfTest() {
    var condition = true
    var result = "Is a inline if a good idea?: ${if(condition) 1 else 0}"

    assertEquals("Is a inline if a good idea?: 1",result)
  }

}
