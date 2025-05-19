package com.aakash.basic.basicMath;

import java.util.HashMap;

public class CountAllDigitOfNumber {

    public int countDigit(int n) {
    if (n==0)
    {
        return 0;
    }
    int count=0;

    while(n>0)
    {
        n=n/10;
        count++;
    }
    return  count;

    /*
    Second approach:
    if(n==0) return 1;

    int count =(int) (Math.log10(n) +1);
    return count;

     */

    }


    public static void main(String[] args) {
        int n = 6678;

        /* Creating an instance of
        Solution class */
        CountAllDigitOfNumber sol = new CountAllDigitOfNumber();

        // Function call to get count of digits in n
        int ans = sol.countDigit(n);
        System.out.println("The count of digits in the given number is: " + ans);
    }
}
