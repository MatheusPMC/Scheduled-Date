package com.scheduledDate.scheduled

import com.scheduledDate.port.DateServicePort
import io.micronaut.context.annotation.Prototype
import io.micronaut.scheduling.annotation.Scheduled

@Prototype
class ScheduledService (
    private val dateServicePort: DateServicePort
        ) {

    @Scheduled(fixedDelay = "50s")
    fun startScheduled(){
        dateServicePort.DateFormat()
    }

}