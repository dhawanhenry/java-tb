package com.dhawan;

public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default CustomerName", 5.0, "default@email.com");
    }

    public VipCustomer(String customerName, double creditLimit){
        this(customerName, creditLimit, "SecondDefault@email.com");
    }

    public VipCustomer(String customerName, double creditLimit, String email){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCreditLimit(double creditLimit){
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
}
