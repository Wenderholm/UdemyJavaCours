package com.company.tablice;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i* 10;
        }
//          WYŚWIETLANIE ELEMENTÓW TABLICY
//        for (int i = 0; i < myIntArray.length; i++) {
//            System.out.println("Element " + i + ", valuse is "+ myIntArray[i]);
//        }

//        WYWOŁANIE METODY DO WYŚWIETLANIA TABLICY
        printArray(myIntArray);
    }
//    ODDZIELNA METODA DO WYZNACZANIA TABLICY
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", valuse is "+ array[i]);
        }
    }
}
