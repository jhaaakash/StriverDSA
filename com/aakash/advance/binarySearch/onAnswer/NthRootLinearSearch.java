package com.aakash.advance.binarySearch.onAnswer;

public class NthRootLinearSearch {

    /* Function to calculate power using
    exponentiation by squaring method */
    private long Pow(int b, int exp) {
        long ans = 1;
        long base = b;

        // Exponentiation by squaring method
        while (exp > 0) {
            if (exp % 2 == 1) {
                exp--;
                ans *= base;
            } else {
                exp /= 2;
                base *= base;
            }
        }
        return ans;
    }

    /* Function to find the nth
    root of m using linear search */
    public int NthRoot(int N, int M) {
        // Linear search on the answer space
        for (int i = 1; i <= M; i++) {
            long val = Pow(i, N);

            /* Check if the computed
            value is equal to M*/
            if (val == M) {
                // Return the root value
                return i;
            } else if (val > M) {
                break;
            }
        }
        // Return -1 if no root found
        return -1;
    }

    public static void main(String[] args) {
        int n = 3, m = 27;

        // Create an object of the Solution class
        NthRootLinearSearch sol = new NthRootLinearSearch();

        int ans = sol.NthRoot(n, m);

        // Print the result
        System.out.println("The answer is: " + ans);
    }
}
