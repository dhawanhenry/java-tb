package com.dhawan;

public class Main {

    public static void main(String[] args) {
	    shouldWakeUp(true, 1);
	    shouldWakeUp(false, 2);
	    shouldWakeUp(true, 8);
	    shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(barking == true){
            if((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23)){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
