package com.company.teenNumberChecker;

public class HasTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(0,0,13));
    }
    public static boolean hasTeen(int oneNum, int secNum, int threeNum){
        if((13 <= oneNum && oneNum <= 19) || (13 <= secNum && secNum <= 19) || (13 <= threeNum && threeNum <= 19)){
            return true;
        }else
            return false;
    }
    public static boolean isTeen(int number){
        if(13 <= number && number <= 19){
            return true;
        }else
            return false;
    }
}
