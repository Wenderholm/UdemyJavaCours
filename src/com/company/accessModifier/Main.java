package com.company.accessModifier;

public class Main {
    public static void main(String[] args) {
        Account aco1 = new Account("Konto przemka");
        aco1.deposite(1000);
        aco1.withdraw(1200);
        aco1.withdraw(200);
        aco1.withdraw(-20);
        aco1.calculateBalance();
        aco1.getBalance();
    }
}
