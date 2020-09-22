package de.claudioaltamura.kotlin.examples.inheritance

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PrinterTest {

    @Test
    fun laserPrinter() {
        val laserPrinter = LaserPrinter("Laser1")
        assertEquals("Laser1", laserPrinter.modelName)
    }

}
