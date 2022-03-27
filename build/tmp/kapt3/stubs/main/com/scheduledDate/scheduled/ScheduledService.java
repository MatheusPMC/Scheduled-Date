package com.scheduledDate.scheduled;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/scheduledDate/scheduled/ScheduledService;", "", "dateServicePort", "Lcom/scheduledDate/port/DateServicePort;", "(Lcom/scheduledDate/port/DateServicePort;)V", "startScheduled", "", "ScheduledDate"})
@io.micronaut.context.annotation.Prototype
public final class ScheduledService {
    private final com.scheduledDate.port.DateServicePort dateServicePort = null;
    
    public ScheduledService(@org.jetbrains.annotations.NotNull
    com.scheduledDate.port.DateServicePort dateServicePort) {
        super();
    }
    
    @io.micronaut.scheduling.annotation.Scheduled(fixedDelay = "50s")
    public final void startScheduled() {
    }
}