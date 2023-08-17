package org.pragma.foodcourttraceability.infrastructure.output.mongodb.adapter;

import lombok.RequiredArgsConstructor;
import org.pragma.foodcourttraceability.domain.model.Traceability;
import org.pragma.foodcourttraceability.domain.spi.ITraceabilityPersistencePort;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.entity.TraceabilityEntity;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.mapper.TraceabilityEntityMapper;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.repository.ITraceabilityRepository;

import java.util.List;


@RequiredArgsConstructor
public class TraceabilityJpaAdapter implements ITraceabilityPersistencePort{

    private final ITraceabilityRepository iTraceabilityRepository;
    private final TraceabilityEntityMapper traceabilityEntityMapper;

    @Override
    public Traceability saveTraceability (Traceability traceability){
        System.out.println("La fecha que llega es " + traceability.getDate());
        return traceabilityEntityMapper.toTraceability(iTraceabilityRepository.save(traceabilityEntityMapper.toEntity(traceability)));

    }

    @Override
    public List<Traceability> getAllTraceabilityByCustomerId (Long customerId){
        List<TraceabilityEntity> traceabilityEntities = iTraceabilityRepository.findByCustomerId(customerId);
        return traceabilityEntityMapper.toTracebilityList(traceabilityEntities);
    }
}
