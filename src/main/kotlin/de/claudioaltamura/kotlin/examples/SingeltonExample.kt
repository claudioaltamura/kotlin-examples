package de.claudioaltamura.kotlin.examples

import de.claudioaltamura.kotlin.examples.SingeltonExample.copyright
import java.time.Year.*

object SingeltonExample {

    val year = now().value

    fun copyright() = "copyright $year"
}

fun main(args: Array<String>) {
    println(copyright())
}