package de.claudioaltamura.kotlin.examples

class ClassWithCompanion {
    companion object {
        private var myVar = 1;
        fun myVar() = "myVar = ${myVar}"
    }
}