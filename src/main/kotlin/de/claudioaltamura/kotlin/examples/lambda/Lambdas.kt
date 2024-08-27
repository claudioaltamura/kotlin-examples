package de.claudioaltamura.kotlin.examples

import de.claudioaltamura.kotlin.examples.lambda.Employee

fun example() {

  val sum = { x: Int, y: Int -> x + y }
  val square: (Int) -> Int = { x -> x * x }

  sum(1, square(2)) == 5
}

fun anyEven(collection: Collection<Int>): Boolean {
  val pred: (Int) -> Boolean = {x -> x.rem(2) == 0}
  return collection.any(pred)
}

fun filterEmployees(
  employees: List<Employee>,
  predicate: (Employee) -> Boolean,
) = employees.filter(predicate)
