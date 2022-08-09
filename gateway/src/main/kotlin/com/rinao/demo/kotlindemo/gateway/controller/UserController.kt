package com.rinao.demo.kotlindemo.gateway.controller

import com.rinao.demo.kotlindemo.gateway.common.Response
import com.rinao.demo.kotlindemo.gateway.entity.User
import com.rinao.demo.kotlindemo.gateway.service.UserService
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
    fun getUserList(): Response {
        val userList: List<User> = userService.getUserList()
        val data: Map<String, List<User>> = mapOf("userList" to userList)
        return Response.success(data)
    }

    @RequestMapping("/{id}")
    fun getUserById(@PathVariable("id") id: Long): Response {
        val user: User? = userService.getUserById(id)
        return if (user != null) {
            val data: Map<String, User> = mapOf("user" to user)
            Response.success(data)
        } else {
            Response.fail(1, "用户不存在")
        }
    }
}
