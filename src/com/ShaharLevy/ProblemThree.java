package com.ShaharLevy;

public class ProblemThree {
    //The prime factors of 13195 are 5, 7, 13 and 29.
    //What is the largest prime factor of the number 600851475143?

    public static void main(String[] args){
        System.out.println(largestPrime(600851475143L));
    }

    public static long largestPrime(long num){
        long result = 0L;
        long squareRootOfNum = Math.round(Math.sqrt(num));
        System.out.println(squareRootOfNum);
        for(long i = squareRootOfNum; i > 0; i--){
            if (num % i == 0){
                System.out.println (i);

            }
        }
        return -1;
    }

}
