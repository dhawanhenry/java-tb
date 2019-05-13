package com.company;

public class Main {

    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        one.add(1,1);
        System.out.println("one.real = " + one.getReal()); // 1 + (1) = 2.0
        System.out.println("one.imaginary = " + one.getImaginary()); // 1 + (1) = 2.0

        one.subtract(number);
        System.out.println("one.real = " + one.getReal()); // 2 - (2.5) = -0.5
        System.out.println("one.imaginary = " + one.getImaginary()); // 2 - (-1.5) = 3.5

        number.subtract(one);
        System.out.println("one.real = " + one.getReal()); // 2.5 - (-0.5) = 3.0
        System.out.println("one.imaginary = " + one.getImaginary()); // -1.5 - (3.5) = 5.0


    }
}
