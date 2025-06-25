package com.aakash.advance.binarySearch.fundamentals;

public class UpperBoundBrute {

    public int upperBound(int[] nums, int x) {
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i] > x)
            {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 8, 9, 15, 19};
        int x = 9;
        // Create an instance of the Solution class
        UpperBoundBrute solution = new UpperBoundBrute();
        // Find the upper bound index for x
        int ind = solution.upperBound(nums, x);
        System.out.println("The upper bound is the index: " + ind);
    }
}
