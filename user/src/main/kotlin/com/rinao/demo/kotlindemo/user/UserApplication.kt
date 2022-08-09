package com.rinao.demo.kotlindemo.user

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@MapperScan("com.rinao.demo.kotlindemo.user.repository")
@SpringBootApplication
@EnableDiscoveryClient
class UserApplication

fun main(args: Array<String>) {
	runApplication<UserApplication>(*args)
}
