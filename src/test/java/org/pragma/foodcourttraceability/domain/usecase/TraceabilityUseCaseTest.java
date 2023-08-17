package org.pragma.foodcourttraceability.domain.usecase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.pragma.foodcourttraceability.domain.model.Traceability;
import org.pragma.foodcourttraceability.domain.spi.ITraceabilityPersistencePort;
import org.pragma.foodcourttraceability.util.FactoryTraceability;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TraceabilityUseCaseTest{

    @Mock
    private ITraceabilityPersistencePort iTraceabilityPersistencePort;

    @InjectMocks
    private TraceabilityUseCase traceabilityUseCase;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveTraceability() {
        Traceability traceability = FactoryTraceability.traceability;
        when(iTraceabilityPersistencePort.saveTraceability(traceability)).thenReturn(traceability);
        Traceability savedTraceability = traceabilityUseCase.saveTraceability(traceability);
        verify(iTraceabilityPersistencePort, times(1)).saveTraceability(traceability);
        assertEquals(traceability, savedTraceability);
    }
}