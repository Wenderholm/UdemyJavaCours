package com.company.tablice;

import java.util.Arrays;

public class ReversExercise {
    public static void main(String[] args) {
        int[] array = {1,3,13,4,53,6};
//        System.out.println("Arrays = " + Arrays.toString(array));
        reverse(array);
//        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    public static void reverse(int[] array){
        System.out.println("Arrays = " + Arrays.toString(array));
        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        int temp;
        for (int i = 0; i < halfLength; i++) {
            temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
