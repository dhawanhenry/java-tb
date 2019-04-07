package com.dhawan;

public class Main {

    public static void main(String[] args) {
        boolean result1 = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(result1);

        boolean result2 = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(result2);

        boolean result3 = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(result3);

        boolean result4 = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(result4);

    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int number1 = (int) (num1 * 1000);
        int number2 = (int) (num2 * 1000);

        if(number1 == number2){
            return true;
        } else{
            return false;
        }

    }
}
