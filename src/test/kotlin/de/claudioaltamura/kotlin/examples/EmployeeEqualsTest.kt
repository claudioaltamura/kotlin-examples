package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

class EmployeeEqualsTest {

  @Test
  fun testEquals() {
    val employee1 = Employee("Tom", 500)
    val employee2 = Employee("Tom", 500)
    val employee3 = Employee("Peter", 501)

    println("==")
    println(employee1==employee2)
    println(employee1==employee3)

    println("equals")
    println(employee1.equals(employee2))
    println(employee1.equals(employee3))

    assertEquals(employee1, employee2)
    assertNotEquals(employee1, employee3)

    println("===")
    println(employee1===employee2)
    println(employee1===employee3)
  }

}
