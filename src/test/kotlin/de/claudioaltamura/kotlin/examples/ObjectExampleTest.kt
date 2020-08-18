package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertTrue

class ObjectExampleTest {

    @Test
    fun testCopyrightLine() {
        assertTrue(CopyrightLine.getLine().contains("Copyright"))
    }

}