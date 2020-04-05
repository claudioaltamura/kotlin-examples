package de.claudioaltamura.kotlin.examples.ddd

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class SealedClassTest {

    @Test
    fun `pattern matching with sealed class`() {
        val sealedClass = SealedClass.StringId("abc")

        val id = when(sealedClass) {
            is SealedClass.StringId -> "abc"
            else -> ""
        }

        assertThat(id).isEqualTo("abc")
    }

}