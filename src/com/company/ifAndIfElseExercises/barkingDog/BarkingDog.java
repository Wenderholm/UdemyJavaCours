package com.company.ifAndIfElseExercises.barkingDog;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,8));

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }else{
            if ( hourOfDay < 8 || hourOfDay >= 23 ){
                if(barking){
                    return true;
                }else
                    return false;
            }else{
                return false;
            }
        }
    }
}
