package com.aakash.advance.arrays.faq_medium;

public class PascalTriangle1 {

    private static int nCr(int n, int r) {
        if (r > n - r) {
            r = n - r;
        }
        if (r == 1) {
            return n;
        }
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public int pascalTriangleI(int r, int c) {
        return nCr(r - 1, c - 1);
    }

    public static void main(String[] args) {
        // row number
        int r = 5;
        // col number
        int c = 3;

        // Create an instance of the Solution class
        PascalTriangle1 sol = new PascalTriangle1();

        // Function call to print the element in rth row and cth column
        int ans = sol.pascalTriangleI(r, c);

        System.out.println("The element in the rth row and cth column in pascal's triangle is: " + ans);
    }
}
