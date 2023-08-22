package org.pragma.foodcourttraceability.application.handler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.pragma.foodcourttraceability.application.dto.request.TraceabilityRequest;
import org.pragma.foodcourttraceability.application.dto.response.TraceabilityResponse;
import org.pragma.foodcourttraceability.application.exception.NoDataFoundException;
import org.pragma.foodcourttraceability.application.mapper.request.TraceabilityRequestMapper;
import org.pragma.foodcourttraceability.application.mapper.response.TraceabilityResponseMapper;
import org.pragma.foodcourttraceability.domain.api.ITraceabilityServicePort;
import org.pragma.foodcourttraceability.domain.model.Traceability;
import org.pragma.foodcourttraceability.util.FactoryRequestTraceability;
import org.pragma.foodcourttraceability.util.FactoryResponseTraceability;
import org.pragma.foodcourttraceability.util.FactoryTraceability;
import org.pragma.foodcourttraceability.util.MessageTestEnum;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TraceabilityHandlerTest{
    @Mock
    private ITraceabilityServicePort iTraceabilityServicePort;
    @Mock
    private TraceabilityRequestMapper traceabilityRequestMapper;
    @Mock
    private TraceabilityResponseMapper traceabilityResponseMapper;
    @InjectMocks
    private TraceabilityHandler traceabilityHandler;


    @Test
    void saveTraceability (){
        Traceability expectedObject = FactoryTraceability.traceability;
        TraceabilityRequest expectedObjectRequest = FactoryRequestTraceability.traceabilityRequest;
        when(traceabilityRequestMapper.toTraceability(FactoryRequestTraceability.traceabilityRequest))
                .thenReturn(expectedObject);
        when(iTraceabilityServicePort.saveTraceability(expectedObject))
                .thenReturn(expectedObject);
        Traceability resultObject = traceabilityHandler.saveTraceability(expectedObjectRequest);
        assertEquals(expectedObject.getId(), resultObject.getId(),
                MessageTestEnum.ID_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getOrderId(), resultObject.getOrderId(),
                MessageTestEnum.ID_ORDER_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getCustomerEmail(), resultObject.getCustomerEmail(),
                MessageTestEnum.CUSTOMER_EMAIL_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getCustomerId(), resultObject.getCustomerId(),
                MessageTestEnum.CUSTOMER_ID_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getDate(), resultObject.getDate(),
                MessageTestEnum.DATE_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getPreviousStatus(), resultObject.getPreviousStatus(),
                MessageTestEnum.PREVIOUS_STATUS_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getNewStatus(), resultObject.getNewStatus(),
                MessageTestEnum.NEW_STATUS_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getEmployeeId(), resultObject.getEmployeeId(),
                MessageTestEnum.EMPLOYEE_ID_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getEmployeeEmail(), resultObject.getEmployeeEmail(),
                MessageTestEnum.EMPLOYEE_EMAIL_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getRestaurantId(), resultObject.getRestaurantId(),
                MessageTestEnum.RESTURANT_ID_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject, resultObject,
                MessageTestEnum.OBJECTS_TRACEABILITY_EQUAL.getMessage());
        verify(iTraceabilityServicePort, times(1))
                .saveTraceability(expectedObject);
    }

    @Test
    void getAllTraceabilityByCustomerId (){
        Long customerId = FactoryTraceability.TRACEABILITY_ID;
        List<TraceabilityResponse> expectedTraceabilitiesRequests = new ArrayList<>();
        expectedTraceabilitiesRequests.add(FactoryResponseTraceability.traceabilityResponse);
        List<Traceability> expectedTraceabilities = new ArrayList<>();
        expectedTraceabilities.add(FactoryTraceability.traceability);
        when(traceabilityResponseMapper.toResponseList(expectedTraceabilities))
                .thenReturn(expectedTraceabilitiesRequests);
        when(iTraceabilityServicePort.getAllTraceabilityByCustomerId(customerId))
                .thenReturn(expectedTraceabilities);
        List<TraceabilityResponse> resultTraceabilities = traceabilityHandler.getAllTraceabilityByCustomerId(customerId);
        assertEquals(expectedTraceabilitiesRequests, resultTraceabilities, MessageTestEnum.OBJECTS_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedTraceabilitiesRequests.size(),resultTraceabilities.size(),MessageTestEnum.SIZE_TRACEABILITY_LIST_EQUAL.getMessage());
    }

    @Test
    void getAllTraceability (){
        List<TraceabilityResponse> expectedTraceabilitiesRequests = new ArrayList<>();
        expectedTraceabilitiesRequests.add(FactoryResponseTraceability.traceabilityResponse);
        List<Traceability> expectedTraceabilities = new ArrayList<>();
        expectedTraceabilities.add(FactoryTraceability.traceability);
        when(traceabilityResponseMapper.toResponseList(expectedTraceabilities))
                .thenReturn(expectedTraceabilitiesRequests);
        when(iTraceabilityServicePort.getAllTraceability())
                .thenReturn(expectedTraceabilities);
        List<TraceabilityResponse> resultTraceabilities = traceabilityHandler.getAllTraceability();
        assertEquals(expectedTraceabilitiesRequests, resultTraceabilities, MessageTestEnum.OBJECTS_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedTraceabilitiesRequests.size(),resultTraceabilities.size(),MessageTestEnum.SIZE_TRACEABILITY_LIST_EQUAL.getMessage());
    }

    @Test
    public void getAllTraceabilityByIdNoData() {
        Long customerId = FactoryTraceability.TRACEABILITY_ID;
        List<Traceability> emptyList = new ArrayList<>();
        when(iTraceabilityServicePort.getAllTraceabilityByCustomerId(customerId)).thenReturn(emptyList);
        assertThrows(NoDataFoundException.class, () -> {
            traceabilityHandler.getAllTraceabilityByCustomerId(customerId);
        });
    }

    @Test
    public void getAllTraceabilityNoData() {
        List<Traceability> emptyList = new ArrayList<>();
        when(iTraceabilityServicePort.getAllTraceability()).thenReturn(emptyList);
        assertThrows(NoDataFoundException.class, () -> {
            traceabilityHandler.getAllTraceability();
        });
    }

}