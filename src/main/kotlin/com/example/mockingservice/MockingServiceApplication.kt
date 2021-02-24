package com.example.mockingservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MockingServiceApplication

fun main(args: Array<String>) {
	runApplication<MockingServiceApplication>(*args)
}
