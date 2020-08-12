package de.claudioaltamura.kotlin.examples

import junit.framework.Assert.assertEquals
import org.junit.jupiter.api.Test

class EnumExampleTest {

    @Test
    fun testEquals()  {
        assertEquals(Department.IT.getInfo(), "The IT department has 10 employees.")
    }

}