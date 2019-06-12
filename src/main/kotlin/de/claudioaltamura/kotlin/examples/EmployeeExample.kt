package de.claudioaltamura.kotlin.examples

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>)  {

    var number: Int
    number = 10
    number = 20

    val employees: EmployeeSet

    val employee1 = Employee("Tom", 500)
    employee1.name = "Lynn Smith"

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane", 400)
    }
    else {
        employee2 = Employee("Mike", 150)
    }

    println(employee2)
}