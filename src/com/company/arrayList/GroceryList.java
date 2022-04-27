package com.company.arrayList;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumber = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

//    ARRAYLIST
//    ADD dodawanie elementów do listy
    public void addGroceryList (String item){
        groceryList.add(item);
    }
// SIZE - wyświetla liczbę elementów w tablicy
// GET - wypisuje element listy z opowiednim i
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
// SET - podmiana elementu na podanej pozycji o podaną wartość
    public void modifyGroceryList(int position, String item){
        groceryList.set(position, item);
        System.out.println("Item " + groceryList.get(position+1) + " was changed");
    }

    public void removeGroceryList(int position){
        String theItem = groceryList.get(position);
        System.out.println("item: " + theItem + " was removed");
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if(position >=0){
            return groceryList.get(position);
        }
        return null;
        }
    }


