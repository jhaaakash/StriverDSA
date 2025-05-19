package com.aakash.basic.basicMath;

public class PalindromeNumber {

    public boolean isPalindrome(int n) {

        int revnum=0;
        int originalNumber=n;
        while(n>0)
        {
            revnum= revnum*10 +(n%10);
            n=n/10;
        }

        if(originalNumber==revnum)
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 12321;

        /* Creating an instance of
        Solution class */
        PalindromeNumber sol = new PalindromeNumber();

        // Function call to check if n is a palindrome
        boolean ans = sol.isPalindrome(n);

        if (ans) {
            System.out.println("The given number is a palindrome");
        } else {
            System.out.println("The given number is not a palindrome");
        }
    }
}
