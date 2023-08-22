package org.pragma.foodcourttraceability.util;

public enum MessageTestEnum{

    ID_TRACEABILITY_EQUAL("Los ids de la traceabilidad son iguales"),
    ID_ORDER_TRACEABILITY_EQUAL("Los ids de las ordenes de la traceabilidad son iguales"),
    CUSTOMER_EMAIL_TRACEABILITY_EQUAL("Los correos de los clientes de la traceabilidad son iguales"),
    CUSTOMER_ID_TRACEABILITY_EQUAL("Los ids de los clientes de la traceabilidad son iguales"),
    DATE_TRACEABILITY_EQUAL("Las fechas de la traceabilidad son iguales"),
    PREVIOUS_STATUS_TRACEABILITY_EQUAL("Los estados previos de la traceabilidad son iguales"),
    NEW_STATUS_TRACEABILITY_EQUAL("Los estados nuevos de la traceabilidad son iguales"),
    EMPLOYEE_ID_TRACEABILITY_EQUAL("Los ids de los empleados de la traceabilidad son iguales"),

    EMPLOYEE_EMAIL_TRACEABILITY_EQUAL("Los correos de los empleados de la traceabilidad son iguales"),
    RESTURANT_ID_TRACEABILITY_EQUAL("Los ids de los resturantes de la traceabilidad son iguales"),

    OBJECTS_TRACEABILITY_EQUAL("Los objetos de la traceabilidad son iguales"),

    SIZE_TRACEABILITY_LIST_EQUAL("El tamaño de las listas de traceabilidad obtenida es igual"),

    HTTP_RESPONSE_CORRECT("Los códigos HTTP de los metodos verificados son los mismos ");


    private String message;

    private MessageTestEnum(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }




}
