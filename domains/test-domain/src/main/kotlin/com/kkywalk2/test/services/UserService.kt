package com.kkywalk2.test.services

import com.kkywalk2.test.entity.User
import com.kkywalk2.test.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun findById(id: Int): User {
        return userRepository.findById(id).orElseThrow()
    }
}