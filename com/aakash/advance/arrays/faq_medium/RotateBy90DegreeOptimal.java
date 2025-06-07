package com.aakash.advance.arrays.faq_medium;

public class RotateBy90DegreeOptimal {
// Second approach would be transpose and reverse each row
    //
    public void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
       // int[][] ans = new int[n][n];

        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                {
                    continue;
                }
                else {
                    matrix[i][j]=matrix[j][i];
                }
            }
        }
    for(int i=0; i<n ;i++)
    {
        for (int j = 0; j < n / 2; j++) {

            // Swap elements symmetrically
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - 1 - j];
            matrix[i][n - 1 - j] = temp;

        }
    }



    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Create an instance of the Solution class
        RotateBy90DegreeOptimal sol = new RotateBy90DegreeOptimal();
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
