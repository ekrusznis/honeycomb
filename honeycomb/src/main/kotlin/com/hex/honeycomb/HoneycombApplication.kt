package com.hex.honeycomb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HoneycombApplication

fun main(args: Array<String>) {
	runApplication<HoneycombApplication>(*args)
	println("***STARTED APPLICATION***")
}
