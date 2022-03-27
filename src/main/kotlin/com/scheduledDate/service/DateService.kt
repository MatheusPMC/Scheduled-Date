package com.scheduledDate.service

import com.scheduledDate.port.DateServicePort
import io.micronaut.context.annotation.Prototype
import java.time.Instant
import java.time.temporal.ChronoUnit

@Prototype
class DateService : DateServicePort{
    override fun DateFormat() {
        var localDateTime = Instant.now()

        var localDateTime2 = Instant.parse("2022-03-23T02:28:08.345805Z")

        val Seconds: Long
        val Minutes: Long
        val Hours: Long
        val Days: Long

        println("Recebendo do checkout: $localDateTime2")
        println("Enviando para o checkout: $localDateTime")



        Seconds = ChronoUnit.SECONDS.between(localDateTime, localDateTime2)

        val S = Seconds % 60

        Minutes = Seconds / 60
        val M = Minutes % 60

        Hours = Minutes / 60
        val H = Hours % 24

        Days = Hours / 24
        val D = Days % 24

        val cvrt = String.format("D:%01d H:%01d M:%01d S:%02d", Math.abs(D), Math.abs(H), Math.abs(M), Math.abs(S))
        println(cvrt)
    }
}