package com.dhawan;

public class Main {

    public static void main(String[] args) {

        int highscore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highscore);

        highscore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highscore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Bert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Karen", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Ken", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score position");
    }

    public static int calculateHighScorePosition(int playerScore){

//        if(playerScore >= 1000){
//            return 1;
//        } else if(playerScore >= 500){
//            return 2;
//        } else if(playerScore >= 100){
//            return 3;
//        } else
//            return 4;

        int position = 4; // assuming position 4 will be returned

        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100){
            position = 1;
        }
        return position;

    }
}
