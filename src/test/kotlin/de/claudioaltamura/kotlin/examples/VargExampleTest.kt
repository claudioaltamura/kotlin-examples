package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class VargExampleTest {

    @Test
    fun printPerson() {
        var actual = printPerson(Person("Peter", Address("street", "city","code")), Person("Angelo", Address("street", "city","code")))
        assertEquals("Peter Angelo ", actual)
    }

}