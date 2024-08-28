package com.namnpse.currency_exchange

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "CurrencyExchange",
    ) {
        App()
    }
}