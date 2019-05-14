package de.claudioaltamura.kotlin.examples

fun toJson(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")
