package de.claudioaltamura.kotlin.examples

class Employee(var name: String, val id : Int) {

    override fun toString() : String = name + "," + id
}
