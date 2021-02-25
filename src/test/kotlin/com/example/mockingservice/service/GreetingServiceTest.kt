package com.example.mockingservice.service

import com.example.mockingservice.model.Cat
import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import io.kotest.property.Arb
import io.kotest.property.arbitrary.string
import io.kotest.property.checkAll

class GreetingServiceTest: WordSpec({
    "getGreeting()" should {
        "return 'Hello, Nightwingus!' and Nightwing's data for the name Nightwingus" {
            GreetingService().getGreeting("Nightwingus").run {
                this.content shouldBe "Hello, Nightwingus!"
                this.cat shouldBe Cat(name = "Nightwing", age = 5)
            }
        }
        "return 'Hello, Lumpy' and Gollum's data for the name Lumpy" {
            GreetingService().getGreeting("Lumpy").run {
                this.content shouldBe "Hello, Lumpy!"
                this.cat shouldBe Cat(name = "Gollum", age = 6)
            }
        }
        "return 'Hello, world!' and no cat for an unrecognized name" {
            checkAll(Arb.string(range = 1..4)) { name ->
                GreetingService().getGreeting(name).run {
                    this.content shouldBe "Hello, $name!"
                    this.cat shouldBe null
                }
            }
        }
    }
})
