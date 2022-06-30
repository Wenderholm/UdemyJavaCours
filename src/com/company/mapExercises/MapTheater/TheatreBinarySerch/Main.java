package com.company.mapExercises.MapTheater.TheatreBinarySerch;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olimp", 9,12);
//        theatre.getSeats();

        if(theatre.reserveSeat("B10")){
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
