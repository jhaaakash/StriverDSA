package com.aakash.basic.basicMath;

import java.util.Arrays;

public class DivisorOfANumber {

    public int[] divisors(int n) {
        int temp[]= new int[n];
        int count=0;

        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                temp[count++]=i;
            }
        }

        int arr[] = Arrays.copyOf(temp, count);

        return arr;
    }

    /*
     int[] temp = new int[n]; // Temporary array with max possible size
        int count = 0;

        int sqrtN = (int) Math.sqrt(n);


        for(int i = 1; i <= sqrtN; i++) {


            if(n % i == 0) {

                temp[count++] = i;

                if(i != n / i) {
        temp[count++] = n / i;
    }
}
        }

// Copy only the filled part of temp to the result array
int[] ans = Arrays.copyOf(temp, count);

// Sorting the result
        Arrays.sort(ans);

// Return the result
        return ans;
     */


    public static void main(String[] args) {
        int n = 6;

        // Creating an instance of Solution class
        DivisorOfANumber sol = new DivisorOfANumber();

        // Function call to find all divisors of n
        int[] ans = sol.divisors(n);

        System.out.print("The divisors of " + n + " are: ");
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
