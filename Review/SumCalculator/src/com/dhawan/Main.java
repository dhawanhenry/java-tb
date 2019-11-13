package com.dhawan;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator cal = new SimpleCalculator();

        cal.setFirstNumber(12);
        cal.setSecondNumber(6);
        System.out.println(cal.getAdditionResult());
        System.out.println(cal.getDivisionResult());
    }
}
