package org.pragma.foodcourttraceability.infrastructure.output.mongodb.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.pragma.foodcourttraceability.domain.model.Traceability;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.entity.TraceabilityEntity;
import java.util.List;
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TraceabilityEntityMapper{
    TraceabilityEntity toEntity(Traceability traceability);
    Traceability toTraceability(TraceabilityEntity traceabilityEntity);

    List<Traceability> toTracebilityList(List<TraceabilityEntity> traceabilityEntityList);
}
