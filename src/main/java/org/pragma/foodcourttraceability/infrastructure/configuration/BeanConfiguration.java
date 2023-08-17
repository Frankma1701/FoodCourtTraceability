package org.pragma.foodcourttraceability.infrastructure.configuration;

import lombok.RequiredArgsConstructor;
import org.pragma.foodcourttraceability.domain.api.ITraceabilityServicePort;
import org.pragma.foodcourttraceability.domain.spi.ITraceabilityPersistencePort;
import org.pragma.foodcourttraceability.domain.usecase.TraceabilityUseCase;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.adapter.TraceabilityJpaAdapter;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.mapper.TraceabilityEntityMapper;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.repository.ITraceabilityRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ITraceabilityRepository iTraceabilityRepository;
    private final TraceabilityEntityMapper traceabilityEntityMapper;


    @Bean
    public ITraceabilityPersistencePort traceabilityPersistencePort(){
        return new TraceabilityJpaAdapter(iTraceabilityRepository,traceabilityEntityMapper);
    }
    @Bean
    public ITraceabilityServicePort traceabilityServicePort(){
        return new TraceabilityUseCase(traceabilityPersistencePort());
    }


}
