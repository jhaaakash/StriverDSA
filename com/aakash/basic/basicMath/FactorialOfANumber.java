package com.aakash.basic.basicMath;

public class FactorialOfANumber {


        public int factorial(int n) {

            int ans=1;

            for( int i=1; i<=n; i++)

            {

                ans= ans*i;

            }

            return ans;

        }


    public static void main(String[] args) {
        int n = 4;

        /* Creating an instance of
        Solution class */
        FactorialOfANumber sol = new FactorialOfANumber();

        // Function call to find the factorial of n
        int ans = sol.factorial(n);

        System.out.println("The factorial of given number is: " + ans);
    }
}
