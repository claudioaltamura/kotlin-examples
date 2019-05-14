package de.claudioaltamura.kotlin.examples

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false): String =
  if (toUpperCase) name.toUpperCase() + number else name + number

fun task3(): String {
  return (foo("a") +
    foo("b", number = 1) +
    foo("c", toUpperCase = true) +
    foo(name = "d", number = 2, toUpperCase = true))
}
