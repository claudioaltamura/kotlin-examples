package de.claudioaltamura.kotlin.examples

abstract class AbstractClass(name: String) : ParentClass(name) {

    fun printName() = println("Name: $name")

}