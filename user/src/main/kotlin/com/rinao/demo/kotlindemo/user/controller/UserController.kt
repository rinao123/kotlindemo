package com.rinao.demo.kotlindemo.user.controller

import com.rinao.demo.kotlindemo.user.entity.User
import com.rinao.demo.kotlindemo.user.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user")
class UserController {
    @Autowired
    lateinit var userService: UserService

    @RequestMapping("/all")
    fun getUserList(): List<User> {
        return userService.getAllUserList()
    }

    @RequestMapping("/{id}")
    fun getUserById(@PathVariable("id") id: Long): User? {
        return userService.getUserById(id)
    }
}