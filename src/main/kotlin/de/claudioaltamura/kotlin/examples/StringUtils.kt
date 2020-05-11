package de.claudioaltamura.kotlin.examples

fun upperFirst(str: String): String {
    return str.substring(0,1).toUpperCase() + str.substring(1);
}