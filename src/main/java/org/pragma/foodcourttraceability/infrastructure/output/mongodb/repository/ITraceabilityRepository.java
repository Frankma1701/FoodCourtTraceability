package org.pragma.foodcourttraceability.infrastructure.output.mongodb.repository;

import org.pragma.foodcourttraceability.infrastructure.output.mongodb.entity.TraceabilityEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ITraceabilityRepository extends MongoRepository<TraceabilityEntity, String>  {

    List<TraceabilityEntity> findByCustomerId(Long customerId);

    @Query("{" +
            "$or: [" +
            "{'previousStatus': 'PENDING'}, " +
            "{'newStatus': 'DELIVERED'}" +
            "]" +
            "}")
    List<TraceabilityEntity> findFinishOrders();

}
