package com.example.mockingservice.service

import com.example.mockingservice.model.Cat
import com.example.mockingservice.model.Greeting
import org.springframework.stereotype.Component

@Component
class GreetingService {
    fun getGreeting(name: String): Greeting =
        when (name) {
            "Nightwingus" -> Greeting(
                content = "Hello, $name!",
                cat = Cat(name = "Nightwing", age = 5)
            )
            "Lumpy" -> Greeting(
                content = "Hello, $name!",
                cat = Cat(name = "Gollum", age = 6)
            )
            else -> Greeting(content = "Hello, $name!", cat = null)

        }
}
