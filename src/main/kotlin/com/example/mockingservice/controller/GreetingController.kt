package com.example.mockingservice.controller

import com.example.mockingservice.controller.converter.toControllerModel
import com.example.mockingservice.controller.model.Greeting
import com.example.mockingservice.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(@Autowired private val greetingService: GreetingService) {
    @GetMapping("/greeting")
    fun getGreeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting =
        greetingService.getGreeting(name).toControllerModel()
}
