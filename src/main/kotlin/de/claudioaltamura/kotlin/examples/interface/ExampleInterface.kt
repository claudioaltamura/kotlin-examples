package de.claudioaltamura.kotlin.examples.`interface`

interface ExampleInterface {
  fun method(number: Int): Int
}

interface MySubInterface: ExampleInterface {
  fun anotherMethod(name: String): String
}
