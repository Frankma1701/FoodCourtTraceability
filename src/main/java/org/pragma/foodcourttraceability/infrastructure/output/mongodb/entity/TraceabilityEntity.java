package org.pragma.foodcourttraceability.infrastructure.output.mongodb.entity;
import org.springframework.data.annotation.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
@Document(collection = "traceability")
@Data
public class TraceabilityEntity{
    @Id
    private String id;
    private Long orderId;
    private Long customerId;
    private String customerEmail;
    private LocalDateTime date;
    private String previousStatus;
    private String newStatus;
    private Long employeeId;
    private String employeeEmail;
    private Long restaurantId;

}
