package org.pragma.foodcourttraceability.infrastructure.input.rest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.pragma.foodcourttraceability.application.dto.request.TraceabilityRequest;
import org.pragma.foodcourttraceability.application.dto.response.TraceabilityResponse;
import org.pragma.foodcourttraceability.application.handler.TraceabilityHandler;
import org.pragma.foodcourttraceability.util.FactoryRequestTraceability;
import org.pragma.foodcourttraceability.util.FactoryTraceability;
import org.pragma.foodcourttraceability.util.MessageTestEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class TraceabilityRestControllerTest{
    @Mock
    private TraceabilityHandler traceabilityHandler;
    @InjectMocks
    private TraceabilityRestController traceabilityRestController;
    @Test
    void saveTraceability (){
        TraceabilityRequest request = FactoryRequestTraceability.traceabilityRequest;
        ResponseEntity<Void> responseEntity = traceabilityRestController.saveTraceability(request);
        verify(traceabilityHandler).saveTraceability(request);
        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode(), MessageTestEnum.HTTP_RESPONSE_CORRECT.getMessage());
    }
    @Test
    void getTraceability (){
        Long customerId = FactoryTraceability.TRACEABILITY_ID;
        List<TraceabilityResponse> responseList = new ArrayList<>();
        when(traceabilityHandler.getAllTraceabilityByCustomerId(customerId)).thenReturn(responseList);
        ResponseEntity<List<TraceabilityResponse>> responseEntity = traceabilityRestController.getTraceability(customerId);
        verify(traceabilityHandler).getAllTraceabilityByCustomerId(customerId);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode(), MessageTestEnum.HTTP_RESPONSE_CORRECT.getMessage());
        assertEquals(responseList, responseEntity.getBody(), MessageTestEnum.OBJECTS_TRACEABILITY_EQUAL.getMessage());
    }
    @Test
    void getAllTraceability (){
        List<TraceabilityResponse> responseList = new ArrayList<>();
        when(traceabilityHandler.getAllTraceability()).thenReturn(responseList);
        ResponseEntity<List<TraceabilityResponse>> responseEntity = traceabilityRestController.getAllTraceability();
        verify(traceabilityHandler).getAllTraceability();
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode(), MessageTestEnum.HTTP_RESPONSE_CORRECT.getMessage());
        assertEquals(responseList, responseEntity.getBody(), MessageTestEnum.OBJECTS_TRACEABILITY_EQUAL.getMessage());
    }
}