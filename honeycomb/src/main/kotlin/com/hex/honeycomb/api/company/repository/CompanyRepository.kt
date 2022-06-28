package com.hex.honeycomb.api.company.repository

import com.hex.honeycomb.api.company.model.Company
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CompanyRepository : JpaRepository<Company, Int>{}