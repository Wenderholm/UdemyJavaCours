package com.company.codeBlock;

public class MethodExercise {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Janek",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Janek",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Janek",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Janek",highScorePosition);

    }

    public static void displayHighScorePosition(String name, int highScorePosition){
        System.out.println(name + " zajął pozychę " + highScorePosition + " w tabeli wyników.");
    }

    public static int calculateHighScorePosition(int playerScore){
//        if (playerScore >= 1000){
//           return 1;
//        } else if (playerScore >= 500){
//            return 2;
//        } else if (playerScore >= 100){
//            return 3;
//        }
//        return 4;
//        }
        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        }else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }
        return position;
    }
}
