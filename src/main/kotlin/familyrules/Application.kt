package pl.zarajczyk.familyrules

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyFamilyApplication

fun main(args: Array<String>) {
    runApplication<MyFamilyApplication>(*args)
}
