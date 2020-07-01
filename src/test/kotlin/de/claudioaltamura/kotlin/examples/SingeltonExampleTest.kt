package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import de.claudioaltamura.kotlin.examples.SingeltonExample.copyright

class SingeltonExampleTest {

    @Test
    fun testCopyright() {
        val str = copyright()
        //copyright 2020
        assertEquals("copyright", str.substringBefore(" "))
    }
}