package com.aakash.basic.basicMath;

public class PrimeNumber {
    public boolean isPrime(int n) {
        //your code goes here
        if(n<2)
        {
            return false;
        }
        int count=0;
        for(int i=2; i*i<n;i++)
        {
            if(n%i==0)
            {
                count++;
                if(count==1)
                {   // if a number is divisible by anynumber between 2 to the square root of number, it will not be a prime number.
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int n = 5;

        /* Creating an instance of
        Solution class */
        PrimeNumber sol = new PrimeNumber();

        /* Function call to find whether the
         given number is prime or not */
        boolean ans = sol.isPrime(n);

        if (ans) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

}
