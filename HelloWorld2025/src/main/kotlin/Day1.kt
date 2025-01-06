package com.neojou

fun Day1() {
    val a = 5
    println("a = $a")

    var b : Long = 6
    println("At first, Long b = $b")

    b = a.toLong()
    println("Assign Int a value to Long b = $b")

    val ifAEqualsB = (b == 5L)
    println("if b equals 5 ? $ifAEqualsB ")
}
