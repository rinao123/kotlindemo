package com.rinao.demo.kotlindemo.user.service.impl

import com.rinao.demo.kotlindemo.user.entity.User
import com.rinao.demo.kotlindemo.user.repository.UserRepository
import com.rinao.demo.kotlindemo.user.service.UserService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    @Autowired
    lateinit var userRepository: UserRepository

    override fun getAllUserList(): List<User> {
        return userRepository.queryAll()
    }

    override fun getUserById(id: Long): User? {
        return userRepository.queryById(id)
    }
}