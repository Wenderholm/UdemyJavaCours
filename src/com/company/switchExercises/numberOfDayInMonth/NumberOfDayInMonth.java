package com.company.switchExercises.numberOfDayInMonth;

public class NumberOfDayInMonth {
    public static void main(String[] args) {
        getDaysInMonth(1,2020);
        getDaysInMonth(2,2020);
        getDaysInMonth(-2,2020);
        getDaysInMonth(2,-2020);
    }
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if((year % 4) == 0 ){
                if((year % 100) == 0){
                    return (year % 400) == 0;
                }else
                    return true;
            }else
                return false;
        }else
            return false;
    }
    public static int getDaysInMonth(int month, int year){
        if((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)){
           if(isLeapYear(year)){
               switch (month) {
                   case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
                   case 2 -> System.out.println("29");
                   case 4, 6, 9, 11 -> System.out.println("30");
                   default -> System.out.println("invalid month number");
               }
           }else
               switch (month) {
                   case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
                   case 2 -> System.out.println("28");
                   case 4, 6, 9, 11 -> System.out.println("30");
                   default -> System.out.println("invalid month number");
               }
        }else
            return -1;
        return -1;
    }
}
