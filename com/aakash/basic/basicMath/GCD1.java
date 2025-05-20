package com.aakash.basic.basicMath;

public class GCD1 {

    public int GCD(int n1, int n2) {
        int largest=1;
        for(int i=1; i<=Math.min(n1,n2); i++)
        {
            if(n1%i==0  && n2%i==0)
            {
                largest=i;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int n1 = 4, n2 = 6;

        /* Creating an instance of
        Solution class */
        GCD1 sol = new GCD1();

        /* Function call to find the
        gcd of two numbers */
        int ans = sol.GCD(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + ans);
    }


}
