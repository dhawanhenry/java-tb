package com.dhawan;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        String durationOne = getDurationString(342, 77);
        System.out.println(durationOne);

        String durationTwo = getDurationString(2433L);
        System.out.println(durationTwo);

        String durationThree = getDurationString(65, 45);
        System.out.println(durationThree);

        String durationFour = getDurationString(3945L);
        System.out.println(durationFour);

        String durationFive = getDurationString(-200);
        System.out.println(durationFive);
    }

    public static String getDurationString(long minutes, long seconds){
        if((minutes < 0) || (seconds < 0)){
            return INVALID_VALUE_MESSAGE;
        } else {
            long hours = minutes / 60;
            long calculatedMinutes = (minutes % 60) + (seconds / 60);
            long calculatedSeconds = seconds % 60;
            return hours + " h " + calculatedMinutes + " m " + calculatedSeconds + " s";
        }
    }

    public static String getDurationString(long seconds){
        if(seconds < 0){
            return "Invalid Value";
        } else {
            long calculatedMinutes = (seconds / 60);
            long calculatedSeconds = seconds % 60;
            return getDurationString(calculatedMinutes, calculatedSeconds);
        }
    }
}
