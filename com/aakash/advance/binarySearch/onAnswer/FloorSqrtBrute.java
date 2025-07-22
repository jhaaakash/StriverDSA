package com.aakash.advance.binarySearch.onAnswer;

public class FloorSqrtBrute {
    public long floorSqrt(long n) {
        long ans = 0;
        // Linear search in the answer space
        for (long i = 1; i <= n; i++) {
            long val = i * i;

            // Check if val is less than or equal to n
            if (val <= (long) n) {
                // Update ans to current value of i
                ans = (int) i;
            }
            else {
                break;
            }
        }
        // Return the computed floor of square root
        return ans;
    }


    public static void main(String[] args) {
        int n = 28;

        // Create an object of the Solution class
        FloorSqrtBrute sol = new FloorSqrtBrute();

        long ans = sol.floorSqrt(n);

        // Print the result
        System.out.println("The floor of square root of " + n
                + " is: " + ans);
    }
}
