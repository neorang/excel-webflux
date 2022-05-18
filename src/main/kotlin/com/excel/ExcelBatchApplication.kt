package com.excel

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExcelBatchApplication

fun main(args: Array<String>) {
	runApplication<ExcelBatchApplication>(*args)
}
