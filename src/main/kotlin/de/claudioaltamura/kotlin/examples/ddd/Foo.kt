package de.claudioaltamura.kotlin.examples.ddd

class Foo (val functionalId: FunctionalId, val someValue : String) {
  override fun toString(): String {
    return "Foo(id='$functionalId', value=$someValue)"
  }
}
