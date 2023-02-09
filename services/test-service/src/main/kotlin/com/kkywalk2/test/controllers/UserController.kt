package com.kkywalk2.test.controllers

import com.kkywalk2.test.entity.User
import com.kkywalk2.test.services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController(
    private val userService: UserService
) {

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): User {
        return userService.findById(id)
    }
}