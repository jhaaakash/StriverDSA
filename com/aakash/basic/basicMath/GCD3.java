package com.aakash.basic.basicMath;

public class GCD3 {

    public int GCD(int n1, int n2) {


        return 1;
    }

    public static void main(String[] args) {
        int n1 = 4, n2 = 6;

        /* Creating an instance of
        Solution class */
        GCD3 sol = new GCD3();

        /* Function call to find the
        gcd of two numbers */
        int ans = sol.GCD(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + ans);
    }


}
