package com.aakash.advance.arrays.faq_medium;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle3 {

    private List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();

        // Inserting the 1st element
        ansRow.add(1);

        // Calculate the rest of the elements
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }

        return ansRow; // Return the computed row
    }

    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        // Compute the entire Pascal's Triangle
        for (int row = 1; row <= n; row++) {
            pascalTriangle.add(generateRow(row));
        }

        //return the pascalTriangle
        return pascalTriangle;
    }

    public static void main(String[] args) {
        int n = 5;
        PascalTriangle3 sol = new PascalTriangle3();

        // Generate Pascal's Triangle with n rows
        List<List<Integer>> pascalTriangle = sol.pascalTriangleIII(n);

        // Output the Pascal's Triangle
        for (List<Integer> row : pascalTriangle) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
