package de.claudioaltamura.kotlin.examples.ddd

import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.assertFailsWith
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class StringIdTest {

    @Test
    fun validValue() {
        val id = StringId("hello")
        assertEquals("hello", id.value)
    }

    @Test
    fun invalidTooShort() {
        assertFailsWith(IllegalArgumentException::class, {StringId("ha")})
    }

}