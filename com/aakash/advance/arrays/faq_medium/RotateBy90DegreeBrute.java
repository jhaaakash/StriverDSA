package com.aakash.advance.arrays.faq_medium;

import java.util.ArrayList;
import java.util.List;

public class RotateBy90DegreeBrute {

    public void rotateMatrix(int[][] matrix) {

        int n = matrix.length;

        int[][] ans = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                ans[j][n - i - 1] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matrix[i][j] = ans[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Create an instance of the Solution class
        RotateBy90DegreeBrute sol = new RotateBy90DegreeBrute();

        // Rotate the matrix
        sol.rotateMatrix(arr);

        // Print the rotated matrix
        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
