package org.pragma.foodcourttraceability.domain.model;

import java.time.LocalDate;

public class Traceability{
    private String id;
    private Long orderId;
    private Long customerId;
    private String customerEmail;
    private LocalDate date;
    private String previousStatus;
    private String newStatus;
    private Long employeeId;
    private String employeeEmail;

    public Traceability (String id, Long orderId, Long customerId, String customerEmail, LocalDate date, String previousStatus, String newStatus, Long employeeId, String employeeEmail){
        this.id = id;
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerEmail = customerEmail;
        this.date = date;
        this.previousStatus = previousStatus;
        this.newStatus = newStatus;
        this.employeeId = employeeId;
        this.employeeEmail = employeeEmail;
    }

    public String getId (){
        return id;
    }

    public void setId (String id){
        this.id = id;
    }

    public Long getOrderId (){
        return orderId;
    }

    public void setOrderId (Long orderId){
        this.orderId = orderId;
    }

    public Long getCustomerId (){
        return customerId;
    }

    public void setCustomerId (Long customerId){
        this.customerId = customerId;
    }

    public String getCustomerEmail (){
        return customerEmail;
    }

    public void setCustomerEmail (String customerEmail){
        this.customerEmail = customerEmail;
    }

    public LocalDate getDate (){
        return date;
    }

    public void setDate (LocalDate date){
        this.date = date;
    }

    public String getPreviousStatus (){
        return previousStatus;
    }

    public void setPreviousStatus (String previousStatus){
        this.previousStatus = previousStatus;
    }

    public String getNewStatus (){
        return newStatus;
    }

    public void setNewStatus (String newStatus){
        this.newStatus = newStatus;
    }

    public Long getEmployeeId (){
        return employeeId;
    }

    public void setEmployeeId (Long employeeId){
        this.employeeId = employeeId;
    }

    public String getEmployeeEmail (){
        return employeeEmail;
    }

    public void setEmployeeEmail (String employeeEmail){
        this.employeeEmail = employeeEmail;
    }

    @Override
    public String toString (){
        return "Traceability{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", customerId=" + customerId +
                ", customerEmail='" + customerEmail + '\'' +
                ", date=" + date +
                ", previousStatus='" + previousStatus + '\'' +
                ", newStatus='" + newStatus + '\'' +
                ", employeeId=" + employeeId +
                ", employeeEmail='" + employeeEmail + '\'' +
                '}';
    }
}
