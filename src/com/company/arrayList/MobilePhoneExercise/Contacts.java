package com.company.arrayList.MobilePhoneExercise;

import com.company.arrayList.GroceryList;

import java.util.Scanner;

public class Contacts {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

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
                    mobilePhone.printContact();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
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
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add new contact to the list.");
        System.out.println("\t 3 - To modify contact on the list.");
        System.out.println("\t 4 - To remove contact from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
    private static void addItem() {
        System.out.print("Please enter the contact name: ");
        mobilePhone.addContact(scanner.nextLine());
    }

    private static void modifyContact() {
        System.out.println("Enter number contact to modify: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replace Contact Name: ");
        String contactName = scanner.nextLine();
        mobilePhone.modifiedContact(number - 1, contactName);
    }

    private static void removeContact() {
        System.out.println("Enter contact number to remove: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        mobilePhone.removeContact(number-1);
    }

    private static void searchContact(){
        System.out.println("Enter contact name to find: ");
        String contact = scanner.nextLine();
        if(mobilePhone.findContact(contact) != null){
            System.out.println("You have " + contact + " in your number book");
        } else{
            System.out.println(contact + " not exist");
        }
    }
}
