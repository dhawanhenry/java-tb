package com.dhawan;

public class Main {

    private final static String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
	    numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number){
        int numberOfDigits = getDigitCount(number);
        int reversedNumberOfDigits = getDigitCount(reverse(number));
        int differenceOfDigits = numberOfDigits - reversedNumberOfDigits;

        if(number < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        } else{
            number = reverse(number);
            while (number > 0){
                int digit = number % 10;
                int divNumber = number / 10;
                number = divNumber;
                switch (digit){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("No number");
                        break;
                }
            }
            for(int i = 0; i < differenceOfDigits; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number){
        int reversedNumber = 0;
        if(number < 0){
            return -1;
        } else {
            while(number > 0){
                int divisor = number / 10;
                int remainder = number % 10;
                number = divisor;
                reversedNumber = (reversedNumber * 10) + remainder;
            }
            return reversedNumber;
        }
    }

    public static int getDigitCount(int number){
        int digitCount = 0;
        while(number / 10 > 0){
            int div = number / 10;
            number = div;
            digitCount++;
        }
        return digitCount;
    }
}
