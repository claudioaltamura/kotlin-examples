package de.claudioaltamura.kotlin.examples.inheritance

import de.claudioaltamura.kotlin.examples.ParentClass

abstract class AbstractClass(name: String) : ParentClass(name) {

    fun printName() = println("Name: $name")

}