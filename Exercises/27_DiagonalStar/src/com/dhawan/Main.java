package com.dhawan;

public class Main {

    public final static String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        printSquareStar(5);
        System.out.println("");
        System.out.println("");
        printSquareStar(8);
    }

    public static void printSquareStar(int number){
        if (number >= 5) {
            for (int row = 1; row <= number; row++) {
                for (int column = 1; column <= number; column++) {
                    if (row == number || row == 1 || // First and last row
                            column == number || column == 1 || // First and last column
                            row == column || // When row == column
                            column == (number - row + 1)) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
                System.out.println(); // New row
            }
        } else System.out.println(INVALID_VALUE_MESSAGE);
    }
}
