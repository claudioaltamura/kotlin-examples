package de.claudioaltamura.kotlin.examples.lambda

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

	override fun toString(): String {
		return "Employee(firstName='$firstName', lastName='$lastName', startYear=$startYear)"
	}
}