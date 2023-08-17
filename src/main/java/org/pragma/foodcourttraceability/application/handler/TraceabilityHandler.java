package org.pragma.foodcourttraceability.application.handler;

import lombok.RequiredArgsConstructor;
import org.pragma.foodcourttraceability.application.dto.request.TraceabilityRequest;
import org.pragma.foodcourttraceability.application.mapper.request.TraceabilityRequestMapper;
import org.pragma.foodcourttraceability.domain.api.ITraceabilityServicePort;
import org.pragma.foodcourttraceability.domain.model.Traceability;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TraceabilityHandler implements ITraceabilityHandler{

    private final ITraceabilityServicePort iTraceabilityServicePort;
    private final TraceabilityRequestMapper traceabilityRequestMapper;

    @Override
    public Traceability saveTraceability (TraceabilityRequest traceabilityRequest){
        Traceability message = iTraceabilityServicePort.saveTraceability(traceabilityRequestMapper.toTraceability(traceabilityRequest));

        return null;
    }
}
