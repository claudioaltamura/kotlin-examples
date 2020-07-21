package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructorExampleTest {

    @Test
    fun simple() {
        val todo = TodoSimple("a")
        assertEquals("a", todo.name)
    }

    @Test
    fun init() {
        val todo = TodoInit("a")
        assertEquals("a", todo.name)
    }

    @Test
    fun constructor() {
        val todo = TodoConstructor("a", "this is a description")
        assertEquals("this is a description", todo.description)
    }

}