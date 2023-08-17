package org.pragma.foodcourttraceability.application.handler;

import lombok.RequiredArgsConstructor;
import org.pragma.foodcourttraceability.application.dto.request.TraceabilityRequest;
import org.pragma.foodcourttraceability.application.dto.response.TraceabilityResponse;
import org.pragma.foodcourttraceability.application.mapper.request.TraceabilityRequestMapper;
import org.pragma.foodcourttraceability.application.mapper.response.TraceabilityResponseMapper;
import org.pragma.foodcourttraceability.domain.api.ITraceabilityServicePort;
import org.pragma.foodcourttraceability.domain.model.Traceability;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TraceabilityHandler implements ITraceabilityHandler{

    private final ITraceabilityServicePort iTraceabilityServicePort;
    private final TraceabilityRequestMapper traceabilityRequestMapper;
    private final TraceabilityResponseMapper traceabilityResponseMapper;

    @Override
    public Traceability saveTraceability (TraceabilityRequest traceabilityRequest){
        Traceability traceability = iTraceabilityServicePort.saveTraceability(traceabilityRequestMapper.toTraceability(traceabilityRequest));
        ZonedDateTime utcDateTime = ZonedDateTime.parse("2023-08-17T20:34:48.131+00:00");

        ZonedDateTime colombianDateTime = utcDateTime.withZoneSameInstant(ZoneId.of("America/Bogota"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = colombianDateTime.format(formatter);

        return traceability;
    }

    @Override
    public List<TraceabilityResponse> getAllTraceabilityByCustomerId (Long customerId){
        return traceabilityResponseMapper.toResponseList(iTraceabilityServicePort.getAllTraceabilityByCustomerId(customerId));
    }
}
