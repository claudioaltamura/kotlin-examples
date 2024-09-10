package de.claudioaltamura.kotlin.examples.scopedfunctions

import de.claudioaltamura.kotlin.examples.scopedunctions.multiplyFilterAndSum
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScopedFunctionsTest {

    @Test
    fun testMultiplyFilterAndSum() {
        assertThat(multiplyFilterAndSum(mutableListOf(1,2,3,4,5))).isEqualTo(24)
    }

}
