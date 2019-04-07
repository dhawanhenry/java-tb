package com.dhawan;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-252);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            long years = (minutes / (365 * 24 * 60));
            long remainingMinutes = (minutes % (365 * 24 * 60));
            long days = remainingMinutes / (24 * 60);
            System.out.println(minutes + " min = " + years + " y " + days + " d");
        }
    }
}
