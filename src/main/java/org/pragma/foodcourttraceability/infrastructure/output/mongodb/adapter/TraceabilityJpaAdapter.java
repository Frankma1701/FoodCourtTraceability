package org.pragma.foodcourttraceability.infrastructure.output.mongodb.adapter;

import lombok.RequiredArgsConstructor;
import org.pragma.foodcourttraceability.domain.model.Traceability;
import org.pragma.foodcourttraceability.domain.spi.ITraceabilityPersistencePort;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.mapper.TraceabilityEntityMapper;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.repository.ITraceabilityRepository;


@RequiredArgsConstructor
public class TraceabilityJpaAdapter implements ITraceabilityPersistencePort{

    private final ITraceabilityRepository iTraceabilityRepository;
    private final TraceabilityEntityMapper traceabilityEntityMapper;

    @Override
    public Traceability saveTraceability (Traceability traceability){
        return traceabilityEntityMapper.toTraceability(iTraceabilityRepository.save(traceabilityEntityMapper.toEntity(traceability)));

    }
}
