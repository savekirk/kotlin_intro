package com.gdgdevfest.kotlin.Introduction._7Lambdas


fun higherOrder(value: String, op: (String) -> String): String {
    println("Executing the operation $op")
    return op(value)
}




fun lowerCase(value: String) = value.toLowerCase()

fun main(args: Array<String>) {
    println(higherOrder("HELLO", ::lowerCase))
}
