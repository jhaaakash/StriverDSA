package com.aakash.advance.sorting.algorithm;

import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] nums) {
        int n=nums.length;

        for(int i=n-1; i>=1; i--)
        {
            for(int j=0; j<i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }
return  nums;
    }

    public static void main(String[] args) {

        // Create an instance of solution class
        BubbleSort solution = new BubbleSort();

        int[] nums = {7, 4, 1, 5, 3};

        System.out.println("Array Before Using Bubble Sort: " + Arrays.toString(nums));

        // Function call for Bubble Sort
        nums = solution.bubbleSort(nums);

        System.out.println("Array After Using Bubble Sort: " + Arrays.toString(nums));

    }
}
