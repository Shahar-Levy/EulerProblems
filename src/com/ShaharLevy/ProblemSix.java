package com.ShaharLevy;

public class ProblemSix {

    //the difference between the sum of the squares of the first ten
    //natural numbers and the square of the sum is 3025 − 385 = 2640.
    //Find the difference between the sum of the squares of the first
    //one hundred natural numbers and the square of the sum.

    public static void main(String[] args){
        System.out.println(eulerProblemSix());
    }

    public static int eulerProblemSix(){
        int sumSquares = 0;
        int sum = 0;

        for(int i = 0; i <= 100; i++){
            sumSquares += i*i;
            sum += i;
        }
        int squareSums = sum * sum;
        System.out.println("sum of squares: " + sumSquares);
        System.out.println("square of sums: " + squareSums);
        return squareSums - sumSquares;
    }


}
