package com.dhawan;

public class Main {
    private final static String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
	    printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number){
        if(number < 1){
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            for(int i = 1; i <= number; i++){
                if(number % i == 0){
                    System.out.println("Factor for " + number + " = " + i);
                }
            }
        }
    }
}
