package de.claudioaltamura.kotlin.examples.ddd

data class FunctionalId(
        val value: Int
) {
    override fun toString(): String = value.toString()
}
