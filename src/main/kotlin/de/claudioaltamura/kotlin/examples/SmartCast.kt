package de.claudioaltamura.kotlin.examples

fun demo(x: Any): Boolean {
  if (x is String) {
    return true
  }
  return false
}

fun safeCast(y: Any): String {
  var x: String = y as String
  return x
}
