package com.example

data class Customer(val name: String = "", val email: String = "0"){
    fun sayHello( call:String) {
        println(" I say $call ")
    }
}