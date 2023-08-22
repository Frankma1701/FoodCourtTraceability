package org.pragma.foodcourttraceability.application.handler;
import org.pragma.foodcourttraceability.application.dto.request.TraceabilityRequest;
import org.pragma.foodcourttraceability.application.dto.response.TraceabilityResponse;
import org.pragma.foodcourttraceability.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityHandler{

    Traceability saveTraceability(TraceabilityRequest traceabilityRequest);

    List<TraceabilityResponse> getAllTraceabilityByCustomerId(Long customerId);

    List<TraceabilityResponse> getAllTraceability();

}
