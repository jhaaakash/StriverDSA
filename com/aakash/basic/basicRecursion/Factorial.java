package com.aakash.basic.basicRecursion;

public class Factorial {
    public long factorial(int n) {
        //your code goes here

        if(n<=1)
        {
            return 1;
        }

        return n * factorial(n-1);
    }


    public static void main(String[] args) {
        Factorial solution = new Factorial();
        int N = 5; // Example input
        System.out.println("Factorial of " + N + " is " + solution.factorial(N));
    }
}
