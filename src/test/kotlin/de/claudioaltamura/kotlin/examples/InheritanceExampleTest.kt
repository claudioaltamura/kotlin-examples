package de.claudioaltamura.kotlin.examples

import de.claudioaltamura.kotlin.examples.ddd.Amount
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import org.junit.jupiter.api.Assertions.*;

class InheritanceExampleTest {

    @Test
    fun `child class`() {
        val child = ChildClass("child")
        assertEquals("child",child.name)
    }

}