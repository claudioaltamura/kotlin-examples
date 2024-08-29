package de.claudioaltamura.kotlin.examples.collections

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CollectionsTest {

    val employees = listOf(Employee("Peter", "Parker", 2017), Employee("Angelo", "Peter", 2015), Employee("Ollie", "van Dunk", 2015))

    @Test
    fun employeeMinBy() {
        val minBy = employees.minBy(Employee::startYear) //employees.minBy { e -> e.startYear }

        assertEquals("Employee(firstName='Angelo', lastName='Peter', startYear=2015)", minBy.toString())
    }

    @Test
    fun filterByYear() {
        val filterByYear = { e: Employee -> e.startYear == 2017 }

        assertEquals(listOf(Employee("Peter", "Parker", 2017)), filterEmployees(employees, filterByYear))
    }

    @Test
    fun mapByYear() {
        val filterByYear = { e: Employee -> e.startYear == 2017 }
        val employeesMap = mapEmployees(filterByYear, employees)

        assertThat(employeesMap[2017]).contains(Employee("Peter", "Parker", 2017))
    }

}
