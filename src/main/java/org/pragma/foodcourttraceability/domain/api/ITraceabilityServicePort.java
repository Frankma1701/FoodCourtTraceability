package org.pragma.foodcourttraceability.domain.api;

import org.pragma.foodcourttraceability.domain.model.Traceability;

public interface ITraceabilityServicePort{

    Traceability saveTraceability(Traceability traceability);

}
