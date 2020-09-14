package de.claudioaltamura.kotlin.examples.`interface`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ExampleInterfaceTest {

    @Test
    fun mustImplement() {
        val example = ExampleImplementation()
        assertEquals(2, example.method(1))
    }

    @Test
    fun anonymous() {
        val example = object : ExampleInterface {
            override fun method(number: Int): Int {
                return number
            }
        }

        assertEquals(1, example.method(1))
    }
}