package de.claudioaltamura.kotlin.examples

fun example() {

  val sum = { x: Int, y: Int -> x + y }
  val square: (Int) -> Int = { x -> x * x }

  sum(1, square(2)) == 5
}
