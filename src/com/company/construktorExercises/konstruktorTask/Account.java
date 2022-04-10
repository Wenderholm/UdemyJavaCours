package com.company.construktorExercises.konstruktorTask;

public class Account {
    private String number;
    private double balance;
    private String customerNumber;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(String number, double balance, String customerNumber, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerNumber = customerNumber;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account() {
        this("4444", 5, "78998732", "nowy@wp.pl","4859564123");
        System.out.println("Empty constructor called");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void deposit( double depositAmount ){
        this.balance += depositAmount;
        System.out.println("deposit of " + depositAmount + "PLN. New balance is " + this.balance);
    }

    public void withdrawFound( double withdrawalAmount){
        if (this.balance < withdrawalAmount){
            System.out.println("you have " + this.balance + " available. Withdrawal not processed");
        } else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + "PLN. New balance is " + this.balance);
        }

    }
}
