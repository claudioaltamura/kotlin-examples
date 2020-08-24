package de.claudioaltamura.kotlin.examples

class ClassWithCompanion2 private constructor(val something: String){
    companion object {
        fun upperOrLower(str: String, upper: Boolean): ClassWithCompanion2 {
            if(upper) {
                return ClassWithCompanion2(str.toUpperCase())
            }
            return ClassWithCompanion2(str.toLowerCase())
        }
    }
}