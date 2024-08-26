package de.claudioaltamura.kotlin.examples.functional

fun calculate(
    x: Int,
    y: Int,
    op: (x: Int, y: Int) -> Int
): Int {
    return op(x,y)
}
