package de.claudioaltamura.kotlin.examples.scopedunctions

fun multiplyFilterAndSum(numbers: MutableList<Int>): Int =
    numbers.map {it * 2}.filter{it > 4}.let {
        it.sum()
    }

fun plusAndSum(plus: Int, numbers: MutableList<Int>): Int {
    //with(numbers)
    val list = numbers.plus(plus)
    return list.sum()
}

fun lengthOfString(str: String): Int = str.length
