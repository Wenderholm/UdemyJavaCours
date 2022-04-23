package com.company.oopChallange;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe burger", "Sausage & beef", 15.54, "White");
        super.addHamburgerAddition1("Chips", 4.42);
        super.addHamburgerAddition2("Cola", 4.78);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe hamburger");
    }
}
