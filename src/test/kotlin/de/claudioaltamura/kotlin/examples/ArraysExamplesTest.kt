package de.claudioaltamura.kotlin.examples

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArraysExamplesTest {

    @Test
    fun testArrayWithLambdaExpression() {
      val elements = arrayWithLambdaExpression()
      assertArrayEquals(arrayOf(1,2,3), elements)
    }

}
