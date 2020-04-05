package de.claudioaltamura.kotlin.examples.ddd

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class AmountTest {

    @Test
    fun `plus operator`() {
        // given
        val a = Amount(BigDecimal("10.00"))
        val b = Amount(BigDecimal("9.50"))
        // when
        val result = a + b
        // then
        assertEquals(BigDecimal("19.50"),result.value)
    }

    @Test
    fun `scale to two decimals`() {
        assertThat(Amount.scaleToTwoDecimals(BigDecimal("1.235")))
                .isEqualTo(Amount(BigDecimal("1.24")))
    }

}