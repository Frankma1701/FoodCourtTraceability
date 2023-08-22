package org.pragma.foodcourttraceability.application.dto.response;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TraceabilityResponseTest{

    @Test
    public void testGetters() {
        String id = "123";
        Long orderId = 456L;
        Long customerId = 789L;
        String customerEmail = "customer@example.com";
        LocalDateTime date = LocalDateTime.now();
        String previousStatus = "PENDING";
        String newStatus = "IN_PREPARATION";
        Long employeeId = 987L;
        String employeeEmail = "employee@example.com";
        Long restaurantId = 654L;

        TraceabilityResponse traceabilityResponse = new TraceabilityResponse(
                id, orderId, customerId, customerEmail, date, previousStatus, newStatus,
                employeeId, employeeEmail, restaurantId
        );

        assertEquals(id, traceabilityResponse.getId());
        assertEquals(orderId, traceabilityResponse.getOrderId());
        assertEquals(customerId, traceabilityResponse.getCustomerId());
        assertEquals(customerEmail, traceabilityResponse.getCustomerEmail());
        assertEquals(date, traceabilityResponse.getDate());
        assertEquals(previousStatus, traceabilityResponse.getPreviousStatus());
        assertEquals(newStatus, traceabilityResponse.getNewStatus());
        assertEquals(employeeId, traceabilityResponse.getEmployeeId());
        assertEquals(employeeEmail, traceabilityResponse.getEmployeeEmail());
        assertEquals(restaurantId, traceabilityResponse.getRestaurantId());
    }

}