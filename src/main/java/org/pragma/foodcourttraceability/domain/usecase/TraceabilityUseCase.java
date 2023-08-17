package org.pragma.foodcourttraceability.domain.usecase;
import org.pragma.foodcourttraceability.domain.api.ITraceabilityServicePort;
import org.pragma.foodcourttraceability.domain.model.Traceability;
import org.pragma.foodcourttraceability.domain.spi.ITraceabilityPersistencePort;

public class TraceabilityUseCase implements ITraceabilityServicePort{

    private ITraceabilityPersistencePort iTraceabilityPersistencePort;

    public TraceabilityUseCase (ITraceabilityPersistencePort iTraceabilityPersistencePort){
        this.iTraceabilityPersistencePort = iTraceabilityPersistencePort;
    }

    @Override
    public Traceability saveTraceability (Traceability traceability){
        return iTraceabilityPersistencePort.saveTraceability(traceability);
    }
}
