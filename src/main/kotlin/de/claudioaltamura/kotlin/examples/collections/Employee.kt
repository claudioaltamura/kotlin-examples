package de.claudioaltamura.kotlin.examples.collections

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as Employee

		if (firstName != other.firstName) return false
		if (lastName != other.lastName) return false
		if (startYear != other.startYear) return false

		return true
	}

	override fun hashCode(): Int {
		var result = firstName.hashCode()
		result = 31 * result + lastName.hashCode()
		result = 31 * result + startYear
		return result
	}

	override fun toString(): String {
		return "Employee(firstName='$firstName', lastName='$lastName', startYear=$startYear)"
	}

}