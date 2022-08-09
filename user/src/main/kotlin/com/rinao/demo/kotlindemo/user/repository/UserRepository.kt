package com.rinao.demo.kotlindemo.user.repository

import com.rinao.demo.kotlindemo.user.entity.User
import org.springframework.stereotype.Repository

@Repository
interface UserRepository {
    fun queryAll(): List<User>
    fun queryById(id: Long): User?
}