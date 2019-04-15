package com.dhawan;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of digits for " + 125 + " = "+ sumDigits(125));
        System.out.println("Sum of digits for " + 777 + " = "+ sumDigits(777));
        System.out.println("Sum of digits for " + 729 + " = "+ sumDigits(729));
        System.out.println("Sum of digits for " + 0 + " = "+ sumDigits(0));
        System.out.println("Sum of digits for " + -45 + " = "+ sumDigits(-45));
        System.out.println("Sum of digits for " + 6 + " = "+ sumDigits(6));
    }

    public static int sumDigits(int number){
        int sum = 0;
        if(number <= 9){
            return -1;
        } else{
            while (number > 0){
                int divNumber = number / 10;
                int remNumber = number % 10;
                number = divNumber;
                sum = sum + remNumber;
            }
            //System.out.println("Sum of digits = " + sum);
            return sum;
        }
    }
}
