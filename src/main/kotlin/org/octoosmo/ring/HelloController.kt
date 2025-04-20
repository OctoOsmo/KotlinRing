package org.octoosmo.ring

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    private val logger: Logger = LoggerFactory.getLogger(HelloController::class.java)

    @GetMapping("/hello")
    fun hello(): String {
        logger.info("Received request to the root endpoint")
        return "Hello, welcome to Ring!"
    }
}