package com.dhawan;

public class Main {

    public static void main(String[] args) {
        hasSharedDigit(15, 64);
	    hasSharedDigit(12, 23);
	    hasSharedDigit(9, 99);
	    hasSharedDigit(15, 55);
        hasSharedDigit(6, 1);
        hasSharedDigit(15, 7);
    }

    public static boolean hasSharedDigit(int numOne, int numTwo){
        if(((numOne >= 10) && (numOne < 100)) && ((numTwo >= 10) && (numTwo < 100))){
            int remOneNumOne = numOne % 10;
            int divOneNumOne = numOne / 10;

            int remTwoNumTwo = numTwo % 10;
            int divTwoNumTwo = numTwo / 10;

            if((remOneNumOne == remTwoNumTwo) || (remOneNumOne == divTwoNumTwo) || (divOneNumOne == remTwoNumTwo) || (divOneNumOne == divTwoNumTwo)){
                System.out.println("Common numbers are present");
                return true;
            } else {
                System.out.println("Numbers do not have any common digits");
                return false;
            }
        } else {
            System.out.println("Numbers are out of range");
            return false;
        }
    }
}
