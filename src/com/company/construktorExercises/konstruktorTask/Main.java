package com.company.construktorExercises.konstruktorTask;

public class Main {
    public static void main(String[] args) {
        Account aco1 = new Account("4541236987",10000, "1234","pwenderholm@gmail.com","789456123");

        aco1.deposit(1000);
        aco1.withdrawFound(200000);

        Account aco2 = new Account();

        aco2.getBalance();
       }
}
