package org.pragma.foodcourttraceability.application.handler;
import org.pragma.foodcourttraceability.application.dto.request.TraceabilityRequest;
import org.pragma.foodcourttraceability.domain.model.Traceability;

public interface ITraceabilityHandler{

    Traceability saveTraceability(TraceabilityRequest traceabilityRequest);



}
