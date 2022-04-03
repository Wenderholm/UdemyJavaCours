package com.company.operatorChallange;

public class Operators {
    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;

        double totalValue = firstValue + secondValue * 100d;
        System.out.println("myTotalValue is: "+ totalValue);
        double theRemainder = totalValue % 40.00d;
        System.out.println("theRemainder is: "+ theRemainder);
        boolean isNotRemainder = (theRemainder==0) ? true : false;
        System.out.println("isNotRemainder is : " + isNotRemainder );
        if(!isNotRemainder){
            System.out.println("got some remainder");
        }
    }
}
