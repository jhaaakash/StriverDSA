package com.aakash.advance.binarySearch.fundamentals;

public class LowerBound {
    public int lowerBound(int[] nums, int x) {
        int n= nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i] >= x)
            {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int x = 2;

        // Create an instance of the Solution class
        LowerBound sol = new LowerBound();

        // Function call to find the lower bound
        int ind = sol.lowerBound(arr, x);

        System.out.println("The lower bound is the index: " + ind);
    }
}
