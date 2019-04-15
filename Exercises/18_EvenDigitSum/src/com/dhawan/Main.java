package com.dhawan;

public class Main {

    public static void main(String[] args) {
        getEvenDigitSum(202);
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }

    public static int getEvenDigitSum(int number){
        int sum = 0;
        if(number < 0){
            System.out.println("Number is less than 0");
            return -1;
        } else {
            while(number > 0){
                int divisor = number / 10;
                int remainder = number % 10;
                number = divisor;
                if(remainder % 2 == 0){
                    sum = sum + remainder;
                }
            }
            System.out.println("Sum of the even digits = " + sum);
            return sum;
        }
    }
}
