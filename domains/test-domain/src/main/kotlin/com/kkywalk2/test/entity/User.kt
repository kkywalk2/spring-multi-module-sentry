package com.kkywalk2.test.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity(name = "test_users")
class User (
    @Id
    val id: Int,

    @Column
    val name: String
)