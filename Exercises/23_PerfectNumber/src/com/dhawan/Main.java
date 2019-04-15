package com.dhawan;

public class Main {

    private final static String INVALID_VALUE_MESSAGE = "False. Invalid value";
    public static void main(String[] args) {
	    isPerfectNumber(6);
	    isPerfectNumber(28);
	    isPerfectNumber(5);
	    isPerfectNumber(-1);
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        if(number < 1){
            System.out.println(INVALID_VALUE_MESSAGE);
            return false;
        } else {
            for(int i = 1; i < number; i++){
                if(number % i == 0){
                    sum = sum + i;
                }
            }
            if(sum == number){
                System.out.println("True. This is a perfect number");
                return true;
            }
            System.out.println("False. This is NOT a perfect number");
            return false;

        }
    }
}
