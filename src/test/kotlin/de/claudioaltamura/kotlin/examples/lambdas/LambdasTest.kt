package de.claudioaltamura.kotlin.examples.lambdas

import de.claudioaltamura.kotlin.examples.anyEven
import de.claudioaltamura.kotlin.examples.filterEmployees
import de.claudioaltamura.kotlin.examples.lambda.Employee

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LambdasTest {

  @Test
  fun contains() {
    assertTrue(anyEven(listOf(1, 2, 3)))
  }

  @Test
  fun notContains() {
    assertFalse(anyEven(listOf(1, 3, 5)))
  }

  @Test
  fun squareExample() {
    val square = { number: Int -> number * number }
    assertEquals(4,square(2))
  }

  @Test
  fun magnitude() {
    val magnitude100String = { input: Int ->
      val magnitude = input * 100
      magnitude.toString()
    }
    assertEquals("200",magnitude100String(2))
  }

	@Test
	fun employeeMinBy() {
		val employees = listOf(Employee("Peter", "Parker", 2017), Employee("Angelo", "Peter",2015))
		val minBy = employees.minBy(Employee::startYear) //employees.minBy { e -> e.startYear }

		assertEquals("Employee(firstName='Angelo', lastName='Peter', startYear=2015)", minBy.toString())
	}

    @Test
    fun filterByYear() {
        val employees = listOf(Employee("Peter", "Parker", 2017), Employee("Angelo", "Peter",2015))
        val filterByYear = { e: Employee -> e.startYear == 2015 }

        assertEquals(listOf(Employee("Angelo", "Peter",2015)), filterEmployees(employees, filterByYear))
    }

}
