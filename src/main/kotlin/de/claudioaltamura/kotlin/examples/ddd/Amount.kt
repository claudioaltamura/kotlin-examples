package de.claudioaltamura.kotlin.examples.ddd

import java.math.BigDecimal
import java.math.RoundingMode

data class Amount(
        val value: BigDecimal
) : Comparable<Amount> {

    override operator fun compareTo(other: Amount): Int =
            this.value.compareTo(other.value)

    override fun equals(other: Any?): Boolean {
        if (other == null) {
            return false
        }
        return this.compareTo(other as Amount) == 0
    }

    override fun hashCode(): Int {
        return value.multiply(BigDecimal("100")).intValueExact()
    }

    operator fun plus(b: Amount) = Amount(this.value + b.value)

    operator fun minus(b: Amount) = Amount(this.value - b.value)

    companion object {
        fun scaleToTwoDecimals(value: BigDecimal) =
                Amount(value.setScale(2, RoundingMode.HALF_EVEN))
    }

}

