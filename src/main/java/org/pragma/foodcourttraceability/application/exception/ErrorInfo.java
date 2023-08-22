package org.pragma.foodcourttraceability.application.exception;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorInfo {
    private String code;
    private String message;
}