package com.aakash.basic.basicMath;

public class ReverseNumber {

    public int reverseNumber(int n) {
        int revnum=0;


        while(n>0)
        {
            revnum= revnum*10 +(n%10);
            n=n/10;

        }

        return revnum;

    }

    public static void main(String[] args) {
        int n = 6678;

        /* Creating an instance of
        Solution class */
        ReverseNumber sol = new ReverseNumber();

        // Function call to reverse the digits in n
        int ans = sol.reverseNumber(n);
        System.out.println("The reverse of given number is: " + ans);
    }
}


