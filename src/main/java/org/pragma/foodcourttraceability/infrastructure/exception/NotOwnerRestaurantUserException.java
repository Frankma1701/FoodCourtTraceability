package org.pragma.foodcourttraceability.infrastructure.exception;

public class NotOwnerRestaurantUserException extends RuntimeException{

    public NotOwnerRestaurantUserException () {
        super(ExceptionConstant.NOT_OWNER_OF_RESTAURANT);
    }
}
