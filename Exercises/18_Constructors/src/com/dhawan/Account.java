package com.dhawan;

public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public Account(){
        this("567888", 2.50, "Default Name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double balance, String customerName, String email, String phone){
        System.out.println("Account Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public Account(String customerName, String email, String phone) {
        this("99999", 100.55, customerName, email, phone);
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void depositFunds(double deposit){
        this.balance += deposit;
        System.out.println("Deposit made  = " + deposit + " . New Balance = " + balance);
    }

    public void withdrawFunds(double withdraw){
        if(withdraw >= 0 && withdraw <= balance){
            this.balance -= withdraw;
            System.out.println("Withdrawn amount = " + withdraw + ". Balance remaining = " + balance);
        } else {
            System.out.println("Balance available = " + balance + ". Not sufficient funds to withdraw");
        }
    }
}
