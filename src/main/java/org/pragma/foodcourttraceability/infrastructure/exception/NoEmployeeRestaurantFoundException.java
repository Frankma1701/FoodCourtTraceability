package org.pragma.foodcourttraceability.infrastructure.exception;

public class NoEmployeeRestaurantFoundException extends RuntimeException{

    public NoEmployeeRestaurantFoundException () {
        super(ExceptionConstant.EMPLOYEE_RESTAURANT_NO_DATA);
    }
}
