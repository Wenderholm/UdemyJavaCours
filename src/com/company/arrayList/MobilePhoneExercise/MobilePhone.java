package com.company.arrayList.MobilePhoneExercise;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<String> contacts = new ArrayList<String>();

    public void addContact (String contactName){
        contacts.add(contactName);
    }

    public void printContact(){
        System.out.println("You have " + contacts.size() + " contacts in your phone");
        for (int i = 0; i < contacts.size() ; i++) {
            System.out.println((i+1) + ". " + contacts.get(i));
        }
    }

    public void modifiedContact(int position, String contact){
        contacts.set(position,contact);
        System.out.println("Item " + contacts.get(position + 1) + " was changed");
    }

    public void removeContact(int position){
        String itemName = contacts.get(position);
        System.out.println("Contact " + itemName + " was removed");
        contacts.remove(position);
    }

    public String findContact(String itemName){
        int contactPosition = contacts.indexOf(itemName);
        if (contactPosition >= 0 ){
            return contacts.get(contactPosition);
        }else
            return null;
    }
}
