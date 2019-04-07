package com.dhawan;

public class Main {

    public static void main(String[] args) {

        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
        isCatPlaying(true, 40);
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer == true){
            if((temperature > 24) && (temperature < 46)){
                System.out.println("summer and temperature in range. Boolean true for Cat playing");
                return true;
            } else {
                System.out.println("summer true but temperature out of range. Boolean false for Cat playing");
                return false;
            }

        } else {
            if((temperature > 24) && (temperature < 36)){
                System.out.println("Not summer and temperature in range. Boolean true for Cat playing");
                return true;
            } else {
                System.out.println("Not summer but temperature not in range. Boolean false for Cat playing");
                return false;
            }
        }

    }
}
