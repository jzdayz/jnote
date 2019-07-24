package com.example

import java.io.File

data class Customer(val name: String = "", val email: String = "0") {
    fun sayHello(call: String) {
        println(" I say $call ")
    }


}

fun main(args: Array<String>) {
    // list
    mutableListOf("a", "b").forEach { x -> println(x) }

    // map
    mutableMapOf("a" to 123, "bbb" to 123).forEach { (t, u) -> println("key $t value $u") }

    // lazy
    val p: String by lazy {
        "aa"
    }
    println(p)

    // 拓展函数
    fun String.spaceToCamelCase(): String {
        return "哈哈"
    }

    val res = "Convert this to camelcase".spaceToCamelCase()
    println("结果集 $res")

    val files = File("A").listFiles()
    // 如果files是空，的话就为0
    println(files?.size ?: 0)

    val values = mutableMapOf("email" to 1, "b" to 2)
    // 如果map中 email的key没有值的话，抛异常
    val email = values["email"] ?: throw IllegalStateException("Email is missing!")

    // when 语句
    println(describe(1))

    // for
    for(x in 0..10)
        println(x)

}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

object Resource {
    val name = "Name"
}