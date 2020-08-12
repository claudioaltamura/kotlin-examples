package de.claudioaltamura.kotlin.examples

enum class Department(val depName: String, val numEmployees: Int) {
    IT("IT",10),
    SALES("Sales", 5);

    fun getInfo() = "The $depName department has $numEmployees employees."
}