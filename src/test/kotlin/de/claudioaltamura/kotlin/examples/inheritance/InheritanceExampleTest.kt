package de.claudioaltamura.kotlin.examples.inheritance

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class InheritanceExampleTest {

    @Test
    fun `child class`() {
        val child = ChildClass("child")
        assertEquals("child",child.name)
    }

}