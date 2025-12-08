package io.mango.cdcexample

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<CdcExampleApplication>().with(TestcontainersConfiguration::class).run(*args)
}
