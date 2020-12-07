package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class TryCatchTest {

	@Test
	fun test() {
		assertThat(getNumber("2.5")).isEqualTo(0)
	}

	@Test
	fun testNullable() {
		assertThat(getNumberNullable("2.5")).isNull()
	}

}