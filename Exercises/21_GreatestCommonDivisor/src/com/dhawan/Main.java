package com.dhawan;

public class Main {

    public static void main(String[] args) {
        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(12, 30);
        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(81, 153);
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int gcd = 0;
        if(first >= 10 && second >= 10){
            for(int i = 1; i <= first && i <= second; i++){
                if(first % i== 0 && second % i == 0){
                    gcd = i;
                }
            }
            System.out.println("GCD = " + gcd);
            return gcd;
        }
        else {
            System.out.println("Invalid value and value returned = -1");
            return -1;
        }
    }
}
