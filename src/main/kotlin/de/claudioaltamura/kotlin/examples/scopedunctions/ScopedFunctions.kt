package de.claudioaltamura.kotlin.examples.scopedunctions

fun multiplyFilterAndSum(numbers: MutableList<Int>): Int =
    numbers.map {it * 2}.filter{it > 4}.let {
        it.sum()
    }

