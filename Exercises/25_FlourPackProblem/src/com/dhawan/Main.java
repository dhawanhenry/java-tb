package com.dhawan;

public class Main {

    public static void main(String[] args) {
        canPack(1, 0, 4);
        canPack(1, 0, 5);
        canPack(0,5,4);
        canPack(2,2,11);
        canPack(-3, 2, 12);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int bigSum = 5 * bigCount;
        int smallSum = 1 * smallCount;
        int differenceBig = goal - bigSum;
        int differenceSmall = goal - smallSum;
        int differenceFull = goal - smallSum - bigSum;

        if(differenceBig < 0 || bigSum < 0 || smallSum < 0){
            System.out.println("False. The difference is negative. Goal is not achieved");
            return false;

        } else if ((differenceSmall < 0) && (bigSum == 0)){
            System.out.println("True. Big Count is zero. But the goal is achieved.");
            return true;

        } else if(differenceFull == 0){
            System.out.println("True. The Full Difference is zero. Goal is achieved.");
            return true;

        } else if((differenceSmall <= 0) && (bigSum == 0)){
            System.out.println("True. bigCount is zero but goal is achieved.");
            return true;

        } else if(((goal % bigSum) - smallSum <= 0) && (smallSum != 0)) {
            System.out.println("True. Remainder is not zero. smallCount is not zero. The goal is achieved.");
            return true;

        } else {
            System.out.println("False. One of the parameters is negative");
            return false;
        }
    }
}
