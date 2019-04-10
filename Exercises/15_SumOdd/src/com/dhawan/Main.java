package com.dhawan;

public class Main {

    public static void main(String[] args) {
        sumOdd(1, 100);
        sumOdd(-1, 100);
        sumOdd(100, 100);
        sumOdd(13, 13);
        sumOdd(100, -100);
        sumOdd(100, 1000);
    }

    public static boolean isOdd(int number){
        if((number < 0) || (number % 2 == 0)){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if((start > 0) && (end > 0) && (start <= end)){
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
            System.out.println("final sum = " + sum);
            return sum;
        }
        System.out.println("final sum = -1");
        return -1;
    }
}
