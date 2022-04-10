package com.company.ifAndIfElseExercises.secAndMinute;


public class SecondAndMinute {
    public static void main(String[] args) {
        getDurationString(15,110);
    }
    public static void getDurationString(int minutes, int seconds){
        if ((minutes >=0)&&(seconds >=0)){
            int sec = seconds % 60;
            int min = (seconds/60) + minutes;
            int hour = min / 60;
            System.out.println(" value string is: " + hour + "h" + min + "m" + sec + "s" );
        }else
            System.out.println("Invalid value");
    }
}
