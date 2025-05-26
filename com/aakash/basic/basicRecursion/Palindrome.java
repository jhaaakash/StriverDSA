package com.aakash.basic.basicRecursion;

public class Palindrome {

    public boolean palindromeCheck(String s) {
        //your code goes here
        int left=0;
        int right=s.length()-1;
        return isPalindrome(s, left, right);

    }
    public boolean isPalindrome(String s, int left, int right)
    {
        if(left>=right)
        {
            return true;
        }

        if(s.charAt(left)!=s.charAt(right))
        {
            return false;
        }

        return isPalindrome(s, left +1, right-1);
    }

    public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        System.out.println(solution.palindromeCheck("hannah")); // Output: true
        System.out.println(solution.palindromeCheck("aabbaaa")); // Output: false
        System.out.println(solution.palindromeCheck("aba")); // Output: true

    }
}
