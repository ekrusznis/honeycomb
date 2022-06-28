package com.hex.honeycomb.api.user.repository

import com.hex.honeycomb.api.user.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Int> {
}