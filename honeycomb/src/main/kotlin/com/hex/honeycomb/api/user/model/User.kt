package com.hex.honeycomb.api.user.model

import com.hex.honeycomb.api.company.model.Company
import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn

data class User(
    @GeneratedValue
    @Id private val id: Int,
    @Column(name = "first_name") val firstName: String,
    @Column(name = "last_name") val lastName: String,
    @Column(name = "admin") val isAdmin: Boolean,
    @Column(name = "hourly") val isHourlyEmployee: Boolean,
    @Column(name = "salary") val salary: BigDecimal,
    @Column(name = "hourly_wage") val hourlyWage: BigDecimal,
    @JoinColumn(name = "company_id") val companyId: Company
)
