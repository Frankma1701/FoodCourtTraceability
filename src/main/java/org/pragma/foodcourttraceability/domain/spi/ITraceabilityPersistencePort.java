package org.pragma.foodcourttraceability.domain.spi;

import org.pragma.foodcourttraceability.domain.model.Traceability;

public interface ITraceabilityPersistencePort{
    Traceability saveTraceability(Traceability traceability);



}
