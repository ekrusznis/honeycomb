package com.hex.honeycomb.api.user.service

import com.hex.honeycomb.api.user.model.User
import com.hex.honeycomb.api.user.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserService(
    @Autowired val userRepository: UserRepository
) {
    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    fun getUserById(id: Int): User? {
        return userRepository.findByIdOrNull(id)
    }

    fun createNewUser(user: User): User {
        return userRepository.save(user)
    }

    fun deleteUserById(id: Int): Boolean {
        val user = getUserById(id) ?: throw NotFoundException()
        userRepository.delete(user)

        return true
    }

}