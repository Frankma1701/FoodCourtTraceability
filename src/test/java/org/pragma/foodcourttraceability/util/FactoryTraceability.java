package org.pragma.foodcourttraceability.util;
import org.pragma.foodcourttraceability.domain.model.Traceability;
<<<<<<< HEAD

import java.time.LocalDate;
=======
>>>>>>> HU_18_order_efficiency
import java.time.LocalDateTime;

public class FactoryTraceability{

    public static final Traceability traceability = new Traceability(
            "1",
            123L,
            456L,
            "customer@example.com",
            LocalDateTime.now(),
            "PENDING",
            "IN_PREPARATION",
            21L,
            "employee@email.com",
            1L
    );
    public  static final Long TRACEABILITY_ID = 1L;
}
