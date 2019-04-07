package com.dhawan;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {

        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2,3);
    }

    public static void printEqual(int valueOne, int valueTwo, int valueThree){
        if(valueOne < 0 || valueTwo < 0 || valueThree < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if ((valueOne == valueTwo) && (valueOne == valueThree) && (valueThree == valueTwo) && (valueOne >= 0) && (valueTwo >= 0) && (valueThree >= 0)){
            System.out.println("All numbers are equal");
        } else if((valueOne != valueTwo) && (valueOne != valueThree) && (valueThree != valueTwo) && (valueOne >= 0) && (valueTwo >= 0) && (valueThree >= 0)){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal nor different");
        }
    }
}
