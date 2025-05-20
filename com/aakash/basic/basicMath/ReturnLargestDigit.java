package com.aakash.basic.basicMath;

public class ReturnLargestDigit {

    public int largestDigit(int n) {

        int largest = 0;

        int remainder = 0;

        while (n > 0) {

            remainder = n % 10;

            largest = Math.max(remainder, largest);

            n = n / 10;
        }

        return largest;
    }




    public static void main(String[] args) {
        int n = 348;

        /* Creating an instance of
        Solution class */
        ReturnLargestDigit sol = new ReturnLargestDigit();

        // Function call to find the largest digit in n
        int ans = sol.largestDigit(n);

        System.out.println("The largest digit in the number is: " + ans);
    }
}
