package com.example.mockingservice.controller.converter

import com.example.mockingservice.controller.model.Cat as ControllerCat
import com.example.mockingservice.controller.model.Greeting as ControllerGreeting
import com.example.mockingservice.model.Greeting as ServiceGreeting

fun ServiceGreeting.toControllerModel(): ControllerGreeting =
    ControllerGreeting(
        content = this.content,
        cat = this.cat?.run {
            ControllerCat(name = this.name, age = this.age)
        }
    )
