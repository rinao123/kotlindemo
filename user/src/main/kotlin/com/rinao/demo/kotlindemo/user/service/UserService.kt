package com.rinao.demo.kotlindemo.user.service

import com.rinao.demo.kotlindemo.user.entity.User

interface UserService {
    fun getAllUserList(): List<User>
    fun getUserById(id: Long): User?
}
