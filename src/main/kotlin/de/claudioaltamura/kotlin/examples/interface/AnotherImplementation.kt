package de.claudioaltamura.kotlin.examples.`interface`

open class AnotherImplementation: MySubInterface {

  val prop: String

  constructor(something: String) {
    prop = something
  }

  override fun method(number: Int): Int {
    return number + number;
  }

  override fun anotherMethod(name: String): String {
    return "$name $prop".toUpperCase();
  }

}
