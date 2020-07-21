package de.claudioaltamura.kotlin.examples

class TodoSimple(val name: String)

class TodoInit constructor(var name: String) {

    //explizit
    init {
        this.name = name
    }
}

class TodoConstructor(val name: String) {

    var description : String = ""

    constructor(name: String, description: String): this(name) {
        this.description = description
    }

}