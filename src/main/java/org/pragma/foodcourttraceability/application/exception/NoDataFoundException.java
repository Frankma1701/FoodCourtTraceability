package org.pragma.foodcourttraceability.application.exception;

import org.springframework.http.HttpStatus;

public class NoDataFoundException extends CustomException{

    public NoDataFoundException() {
        super(ExceptionMessageEnum.NO_DATA_FOUND.getMessage(), HttpStatus.NOT_FOUND.name());
    }
}
