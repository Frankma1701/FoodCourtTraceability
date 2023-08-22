package org.pragma.foodcourttraceability.util;

import org.pragma.foodcourttraceability.application.dto.request.TraceabilityRequest;
import org.pragma.foodcourttraceability.application.dto.response.TraceabilityResponse;

import java.time.LocalDateTime;

public class FactoryResponseTraceability{

    public static final TraceabilityResponse traceabilityResponse = new TraceabilityResponse(
            "1abc",
            1L,
            123L,
            "customer@example.com",
            LocalDateTime.now(),
            "PENDING",
            "IN_PREPARATION",
            21L,
            "employee@email.com",
            1L
    );


}
