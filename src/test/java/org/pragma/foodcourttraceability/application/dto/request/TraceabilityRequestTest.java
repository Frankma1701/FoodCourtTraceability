package org.pragma.foodcourttraceability.application.dto.request;

import org.junit.jupiter.api.Test;
import org.pragma.foodcourttraceability.application.dto.response.TraceabilityResponse;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TraceabilityRequestTest{

    @Test
    public void testGetters() {
        Long orderId = 456L;
        Long customerId = 789L;
        String customerEmail = "customer@example.com";
        LocalDateTime date = LocalDateTime.now();
        String previousStatus = "PENDING";
        String newStatus = "IN_PREPARATION";
        Long employeeId = 987L;
        String employeeEmail = "employee@example.com";
        Long restaurantId = 654L;

        TraceabilityRequest traceabilityRequest = new TraceabilityRequest(orderId, customerId, customerEmail, date, previousStatus, newStatus,
                employeeId, employeeEmail, restaurantId
        );
        assertEquals(orderId, traceabilityRequest.getOrderId());
        assertEquals(customerId, traceabilityRequest.getCustomerId());
        assertEquals(customerEmail, traceabilityRequest.getCustomerEmail());
        assertEquals(date, traceabilityRequest.getDate());
        assertEquals(previousStatus, traceabilityRequest.getPreviousStatus());
        assertEquals(newStatus, traceabilityRequest.getNewStatus());
        assertEquals(employeeId, traceabilityRequest.getEmployeeId());
        assertEquals(employeeEmail, traceabilityRequest.getEmployeeEmail());
        assertEquals(restaurantId, traceabilityRequest.getRestaurantId());
    }

}