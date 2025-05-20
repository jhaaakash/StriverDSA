package com.aakash.basic.basicMath;

public class PerfectNumber {

    public boolean isPerfect(int n) {

        int sum = 0;


        for(int i = 1; i < n; ++i) {


            if(n % i == 0){

                sum = sum + i;
            }
        }


        if(sum == n) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 6;

        /* Creating an instance of
        Solution class */
        PerfectNumber sol = new PerfectNumber();

        /* Function call to find whether the
         given number is perfect or not */
        boolean ans = sol.isPerfect(n);

        if(ans) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
}
