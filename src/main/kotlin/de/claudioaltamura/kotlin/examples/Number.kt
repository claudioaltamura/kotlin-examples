package de.claudioaltamura.kotlin.examples

fun getNumber(str: String): Int {
	return try {
		Integer.parseInt(str)
	}
	catch(e: NumberFormatException) {
		0
	}
}

fun getNumberNullable(str: String): Int? {
	return try {
		Integer.parseInt(str)
	}
	catch(e: NumberFormatException) {
		null
	}
}