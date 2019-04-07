package com.dhawan;

public class Main {

    public static void main(String[] args) {

	    boolean result1 = hasTeen(9, 99, 19);
        System.out.println(result1);

        boolean result2 = hasTeen(23, 15, 42);
        System.out.println(result2);

        boolean result3 = hasTeen(22, 23, 34);
        System.out.println(result3);
    }

    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree){
        if((numberOne >= 13 && numberOne <= 19)
                || (numberTwo >= 13 && numberTwo <= 19)
                        || (numberThree >= 13 && numberThree <= 19)){
            return true;
        }
        return false;
    }
}
