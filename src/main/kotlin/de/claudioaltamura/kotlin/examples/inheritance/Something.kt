package de.claudioaltamura.kotlin.examples.inheritance

open class Anything(val x: String) {
}

open class Something {
    val property: String

    constructor(prop: String) {
        property = prop
    }

}

class ConcreteSomething : Something {
    constructor(something: String): super(something)
}