package de.claudioaltamura.kotlin.examples

fun someMethod(a: Int, func: () -> Unit):Int {
    func()
    return 2*a
}

fun main(args: Array<String>) {
    println(someMethod(2,{println("inline function")}))
}