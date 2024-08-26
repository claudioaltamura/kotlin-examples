package de.claudioaltamura.kotlin.examples.functional

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HighOrderFunctionExampleTest {

    @Test
    fun add() {
        val result = calculate(1,2) { x, y -> x + y }
        assertEquals(3, result)
    }

    @Test
    fun multiply() {
        val result = calculate(1,2) { x, y -> x * y }
        assertEquals(2, result)
    }

}