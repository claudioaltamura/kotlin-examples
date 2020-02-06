package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NullReferencesTest {

  @Test
  fun testJustAnotherPrintMethdod() {
    val str: String ? = "boo"
    println("What happens: ${justAnotherUppercaseMethod(str)}")
    assertEquals("BOO", justAnotherUppercaseMethod(str))

    //KotlinNullPointerException
    //val strNull: String ? =  null
    //assertEquals("BOO", justAnotherUppercaseMethod(strNull))
  }

  @Test
  fun testNullReferences() {
    val str: String ? = null
    str?.let{println(it)}
  }

  @Test
  fun testNeverNull() {
    val string: String? = "not null"
    val stringNeverNull = string!!.toUpperCase()
    assertEquals("NOT NULL", stringNeverNull)
  }

  @Test
  fun testAMethodWithElvisOperator() {
    assertEquals("test", aMethodWithElvisOperator("test"))
    assertEquals("default", aMethodWithElvisOperator(null))
  }

  @Test
  fun testPersonAndAddress() {
    val address = Address("street", "city", "12345")
    val person = Person("Colt", address)

    assertEquals("street", person?.address?.street)
  }

}
