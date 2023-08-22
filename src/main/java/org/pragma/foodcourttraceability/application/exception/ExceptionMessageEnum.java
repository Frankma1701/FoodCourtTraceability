package org.pragma.foodcourttraceability.application.exception;

public enum ExceptionMessageEnum{
    NO_DATA_FOUND("No se han encontrado los datos solicitados");
    private final String message;
    ExceptionMessageEnum (String message ){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }



}
