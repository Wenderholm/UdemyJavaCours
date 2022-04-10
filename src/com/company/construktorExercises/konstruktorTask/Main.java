package com.company.construktorExercises.konstruktorTask;

public class Main {
    public static void main(String[] args) {
        Account aco1 = new Account("4541236987",10000, "Andrzej","pwenderholm@gmail.com","789456123");

        aco1.deposit(1000);
        aco1.withdrawFound(200000);

        Account aco2 = new Account();

        aco2.getBalance();
        Account timsAccount = new Account("Tim", "tim@email.com","12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob",2500.0);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.0, "tim@gmail.com");
        System.out.println(person3.getName());

    }
}
