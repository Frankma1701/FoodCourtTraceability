package org.pragma.foodcourttraceability.util;

import org.pragma.foodcourttraceability.domain.model.Traceability;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FactoryTraceability{

    public static final Traceability traceability = new Traceability(
            "1",
            123L,
            456L,
            "customer@example.com",
            LocalDateTime.now(),
            "PENDING",
            "IN_PREPARATION",
            789L,
            "employee@example.com"
    );

}
