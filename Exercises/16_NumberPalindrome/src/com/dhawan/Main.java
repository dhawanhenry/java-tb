package com.dhawan;

public class Main {

    public static void main(String[] args) {
        isPalindrome(-1221);
        isPalindrome(121);
        isPalindrome(223);
        isPalindrome(102);
        isPalindrome(707);
        isPalindrome(11212);
        isPalindrome(-111);
    }

    public static boolean isPalindrome(int number){
        int numberToCompare;
        int reverse = 0;
        if(number < 0){
            numberToCompare = -1 * number;
            number = -1 * number;
            while(number > 0){
                int remainder = number % 10;
                int divisor = number / 10;
                number = divisor;
                reverse = (reverse * 10) + remainder;
            }

            if(reverse == numberToCompare){
                System.out.println("Number is a Palindrome");
                return true;
            } else {
                System.out.println("Number is NOT a Palindrome");
                return false;
            }
        } else {
            numberToCompare = number;
            while(number > 0) {
                int remainder = number % 10;
                int divisor = number / 10;
                number = divisor;
                reverse = (reverse * 10) + remainder;
            }

            if(reverse == numberToCompare){
                System.out.println("Number is a Palindrome");
                return true;
            } else {
                System.out.println("Number is NOT a Palindrome");
                return false;
            }
        }
    }
}
