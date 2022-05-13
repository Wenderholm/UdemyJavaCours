package com.company.linkedList.demo;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Warszawa");
        placesToVisit.add("Poznań");
        placesToVisit.add("Gdańsk");
        placesToVisit.add("Kraków");
        placesToVisit.add("Szczecin");
        placesToVisit.add("Rumia");

        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==================================");
    }
}
