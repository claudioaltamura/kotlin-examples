package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    fun `label prints`() {
        assertEquals("label 1 * 2",label(1,2))
    }

    @Test
    fun `prints first letter uppercase`() {
        assertEquals("Hello", upperFirst("hello"))
    }

    @Test
    fun `inline function`() {
        assertEquals(4, someMethod(2,{"Test"}))
    }

}
