package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
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
    str.let{println(it)}
  }

}
