package org.pragma.foodcourttraceability.domain.api;

import org.pragma.foodcourttraceability.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityServicePort{

    Traceability saveTraceability(Traceability traceability);
    List<Traceability> getAllTraceabilityByCustomerId(Long customerId);

}
