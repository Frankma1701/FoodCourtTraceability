package org.pragma.foodcourttraceability.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class TraceabilityResponse{

    private Long id;
    private Long orderId;
    private Long customerId;
    private String customerEmail;
    private LocalDate date;
    private String previousStatus;
    private String newStatus;
    private Long employeeId;
    private String employeeEmail;
}
