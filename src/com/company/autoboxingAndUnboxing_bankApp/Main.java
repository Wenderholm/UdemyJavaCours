package com.company.autoboxingAndUnboxing_bankApp;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australian Bank");
        bank.addBranch("Ade");

        bank.addCustomer("Ade","Tim", 50.05);
        bank.addCustomer("Ade","Mike", 175.34);
        bank.addCustomer("Ade","Percy", 220.12);


        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob", 150.54);

        bank.addCustomerTransaction("Ade","Tim", 44.22);
        bank.addCustomerTransaction("Ade","Tim", 12.44);
        bank.addCustomerTransaction("Ade","Mike", 1.65);

        bank.listCustomers("Ade", true);
        bank.listCustomers("Sydney", true);

//        sprawdzenie czy dodatnie użytkowanieka do niestniejacego banku pokaże bład
        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }
//sprawdzenie czy możemy dodać jeszcze raz ten sam oddział
        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }
// sprwadzenie czy mozemy dodać tranzakcję dla uzutkownieka którego nie ma w banku
        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }
// sprwdzenie czy mozna dodać jeszcze raz tego samoego uzytkownika do tego samoego banku
        if(!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}
