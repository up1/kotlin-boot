package demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/hello")
    fun greeting(@RequestParam(value = "name", defaultValue = "somkiat") name: String) =
            Hello("Hello, $name")

}