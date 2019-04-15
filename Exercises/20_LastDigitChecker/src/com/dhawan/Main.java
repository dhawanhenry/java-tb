package com.dhawan;

public class Main {

    public static void main(String[] args) {
        hasSameLastDigit(41, 22, 71);
        hasSameLastDigit(23, 32, 42);
        hasSameLastDigit(9, 99, 999);
        hasSameLastDigit(22, 33, 44);
    }

    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree){
        if(((numOne >= 10) && (numOne < 1001)) &&
                ((numTwo >= 10) && (numTwo < 1001)) &&
                        ((numThree >= 10) && (numThree < 1001))){

            int remOne = numOne % 10;
            int remTwo = numTwo % 10;
            int remThree = numThree % 10;

            if((remOne == remTwo) || (remOne == remThree) || (remTwo == remThree)){
                System.out.println("At least two numbers have the same last digit");
                return true;
            } else {
                System.out.println("None of the numbers have the same last digit");
            }
            return true;
        } else {
            System.out.println("Numbers are out of range");
            return false;
        }
    }
}
