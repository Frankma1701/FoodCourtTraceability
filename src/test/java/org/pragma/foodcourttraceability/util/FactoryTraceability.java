package org.pragma.foodcourttraceability.util;

import org.pragma.foodcourttraceability.domain.model.Traceability;

import java.time.LocalDate;

public class FactoryTraceability{

    public static final Traceability traceability = new Traceability(
            "1",
            123L,
            456L,
            "customer@example.com",
            LocalDate.now(),
            "PENDING",
            "IN_PREPARATION",
            789L,
            "employee@example.com"
    );
}
