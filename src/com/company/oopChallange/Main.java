package com.company.oopChallange;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Chicken",4.53,"white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("cheese", 4.01);
        hamburger.addHamburgerAddition2("tomato", 0.71);
        hamburger.addHamburgerAddition3("Lettuce", 0.51);
        hamburger.addHamburgerAddition3("Potato", 0.84);
        System.out.println("Total price for hamburger " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Beacon", 10.50);
        healthyBurger.addHealthAddition1("Lettuce", 0.78);
        healthyBurger.addHealthAddition2("Egg", 1.64);
        System.out.println("Total price for healthy burger is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        System.out.println("Total price for healthy burger is " + db.itemizeHamburger());


    }
}
