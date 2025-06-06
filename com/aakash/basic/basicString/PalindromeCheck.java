package com.aakash.basic.basicString;

public class PalindromeCheck {

    public boolean palindromeCheck(String s) {

        // your code goes here

        int left = 0;

        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                return false;
            }

            left++;

            right--;
        }

        return true;
    }


    public static void main(String[] args) {
        PalindromeCheck solution = new PalindromeCheck();
        String str = "racecar";

        if (solution.palindromeCheck(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
