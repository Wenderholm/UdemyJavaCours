package com.company.tablice;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayExercise {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        int[] sorted = sortIntegers(myArray);
        printArrays(sorted);
    }
// pierwszy sposób sortowania
//    private static void sortArray(int[] arrNum) {
//        int temp = 0;
//        System.out.println("Sorted array elements in descending order:");
//        for(int i=0;i<arrNum.length;i++) {
//            for(int j=i+1;j<arrNum.length;j++) {
//                if(arrNum[i] < arrNum[j]) {
//                    temp = arrNum[i];
//                    arrNum[i] = arrNum[j];
//                    arrNum[j] = temp;
//                }
//            }
//            System.out.println(arrNum[i]);
//        }
//    }

//    drugi sposób sortowania
    public static int[] sortIntegers(int[] array){
        //skopiowanie tablicy pętla
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

//        kopiowanie tablicy łatiwejszy sposób
        int[] sortedArray = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


    private static void printArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("podaj " + number + " liczbe \r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

}
