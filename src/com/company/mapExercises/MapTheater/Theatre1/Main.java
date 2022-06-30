package com.company.mapExercises.MapTheater.Theatre1;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olimp", 8,12);
        theatre.getSeats();

        if(theatre.reserveSeat("H11")){
            System.out.println("pleas pay");
        }else{
            System.out.println("sorry, seat is reserved");
        }
        if(theatre.reserveSeat("H11")){
            System.out.println("pleas pay");
        }else{
            System.out.println("sorry, seat is reserved");
        }
    }
}
