package com.company.tablice;

import java.util.Scanner;

public class MinElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberElement = readIntegers();
        int[] newArray = readElement(numberElement);
        int minValue = findMin(newArray);
        System.out.println("Min Value is :" + minValue);
    }

    public static int readIntegers(){
        System.out.println("Podaj ilość liczn do wczytania :");
        int count = scanner.nextInt();
        return count;
    }
    public static int[] readElement(int number){
        int[] value = new int[number];

        for (int i = 0; i < value.length; i++) {
            System.out.println("wczytaj liczbę");
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static int findMin(int[] array ) {
        int  min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        return min;
    }
}
