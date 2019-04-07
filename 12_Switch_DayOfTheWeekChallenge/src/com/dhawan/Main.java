package com.dhawan;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid day";
    public static void main(String[] args) {
        printDayOfTheWeek(2);
        printDayOfTheWeek(6);
        printDayOfTheWeek(1);
        printDayOfTheWeek(9);

    }

    public static void printDayOfTheWeek(int day){

        switch(day){
            case 0:
                System.out.println("Monday");
                break;

            case 1:
                System.out.println("Tuesday");
                break;

            case 2:
                System.out.println("Wednesday");
                break;

            case 3:
                System.out.println("Thursday");
                break;

            case 4:
                System.out.println("Friday");
                break;

            case 5:
                System.out.println("Saturday");
                break;

            case 6:
                System.out.println("Sunday");
                break;

            default:
                System.out.println(INVALID_VALUE_MESSAGE);
                break;
        }

    }
}
