package de.claudioaltamura.kotlin.examples

fun printPerson(vararg persons: Person):String {
    var ret = ""
    for(person in persons) {
        ret += person.name  + " "
    }
    return ret;
}