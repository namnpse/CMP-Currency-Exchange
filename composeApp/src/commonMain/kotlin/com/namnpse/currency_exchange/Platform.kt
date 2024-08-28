package com.namnpse.currency_exchange

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform