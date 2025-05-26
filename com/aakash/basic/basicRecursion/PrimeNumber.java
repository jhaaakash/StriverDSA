package com.aakash.basic.basicRecursion;

public class PrimeNumber {
    public boolean checkPrime(int num) {
        int n=(int)(Math.sqrt(num));
        if(num<=1)
        {
            return false;
        }

        return isPrime(num, 2);
    }
    public boolean isPrime(int num, int n)
    {
        if(n > Math.sqrt(num))
        {
            return true;
        }


        if(num%n==0)
        {
            return false;
        }


        return isPrime(num, n+1);
    }


    public static void main(String[] args) {
        PrimeNumber solution = new PrimeNumber();
        int num = 7;
        boolean result = solution.checkPrime(num);
        System.out.println(result);
    }
}
