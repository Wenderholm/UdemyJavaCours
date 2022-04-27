package com.company.tablice;

import java.util.Scanner;

public class ArrayExercise {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getInteger(5);
        printNextArray(myArray);
        System.out.println("The average is " + getAverage(myArray));
    }

    private static void printNextArray(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Element " + i + " value is "+ array[i]);
        }
    }

    public static int[] getInteger(int number ){
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

}
