package de.claudioaltamura.kotlin.examples

class Employee(var name: String, val id : Int) {

    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Employee)
            return false
        return id == other.id && name==other.name
    }

    override fun hashCode(): Int =
            31+id * name.hashCode()

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }


}
