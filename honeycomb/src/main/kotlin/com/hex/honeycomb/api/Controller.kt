package com.hex.honeycomb.api

import com.hex.honeycomb.coin.Honeycomb
import com.hex.honeycomb.coin.Wallet
import com.hex.honeycomb.coin.Wallet.Companion.create
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/hex")
class Controller {

    @PostMapping("")
    fun createHoneyCombWallet(
        @RequestBody comb: Honeycomb
    ): Wallet {
        return create(comb)
    }


}