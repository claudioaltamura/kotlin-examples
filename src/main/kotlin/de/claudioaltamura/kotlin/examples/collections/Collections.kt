package de.claudioaltamura.kotlin.examples.collections

fun anyEven(collection: Collection<Int>): Boolean {
    val pred: (Int) -> Boolean = {x -> x.rem(2) == 0}
    return collection.any(pred)
}

fun filterEmployees(
    employees: List<Employee>,
    predicate: (Employee) -> Boolean,
) = employees.filter(predicate)

fun mapEmployees(filterPredicate: (Employee) -> Boolean, employees: List<Employee>): Map<Int, List<Employee>> =
    employees.filter(filterPredicate).groupBy{it.startYear}