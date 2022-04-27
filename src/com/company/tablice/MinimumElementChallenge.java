package com.company.tablice;


import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] testArray = readIntegers(3);
        int returnedMin = findMin(testArray);
        System.out.println("Min value is : " + returnedMin );
    }
    public static int[] readIntegers(int count){
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
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
