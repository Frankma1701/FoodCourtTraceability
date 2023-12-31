package org.pragma.foodcourttraceability.domain.model;

import java.time.LocalDateTime;

public class Traceability{
    private String id;
    private Long orderId;
    private Long customerId;
    private String customerEmail;
    private LocalDateTime date;
    private String previousStatus;
    private String newStatus;
    private Long employeeId;
    private String employeeEmail;
    private Long restaurantId;

    public Traceability (String id, Long orderId, Long customerId, String customerEmail, LocalDateTime date, String previousStatus, String newStatus, Long employeeId, String employeeEmail, Long restaurantId){
        this.id = id;
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.date = date;
        this.previousStatus = previousStatus;
        this.newStatus = newStatus;
        this.employeeId = employeeId;
        this.employeeEmail = employeeEmail;
        this.restaurantId = restaurantId;
    }

    public void setId (String id){
        this.id = id;
    }



    public void setOrderId (Long orderId){
        this.orderId = orderId;
    }

    public void setCustomerId (Long customerId){
        this.customerId = customerId;
    }

    public void setCustomerEmail (String customerEmail){
        this.customerEmail = customerEmail;
    }

    public void setDate (LocalDateTime date){
        this.date = date;
    }

    public void setPreviousStatus (String previousStatus){
        this.previousStatus = previousStatus;
    }

    public void setNewStatus (String newStatus){
        this.newStatus = newStatus;
    }

    public void setEmployeeId (Long employeeId){
        this.employeeId = employeeId;
    }

    public void setEmployeeEmail (String employeeEmail){
        this.employeeEmail = employeeEmail;
    }

    public void setRestaurantId (Long restaurantId){
        this.restaurantId = restaurantId;
    }

    public String getId (){
        return id;
    }

    public Long getOrderId (){
        return orderId;
    }

    public Long getCustomerId (){
        return customerId;
    }

    public String getCustomerEmail (){
        return customerEmail;
    }

    public LocalDateTime getDate (){
        return date;
    }

    public String getPreviousStatus (){
        return previousStatus;
    }

    public String getNewStatus (){
        return newStatus;
    }

    public Long getEmployeeId (){
        return employeeId;
    }

    public String getEmployeeEmail (){
        return employeeEmail;
    }

    public Long getRestaurantId (){
        return restaurantId;
    }
}
