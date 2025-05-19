package com.aakash.basic.basicMath;

public class CountOddDigitInNumber {

    public int countOddDigit(int n) {
        if(n==0)
        {
            return 0;
        }

        int count=0;
        int rem;
        while(n>0)
        {   rem=n%10;
            if(rem%2!=0)
            {
                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 6678;

        /* Creating an instance of
        Solution class */
        CountOddDigitInNumber sol = new CountOddDigitInNumber();

        // Function call to get count of odd digits in n
        int ans = sol.countOddDigit(n);
        System.out.println("The count of odd digits in the given number is: " + ans);
    }
}
