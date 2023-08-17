package org.pragma.foodcourttraceability.infrastructure.exception;

public class NotOwnerUserException extends RuntimeException{

    public NotOwnerUserException () {
        super(ExceptionConstant.NOT_OWNER_USER);
    }
}
