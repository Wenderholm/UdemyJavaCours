package com.company.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    System.out.println("Thank for your cooperation. Bye Bye");
                    quit = true;
                    break;

            }
        }
    }


    private static void printInstruction() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryList(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replace item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(itemNum - 1, newItem);
    }

    private static void removeItem() {
        System.out.print("Enter item number to remove: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryList(itemNum-1);
    }

    private static void searchItem() {
        System.out.print("Item to search for: ");
        String item = scanner.nextLine();
        if(groceryList.findItem(item) != null){
            System.out.println("Found " + item + " on your grocery list");
        }else{
            System.out.println(item + " is not in your grocery list");
        }
    }

}
