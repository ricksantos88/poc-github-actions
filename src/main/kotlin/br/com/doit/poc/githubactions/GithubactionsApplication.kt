package br.com.doit.poc.githubactions

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GithubactionsApplication

fun main(args: Array<String>) {
	runApplication<GithubactionsApplication>(*args)
}
