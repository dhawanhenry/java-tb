package com.dhawan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int XX = 0;
        long YY = 0;
        int counter = 0;

        while(true){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                XX += number;
                counter++;
                YY = Math.round((double) XX / counter);
            } else {
                //System.out.println("Atleast one of the entered numbers is invalid");
                break;
            }
            //scanner.nextLine();
        }
        System.out.println("SUM = " + XX + " counter = " + counter + " AVG = " + YY);
        scanner.close();
    }
}
