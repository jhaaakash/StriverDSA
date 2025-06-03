package com.aakash.advance.arrays.faq_medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralPrint {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
    int m=matrix.length;
    int n=matrix[0].length;

    int top=0,left=0;
    int right=m-1, bottom=n-1;


    while(top<=bottom && left <=right)
    {

        for(int i=left; i<=right; i++)
        {
            ans.add(matrix[top][i]);
        }
        top++;

        for(int i=top; i<=bottom; i++)
        {
            ans.add(matrix[i][right]);
        }
        right--;

        if(top <=bottom)
        {
            for(int i=right; i >=left; i--)
            {
                ans.add(matrix[bottom][i]);
            }
            bottom--;
        }

        if(left <= right)
        {
            for(int i=bottom; i>=top; i--)
            {
                ans.add(matrix[i][left]);
            }
            left++;
        }
    }
    return  ans;
    }


    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Create an instance of the Solution class
        SpiralPrint finder = new SpiralPrint();

        // Get spiral order using class method
        List<Integer> ans = finder.spiralOrder(mat);

        System.out.print("Elements in spiral order are: ");
        for (int i = 0; i < ans.size(); ++i) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
