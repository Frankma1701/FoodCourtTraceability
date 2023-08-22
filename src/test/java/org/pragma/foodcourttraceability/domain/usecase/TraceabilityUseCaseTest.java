package org.pragma.foodcourttraceability.domain.usecase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.pragma.foodcourttraceability.domain.model.Traceability;
import org.pragma.foodcourttraceability.domain.spi.ITraceabilityPersistencePort;
import org.pragma.foodcourttraceability.util.FactoryTraceability;
import org.pragma.foodcourttraceability.util.MessageTestEnum;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class TraceabilityUseCaseTest{
    @Mock
    private ITraceabilityPersistencePort iTraceabilityPersistencePort;
    @InjectMocks
    private TraceabilityUseCase traceabilityUseCase;
    @Test
    void testSaveTraceability() {
        Traceability expectedObject = FactoryTraceability.traceability;
        when(iTraceabilityPersistencePort.saveTraceability(expectedObject)).thenReturn(expectedObject);
        Traceability resultObject = traceabilityUseCase.saveTraceability(expectedObject);
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
        assertEquals(expectedObject, resultObject,MessageTestEnum.OBJECTS_TRACEABILITY_EQUAL.getMessage());
        verify(iTraceabilityPersistencePort, times(1)).saveTraceability(expectedObject);
    }
    @Test
    void getAllTraceabilityByCustomerId (){
        Long customerId = FactoryTraceability.TRACEABILITY_ID;
        List<Traceability> expectedTraceabilities = new ArrayList<>();
        expectedTraceabilities.add(FactoryTraceability.traceability);
        when(iTraceabilityPersistencePort.getAllTraceabilityByCustomerId(customerId))
                .thenReturn(expectedTraceabilities);
        List<Traceability> resultTraceabilities = traceabilityUseCase.getAllTraceabilityByCustomerId(customerId);
        assertEquals(expectedTraceabilities, resultTraceabilities,MessageTestEnum.OBJECTS_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedTraceabilities.size(),resultTraceabilities.size(),MessageTestEnum.SIZE_TRACEABILITY_LIST_EQUAL.getMessage());
    }
    @Test
    void getAllTraceability (){
        List<Traceability> expectedTraceabilities = new ArrayList<>();
        expectedTraceabilities.add(FactoryTraceability.traceability);
        when(iTraceabilityPersistencePort.getAllTraceability())
                .thenReturn(expectedTraceabilities);
        List<Traceability> resultTraceabilities = traceabilityUseCase.getAllTraceability();
        assertEquals(expectedTraceabilities, resultTraceabilities,MessageTestEnum.OBJECTS_TRACEABILITY_EQUAL.getMessage());
        assertEquals(expectedTraceabilities.size(),resultTraceabilities.size(),MessageTestEnum.SIZE_TRACEABILITY_LIST_EQUAL.getMessage());
    }
}