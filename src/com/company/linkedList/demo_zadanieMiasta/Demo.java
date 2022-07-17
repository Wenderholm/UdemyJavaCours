package com.company.linkedList.demo_zadanieMiasta;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
//  dodawnie alfabetycznie
        addInOrder(placesToVisit,"Warszawa");
        addInOrder(placesToVisit,"Poznań");
        addInOrder(placesToVisit,"Gdańsk");
        addInOrder(placesToVisit,"Brodnica");
        addInOrder(placesToVisit,"Szczecin");
        addInOrder(placesToVisit,"Rumia");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Brodnica");
        addInOrder(placesToVisit, "Adamów");
        visit(placesToVisit);



//        dodawnie elementów jak w ArrayList
//        placesToVisit.add("Warszawa");
//        placesToVisit.add("Poznań");
//        placesToVisit.add("Gdańsk");
//        placesToVisit.add("Kraków");
//        placesToVisit.add("Szczecin");
//        placesToVisit.add("Rumia");
//
        printList(placesToVisit);

//        dodanie elementu do listy na pierwszym indexie
//        placesToVisit.add(1,"Brodnica");
//        printList(placesToVisit);

//        usunięcie elementu z indeksem równym 4
//        placesToVisit.remove(4);
//        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList , String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
//            compare to porównuje leksykalnie pierwsze litery wyrazów
//            jezeli A.compareTo(A) wynik 0
//            jezeli A.compareTo(B) wynik -1
//            jezeli B.compareTo(A) wynik 1
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0 ){
                // zero bedzie gdy jest równy czyli znaleziono taki sam
                // wtedy nie dodajemy
                System.out.println(newCity  + " already exist on the list.");
                return false;
            }else if(comparison > 0 ){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){

            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    public static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.getFirst() == ""){
            System.out.println("No cities in the list");
            return;
        }else{
            System.out.println("No visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacation (Holiday) over ");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available options: ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }

}
