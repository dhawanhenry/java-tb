package com.dhawan;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while(count != 5){
            System.out.println("Count value with while loop is " + count);
            count++;
        }

	    for(int i = 1; i < 6; i++){
            System.out.println("Count value with for loop with wrong variable is " + count);
        }

	    for(count = 1; count < 6; count++){
            System.out.println("Count value with for loop is " + count);
        }

	    count = 1;
	    while(true){
	        if(count == 6){
	            break;
            }
            System.out.println("Count value with whole loop is " + count);
	        count++;
        }

	    count = 1;
	    do{
            System.out.println("Count value with do-while loop is " + count);
            count++;
        } while(count!= 6);

	    int number = 4;
	    int finishNumber = 20;
	    int evenNumbersFound = 0;

	    while(number <= finishNumber){
	        number++;
	        if(!isEvenNumber(number)){
	            continue;
            }
	        evenNumbersFound++;
            System.out.println("Even number is " + number);
            if(evenNumbersFound == 5){
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        } else{
            return false;
        }
    }
}
