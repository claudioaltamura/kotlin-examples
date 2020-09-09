package de.claudioaltamura.kotlin.examples.inheritance

import junit.framework.Assert.assertEquals
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PrinterTest {

    @Test
    fun laserPrinter() {
        val laserPrinter = LaserPrinter("Laser1")
        assertEquals("Laser1", laserPrinter.modelName)
    }

}