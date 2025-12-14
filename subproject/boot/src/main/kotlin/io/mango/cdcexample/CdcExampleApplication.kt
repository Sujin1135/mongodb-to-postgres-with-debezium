package io.mango.cdcexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CdcExampleApplication

fun main(args: Array<String>) {
    runApplication<CdcExampleApplication>(*args)
}
