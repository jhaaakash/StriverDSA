package com.aakash.basic.basicRecursion;

public class SumOfFirstNNumber {

    public int NnumbersSum(int N) {
        //your code goes here
        if(N==0)
        {
            return 0;
        }
        return N + NnumbersSum(N-1);

    }
    public static void main(String[] args) {
        SumOfFirstNNumber solution = new SumOfFirstNNumber();
        int N = 10; // Example input
        System.out.println("Sum of first " + N + " numbers is " + solution.NnumbersSum(N));
    }
}
