package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EmployeeToStringTest {

  @Test
  fun testToString() {
    val employee1 = Employee("Tom", 500)

    assertEquals(employee1.toString(), "Employee(name='Tom', id=500)")
  }

}
