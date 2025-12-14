package io.mango.cdcexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CdcExampleApplication

fun main(args: Array<String>) {
    System.setProperty("spring.config.name", "application,application-infrastructure")
    runApplication<CdcExampleApplication>(*args)
}
