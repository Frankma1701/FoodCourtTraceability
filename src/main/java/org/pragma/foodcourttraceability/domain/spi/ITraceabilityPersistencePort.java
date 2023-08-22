package org.pragma.foodcourttraceability.domain.spi;

import org.pragma.foodcourttraceability.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityPersistencePort{
    Traceability saveTraceability(Traceability traceability);

    List<Traceability> getAllTraceabilityByCustomerId(Long customerId);
    List<Traceability> getAllTraceability();


}
