package com.dhawan;

public class Main {

    public static void main(String[] args) {
        sumFirstAndLastDigit(136);
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
    }

    public static int sumFirstAndLastDigit(int number){

        int sum = 0;
        //int originalNumber = number;
        //int firstRemainder = 0;
        if(number < 0){
            System.out.println("Number is less than 0");
            return -1;
        } else {
            int originalNumber = number;
            while(number > 0){

                int firstRemainder = originalNumber % 10;
                int divisor = number / 10;
                int remainder = number % 10;
                number = divisor;
                if(number < 10){
                    sum = firstRemainder + remainder;
                }
            }
            System.out.println("Sum of digits = " + sum);
            return sum;
        }
    }
}
