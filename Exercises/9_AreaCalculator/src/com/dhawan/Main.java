package com.dhawan;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
	    area(5.0);
        area(-1.0);
        area(5.0, 4.0);

    }

    public static double area(double radius){
        if(radius < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1.0;
        } else {
            double area = 3.14159 * radius * radius;
            System.out.println("Area of circle " + area);
            return area;
        }
    }

    public static double area(double sideOne, double sideTwo){
        if(sideOne < 0 || sideTwo < 0){
            return -1.0;
        } else {
            double area = sideOne * sideTwo;
            System.out.println("Area of rectangle " + area);
            return area;
        }
    }
}
