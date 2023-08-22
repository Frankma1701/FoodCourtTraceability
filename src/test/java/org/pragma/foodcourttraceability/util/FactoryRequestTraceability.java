package org.pragma.foodcourttraceability.util;

import org.pragma.foodcourttraceability.application.dto.request.TraceabilityRequest;
import org.pragma.foodcourttraceability.domain.model.Traceability;

import java.time.LocalDateTime;

public class FactoryRequestTraceability{

    public static final TraceabilityRequest traceabilityRequest = new TraceabilityRequest(
            123L,
            456L,
            "customer@example.com",
            LocalDateTime.now(),
            "PENDING",
            "IN_PREPARATION",
            21L,
            "employee@email.com",
            1L
    );
}
