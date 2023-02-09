package com.kkywalk2.test.repository

import com.kkywalk2.test.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int> {
}