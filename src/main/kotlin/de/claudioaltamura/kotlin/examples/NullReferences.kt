package de.claudioaltamura.kotlin.examples

fun justAnotherUppercaseMethod(message: String?): String {
  val anotherString = message!!.toUpperCase()
  return anotherString;
}

fun aMethodWithElvisOperator(message: String?): String {
  return message ?: "default"
}
