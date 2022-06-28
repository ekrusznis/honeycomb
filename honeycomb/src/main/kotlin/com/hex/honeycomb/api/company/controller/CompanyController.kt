package com.hex.honeycomb.api.company.controller

import com.hex.honeycomb.api.company.model.Company
import com.hex.honeycomb.api.company.model.SignUpData
import com.hex.honeycomb.api.company.service.CompanyService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/company")
class CompanyController(
    @Autowired val service: CompanyService
) {

    @GetMapping()
    fun getAllCompanies(): List<Company>{
        return service.getAllCompanies()
    }

    @GetMapping("/{id}")
    fun getCompanyById(@PathVariable id: Int): Company{
        return service.getCompanyById(id)
    }

    @PostMapping()
    fun newCompanySignup(
        @RequestBody data: SignUpData
    ): Boolean{
        return service.signUpNewCompany(data)
    }

    @DeleteMapping("/{id}")
    fun deleteCompanyById(
        @PathVariable id: Int
    ): Boolean{
        return service.deleteCompanyById(id)
    }
}