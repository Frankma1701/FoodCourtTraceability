package org.pragma.foodcourttraceability.util;

import org.pragma.foodcourttraceability.application.dto.response.TraceabilityResponse;
import org.pragma.foodcourttraceability.application.exception.CustomException;

import java.time.LocalDateTime;

public class FactoryCustomException{

    public static final CustomException customException = new CustomException("Error en los datos","400");

    public static final String messageValidationException = "Error en la validación , ingresa correctamente el dato";

}
