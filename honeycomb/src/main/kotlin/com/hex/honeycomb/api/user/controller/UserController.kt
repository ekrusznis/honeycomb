package com.hex.honeycomb.api.user.controller

import com.hex.honeycomb.api.user.model.User
import com.hex.honeycomb.api.user.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/user")
class UserController(
    @Autowired private val userService: UserService
) {

    @GetMapping()
    fun getAllUsers(): List<User>{
        return userService.getAllUsers()
    }

    @GetMapping("/{id}")
    fun getUserById(
        @PathVariable id: Int
    ): User?{
        return userService.getUserById(id)
    }

    @PostMapping()
    fun createNewUser(
        @RequestBody user: User
    ): User{
        return userService.createNewUser(user)
    }

    @DeleteMapping("/{id}")
    fun deleteUserById(
        @PathVariable id: Int
    ): Boolean{
        return userService.deleteUserById(id)
    }
}