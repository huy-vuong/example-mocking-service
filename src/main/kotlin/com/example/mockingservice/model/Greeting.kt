package com.example.mockingservice.model

data class Cat(val name: String, val age: Int)

data class Greeting(val content: String, val cat: Cat?)
