package com.rinao.demo.kotlindemo.gateway.service

import com.rinao.demo.kotlindemo.gateway.entity.User
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping


@FeignClient(name = "user")
interface UserService {
    @RequestMapping("/user/all")
    fun getUserList(): List<User>

    @RequestMapping("/user/{id}")
    fun getUserById(@PathVariable("id") id: Long): User?
}
