package com.dhawan;

public class Main {

    public static void main(String[] args) {

        getLargestPrime(21);
        getLargestPrime(217);
        getLargestPrime(0);
        getLargestPrime(45);
        getLargestPrime(-1);
    }

    public static int getLargestPrime(int number){
        int prime = 0;
        if(number <= 1){
            System.out.println("Invalid value");
            return -1;
        }

        boolean isPrime = true;
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0){
                for(int k = 2; k <= i/2; k++){
                    if(i % k == 0){
                        isPrime = false;
                    }
                }
                if(isPrime == true && i > prime){
                    prime = i;
                }
            }
        }
        System.out.println(prime);
        return prime;
    }
}
