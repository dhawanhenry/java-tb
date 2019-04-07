package com.dhawan;

public class Main {

    public static void main(String[] args) {

        printConversion(60.5);
        printConversion(96);
        printConversion(124.66);
        printConversion(0);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long convertMilesPerHour = Math.round(kilometersPerHour / 1.609);
            return convertMilesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
