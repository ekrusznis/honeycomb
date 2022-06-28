package com.hex.honeycomb.api.company.service

import com.hex.honeycomb.api.company.model.Company
import com.hex.honeycomb.api.company.model.SignUpData
import com.hex.honeycomb.api.company.repository.CompanyRepository
import com.hex.honeycomb.api.user.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompanyService(
    @Autowired val companyRepository: CompanyRepository,
    @Autowired val userRepository: UserRepository
) {
    fun getAllCompanies(): List<Company> {
        return companyRepository.findAll()
    }

    fun getCompanyById(id: Int): Company {
        return companyRepository.findById(id).get()
    }

    fun signUpNewCompany(data: SignUpData): Boolean {
        val user = data.user
        val newUser = user.copy(isAdmin = true)
        val company = data.company

        userRepository.save(newUser)
        companyRepository.save(company)

        return true
    }

    fun deleteCompanyById(id: Int): Boolean {
        val comp = getCompanyById(id)
        companyRepository.delete(comp)

        return true
    }

}