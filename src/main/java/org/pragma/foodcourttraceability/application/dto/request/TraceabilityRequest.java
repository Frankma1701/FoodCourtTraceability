package org.pragma.foodcourttraceability.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class TraceabilityRequest{

    private Long orderId;
    private Long customerId;
    private String customerEmail;
    private LocalDate date;
    private String previousStatus;
    private String newStatus;
    private Long employeeId;
    private String employeeEmail;
}
