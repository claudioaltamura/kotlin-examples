package de.claudioaltamura.kotlin.examples

import java.time.Year

object CopyrightLine {
    val year = Year.now().value
    internal fun getLine() = "Copyright $year " + extension()
}

private fun extension() = "All Rights reserved."