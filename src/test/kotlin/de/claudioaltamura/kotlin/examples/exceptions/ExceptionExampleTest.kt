package de.claudioaltamura.kotlin.examples.exceptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

class ExceptionExampleTest {

    @Test
    fun nameIsNotNull() {
        assertThat(nameLengthSafe("Angelo")).isEqualTo(6)
    }

    @Test
    fun nameIsNull() {
        assertFailsWith<Exception> {
            nameLength(null)
        }
    }

}
