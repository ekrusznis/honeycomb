package com.hex.honeycomb.api.company.model

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "company")
data class Company(
    @GeneratedValue
    @Id val id: Int,
    @Column(name = "name") val name: String,
    @Column(name = "date_created") val dateCreated: LocalDateTime,
    @Column(name = "outgoing_bank") val outgoingBank: String,
    @Column(name = "payment_schedule") val paymentSchedule: String
)
