package com.hex.honeycomb.api.company.model

import com.hex.honeycomb.api.user.model.User

data class SignUpData(
    val company: Company,
    val user: User
)
