package com.company.construktorExercises.simpleCalculator;

import org.w3c.dom.ls.LSOutput;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getAdditionResult(){
        double sum = this.firstNumber + this.secondNumber;
        return sum + " is printed because " + this.firstNumber + " +  " + this.secondNumber + " is " + sum;

    }
    public String getSubtractionResult(){
        double subst = this.firstNumber - this.secondNumber;
        return subst +" is printed because " + this.firstNumber + " -  " + this.secondNumber + " is " + subst;
    }
    public String getMultiplicationResult(){
        double mult = this.firstNumber * this.secondNumber;
        return mult +" is printed because " + this.firstNumber + " *  " + this.secondNumber + " is " + mult;
    }
    public String getDivisionResult(){
        if(this.secondNumber == 0){
            return "0 is printed because secondNumber is set to " + this.secondNumber;
        }else{
            double divide = this.firstNumber / this.secondNumber;
            return divide +" is pritned because " + this.firstNumber + " *  " + this.secondNumber + " is " + divide;
        }

    }
//    wersja z użyciem public double
//    public double getAdditionResult(){
//        double sum = this.firstNumber + this.secondNumber;
//        return sum;
//    }
//    public double getSubtractionResult(){
//        double subst = this.firstNumber - this.secondNumber;
//        return subst;
//    }
//    public double getMultiplicationResult(){
//        double mult = this.firstNumber * this.secondNumber;
//        return mult;
//    }
//    public double getDivisionResult(){
//        if(this.secondNumber == 0){
//            return 0;
//        }else{
//            double divide = this.firstNumber / this.secondNumber;
//            return divide;
//        }
//
//    }
}
