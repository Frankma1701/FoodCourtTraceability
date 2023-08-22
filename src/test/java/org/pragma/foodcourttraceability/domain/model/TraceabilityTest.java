package org.pragma.foodcourttraceability.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.pragma.foodcourttraceability.util.FactoryTraceability;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TraceabilityTest{
    private Traceability traceability;

    @BeforeEach
    void setUp() {
        // Initialize a new Traceability instance before each test
        traceability = new Traceability("id", 1L, 2L, "email@example.com", LocalDateTime.now(),
                "oldStatus", "newStatus", 3L, "employee@example.com", 4L);
    }

    @Test
    void testSetId() {
        traceability.setId("newId");
        assertEquals("newId", traceability.getId());
    }

    @Test
    void testSetOrderId() {
        traceability.setOrderId(5L);
        assertEquals(5L, traceability.getOrderId());
    }

    @Test
    void testSetCustomerId() {
        traceability.setCustomerId(6L);
        assertEquals(6L, traceability.getCustomerId());
    }

    @Test
    void testSetCustomerEmail() {
        traceability.setCustomerEmail("newemail@example.com");
        assertEquals("newemail@example.com", traceability.getCustomerEmail());
    }

    @Test
    void testSetDate() {
        LocalDateTime newDate = LocalDateTime.now().minusDays(1);
        traceability.setDate(newDate);
        assertEquals(newDate, traceability.getDate());
    }

    @Test
    void testSetPreviousStatus() {
        traceability.setPreviousStatus("updatedOldStatus");
        assertEquals("updatedOldStatus", traceability.getPreviousStatus());
    }

    @Test
    void testSetNewStatus() {
        traceability.setNewStatus("updatedNewStatus");
        assertEquals("updatedNewStatus", traceability.getNewStatus());
    }

    @Test
    void testSetEmployeeId() {
        traceability.setEmployeeId(7L);
        assertEquals(7L, traceability.getEmployeeId());
    }

    @Test
    void testSetEmployeeEmail() {
        traceability.setEmployeeEmail("newemployee@example.com");
        assertEquals("newemployee@example.com", traceability.getEmployeeEmail());
    }

    @Test
    void testSetRestaurantId() {
        traceability.setRestaurantId(8L);
        assertEquals(8L, traceability.getRestaurantId());
    }
}