package com.company.equalSum;

public class EqualSum {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }
    public static boolean hasEqualSum(int oneNumber, int secondNumber, int threeNumber){
        if(oneNumber + secondNumber == threeNumber){
            return true;
        }else
            return false;
    }
}
