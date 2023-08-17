package org.pragma.foodcourttraceability.infrastructure.output.mongodb.repository;

import org.pragma.foodcourttraceability.infrastructure.output.mongodb.entity.TraceabilityEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITraceabilityRepository extends MongoRepository<TraceabilityEntity, String>  {

}
