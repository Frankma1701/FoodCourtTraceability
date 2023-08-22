package org.pragma.foodcourttraceability.infrastructure.output.mongodb.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.pragma.foodcourttraceability.domain.model.Traceability;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.entity.TraceabilityEntity;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.mapper.TraceabilityEntityMapper;
import org.pragma.foodcourttraceability.infrastructure.output.mongodb.repository.ITraceabilityRepository;
import org.pragma.foodcourttraceability.util.FactoryTraceability;
import org.pragma.foodcourttraceability.util.MessageTestEnum;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)

class TraceabilityJpaAdapterTest{

    @Mock
    private ITraceabilityRepository traceabilityRepository;

    @Mock
    private TraceabilityEntityMapper entityMapper;

    @InjectMocks
    private TraceabilityJpaAdapter traceabilityJpaAdapter;


    @Test
    public void testSaveTraceability() {
        Traceability expectedObject = FactoryTraceability.traceability;
        TraceabilityEntity entity = new TraceabilityEntity();
        when(entityMapper.toEntity(expectedObject)).thenReturn(entity);
        when(traceabilityRepository.save(entity)).thenReturn(entity);
        when(entityMapper.toTraceability(entity)).thenReturn(expectedObject);
        Traceability resultObject = traceabilityJpaAdapter.saveTraceability(expectedObject);
        verify(entityMapper).toEntity(expectedObject);
        verify(traceabilityRepository).save(entity);
        verify(entityMapper).toTraceability(entity);
        assertEquals(expectedObject.getId() , resultObject.getId() , MessageTestEnum.ID_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getOrderId() , resultObject.getOrderId(),MessageTestEnum.ID_ORDER_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getCustomerEmail() , resultObject.getCustomerEmail(),MessageTestEnum.CUSTOMER_EMAIL_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getCustomerId(), resultObject.getCustomerId(),MessageTestEnum.CUSTOMER_ID_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getDate() , resultObject.getDate(),MessageTestEnum.DATE_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getPreviousStatus() , resultObject.getPreviousStatus(),MessageTestEnum.PREVIOUS_STATUS_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getNewStatus() , resultObject.getNewStatus(),MessageTestEnum.NEW_STATUS_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getEmployeeId() , resultObject.getEmployeeId(),MessageTestEnum.EMPLOYEE_ID_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getEmployeeEmail() , resultObject.getEmployeeEmail(),MessageTestEnum.EMPLOYEE_EMAIL_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedObject.getRestaurantId() , resultObject.getRestaurantId(),MessageTestEnum.RESTURANT_ID_TRACEABILITY_EQUAL.getMessage());
    }

    @Test
    public void testGetAllTraceabilityByCustomerId() {
        Long customerId = 123L;
        List<TraceabilityEntity> entities = new ArrayList<>();
        when(traceabilityRepository.findByCustomerId(customerId)).thenReturn(entities);
        traceabilityJpaAdapter.getAllTraceabilityByCustomerId(customerId);
        verify(traceabilityRepository).findByCustomerId(customerId);
        verify(entityMapper).toTracebilityList(entities);

    }

    @Test
    public void testGetAllTraceability() {
        List<TraceabilityEntity> entities = new ArrayList<>();
        when(traceabilityRepository.findFinishOrders()).thenReturn(entities);
        traceabilityJpaAdapter.getAllTraceability();
        verify(traceabilityRepository).findFinishOrders();
        verify(entityMapper).toTracebilityList(entities);
    }

}