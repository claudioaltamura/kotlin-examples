package de.claudioaltamura.kotlin.examples.ddd

val pattern = "[a-z0-9]{3,}".toRegex()

data class StringId(
        val value: String
) {
    init {
        require(pattern.matches(value)) {
            "id $value does not match the pattern $pattern."
        }
    }

    override fun toString(): String = value.toString()
}
