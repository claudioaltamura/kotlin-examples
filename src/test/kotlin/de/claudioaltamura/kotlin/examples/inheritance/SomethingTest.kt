package de.claudioaltamura.kotlin.examples.inheritance

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SomethingTest {

    @Test
    fun anything() {
        val anything = Anything("ciao")
        assertEquals("ciao", anything.x)
    }

    @Test
    fun concrete() {
        val something = ConcreteSomething("hello")
        assertEquals("hello", something.property)
    }

}
