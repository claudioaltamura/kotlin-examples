package de.claudioaltamura.kotlin.examples.exceptions

fun nameLengthSafe(name: String?): Int? {
    val result = try {
        name!!.length
    } catch (ex: Exception) {
        null
    }
    return result
}

fun nameLength(name: String?): Int? {
    return name!!.length
}