package com.aakash.basic.basicMath;

public class PrimeNumberCountUptoN {

    public int primeUptoN(int n) {
        int count=0;
        for(int i=2; i<=n; i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }
        return count;

    }

    public boolean isPrime(int n)
    {
        int count=0;
        if(n<2)
        {
            return false;
        }

        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }

        }
        if(count==2)
        {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int n = 6;

        /* Creating an instance of
        Solution class */
        PrimeNumberCountUptoN sol = new PrimeNumberCountUptoN();

        /* Function call to get
        count of all primes till n */
        int ans = sol.primeUptoN(n);

        System.out.println("The count of primes till " + n + " is: " + ans);
    }
}
