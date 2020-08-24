package de.claudioaltamura.kotlin.examples

import junit.framework.Assert.assertEquals
import org.junit.jupiter.api.Test

class ClassWithCompanionTest {

    @Test
    fun test() {
        assertEquals("myVar = 1", ClassWithCompanion.myVar())
    }

    @Test
    fun upper() {
        assertEquals("HELLO", ClassWithCompanion2.upperOrLower("Hello", true).something)
    }
}