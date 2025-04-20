package org.octoosmo.ring

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Main

private val logger = LoggerFactory.getLogger(Main::class.java)

fun main(args: Array<String>) {
    logger.info("Starting Ring Messenger...")
    runApplication<Main>(*args)
}
