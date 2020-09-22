package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EnumExampleTest {

    @Test
    fun testEquals()  {
        assertEquals(Department.IT.getInfo(), "The IT department has 10 employees.")
    }

}
