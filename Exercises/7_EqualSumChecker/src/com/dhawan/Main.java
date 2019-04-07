package com.dhawan;

public class Main {

    public static void main(String[] args) {

        boolean result1 = hasEqualSum(1, 1, 1);
        System.out.println(result1);

        boolean result2 = hasEqualSum(1, 1, 2);
        System.out.println(result2);

        boolean result3 = hasEqualSum(1, -1, 0);
        System.out.println(result3);
    }

    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree){
        if((numberOne + numberTwo) == numberThree){
            return true;
        }
        return false;
    }
}
