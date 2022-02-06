package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteVariable = 3;
        short shortVariable = 20;
        int intVariable = 1000;

        long longVariable = 50_000L + (10L *(byteVariable+shortVariable+intVariable));
        System.out.println(longVariable);
    }

}
