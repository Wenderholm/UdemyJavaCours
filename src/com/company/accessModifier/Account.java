package com.company.accessModifier;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    public ArrayList<Integer> transaction;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transaction = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposite(int amount){
        if(amount<0){
            System.out.println("You cannot add negative sum");
        }else {
            transaction.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        }
    }

    public void withdraw(int amount){
        if(amount > 0){
            if( this.balance < amount){
                System.out.println("You dont have not enough money");
            }else{
                this.transaction.add(amount);
                this.balance -= amount;
                System.out.println("You withdraw "+ amount + ". Balance is now " + this.balance);
            }
        }else{
            System.out.println("You cannot withdraw negative sum");
        }
    }
    public void calculateBalance(){
        this.balance = 0;
        for(int i: this.transaction){
            this.balance += i;
        }
        System.out.println("Calculate sum on account is " + this.balance);
    }
}
