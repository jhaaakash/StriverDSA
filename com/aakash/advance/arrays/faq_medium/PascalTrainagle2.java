package com.aakash.advance.arrays.faq_medium;

// this will print any row of pascal triangle

public class PascalTrainagle2 {

    public int[] pascalTriangleII(int r) {
        int[] ans = new int[r];
        ans[0] = 1;
        for (int i = 1; i < r; i++) {
            ans[i] = ans[i - 1] * (r - i);
            ans[i] = ans[i] / i;
        }
        return ans;
    }

    public static void main(String[] args) {
        // row number
        int r = 5;

        // Create an instance of the Solution class
        PascalTrainagle2 sol = new PascalTrainagle2();

        // Function call to return the rth row of Pascal's triangle
        int[] ans = sol.pascalTriangleII(r);

        // Output
        System.out.print("Row " + r + ": ");
        for(int x : ans) System.out.print(x + " ");
    }


}
