package com.dhawan;

public class Main {

    public static void main(String[] args) {
        //isLeapYear(-1600);
        //isLeapYear(1600);
        //isLeapYear(2017);
        //isLeapYear(2000);

        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(year + ". It is a leap year. Boolean is true");
                return true;
            } else {
                System.out.println(year + ". It is not a leap year. Boolean is false");
                return false;
            }
        }
        System.out.println(year + ". Invalid value for year. Boolean is false");
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        int days = 0;
        if(((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))){
            System.out.println("Invalid value");
            return -1;
        } else {
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    System.out.println(days + " is the number of days in month " + month + " of year " + year);
                    break;

                case 2:
                    if(isLeapYear(year)){
                        days = 29;
                        System.out.println(days + " is the number of days in month " + month + " of year " + year);
                    } else {
                        days = 28;
                        System.out.println(days + " is the number of days in month " + month + " of year " + year);
                    }
                    break;

                case 4: case 6: case 9: case 11:
                    days = 30;
                    System.out.println(days + " is the number of days in month " + month + " of year " + year);
                    break;
            }
            return days;
        }
    }
}
