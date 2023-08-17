package org.pragma.foodcourttraceability.application.mapper.response;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pragma.foodcourttraceability.application.dto.response.TraceabilityResponse;
import org.pragma.foodcourttraceability.domain.model.Traceability;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TraceabilityResponseMapper{
    TraceabilityResponse toResponse(Traceability traceability);

    List<Traceability> toTraceabilityList(List<TraceabilityResponse> traceabilityResponses);

    List<TraceabilityResponse> toResponseList(List<Traceability> traceabilityList);
}
