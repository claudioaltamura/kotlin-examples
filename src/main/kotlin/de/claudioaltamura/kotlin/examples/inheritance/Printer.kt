package de.claudioaltamura.kotlin.examples.inheritance

abstract class Printer(val modelName: String) {
    open fun printModel() = println("modelname $modelName")
    abstract fun price(): Double
}

class LaserPrinter(modelName: String): Printer(modelName) {
    override fun printModel() = println("model: $modelName")
    final override fun price(): Double = 123.0
}