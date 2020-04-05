package de.claudioaltamura.kotlin.examples.ddd

sealed class SealedClass {
    data class StringId(val id: String): SealedClass()
}