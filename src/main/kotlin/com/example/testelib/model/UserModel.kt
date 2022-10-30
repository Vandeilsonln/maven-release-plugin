package com.example.testelib.model

class UserModel(private val name: String, private val age: Int) {

    fun doSomething() {
        println("My name is ${this.name} and I'm ${this.age} years old")
    }
}