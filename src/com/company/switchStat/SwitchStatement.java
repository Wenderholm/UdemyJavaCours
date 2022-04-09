package com.company.switchStat;

public class SwitchStatement {
    public static void main(String[] args) {
        char charValue = 'C';
        switch(charValue){
            case 'A':
                System.out.println("we found char A");
                break;
            case 'B':
                System.out.println("we found char B");
                break;
            case 'C':  case 'D': case 'E':
                System.out.println("could not found C, D or E");
                break;
            default:
                System.out.println("char not found");
                break;

        }
        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
            default:
                System.out.println("not sure");
        }

    }


}
