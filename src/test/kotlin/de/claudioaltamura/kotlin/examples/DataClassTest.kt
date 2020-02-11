package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test

class DataClassTest {

  @Test
  fun copy() {
    val person = Person("Peter", Address("street", "city","code"))
    val copiedPerson = person.copy(name = "Angelo")
    assertNotEquals(person, copiedPerson)
    assertEquals(person.address, copiedPerson.address)
  }

  @Test
  fun destructing() {
    val person = Person("Peter", Address("street", "city", "code"))
    val (name) = person

    val string = "name: $name"

    assertEquals("name: Peter", string)
  }

}
