package com.dhawan;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(11, 13);
        calcFeetAndInchesToCentimeters(86.5);
        calcFeetAndInchesToCentimeters(156);
        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(6, -10);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if((feet < 0) || (inches < 0 || inches > 12)){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        } else {
            double calculatedInches = feet * 12;
            double calculatedCentimeters = (calculatedInches + inches) * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + calculatedCentimeters);
            return calculatedCentimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0){
            System.out.println("Invalid inches parameters");
            return -1;
        } else {
            double calculatedFeet = (int)(inches / 12);
            double calculatedInches = (int) (inches % 12);
            return calcFeetAndInchesToCentimeters(calculatedFeet, calculatedInches);

        }
    }








}
